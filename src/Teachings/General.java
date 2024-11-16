package Teachings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class General{
	public static void main(String args[]) {
		General g=new General();
		char a='\u0061';
		int b=0b1111;
		int c=01111;
		int d[]= {1,2,3,4,5};
		int e=10,f=15;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d.length);
		g.arraysum(new int[] {1,2,3,4,5});
		if (++e<10 || ++f>15)
			e++;
		else
			f++;
		System.out.println("value of e and f is"+e+f);
		boolean h=true;
		if(h=false)
			System.out.println("Inside false lloop");
			else
				System.out.println("Inside no false loop");
	int i=0;
	int j=2;
	switch(i+2){
	case 0:
		System.out.println("you entered 0 da");
		break;
	case 2:
		System.out.println("you entered 2 da");
		break;
		default:
			System.out.println("can you enter correct one");
	}
	}
	public void arraysum(int a[]){
		int total=0;
		for (int x:a) {
			total+=x;
		}
		System.out.println(total);
	}
}
