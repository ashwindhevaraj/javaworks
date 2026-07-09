package Interviewprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Hashedin {
	public static String longestSubstring(String a,String b) {
		if(b.indexOf(a)!=-1) {
			return a;
		}
		else
			return "";
	}
	public static void main(String args[]) {
		String input="abcdxvf";
		String pattern="xvfabcd";
		String temp;
		String temp2;
		List<String> answer=new ArrayList<>();
		for(int i=input.length();i>0;i--) {    
			for(int j=0;j<=input.length()-i;j++) {
				temp=input.substring(j,i+j);
				temp2=longestSubstring(temp,pattern);
				if(temp2!="") {
					answer.add(temp);
				}
			}
		}
		System.out.println(answer.get(0));
		countingpairs();
		decodeprogram();
	}
	public static void countingpairs() {
		int a[]= {2,3,4,5,6,7};
		int target=7;
		int temp=0;
		Set<Integer> seen=new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			temp=Math.abs(target-a[i]);
			if(seen.contains(Integer.valueOf(temp))) {
				System.out.println(temp+" "+a[i]);
			}
			seen.add(a[i]);
		}
		
	}
	public static void decodeprogram() {
		String a="3[a]2[bc]";
		//add 3 a
		//read number-take all characters inside braces
		int recentnum=0;
		int count=0;
		int n=0;
		StringBuilder c=new StringBuilder();
		Stack<String> data=new Stack<>();
		while(count<a.length()) {
			if(Character.isDigit(a.charAt(count))) {
				n=Integer.parseInt(String.valueOf(a.charAt(count)));
				count++;
			}
			if(a.charAt(count)=='[' || a.charAt(count)==']') {
				if(data.isEmpty()) {
					data.push(String.valueOf(a.charAt(count)));
					count++;
				}
				else {
					data.pop();
					count++;
					System.out.print(String.valueOf(c).repeat(n));
					c.setLength(0);
				}
			}
			if(!data.isEmpty()) {
				c.append(a.charAt(count++));
			}
					
			for(int i=0;i<n;i++) {
				
			}
		}
		
	}

}
