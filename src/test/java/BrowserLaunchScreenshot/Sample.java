package BrowserLaunchScreenshot;


public class Sample {
	public static void main(String[] args) {
		String inpString="Aspire Systems India Pvt Ltd";
		String  outString="";
	String[] sp = inpString.split(" ");
	for( int i=0;i<sp.length;i++) {
			if (i % 2==1) {
				String s=sp[i];
				String rev="";
				for(int j=s.length()-1;j >=0;j--) {
					char c = s.charAt(j);
					rev=rev+c; }
				
		
				outString= outString+rev +" ";
		}
			else {
 outString=outString+sp[i]+" ";
		}
		}
	System.out.println(outString);
	
}
}
