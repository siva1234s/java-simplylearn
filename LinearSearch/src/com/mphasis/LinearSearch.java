package com.mphasis;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {

	    int arr[] = {10,20,50,40,60,30};
	        System.out.println("Enter key for linear search");
			Scanner  scanner = new Scanner(System.in);
	        int key =	scanner.nextInt();
	        int result =		linearSearch(arr, key);
	          if(result == -1) {

					System.out.println("Element not found");

				}
				else {

				System.out.println("Element found at index "+result);

				}
	}
	public static int   linearSearch(int arr[],int key) {

					int len = arr.length;

					int index = -1;

				for (int i = 0; i < len; i++) {

					if(arr[i] == key) { // if key found in given array

						index = i;   // index value will update
					}
	}
	return index;

			}
	}
