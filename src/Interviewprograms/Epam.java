package Interviewprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Epam {
	public static void movezerostoend() {
		int a[]= {5,21,0,3,4,0,5,6,0,9};
		int left=0;
		for(int right=0;right<=a.length-1;right++) {
			if(a[right]!=0) {
				a[left]=a[right];
				left++;
			}
		}
		while(left<=a.length-1) {
			a[left]=0;
			left++;
		}
		System.out.println(Arrays.toString(a));
	}
	public static void movezerostofront() {
		int a[]= {5,21,0,3,4,0,5,6,0,9};
		int read=a.length-1;
		int write=read;
		for(int i=read;i>=0;i--) {
			if(a[i]!=0) {
				a[write]=a[i];
				write--;
			}
		}
		while(write>=0) {
			a[write]=0;
			write--;
		}
		System.out.println(Arrays.toString(a));
	}
	public static void keysandvalueproblem() {
		String data[][]= {{"ash","tester"},
				{"dev","user"},
				{"ash","lead"},
				{"dev","lead"},
				{"nandhini","tester"},
				{"ash","manager"},
				{"ash","lead"},
				{"nandhini","tester"}
		};
		Map<String,Set<String>> temp=new HashMap<>();
		
		for(String temp1[]:data) {
			if(!temp.containsKey(temp1[0])) {
				temp.put(temp1[0],new HashSet<>());
				temp.get(temp1[0]).add(temp1[1]);
			}
			else {
				temp.get(temp1[0]).add(temp1[1]);
			}
		}
		/*temp.forEach(v->
		System.out.println(v));*/
		for(Entry<String, Set<String>> tempdata:temp.entrySet()) {
			System.out.println(tempdata.getKey()+" "+tempdata.getValue());
		}
	}
	public static void sumbyjavaadvanced() {
		List<String> a=Arrays.asList("1","12","14","17");
		int sum=a.stream().mapToInt(Integer::parseInt).sum();
		System.out.println(sum);
	}
public static void main(String args[]) {
	//keysandvalueproblem();
	movezerostofront();
	//sumbyjavaadvanced();
	//movezerostoend();
}
}
