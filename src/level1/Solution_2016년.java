//문제 설명
//2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
//
//입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
//
//제한 조건
//2016년은 윤년입니다.
//2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
//입출력 예
//a	b	result
//5	24	TUE
package level1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

class Solution_2016년 {
	public String solution(int a, int b) throws ParseException {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "SUN");
		map.put(2, "MON");
		map.put(3, "TUE");
		map.put(4, "WED");
		map.put(5, "THU");
		map.put(6, "FRI");
		map.put(7, "SAT");
		String d = "2016-"+String.valueOf(a)+"-"+String.valueOf(b);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse(d);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		int n = cal.get(Calendar.DAY_OF_WEEK);
		
		
		String answer = map.get(n);
		return answer;
	}
}
