public class StringManipulator {
	public String trimAndConcat(String str1, String str2) {
		String a = str1.trim();
		String b = str2.trim();
		String s = a.concat(b);
		return s;
	}

	public Integer getIndexOrNull(String str, char letter) {
		int index = str.indexOf(letter);
		if (index == -1) {
			return null;
		}
		return index;
	}

	public Integer getIndexOrNull(String str, String letter) {
		int index = str.indexOf(letter);
		if (index == -1) {
			return null;
		}
		return index;
	}

	public String concatSubstring(String str1, int index1, int index2, String str2) {
		String a = str1.substring(index1, index2);
		String b = a.concat(str2);
		return b;
	}
}




///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class StringManipulatorTest {
	public static void main(String[] args) {
		StringManipulator manipulator = new StringManipulator();
		System.out.println(manipulator.trimAndConcat("Hello","World"));
		System.out.println(manipulator.getIndexOrNull("Hello", 'l'));
		System.out.println(manipulator.getIndexOrNull("Hello", 'a'));
		System.out.println(manipulator.getIndexOrNull("Hello", "llo"));
		System.out.println(manipulator.getIndexOrNull("Hello", "lw"));
		System.out.println(manipulator.concatSubstring("Hello", 1, 2, "World"));
	}
}