/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void bubbleSort(int arr[], int n) {
        for(int itr = 1;itr < n;itr++) {
            for(int j=0;j<n-itr;j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }    
    }
    
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void display(int arr[], int n) {
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void selectionSort(int arr[], int n) {
        for(int i=0;i<n-1;i++) {
            int minIdx = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            
            swap(arr,i,minIdx);
        }
    }
    
    public static void insertionSort(int arr[], int n) {
        for(int i=1;i<n;i++) {
            for(int j=i-1;j>=0;j--) {
                if(arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                } else {
                    break;
                }
            }
        }
    }
    
    public static int [] mergeSort(int arr[], int low, int high) {
        if (low == high) {
            int base[] = new int[1];
            base[0] = arr[low];
            return base;
        }
        
        
        int mid = (low + high)/2;
        
        int fh[] = mergeSort(arr,low,mid);
        int sh[] = mergeSort(arr,mid+1,high);
        
        return mergeTwoSortedArray(fh,sh);
    }
    
    public static int [] mergeTwoSortedArray(int a1[], int a2[]) {
        int n = a1.length;
        int m = a2.length;
        
        int ans[] = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m) {
            if (a1[i] > a2[j]) {
                ans[k] = a2[j];
                j++;
            } else {
                ans[k] = a1[i];
                i++;
            }
            
            k++;
        }
        
        
        while(i<n) {
            ans[k] = a1[i];
            i++;
            k++;
        }
        
        while(j<m) {
            ans[k] = a2[j];
            j++;
            k++;
        }
        
        
        return ans;
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int [n];
		for(int i=0;i<n;i++) {
		    arr[i] = scn.nextInt();
		}
		display(arr,n);
		arr =  mergeSort(arr,0,n-1);
		display(arr,n);
	}
}
