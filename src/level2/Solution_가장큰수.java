//문제 설명
//0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
//
//예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
//
//0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
//
//제한 사항
//numbers의 길이는 1 이상 100,000 이하입니다.
//numbers의 원소는 0 이상 1,000 이하입니다.
//정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
package level2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution_가장큰수 {
	public static void main(String[] args) {
//		int[] numbers = {6,12,2};
		int[] numbers = { 3, 30, 34, 5, 9 };
		System.out.println(solution(numbers));
	}

	static String solution(int[] numbers) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				String temp1 = String.valueOf(o1) + String.valueOf(o2);
				String temp2 = String.valueOf(o2) + String.valueOf(o1);
				if (Integer.parseInt(temp1) >= Integer.parseInt(temp2)) {
					return -1;
				}
				return 1;
			}
		});
		boolean isZero = true;
		for (int i : numbers) {
			if (i != 0) {
				isZero = false;
			}
			queue.offer(i);
		}
		if (isZero)
			return "0";
		String answer = "";
		while (!queue.isEmpty()) {
			answer += queue.poll();
		}
		return answer;
	}
}
