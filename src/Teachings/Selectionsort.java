package Teachings;

public class Selectionsort {
	public static void selectionsort(int a[]) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
	}
public static void main(String args[]) {
	int a[]= {3,4,1,2,7,6,9,8,0};
	selectionsort(a);
	for(int x:a) {
		System.out.print(x);
	}
}
}
