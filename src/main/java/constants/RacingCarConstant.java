package constants;

public class RacingCarConstant {
	public static final String INPUT_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	public static final String INPUT_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";
	public static final String EXECUTION_RESULT_MESSAGE = "실행 결과";
	public static final String FINAL_WINNER_MESSAGE = "최중 우승자 : ";

	public static final String DELIMITER = ",";

	public static final String CAR_NAME_DUPLICATE_ERROR = "[ERROR] 자동차 이름은 중복되어서는 안된다";
	public static final String CAR_NAME_WRONG_LENGTH_ERROR = "[ERROR] 자동차 이름의 길이는 1~5자여야 한다";
	public static final String CAR_NAME_EMPTY_ERROR = "[ERROR] 자동차 이름에 빈 이름을 넣어서는 안된다";
	public static final String CAR_NAME_WRONG_END_ERROR = "[ERROR] 자동차 이름의 입력이 ,로 끝나서는 안된다";
}