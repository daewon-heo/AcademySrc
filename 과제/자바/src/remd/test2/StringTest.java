package remd.test2;

public class StringTest {

	public static void main(String[] args) {
		String str = "A, b, c, D, a, B, C, d, f, F";

		String[] st = str.split(", "); /* str에서 ‘, ‘ 으로 데이터를 분리한다. */
		// st 에서 char[] 로 바꾼다.
		char[] data = new char[st.length]; /* 배열 할당 선언 */

		int cnt = 0;
		for (String ch : st) { // for~each 문 사용한다.
			// char[] 배열에 문자 데이터를 넣는다.
			data[cnt++] = ch.charAt(0);
		}
		cnt = 0;
		// char[] 에서 대문자만 골라서 출력 한다. continue 문 사용할 것
		while (cnt < data.length) {
			if(data[cnt] < 'A' && data[cnt] > 'Z'){
				cnt++;
				continue;
			}
			
			System.out.println("data[" + cnt + "] : " + data[cnt]);
			cnt++;
		} // while loop 문 사용한다.
	}

}
