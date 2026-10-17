package Teachings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class General{
	public static void main(String args[]) throws IOException {
		General g=new General();
		//g.secondsmallnumber(); //asked on Strategic interview
		//g.stringindexrotate();
		//g.stringregularexp();
		//g.samenumbergrouping();
		//g.leaderinarray();
		//g.countcharactersinfile();
		//g.paircheck();
		//g.middleindexsum();
		//g.missingnumbercheck();
		//g.printingtree();
		//g.arraylistduplicate();
		//g.ibmquestion();
		//g.sorttechnique1();
		//g.duplicateinname();
		//g.maxrepeatnumber();
		//g.noofrotations_insortedarray();
		//g.pairscount();
		//g.arrivaldeparture();
		//g.movezerostoend();
		//g.reversearray();
		g.wordcomparison();
		//g.streamusage();
		//g.reverseonlystring()
		//g.squarerootcheck();
		//System.out.println(g.longestpalindrome());
		//g.maxsubarraysum();
		//g.backtrackingletters("23");
		//g.backtracking2();
		//g.consecutivenumberdisplay();
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
			else if(a[i]>first && a[i]<second) {
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
		Set<Integer> seen=new HashSet<>();
		Map<Integer,Integer> data=new HashMap<>();
		for(int c:a) {
			int compliment= result-c;
			if(seen.contains(compliment)) {
				data.put(c,compliment);
			}
			seen.add(c);
		}
		System.out.println(data);
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
	
	
	public void duplicateinname() {
		String s="aaabbbcd";
		char b[]=s.toCharArray();
		Map<Character,Integer> c=new HashMap<Character,Integer>();
		for(int i=0;i<b.length;i++) {
			if(c.containsKey(b[i])) {
				c.put(b[i],c.get(b[i])+1);
			}
			else {
				c.put(b[i],1);
			}
		}
		for(Map.Entry<Character,Integer> k:c.entrySet()) {
			if(k.getValue()>1)
			System.out.println(k.getKey()+"..."+k.getValue());
		}
	}
	public void maxrepeatnumber() {
		int a[]= {1,1,2,3,4,5,6,1,2,3};
		int n=a.length;
		int max=0;
		int pos=0;
		int count[]=new int[a.length];
		for(int c:a) {
			count[c]++;
		}
		for(int i=0;i<n;i++) {
			if(count[i]==0)
				continue;
			else if(max<count[i]) {
				max=count[i];
				pos=i;
			}
		}
		System.out.println(pos+" has repeated "+max+" times here ");
	}
	public boolean sortcheck(int arr[],int n) {
		if(n==1||n==0)
			return true;
		else
			return arr[n-1]>arr[n-2] && sortcheck(arr,n-1);
		
	}
	public void noofrotations_insortedarray() {
		int a[]= {15,2,3,6,8,12};
		int rotate=a.length;
		int fix[]=new int[a.length];
		while(rotate>0) {
			if(sortcheck(fix,fix.length)!=true) {
				rotate-=1;
				for(int i=0;i<a.length;i++) {
					fix[(rotate+i)%a.length]=a[i];
				}
				System.out.println(Arrays.toString(fix)); //[2, 3, 6, 8, 12, 15] first time
				
			}
			else {
				System.out.println((rotate+2)%a.length); //ans is 1- first time shift itself got ascending order
				break;
			}
		}
		
	}
	public void pairscount() {
		int[] k= {1,2,1,2,3,4,1,1,2,3};
		int n=k.length;
		int count=0;
		Map<Integer,Integer> a=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			if(a.containsKey(k[i])) {
				a.put(k[i],a.get(k[i])+1);
			}
			else {
				a.put(k[i],1);
			}
		}
		System.out.println(a); //{1=4, 2=3, 3=2, 4=1}
		for(Integer c:a.values()) {
			while(c>1) {
				c=(c)/2;
				count++;
			}
		}
		System.out.println(count); //4
	}
	public void arrivaldeparture() {
		int arr[] = {900, 940, 950, 1100, 1500, 1800}; //denotes time of arrival
		int dep[] = {910, 1200, 1120, 1130, 1900, 2000}; //denotes time of departure
		int platform=1;
		int maxplatform=1;
		Arrays.sort(arr);
		Arrays.sort(dep);
		int n=arr.length;
		int i=1,j=0;
		while(i<n && j<n) {
			if(arr[i]<=dep[j]) {
				platform++;
				i++;
			}
			else {
				platform--;
				j++;
			}
			maxplatform = Math.max(platform,maxplatform);
		}
		System.out.println("maxplatform needed is "+maxplatform);
	}
	public void countcharactersv3() {
		String s="assssvvvvv";
		Map<Character,Integer> check=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            check.put(s.charAt(i),check.getOrDefault(s.charAt(i),0)+1);
        }
        for(char a:check.keySet()){
            if(check.get(a)!=1)
            System.out.println("first non repeating character "+ a +" and times "+check.get(a));
            else
            System.out.println("lot of non repeating characters");
        }
	}
	public void movezerostoend() {
		int a[]={1,2,0,5,4,0,7};
        int b[]=new int[a.length];
        int index=0;
        for(int c:a){
            if(c!=0)
            b[index++]=c;
        }
        while(index<a.length){
            b[index++]=0;
        }
        System.out.println(Arrays.toString(b));
	}
	public void reversearray() {
		 int a[]={1,2,3,4,5,6};
	        int k=1;
	        int n=a.length;
	        reverserotate(a,0,n-1);
	        reverserotate(a,0,k-1);
	        reverserotate(a,k,n-1);
	        System.out.println(Arrays.toString(a));
	}
	public void reverserotate(int a[],int start,int end){
        int temp=0;
        while(start<end){
            temp=a[start];
            a[start++]=a[end];
            a[end--]=temp;
        }
    }
	public static void checkwords(String a){
        Set<Character> k=new HashSet<Character>(Arrays.asList('a','e','i','o','u'));
        String finals="";
        char b[]=a.toCharArray();
        boolean flag=false;
        int i=0;
        for(i=0;i<b.length;i++){
            if(k.contains(b[i]))
            {
                finals=a.substring(i);
                flag=true;
                break;
            }
        }
        if(flag==true){
            for(int j=0;j<i;j++){
                finals+=a.charAt(j);
            }
        }
        else{
            finals=a;
        }
        System.out.println(append(finals));
    }
	public static String append(String a){
        return a+="ay";
    }
	
	public static void wordcomparison() {
		String a="Java java program";
		String b[]=a.split(" ");
		String result="";
		for(String c:b) {
			if(result.equalsIgnoreCase(c)) {
				continue;
			}
			else {
				result+=c;
				
			}
		}
		System.out.println(result);
	}
	public static void streamusage() {
		List<Integer> a=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		a.stream().filter((x)->x%2==0).forEach((p)->System.out.println(p));
		String s[]= {"ash","Dev","user","boy"};
		Arrays.stream(s).filter((x)->x.indexOf('a')!=-1).forEach(y->System.out.println(y));
		}
	public static void reverseonlystring() {
		String a="abcd1234defg";
		char b[]=a.toCharArray();
		int left=0;
		int right=a.length()-1;
		while(left<right) {
			if(!Character.isAlphabetic(b[left]))
				left++;
			else if(!Character.isAlphabetic(b[right]))
				right--;
			else {
				char temp=b[left];
				b[left]=b[right];
				b[right]=temp;
				right--;
				left++;
			}
		}
		System.out.println(new String(b));
		}
	public void squarerootcheck() {
		int n=36;
		int length=n/2;
		int sum=0;
		for(int i=1;i<length;i++) {
			if(i%2==0)
				continue;
			else {
				sum+=i;
				if(sum==n)
					break;
			}
				
		}
		if(sum==n)
			System.out.println("perfect square");
		else
			System.out.println("Not a perfect square");
	}
	public String longestpalindrome() {
		String s="radam";
		for(int lengths=s.length();lengths>0;lengths--) {
		for(int start=0;start<=s.length()-lengths;start++) {
			if(checkpalindrome(start,start+lengths,s)) {
				return (s.substring(start,start+lengths));
			}
				
		}
		}
		return "No palindrome found";
	}
	public static boolean checkpalindrome(int left,int right,String s) {
		while(left<right-1) {
			if(s.charAt(left)==s.charAt(right-1)) {
				left++;
				right--;
			}
			else {
				return false;
			}
		}
		return true;
	}
	public void maxsubarraysum() {
		// kadene algorithm - if currentsum goes negative reset to 0 as it will further reduce future sum
		int a[]= {-2,1,-3,4,-1,2,1,-5,4};
		int start=0;
		int tempstart=0;
		int end=0;
		int max=Integer.MIN_VALUE;
		int currentsum=0;
		for(int i=0;i<a.length;i++) {
			currentsum+=a[i];
			if(currentsum>max) {
				max=currentsum;
				end=i;
				start=tempstart;
			}
			if(currentsum<0) {
				currentsum=0;
				tempstart=i+1;
			}
		}
		System.out.println(max);
		for(int i=start;i<=end;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void backtrackingletters(String digits) {
        List<String> res=new ArrayList<>();
        if(digits==null || digits.length()==0)
        return;
        StringBuilder comb=new StringBuilder();
        Map<String,String> data=Map.of("2","abc",
        "3","def",
        "4","ghi",
        "5","jkl",
        "6","mno",
        "7","pqrs",
        "8","tuv",
        "9","wxyz");
        backtrack(0,comb,data,digits,res);
        System.out.println(res);
    }
	public static void backtrack(int idx,StringBuilder comb,Map<String,String> data,String digits,List<String> res){
        if(idx==digits.length()){
            res.add(comb.toString());
            return;
        }
        String letters=data.get(String.valueOf(digits.charAt(idx)));
        for(char c:letters.toCharArray()){
            comb.append(c);
            backtrack(idx+1,comb,data,digits,res);
            comb.deleteCharAt(comb.length()-1);
        }
    }
	public static void backtracking2() {
		List<String> res=new ArrayList<>();
		String pattern="abc";
		backtrack2(0,res,new StringBuilder(),pattern);
		System.out.println(res);
	}
	public static void backtrack2(int index,List<String> res,StringBuilder coms,String pattern) {
		if(coms.length()==pattern.length()) {
			res.add(coms.toString());
			return;
		}
		for(int i=index;i<pattern.length();i++) {
			coms.append(pattern.charAt(i));
			backtrack2(i,res,coms,pattern);
			coms.deleteCharAt(coms.length()-1);
		}
	}
	public static void consecutivenumberdisplay() {
		int a[]= {1,2,4,3,5,6,0,8,7};
		//find small
		int small=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<small) {
				small=a[i];
			}
		}
		List<Integer> data=new ArrayList<>(Arrays.asList(1,2,4,3,5,6,0,8,7));
		List<Integer> result=new ArrayList<>();
		int count=0;
		while(count<a.length) {
			if(data.contains(small)) {
				result.add(small);
				small++;
				count++;
			}
			else {
				break;
			}
		}
		System.out.println(result);
	}
}