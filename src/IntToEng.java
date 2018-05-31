import java.util.Scanner;

public class IntToEng {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    int input = sc.nextInt();

	    System.out.println(translateEng(input));

	}
	static String translateEng(int n) {

	    String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
	    String[] num2 = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	    String[] num3 = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	    if(n<=10) {
	    	return num[n];
	    } else if(n<20) {
	    	return num2[n-11];
	    } else if(n<100) {
	    	String huta = num3[n/10];
	    	String keta = num[n%10];
	    	return huta+keta;
	    } else {
	    	return "I don't know.";
	    }
	}
}
