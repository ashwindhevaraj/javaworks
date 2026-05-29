package Teachings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
		//g.arraylistduplicate();
		//g.ibmquestion();
		//g.sorttechnique1();
		//g.timeconversion();
		g.firstnonrepeatingcharacter();
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
	public String stringreverse(String k) {
		String v=new String();
		int count=k.length()-1;
		int i=0;
		char a[]=new char[k.length()];
		while(count>=0) {
			a[count]=k.charAt(i++);
			count--;
		}
		return String.valueOf(a);
		//we can use String f=new String(a) and return this f
	}
	public int countoneinstring(String k) {
		int count=0;
		for(int i=0;i<k.length();i++) {
			if(k.charAt(i)=='1') {
				count++;
			}
		}
		return count;
	}
	public List<Integer> listposition(String k) {
		List <Integer> v=new ArrayList<Integer>();
		for(int i=0;i<k.length();i++) {
			if(k.charAt(i)=='1') {
				v.add(i+1);
			}
		}
		return v;
	}
	public void ibmquestion() {
		int n=37;
		List<Integer> b=new ArrayList<Integer>();
		String k=Integer.toBinaryString(n);
		System.out.println(k);
		//System.out.println(stringreverse(k));
		int count=countoneinstring(k);
		b=listposition(k);
		b.add(0,count);
		System.out.println(Arrays.toString(b.toArray()));
		}
	public void sorttechnique1() {
		int s[]= {4,4,3,2,1,5};
		int temp=0;
		int n=s.length;
		for(int i=n-1;i>0;i--)
        {
            if(s[i]>s[i/2])
            {
                temp=s[i];
                s[i]=s[i/2];
                s[i/2]=temp;
            }

        }
		System.out.println(Arrays.toString(s));
	}
	public void timeconversion() {
		String a="12:21:04AM";
		String b[]=a.split(":");
		System.out.println(Arrays.toString(b)); //[12,21,04AM]
		String c=b[b.length-1].substring(2); //gives AM
		System.out.println(c);
		int d=0;
		String e="";
		if(c.equals("PM")) {
			if(b[0].equals("12")) {
				b[0]="12";
			}
			else {
				d=Integer.parseInt(b[0]);
				d+=12;
				b[0]=String.valueOf(d);
			}
		}
		else {
			if(b[0].equals("12")) {
				b[0]="00";
			}
		}
		//b[b.length-1]=c;
		for(int i=0;i<b.length;i++) {
			e+=b[i]+":";
		}
		System.out.println(e.substring(0,8)); //00:21:04
	}
	public void firstnonrepeatingcharacter() {
		String a="aaabbbcddef";
		char b[]=a.toCharArray();
		Map<Character,Integer> c=new HashMap<>();
		
		for(char ch:b) {
			if(c.get(ch)==null) //i tried adding 1 to null- getting null pointer exception
				c.put(ch,1);
			else
			c.put(ch,c.get(ch)+1);
		}
		Set<Character> s=c.keySet();
		for(char d:s) {
			if(c.get(d)==1) {
				System.out.println("first non repeating character"+d);
			}
		}
		}
}

