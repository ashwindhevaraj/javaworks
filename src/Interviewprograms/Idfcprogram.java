package Interviewprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
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
	public static boolean stacklogic(String a) {
		Stack<Character> b=new Stack<Character>();
		for(Character c:a.toCharArray()) {
			System.out.println(c);
			if(c=='('||c=='{'||c=='[') {
				b.push(c);
			}
			else {
				if(b.isEmpty())
					return false;
				else {
				switch(c) {
				case '}':
					if(b.pop()!='{')
						return false;
					break;
				case ']':
					if(b.pop()!='[') 
						return false;
					break;
				case ')':
					if(b.pop()!='(')
						return false;
					break;
					}
				}
			}
		}
		return b.isEmpty();
	}
	public static int k1selection(TreeMap<Integer,Integer> cash,int n) {
		int k1=0;
		int temp2=n;
		if(cash.get(cash.floorKey(n))>0) {
			k1=cash.floorKey(n);
		}
		else {
			do{
				int temp=cash.lowerKey(temp2);
				if(cash.lowerKey(temp)!=null && cash.lowerKey(temp)>0)
				k1=cash.lowerKey(temp);
				temp2=temp;
			}
			while(cash.get(k1)==0);
		}
		return k1;
	}
	public static void smartcashier() {
		TreeMap<Integer,Integer> cash= new TreeMap<>();
		cash.put(1,10);
		cash.put(2,1);
		cash.put(5,23);
		cash.put(10,1);
		cash.put(20,0);
		cash.put(50,3);
		cash.put(100,2);
		Scanner k=new Scanner(System.in);
		System.out.println("enter your number");
		int n=k.nextInt();
		while(n>0) {
			int k1=k1selection(cash,n);
				int temp=n/k1;
				while(temp>=1) {
					if(cash.get(k1) != null && cash.get(k1) > 0) {
					cash.put(k1,cash.get(k1)-1);
					System.out.println(k1+" * 1 = "+k1);
					if(cash.get(k1)==0) {
						n=n-k1;
						k1=k1selection(cash,n);
						temp=n/k1;
						temp+=1;
					}
						
					temp--;
					}
				}
				n=n%k1;
			}
		System.out.println(cash);
	}
	public static void main(String args[]) {
		// program to check paranthesis closed in a way or not
		String a="({[aaadds]}[])";
		String d="[ad[dc][]]";
		//char b[]=d.toCharArray();
		//boolean c=bracketcheck(d);
		//System.out.println("Brakcets are processed now "+ c);
		//boolean e=polynomialcheck(a);  //aaadds will be output
		//System.out.println("wordings are processed now "+ e);
		/*boolean k=stacklogic(a);
		
		if(k==true)
			System.out.println("Balanced");
		else
			System.out.println("Not balanced");*/
		smartcashier();
	}
	
}
