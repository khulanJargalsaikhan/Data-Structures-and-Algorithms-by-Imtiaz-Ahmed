package stack;

public class App {

	public static void main(String[] args) {
//		Stack theStack = new Stack(3);
//		theStack.push(20);
//		theStack.push(40);
//		theStack.push(50);
//		theStack.push(10);

//		while(!theStack.isEmpty()) {
//			long value = theStack.pop();
//			System.out.println(value);
//		}	
		
		
		System.out.println(reverseString("hello"));
		
	}
	
	
	public static String reverseString(String str) {
		
		Stack charStack = new Stack(str.length());
		
		int i=0;
		
		while (i < str.length()) {
			charStack.push(str.charAt(i));
			i++;
		}
		
		String result = "";
		
		while(!charStack.isEmpty()) {
			char ch = charStack.pop();
			result = result + ch;
		}
		
		return result;
	}
	
	

}
