package Teachings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Sorting1{
	static boolean arraysortcheck(int arr[],int n) {
		if (n==1 || n==0) 
			return true;
		return arr[n-1]>= arr[n-2] && arraysortcheck(arr,n-1);
	}
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,6};
		int n=a.length;
		if(arraysortcheck(a,n)) 
			System.out.println("In sorted order bro");
		else
			System.out.println("Not in sorted order bro");
	}
	}
// above program to check array is in sorted order or not