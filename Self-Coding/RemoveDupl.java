import java.util.HashSet;
import java.util.Set;

public class RemoveDupl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeDuplicateCharacters("Svetlana"));
	}
	public static String removeDuplicateCharacters(String strA) {
		String str = "";
		Set<Character> set = new HashSet<>();
		for(int i = 0; i<strA.length();i++) {
			char ch = strA.charAt(i);
			if(set.add(ch))
				str+= ch;
		}
		return str;
	}

}
