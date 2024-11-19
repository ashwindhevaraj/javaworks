package Teachings;

public class Mergesort {
public static void main(String args[]) {
	int a[]= {4,2,1,3,6,5,9,8};
	int left=0;
	int right=(a.length)-1;
	sort(a,left,right);
	for(int x:a) {
		System.out.println(x);
	}
}
public static void sort(int a[],int left,int right) {
	if(left<right) {
		//to find midpoint
		int m=(left+right)/2;
		// to sort in left
		sort(a,left,m);
		// to sort in right
		sort(a,m+1,right);
		//merge the sorted data
		merge(a,left,m,right);
	}
}
public static void merge(int a[],int left,int m,int right) {
	//size of left array n1
	//size of right array n2
	int n1=m-left+1;
	int n2=right-m;
	//create new array of c and d with size n1 and n2
	int c[]=new int[n1];
	int d[]=new int[n2];
	//copy the element of left to c and right to d
	for(int i=0;i<n1;i++) {
		c[i]=a[left+i];
	}
	for(int j=0;j<n2;j++) {
		d[j]=a[m+1+j];
	}
	// assign k to the left index
	int k=left;
	int i=0;
	int j=0;
	while(i<n1 && j<n2) {
		if(c[i]<=d[j]) {
			a[k]=c[i];
			i++;
		}
		else {
			a[k]=d[j];
			j++;
		}
		k++;	
	}
	while(i<n1) {
		a[k]=c[i];
		i++;
		k++;
	}
	while(j<n2) {
		a[k]=d[j];
		j++;
		k++;
	}
}
}
