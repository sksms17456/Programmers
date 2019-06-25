//문제 설명
//함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
//
//제한 조건
//n은 1이상 8000000000 이하인 자연수입니다.
//입출력 예
//n	return
//118372	873211
package level1;

import java.util.Arrays;
class Solution {
  public long solution(long n) {
      long answer = 0;
      String str = String.valueOf(n);      

      int length = str.length();

      int[] arr = new int[length];
      for(int i=0; i<length; i++){
          arr[i] = str.charAt(i)-'0';
      }


      Arrays.sort(arr);
      String newstr = "";
      for(int i=length-1; i>=0; i-- ){
          newstr += arr[i];
      }
      answer = Long.parseLong(newstr);
      return answer;
  }
}