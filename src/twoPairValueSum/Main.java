package twoPairValueSum;

import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<int[]> arrList = new ArrayList<int[]>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter target value...");
		int targetValue = scan.nextInt();
		
		int result = twoPairSum(arrList,targetValue);
		System.out.printf("Index of two pair sum is: %d",result);

	}
	
	public static int twoPairSum(ArrayList<int[]> arrList, int targetValue) {
		int index = -1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of pair arrays...");
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			int a[] = new int[2];
			System.out.println("Enter 1st value...");
			a[0] = scan.nextInt();
			System.out.println("Enter 2nd value...");
			a[1] = scan.nextInt();
			arrList.add(a);
		}
		
		
		for(int i =0; i<arrList.size(); i++) {
			int temp[] = arrList.get(i);
			if(temp[0]+temp[1]==targetValue) {
				index=i;
			}
		}
		
		return index;
	}

}
