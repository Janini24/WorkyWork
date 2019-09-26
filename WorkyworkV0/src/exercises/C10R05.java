package exercises;


public class C10R05 {

	private static final String MESSAGE = "Input a string: ";
	private static final String str = "The quick brown fox jumps over the lazy dog.";
	private static int numWord;
	
	private static final String MESSAGEOUTPUT = "Number of words in the string:";
	
	public static void main(String[] args) {
wordCount();
}

public static void wordCount() {
	int len = str.length();
	
	for(int i =0; i<str.length(); i++) {
//		if(str.charAt(x) == ' ' || str.charAt(len)== ) {
	
		 if( ((i>0)&&(str.charAt(i)!=' ')&&(str.charAt(i-1)==' ')) || ((str.charAt(0)!=' ')&&(i==0)) )  {
		
		numWord++;
		}
	}
	
	System.out.println(MESSAGE + str);

	
	System.out.println(MESSAGEOUTPUT+numWord);

}

}
