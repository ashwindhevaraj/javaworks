package Teachings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Stringconcepts {
	public static void stringreversewithnumber() {
		String input="ashwin123devaraj";
		String input1[]=input.split("\\d+");  //regular expression to find digits
		StringBuilder output=new StringBuilder();
		String digit=input.replaceAll("\\D+","");  //regular expression other than digits
		int index=input.indexOf(digit);            //gives index position or -1 if not found
		for(int i=0;i<input1.length;i++) {
			output.append(reverses(input1[i]));
		}
		output.insert(input.indexOf(digit),digit);    // we can use this method of stringbuilder to insert at specific index
		System.out.println(output);
		}
	/*String a="abcd1234defg";
        String b[]=a.split("\\d+");
        String c=a.replaceAll("\\D+",""); c=1234
        StringBuilder result=new StringBuilder();
        int first=0;
        result.append(a.substring(first,a.indexOf(c))).reverse();//dcba
        first=a.indexOf(c)+c.length();
        result.append(c);                      dcba1234
        result.append(new StringBuffer(a.substring(first)).reverse()); dcba1234gfed
        System.out.println(result); another logic*/
	public static String reverses(String a) {
		String temp="";
		for(int i=a.length()-1;i>=0;i--) {
			temp+=a.charAt(i);
		}
		return temp;
	}
	public static void splitdelimiters() {
		/*String a="aswin deva raj";
		String b[]=a.split(" ");
		for(String c:b) {
			System.out.println(c); // aswin[0] deva[1] raj[2]
		}*/
		/*String d="aswin123raj"; 
		String e[]=d.split("\\d+");  //used for group of digit
		Arrays.stream(e).forEach(s->System.out.println(s)); //aswin[0] raj[1]
		String f[]=d.split("\\D+");  //used for group of nondigit
		Arrays.stream(f).forEach(s->System.out.println(s)); //123
		String g="aswin.deva,raj";
		String h[]=g.split(",");
		Arrays.stream(h).forEach(s->System.out.println(s)); //aswin.deva[0],raj[1]
		String i="aswin deva    raj      cecila";
		String j[]=i.split("\\s+");  //s+ denotes one or more spaces
		Arrays.stream(j).forEach(s->System.out.println(s)); //aswin[0],deva[1],raj[2],cecilia[3]
		String k="aswin deva raj";
		String l[]=k.split("\\s");
		Arrays.stream(l).forEach(s->System.out.println(s)); //aswin[0],deva[1],raj[2]*/
		String m="aswDEVraj";
		String n[]=m.split("[a-z]+");
		System.out.println(n[1]);
 	}
	public static void Stringlowercaseconversion() {
		String a=" aswin oo ";
		String d=a.trim();
		System.out.println(d); // will trim white spaces at start and end only / op aswin oo
		System.out.println(a.replaceAll("\\s+","")); // this regular expression removes white spaces in all places(aswinoo
		a=a.replaceAll("\\s+","");
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
	public static void timeconversion() {
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
	public static String reverseword(String a) {
		char b[]=a.toCharArray();
		String d="";
		for(int i=0;i<b.length;i++) {
			d+=b[a.length()-i-1];
		}
		return d;
	}
	public static void reversewordinsentence() {
		String a="HI how are you";
		String b[]=a.split(" ");
		String d[]=new String[b.length];
		int count=0;
		for(String c:b) {
			d[count++]=reverseword(c);
		}
		System.out.println(Arrays.toString(d));
	}
	public static void frequencycount() {
		String s="assssvvvvv";
		Map<Character,Integer> check=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++){
			if(!check.containsKey(s.charAt(i))){
				check.put(s.charAt(i),1);
				}
			else{
				check.put(s.charAt(i),check.get(s.charAt(i))+1);
				}
			}
		for(Map.Entry k:check.entrySet()){
			System.out.println(k.getKey()+"  "+k.getValue());
			}
		}
	public static void firstnonrepeatingcharacter() {
		String a="aaabbbcddef";
		char b[]=a.toCharArray();
		Map<Character,Integer> c=new HashMap<>();
		
		for(char ch:b) {
			c.put(ch,c.getOrDefault(ch,0)+1);
		}
		Set<Character> s=c.keySet();
		for(char d:s) {
			if(c.get(d)==1) {
				System.out.println("first non repeating character"+d);
			}
		}
		}
	public static void duplicateinname() {
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
	public static void piglatin2(String a){
        String result="";
        String tempresult="";
        boolean flag=false;
        for(char b:a.toCharArray()){
            if("aeiou".indexOf(b)==-1){
                result+=String.valueOf(b);
            }
            else{
                flag=true;
                tempresult=a.substring(a.indexOf(b));
                break;
            }
        }
        if(flag==false){
            System.out.println(result+"ay");
        }
        else{
            System.out.println(tempresult+result+"ay");
        }
    }  //myay amenay isay aswinay
	public static void piglatin1(){
		//london ondonlay 
		//my name is aswin devaraj - input
		//myay ameay isay aswinay evarajday - output
		// if vowel encountered - then we need to substring and add the first few characters at beginning and append ay at end
        String name="my name is aswin";
        String data[]=name.split(" ");
        for(int i=0;i<data.length;i++){
            piglatin2(data[i]);
        }
    }
	public static void compressionprogram() {
		String a="aaabbcc";
        Map<Character,Integer> data=new LinkedHashMap<>();
        for(char b:a.toCharArray()){
            data.put(b,data.getOrDefault(b,0)+1);
        }
        for(Map.Entry<Character,Integer>data2:data.entrySet()){
            System.out.print(data2.getKey()+""+data2.getValue()); //a3b2c2
        }
	}
	public static void displayfrequencyindescending() {
		//asked in TCS Interview
		String data="asssbbbccccc";
		Map<Character,Integer> data1=new HashMap<>();
		for(char a:data.toCharArray()) {
			data1.put(a,data1.getOrDefault(a,0)+1);
		}
		List<Map.Entry<Character,Integer>> data2=new ArrayList(data1.entrySet());
		data2.sort((k,v)->v.getValue()-k.getValue());
		for(Map.Entry<Character,Integer> data3:data2) {
			System.out.print(String.valueOf(data3.getKey()).repeat(data3.getValue())); //cccccbbbsssa
		}
	}
	public static void twodimensionarraywork() {
		String data[][]= {{"ash","dev","user"},{"cec","aaaaaa","dai","aa"}};
		Map<Integer,List<String>> result=new HashMap<>();
		/*for(String a[]:data) {
			for(String b:a) {
				if(!result.containsKey(b.length())) {
					result.put(b.length(),new ArrayList());
				}
				result.get(b.length()).add(b);
			}
		}*/
		//above and below code are same 
		for(String a[]:data) {
			for(String b:a) {
				result.computeIfAbsent(b.length(),k->new ArrayList()).add(b);
			}
		}
		result.forEach((k,v)->{
			System.out.println(k+" "+v);
		});
	}
	public static void slidingwindowmax() {
		String a="abcabcdabc";
		int left=0;
		int maxlength=0;
		int start=0;
		Map<Character,Integer> v=new HashMap<Character,Integer>();
		for(int right=0;right<a.length();right++) {
			if(v.containsKey(a.charAt(right))) {
				left=Math.max(left,(v.get(a.charAt(right))+1));
			}
			v.put(a.charAt(right),right);
			if(right-left+1>maxlength) {
				maxlength=right-left+1;
				start=left;
			}
		}
		System.out.println("length of longest substring"+maxlength);
		System.out.println(a.substring(start,start+maxlength));  // output abcd
		System.out.println(v);
	}
	public static void countingnumbers() {
		String a="001123333321156";
		int freq[]=new int[10];
		for(char b:a.toCharArray()) {
			freq[b-'0']++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=0) {
				System.out.println("The number "+i+"repeated "+freq[i]+" times");
			}
		}
	}
	public static void zigzagprint() {
		/*Input: s = "PAYPALISHIRING", numRows = 4
		Output: "PINALSIGYAHRPI"
		Explanation:
		P     I    N
		A   L S  I G
		Y A   H R
		P     I*/
		String a="PAYPALISHIRING";
		int n=4;
		List<Character> result[]=new ArrayList[n];
		for(int i=0;i<n;i++) {
			result[i]=new ArrayList<>();
		}
		int idx=0;
		int data=1;
		for(char b:a.toCharArray()) {
			if(idx==0) {
				data=1;
			}
			else if(idx==n-1) {
				data=-1;
			}
			result[idx].add(b);
			idx+=data;
		}
		StringBuilder finalans=new StringBuilder();
		for(List<Character> data2:result) {
			for(char k:data2) {
				finalans.append(k);    //aesdvjwnaair
			}
		}
		
		System.out.println(finalans.toString());
	}
	public static void duplicatewordremoval() {
		String a="Java java program";
		String result="";
		String b[]=a.split(" ");
		for(String c:b) {
			if(result.equalsIgnoreCase(c)) {
				continue;
			}
			else {
				result+=c; //Javaprogram
			}
		}
		System.out.println(result);
	}
	public static void anagramcheck() {
		String a="silent";
		String b="listen";
		if(a.length()!=b.length()) {
			System.out.println("Not An Anagram");
			return;
		}
		Map<Character,Integer> data=new HashMap<>();
		for(char c:a.toCharArray()) {
			data.put(c, data.getOrDefault(c,0)+1);
		}
		for(char d:b.toCharArray()) {
			if(!data.containsKey(d)) {
				System.out.println("Not an anagram");
				return;
			}
			data.put(d,data.get(d)-1);
			if(data.get(d)<0) {
				System.out.println("Not an Anagram");
				return;
			}
		}
		System.out.println("Anagram exists");
	}
	public static void main(String args[]) {
		//stringreversewithnumber();
		//splitdelimiters();
		//Stringlowercaseconversion();
		//timeconversion();
		//reversewordinsentence();
		//frequencycount();
		//firstnonrepeatingcharacter();
		//duplicateinname();
		//piglatin1();
		//compressionprogram();
		//displayfrequencyindescending();
		//twodimensionarraywork();
		//slidingwindowmax();
		//countingnumbers();
		//zigzagprint();
		//duplicatewordremoval();
		anagramcheck();
	}

}
