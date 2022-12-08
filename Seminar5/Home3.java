package Seminar5;

import java.util.Arrays;

/*
 * реализовать алгоритм пирамидальной сортировки(HeapSort)
 */
public class Home3 {
    public static void main(String[] args) {
        int arr[] = {14, 28, 18, 36, 56, 8, 25, 17};        
        System.out.println("Дан массив: " + Arrays.toString(arr));        
        Home3 ob = new Home3();
        ob.sort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }
    public void sort(int arr[]){    
        int n = arr.length;        
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);          
        for (int i=n-1; i>=0; i--){                   
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;            
            heapify(arr, i, 0);
        }
    }    
     void heapify(int arr[], int n, int i){    
        int largest = i; 
        int l = 2*i + 1; 
        int r = 2*i + 2;            
        if (l < n && arr[l] > arr[largest])
            largest = l;          
        if (r < n && arr[r] > arr[largest])
            largest = r;       
        if (largest != i){        
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;          
            heapify(arr, n, largest);
        }
    }
}
