package Teachings;

import java.util.Arrays;

public class Stringconcepts {
	public static void stringreversewithnumber() {
		String input="ashwin123devaraj";
		String input1[]=input.split("\\d+");
		StringBuilder output=new StringBuilder();
		String digit=input.replaceAll("\\D+","");
		int index=input.indexOf(digit);
		for(int i=0;i<input1.length;i++) {
			output.append(reverses(input1[i]));
		}
		output.insert(input.indexOf(digit),digit);
		System.out.println(output);
		}
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
	public static void main(String args[]) {
		//stringreversewithnumber();
		splitdelimiters();
	}

}
