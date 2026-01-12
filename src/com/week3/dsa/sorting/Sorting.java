package com.week3.dsa.sorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int[] newArr = {5, 7, 2, 90, 67};

//        bubbleSort(newArr);
//        insertionSort(newArr);
//        selectionSort(newArr);
//        System.out.println(Arrays.toString(newArr));
        System.out.println(mergeSort(newArr));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];

            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int currentMin = arr[i];
            int index = i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<currentMin) {
                    currentMin = arr[j];
                    index = j;
                }
            }
            swap(arr, i, index);
        }
    }

    private static void swap(int[] arr, int start, int current) {
        int temp = arr[start];
        arr[start] = arr[current];
        arr[current] = temp;
    }


    public static int[] mergeSort(int[] arr){
        if(arr.length==1)return arr;

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right =  mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] finalArr = new int[arr1.length + arr2.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                finalArr[k] = arr1[i];
                i++;
            } else{
                finalArr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<arr1.length){
            finalArr[k] = arr1[i];
            i++; k++;
        }

        while(j<arr2.length){
            finalArr[k] = arr1[j];
            j++; k++;
        }

        return finalArr;
    }
}
