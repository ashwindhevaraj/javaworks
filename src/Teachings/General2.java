package Teachings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class General2 {
	public static void romantointeger() {
		Map<Character,Integer> rom=new HashMap<Character,Integer>();
		rom.put('I', 1);
		rom.put('X', 10);
		rom.put('V', 5);
		rom.put('L', 50);
		rom.put('C', 100);
		rom.put('D', 500);
		rom.put('M', 1000);
		String roman="XIX";
		int sum=0;
		for(int i=0;i<roman.length();i++) {
			if(i>0 && rom.get(roman.charAt(i))>rom.get(roman.charAt(i-1))) {
				sum+=rom.get(roman.charAt(i))-2*rom.get(roman.charAt(i-1));
			}
			else {
				sum+=rom.get(roman.charAt(i));
			}
		}
		System.out.println(sum);
	}
	public static void mergetwosortarrays() {
		int a[]= {1,3,5};
		int b[]= {2,4,6,8};
		int c[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]>b[j]) {
				c[k++]=b[j++];
			}
			else {
				c[k++]=a[i++];
			}
		}
		while(i<a.length) {
			c[k++]=a[i++];
		}
		while(j<b.length) {
			c[k++]=b[j++];
		}
		System.out.println(Arrays.toString(c));
	}
public static void main(String args[]) {
	General2 obj = new General2();
	//romantointeger();
	mergetwosortarrays();
}
}
