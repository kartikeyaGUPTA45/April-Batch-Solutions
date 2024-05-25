/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    
    public static void sort01(int arr[], int n) {
        int i=0,j=0;
        while(i<n) {
            if (arr[i] == 0) {
                swap(arr,i,j);
                i++;
                j++;
            } else {
                i++;
            }
        }
    }
    
    public static void displayArray(int arr[], int n) {
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void sort012(int arr[], int n) {
        int i=0,j=0,k=n-1;
        
        while(i<=k) {
            if (arr[i] == 0) {
                swap(arr,i,j);
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                swap(arr,i,k);
                k--;
            }
        }
    }
    
    public static void quickSort(int arr[], int low, int high) {
        if (low > high) {
            return;
        }
        
        int pivot = arr[high];
        int pidx = pSort(arr,pivot, low,high);
        
        quickSort(arr,low,pidx-1);
        quickSort(arr,pidx+1, high);
    }
    
    public static int pSort(int arr[], int pivot, int low, int high) {
        int i=low, j=low;
        while(i<=high) {
            if (arr[i] <= pivot) {
                swap(arr,i,j);
                j++;
                i++;
            } else {
                i++;
            }
        }
        
        return (j-1);
    }
    
    
	public static void main(String[] args) {
		int n = 12;
		Scanner scn = new Scanner(System.in);
		int arr [] = new int [12];
		for(int i=0;i<n;i++) {
		    arr[i] = scn.nextInt();
		}
		
		displayArray(arr,n);
		quickSort(arr,0,11);
		displayArray(arr,n);
	}
}
