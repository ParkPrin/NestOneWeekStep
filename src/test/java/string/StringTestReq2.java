package string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTestReq2 {

	/**
	 * 요구사항 2
	 * "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 () 을 제거하고 "1,2"를 반환
	 * 하도록 구현한다.
	 */

	@DisplayName("String 클래스 중 substring() 학습, 검증 assertEquals")
	@Test
	public void reqCase1(){
		// Given
		final String sampleData = "(1,2)" ;

		// When
		final String substring = sampleData.substring(sampleData.indexOf("(")+1, sampleData.lastIndexOf(")"));

		// Then
		assertEquals(substring, "1,2");
	}
}
