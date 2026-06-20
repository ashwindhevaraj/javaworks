package Teachings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hackerrankchecks {
	public static void outputformatting() {
		Scanner a=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("enter name and rollno with spaces in between");
			String s1=a.next();
			int i1=a.nextInt();
			System.out.printf("%-20s",s1);
			System.out.printf("%03d%n",i1);
		}
		
	}
	public static void chocolateproblem() {
		int a[]= {12,4,7,9,2,23,25,41,30,40,28,42,30,44,48,43,50}; //denotes no of chocolates
		int n=a.length;
		int m=3; //denotes no of students
		// we need to give output for min difference of first to third student chocolate as min difference
		//42,43,44 - triplets will give 2 as different-which is small min through any 3 combinations
		int minlength=Integer.MAX_VALUE;
		Arrays.sort(a);
		for(int i=0;i+m-1<n;i++) {
			if(a[i+m-1]-a[i]<minlength) {
				minlength=a[i+m-1]-a[i];
			}
		}
		System.out.println(minlength);
	}
	public static int updowncountproblem(String a) {
		int n=a.length();
		int i=0;
		char b[]=new char[n];
		int count=0;
		int pcount=0;
		int res=0;
		b=a.toCharArray();
		while(i!=n) {
			if(b[i]=='U') {
				count++;
			}
			else {
				count--;
			}
			if(count<=0) {
				if(count==0&&pcount<0)
					res++;
			}
			pcount=count;
			i++;
		}
		return res;
	}
	public static int pagecountproblem1(int n,int p) {
		int count=0;
		int k=n/2;
		if(p==1 || p==n)
			return count;
		else if(p<=k){
			for(int i=2;i<=k;i=i+2) {
				count++;
				if(p==i || p==i+1) {
					return count;
				}
			}
		}
		else {
			if(n%2!=0) {
				count++;
				n=n-1;
			}
			for(int i=n;i>=k;i=i-2) {
				
				if(p==i || p==i-1) {
					return count;
				}
				count++;
				
			}
		}
		return 0;
	}
	public static void coderabbitques1() {
		//if input 234aabdds47- it should return true
		//as 2 and 34 being consecutive even numbers
		//if input 21beess214- it should return true
		String s="234aabdds";
		Pattern p= Pattern.compile("[0-9]+");
		Matcher m=p.matcher(s);
		boolean flag=false;
		while(m.find()) {
			String b=m.group();
			int n=b.length();
			if(n==2)
			flag=checknumbertwo(b);
			else if(n>2)
				flag=checknumberthree(b);
		}
		if(flag==true)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		
	}
	public static boolean checknumbertwo(String a) {
		char b[]=a.toCharArray();
		Integer c=Integer.parseInt(String.valueOf(b[0]));
		Integer d=Integer.parseInt(String.valueOf(b[1]));
		if(b.length<=1)
			return false;
		else if(b.length==2) {
			if(c%2!=0)
				return false;
				else
					if(d%2!=0)
						return false;
						else
							return true;
		}
		return false;
	}
	public static boolean checknumberthree(String a) {
		String b=a.substring(0,1);
		String c=a.substring(1);
		Integer d=Integer.parseInt(b);
		Integer e=Integer.parseInt(c);
		if(d%2==0 && e%2==0)
			return true;
		else
			return false;
	}
	/*public static String convertstringtonum(String s,Map<String,String> m) {
		StringBuilder a=new StringBuilder();
		
		while(!s.isEmpty()) {
			for(String word:m.keySet()) {
				if(s.startsWith(word)) {
					a.append(m.get(word));
					s=s.substring(word.length());
					break;
				}
			}
		}
		return a.toString();
	}*/
	public static int expressioneval(String e) {
		int num=0;
		int result=0;
		char sign='+';
		for(int i=0;i<e.length();i++) {
			if(i<e.length() && Character.isDigit(e.charAt(i))) {
				num=num*10+(e.charAt(i)-'0');
			}
			else
			{
				if(sign=='+') {
					result+=num;
				}
				else if(sign=='-')
					result-=num;
				if(i<e.length()) {
					sign=e.charAt(i); 
				}
				num=0;
			}
			
		}
		return result;
	}
	public static void coderabbitques2() {
		String s="fourfourminustwoplustwozero";
		Map<String,String> m=new HashMap<String,String>();
		m.put("zero","0");
		m.put("one","1");
		m.put("two","2");
		m.put("three","3");
		m.put("four","4");
		m.put("five","5");
		m.put("six","6");
		m.put("seven","7");
		m.put("eight","8");
		m.put("nine","9");
		for(Map.Entry<String,String> e: m.entrySet()) {
			s=s.replace(e.getKey(), e.getValue());
		}
		s=s.replace("minus","-");
		s=s.replace("plus", "+");
		System.out.println(s); //"44-2+20"
		int result=expressioneval(s);
		System.out.println(result);
	}
	//String a=convertstringtonum(s,m);
public static void main(String args[]) {
	Hackerrankchecks check=new Hackerrankchecks();
	//int k=pagecountproblem1(9,4);
	//System.out.println(k);
	/*int a=check.updowncountproblem("UDDDUDUU");
	System.out.println("deep covered "+a);*/
	//chocolateproblem();
	//outputformatting();
	//coderabbitques1();
	coderabbitques2();
	}
}
