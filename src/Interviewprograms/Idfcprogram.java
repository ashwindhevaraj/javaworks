package Interviewprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// to count brackets closure and opening 
public class Idfcprogram {
	public static boolean bracketcheck(String a) {
		int n=a.length();
		char b[]=a.toCharArray();
		int count=0;
		
			for(char c:b) {
				if(c=='{' || c=='[' || c=='(') {
					count++;
				}
				else if(c=='}' || c==']' || c==')') {
					count--;
				}
			}
			
		if (count!=0)
			return false;
		else
			return true;
	}
	public static boolean polynomialcheck(String a) {
		int n=a.length();
		char b[]=a.toCharArray();
		int initialstart=0;
		int startindex=0;
		int endindex=0;
		Pattern p=Pattern.compile("[a-zA-Z0-9]");
		Matcher m=p.matcher(a);
		if(m.find()) {
			initialstart=m.start();
		}
		while(m.find()) {
			startindex=m.start();
			endindex=m.end();
		}
		String d=a.substring(initialstart,endindex);
		System.out.println(d);
		if(d.contains("[")|| d.contains("]")||d.contains("{")||d.contains("}")||d.contains("(")||d.contains(")")) {
			return false;
		}
		else {
			return true;
		}
	}
	public static void main(String args[]) {
		// program to check paranthesis closed in a way or not
		String a="({[aaadds}][])";
		String d="[ad[dc][]]";
		char b[]=d.toCharArray();
		boolean c=bracketcheck(d);
		System.out.println("Brakcets are processed now "+ c);
		boolean e=polynomialcheck(a);
		System.out.println("wordings are processed now "+ e);
	}
	
	

}
