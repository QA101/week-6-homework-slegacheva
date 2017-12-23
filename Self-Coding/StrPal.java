//	Find duplicate characters in a String and count the number of occurrences of the duplicate characters
import java.util.HashMap;
import java.util.Map;
public class StrPal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numOfOccur("Svetlana");
		}
	public static void numOfOccur(String str) {
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i = 0; i<str.length();i++ ) {
			char s = str.charAt(i);
			Integer num = map.get(s);
			if(num == null) {
				num=0;
			}
			map.put(s, num+1);
		}
		for(Character ch : map.keySet()) {
			Integer i = map.get(ch);
			if(i>1) {
				System.out.println(ch+" occures "+ i+" times");
			}
		}
	}
}
