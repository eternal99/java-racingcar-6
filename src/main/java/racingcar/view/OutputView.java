package racingcar.view;

import java.util.List;

public class OutputView {
    private static final String START_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String ASK_NUM_OF_ATTEMPTS_MESSGE = "시도할 회수는 몇회인가요?";
    public void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public void askNumOfAttemptsMessage() {
        System.out.println(ASK_NUM_OF_ATTEMPTS_MESSGE);
    }

    public void printProgress() {
    }

    public void printWinners(List<String> winners) {
        String winCars = "";
        System.out.print("최종 우승자 : ");
        winCars = String.join(",", winners);
        System.out.println(winCars);
    }

}
