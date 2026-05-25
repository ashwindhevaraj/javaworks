package Teachings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class General{
	public static void main(String args[]) throws IOException {
		General g=new General();
		//g.secondsmallnumber(); asked on Strategic interview
		//g.stringindexrotate();
		//g.stringregularexp();
		//g.samenumbergrouping();
		//g.leaderinarray();
		//g.countcharactersinfile();
		//g.paircheck();
		//g.Stringlowercaseconversion();
		//g.middleindexsum();
		//g.missingnumbercheck();
		//g.printingtree();
		g.arraylistduplicate();
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
				b.put(a[i],new ArrayList<>()); //creating array list under map key 
			}
			b.get(num).add(a[i]); //adding value to the arraylist of exact map key
		}
		for(List<Integer> l:b.values()) { //b.values give [[4,4,4],[3],[5,5]] 
			System.out.println(l);
		}
		
	}
	public void leaderinarray() {
		int a[]= {25,10,2,4,1,3};
		int max=Integer.MIN_VALUE;
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]>max) {
				System.out.println(a[i]);
				max=a[i];
			}
		}
	}
	public void countcharactersinfile() throws IOException {
		int charcount=0;
		int linecount=0;
		int wordcount=0;
		BufferedReader br = null;
		try {
			br= new BufferedReader(new FileReader("C:\\Users\\dyens\\git\\javaworks\\src\\Text.txt"));
		}
		catch(IOException e) {
			System.out.println(e);
		}
		String line = br.readLine();
		while(line!=null) {
			linecount++;
			String words[]=line.split(" ");
			wordcount+=words.length;
			for(String s:words) {
				charcount+=s.length();
			}
			line=br.readLine();
		} // slash n used for printing data in newline
		System.out.println("linecount "+linecount+"\n wordcount "+wordcount+"\n charactercount "+charcount);
		
	}
	public void paircheck() {
		int a[]= {1,5,7,-1,5};
		int result = 6;
		List<Integer> temp;
		List<List<Integer>> res=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]+a[j]==result) {
					int first= a[i];
					int second = a[j];
					temp= new ArrayList<>(Arrays.asList(first,second));
				if(!res.contains(temp)) {
					res.add(temp);
				}
			}
		}
		}
		for(List<Integer> check:res) {
			System.out.println(check);
		}
		
}
	public void Stringlowercaseconversion() {
		String a=" aswin oo ";
		String d=a.trim();
		System.out.println(d); // will trim white spaces at start and end only / op aswin oo
		System.out.println(a.replaceAll("\\s+","")); // this regular expression removes white spaces in all places(aswinoo)
		char b[]=a.toCharArray();
		char c[]=new char[b.length];
		for(int i=0;i<b.length;i++) {
			if(b[i]>='A' && b[i]<='Z') {
				c[i]=(char)(b[i]+32);
			}
			else if(b[i]>='a' && b[i]<='z') {
				c[i]=(char)(b[i]-32);
			}
		}
		System.out.println(Arrays.toString(c));
	}
	public void middleindexsum() {
		int a[]= {1,7,3,6,5,6};
		int lsum=0;
		int rsum=0;
		int total=0;
		boolean c=false;
		for(int b:a) {
			total+=b;
		}
		for(int i=0;i<a.length;i++) {
			rsum=total-lsum-a[i];
			if(lsum==rsum) {
				System.out.println("Found at index "+i);
				c=true;
				break;
			}
			lsum+=a[i];
		}
		if(c==false)
		System.out.println("equal sum not found among middle index");
	}
	public void missingnumbercheck() {
		int n=7;
		int a[]= {1,3,5};
		int count=0;
		for(int i=0;i<=n;i++) {
			if(count< a.length && a[count]==i) {
				count++;
				continue;
			}
			System.out.println(i);
		}
	}
	public void printingtree() {
		int n=3;
		// left tree
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("#");
			}
			System.out.println("");
		}
		//right tree
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("#");
			}
			for(int k=0;k<n-i-1;k++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	public void arraylistduplicate() {
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(1);
		l.add(2);
		l.add(5);
		l.add(4);
		l.add(2);
		List<Integer> k=new ArrayList<Integer>();
		for(Integer v:l) {
			if(!k.contains(v)) {
				k.add(v);
			}
		}
		System.out.println(k);
		}
}

