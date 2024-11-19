package Teachings;

public class Quicksort {
	public static int partition(int arr[],int left,int right) {
		//0. pivot to be chose as left element
		int pivot=arr[left];
		int pivotpos=left;
		//5.we need to run until left is smaller than right
		while(left<right) {
		//1.this while loop iterate until any left element is greater than pivot obtains
		// we added left<arr.length-1 to prevent last element getting error on index out of bounds
		while(arr[left]<=pivot && left<arr.length-1) {
			left++;
		}
		//2.this while loop iterate until any right element is lesser than pivot obtains
		// we added left<arr.length to prevent last element getting error on index out of bounds
		while(arr[right]>pivot && right<arr.length) {
			right--;
		}
		//3.we are swapping only if left is less than right
		if(left<right)
		swap(arr,left,right);
		}
		//4.this will executed after cross over of left and right- here right being the pivot position- swapping pivot position with pivot
		swap(arr,pivotpos,right);
		return right;
	}
	public static void swap(int arr[],int left,int right) {
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}
	public static void quicksort(int arr[],int left,int right) {
		if(left<right) {
			int partitiondata=partition(arr,left,right);
			quicksort(arr,left,partitiondata-1);
			quicksort(arr,partitiondata+1,right);
		}
	}
public static void main(String args[]) {
	int a[]= {4,5,6,1,3,2,8,9,0};
	int left=0;
	int right=(a.length)-1;
	quicksort(a,left,right);
	for(int x:a) {
		System.out.println(x);
	}
}
}
