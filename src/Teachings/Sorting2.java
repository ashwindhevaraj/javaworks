package Teachings;

import java.util.Arrays;

public class Sorting2 {
	public static void main(String args[]) {
		int a[]= {1,0,0,1,0,1,0};
		int hi=a.length-1;
		int lo=0;
		int temp=0;
		//public void sort()
		while(lo<hi) {
		while(a[lo]==0 && lo<hi)
			lo++;
		while(a[hi]==1 && lo<hi)
			hi--;
		if(lo<hi) {
			temp=a[lo];
			a[lo]=a[hi];
			a[hi]=temp;
			lo++;
			hi--;
		}
		}
		System.out.println(Arrays.toString(a));
	}
}
