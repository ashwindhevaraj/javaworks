package Teachings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class General{
	public static void main(String args[]) {
		General g=new General();
		//g.secondsmallnumber(); asked on Strategic interview
		//g.stringindexrotate();
		//g.stringregularexp();
		g.samenumbergrouping();
		/*char a='\u0061'; //internally hexa will be converted to 97 and slash u is to denote unicode
		int b=0b1111; //binary representation
		int c=01111; //octal representation
		int d[]= {1,2,3,4,5};
		int e=10,f=15;
		System.out.println(a); //a
		System.out.println(b); //15
		System.out.println(c); //585
		System.out.println(d.length); //5
		g.arraysum(new int[] {1,2,3,4,5}); //anonymous array
		if (++e<10 || ++f>15)
			e++;
		else
			f++;
		System.out.println("value of e and f is"+e+f);
		boolean h=true;
		if(h=false)
			System.out.println("Inside false lloop");
			else
				System.out.println("Inside no false loop");
	int i=0;
	int j=2;
	switch(i+2){
	case 0:
		System.out.println("you entered 0 da");
		break;
	case 2:
		System.out.println("you entered 2 da");
		break;
		default:
			System.out.println("can you enter correct one");
	}*/
	}
	public void arraysum(int a[]){
		int total=0;
		for (int x:a) {
			total+=x;
		}
		System.out.println(total);
	}
	public void secondsmallnumber() {
		// below program displays second smallest number in array without sorting
		int a[]= {5,4,3,1,2};
		int first=Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<first) {
				second=first;
				first= a[i];
			}
			else if(a[i]<second && a[i]!=second) {
				second=a[i];
			}
			
		}
		System.out.println(second);
	}
	public void stringindexrotate() {
		String s1="ABCD";
		String s2="BCDA";
		if(s1.length()==s2.length() && (s1+s1).indexOf(s2)!=-1) { //ABCDABCD have BCDA rotated or found inside
			System.out.println("Two strings have rotation in it");
		}
		else {
			System.out.println("Strings s2 will not rotate inside s1");
		}
	}
	public void stringregularexp() {
		String k = "12345";
		if(k.matches("\\d+")){
			System.out.println("String only having numbers");
		}
		else {
			System.out.println("String contains other than numbers");
		}
	}
	public void samenumbergrouping() {
		int a[]= {4,4,5,4,3,2,1,4,-4};
		int num;
		Map<Integer,List<Integer>> b=new LinkedHashMap<>();
		for(int i=0;i<a.length;i++) {
			num = Math.abs(a[i]);
			if(!b.containsKey(num)) {
				b.put(a[i],new ArrayList<>());
			}
			b.get(num).add(a[i]);
		}
		for(List<Integer> l:b.values()) {
			System.out.println(l);
		}
		
	}
}
