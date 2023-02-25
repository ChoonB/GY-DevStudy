package day3;

/*
기원이는 오늘 항해99를 시작했다. 성격이 급한 기원이는 항해 1일 차부터 언제 수료를 하게될 지 궁금하다.

항해 1일 차 날짜를 입력하면 98일 이후 항해를 수료하게 되는 날짜를 계산해주는 알고리즘을 만들어보자.

### 제한 조건

- 1 ≤ month ≤ 12
- 1 ≤ day ≤ 31 (2월은 28일로 고정합니다, 즉 윤일은 고려하지 않습니다.)

 */

public class 예시_1번신대륙발견 {
    public String solution(int month, int day) {
        int[] eachMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 31, 29, 31, 30};
        int endMonth = month+3;

        int endDay = day+98;

        endDay -= (eachMonth[month-1]+eachMonth[month]+eachMonth[month+1]);

        if (endDay > eachMonth[month+2]){
            endDay -= eachMonth[month+2];
            endMonth += 1;
        }

        if (endMonth > 12){
            endMonth -= 12;
        }

        String answer = "" + endMonth + "월 " + endDay + "일";
        return answer;
    }

    public static void main(String[] args) {
        예시_1번신대륙발견 result = new 예시_1번신대륙발견();
        System.out.println(result.solution(1, 31));
    }
}


