/**
 * https://programmers.co.kr/learn/courses/30/lessons/12937
 *
 * 짝수와 홀수
 *
 * 문제 설명
 *
 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
 * 제한 조건
 * num은 int 범위의 정수입니다.
 * 0은 짝수입니다.
 *
 * 입출력 예
 * num	return
 * 3	"Odd"
 * 4	"Even"
 */
public class Prac {
    public static void main(String[] args) {

        // 1번 입력값 셋팅
        int num = 4; // ex: 4
        String answer = solution(num);
        System.out.println(answer); // Odd, Even이 출력되는지 확인 후 맞다면 프로그래머스에 옮김

        // 2번 입력값 셋팅
        Prac exam = new Prac();
        System.out.println(exam.solution(num));; // Odd, Even이 출력되는지 확인 후 맞다면 프로그래머스에 옮김
    }
    // 1번 답안
    public static String solution(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }
    // 2번 답안
//    public String solution(int num) {
//        String answer = "";
//        if (num % 2 == 0) {
//            answer = "Even";
//        } else {
//            answer = "Odd";
//        }
//        return answer;
//    }
}