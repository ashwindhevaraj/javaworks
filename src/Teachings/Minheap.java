package Teachings;

import java.util.Arrays;

public class Minheap {
public static void main(String args[]) {
	int a[]= {7,2,9,1,5,8};
	int n=a.length;
	for(int i=n/2-1;i>=0;i--) {
		minheap(a,n,i);
	}
	for(int i=n-1;i>0;i--) {
		int temp=a[i];
		a[i]=a[0];
		a[0]=temp;
		minheap(a,i,0);
	}
	System.out.println(Arrays.toString(a));
}
public static void minheap(int a[],int n,int i) {
	int smallest=i;
	int left=(2*i)+1;
	int right=(2*i)+2;
	if(left<n && a[left]<a[smallest])
		smallest=left;
	if(right<n && a[right]<a[smallest])
		smallest=right;
	if(smallest!=i) {
		int temp=a[i];
		a[i]=a[smallest];
		a[smallest]=temp;
		minheap(a,n,smallest);
	}
}
}
