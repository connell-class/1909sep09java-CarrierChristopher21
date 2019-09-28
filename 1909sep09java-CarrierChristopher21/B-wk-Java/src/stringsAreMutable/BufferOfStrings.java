package stringsAreMutable;

public class BufferOfStrings {

	public static void main(String[] args) {
		String str = "are we done yet";
		StringBuffer sb = new StringBuffer("yep");
		System.out.println(str);
		System.out.println(sb);
	}
}
