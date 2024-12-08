package Teachings;

import java.util.Arrays;

public class Heapsort {
	public static void heapify(int a[],int n,int i) {
		int largest=i;
		int left=(2*i)+1;
		int right=(2*i)+2;
		if(left<n && a[left]>a[largest]) {
			largest=left;
		}
		if(right<n && a[right]>a[largest]) {
			largest=right;
		}
		if(largest!=i) {
			int temp=a[largest];
			a[largest]=a[i];
			a[i]=temp;
			heapify(a,n,largest);
		}
	}
	public static void heapsort(int a[],int n) {
		for(int i=(n/2)-1;i>=0;i--) {
			heapify(a,n,i);
		}
		for(int j=n-1;j>0;j--) {
			int temp=a[0];
			a[0]=a[j];
			a[j]=temp;
			heapify(a,j,0);
		}
	}
	public static void main(String args[]) {
		int a[]= {3,6,5,4,1,2,9,8};
		int n=a.length;
		heapsort(a,n-1);
		System.out.println(Arrays.toString(a));
	}

}
