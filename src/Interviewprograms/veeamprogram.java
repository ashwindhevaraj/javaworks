package Interviewprograms;

import java.util.HashMap;
import java.util.Map;

// string arrays having values Abcd* begfg *kelmb geef#
// output will single string - starts with A and ends with Z
//each string endvalue will be starting value of another string - in such a way string to be appended
public class veeamprogram {
	public static void main(String args[]) {
		String a[]= {"Abcd*","begfg","*kelmb","geefZ"};
		Map<Character,String> c=new HashMap<Character,String>();
		for(String b:a) {
			c.put(b.charAt(0),b);
		}
		StringBuilder result=new StringBuilder();
		String current="";
		for(String d:a) {
			if(d.charAt(0)=='A') {
				current=d;
			}
		}
		result.append(current);
		while(current.charAt(current.length()-1)!='Z') {
			char last=current.charAt(current.length()-1);
			String temp=c.get(last);
			if(temp!=null) {
				result.append(temp.substring(1));
			}
			current=temp;
		}
		System.out.println(result.toString());
	}

}
