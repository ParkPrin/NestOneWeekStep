package string;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTestReq3 {

	/**
	 * 요구사항 3
	 * "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.
	 * String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면
	 * StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.
	 * JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다.
	 *
	 * AssertJ Exception Assertions 문서 참고
	 * URL: https://joel-costigliola.github.io/assertj/assertj-core-features-highlight.html#exception-assertion
	 *
	 * 자주 발생하는 Exception의 경우 Exception별 메서드 제공하고 있음
	 * assertThatIllegalArgumentException()
	 * assertThatIllegalStateException()
	 * assertThatIOException()              // 입출력 오류에서
	 * assertThatNullPointerException()
	 */

	@DisplayName("String 클래스 중 substring() 학습, 검증 assertThatThrownBy")
	@Test
	public void reqCase1(){
		// Given
		final String sampleData = "abc" ;
		int chatNum = 3;

		// Then
		Assertions.assertThatThrownBy(
				() -> {sampleData.charAt(chatNum);
				})
				.isInstanceOf(StringIndexOutOfBoundsException.class)
				.hasMessage("String index out of range: %o", chatNum);

	}

	@DisplayName("String 클래스 중 substring() 학습, 검증 assertThatExceptionOfType")
	@Test
	public void reqCase2(){
		// Given
		final String sampleData = "abc" ;
		int chatNum = 3;

		// Then
		assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
				.isThrownBy(() -> {
					sampleData.charAt(chatNum);
				})
				.withMessage("String index out of range: %o", chatNum);
	}

}
