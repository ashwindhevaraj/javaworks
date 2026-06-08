package Teachings;

import java.util.Arrays;

public class Hackerrankchecks {
	public static void chocolateproblem() {
		int a[]= {12,4,7,9,2,23,25,41,30,40,28,42,30,44,48,43,50}; //denotes no of chocolates
		int n=a.length;
		int m=3; //denotes no of students
		// we need to give output for min difference of first to third student chocolate as min difference
		//42,43,44 - triplets will give 2 as different-which is small min through any 3 combinations
		int minlength=Integer.MAX_VALUE;
		Arrays.sort(a);
		for(int i=0;i+m-1<n;i++) {
			if(a[i+m-1]-a[i]<minlength) {
				minlength=a[i+m-1]-a[i];
			}
		}
		System.out.println(minlength);
	}
	public static int updowncountproblem(String a) {
		int n=a.length();
		int i=0;
		char b[]=new char[n];
		int count=0;
		int pcount=0;
		int res=0;
		b=a.toCharArray();
		while(i!=n) {
			if(b[i]=='U') {
				count++;
			}
			else {
				count--;
			}
			if(count<=0) {
				if(count==0&&pcount<0)
					res++;
			}
			pcount=count;
			i++;
		}
		return res;
	}
	public static int pagecountproblem1(int n,int p) {
		int count=0;
		int k=n/2;
		if(p==1 || p==n)
			return count;
		else if(p<=k){
			for(int i=2;i<=k;i=i+2) {
				count++;
				if(p==i || p==i+1) {
					return count;
				}
			}
		}
		else {
			if(n%2!=0) {
				count++;
				n=n-1;
			}
			for(int i=n;i>=k;i=i-2) {
				
				if(p==i || p==i-1) {
					return count;
				}
				count++;
				
			}
		}
		return 0;
	}
public static void main(String args[]) {
	Hackerrankchecks check=new Hackerrankchecks();
	//int k=pagecountproblem1(9,4);
	//System.out.println(k);
	/*int a=check.updowncountproblem("UDDDUDUU");
	System.out.println("deep covered "+a);*/
	chocolateproblem();
	}
}
