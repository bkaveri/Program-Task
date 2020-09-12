package BrowserLaunchScreenshot;


public class Manipulation {
	public static void main(String[] args) {
		String input="ssttyywwswwtt";
		String output="";
		for(int i=0;i<input.length();i++) {
			char c = input.charAt(i);
			if (c=='y'||c=='w') {
				c=' ';
			}
			output=output+c;
				
			}
		
	String res=output.replace(" ","");
	
	
System.out.println(res);
}
}

