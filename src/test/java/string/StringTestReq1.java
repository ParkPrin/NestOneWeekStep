package string;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTestReq1 {

	// Given
	final String splitSampleData = "1,2" ;
	/**
	 * 요구사항 1
	 * "1,2"을 , 로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
	 * "1"을 , 로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.
	 *
	 * 힌트
	 * 배열로 반환하는 값의 경우 assertj의 contains()를 활용해 반환 값이 맞는지 검증한다.
	 * 배열로 반환하는 값의 경우 assertj의 containsExactly()를 활용해 반환 값이 맞는지 검증한다.
	 */

	@DisplayName("String 클래스 중 split 메소드 학습 - 결과순서 X")
	@Test
	public void reqCase1(){
		// When
		final String[] split = splitSampleData.split(",");

		// Then
		assertThat(split).contains("1", "2");
	}

	@DisplayName("String 클래스 중 split 메소드 학습 - 결과순서 X, 하나만 있어도")
	@Test
	public void reqCase2(){
		// When
		final String[] split = splitSampleData.split(",");

		// Then
		assertThat(split).contains("1");
	}

	@DisplayName("String 클래스 중 split 메소드 학습 - 결과순서 O")
	@Test
	public void reqCase3(){
		// When
		final String[] split = splitSampleData.split(",");

		// Then
		assertThat(split).containsExactly("1", "2");
	}
}
