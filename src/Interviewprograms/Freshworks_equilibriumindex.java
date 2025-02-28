package Interviewprograms;

import java.util.Scanner;

public class Freshworks_equilibriumindex {
	//input [-7,1,5,2,-4,3,0]- output is position 3- at pos 3 left array sum will be equal to right array sum- not included element at pos 3
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		int j=0;
		System.out.println("enter the total count of array");
		int n=k.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the element "+i);
			a[i]=k.nextInt();
		}
		int result=0;
		for(j=1;j<n;j++) {
			result=check(a,j);
			if(result==0)
				continue;
			else {
				System.out.println("position is "+(j));
				break;
			}
				
		}
		// if no result happened- then this will be printed
		if(j==n)
			System.out.println("-1");
		
	}
	public static int check(int b[],int pos) {
		int n=b.length;
		int lcount=0;
		int rcount=0;
		for(int i=0;i<=pos-1;i++) {
			lcount+=b[i];
		}
		for(int j=pos+1;j<n;j++) {
			rcount+=b[j];
		}
		if(lcount==rcount)
			return pos;
		else
			return 0;
		
	}
}
