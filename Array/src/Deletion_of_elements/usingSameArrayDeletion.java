//Deletion of array elements using same array :
                                            // 1.  from start of array
                                            // 2.  from end of array
                                            // 3.  from specific elements of array
package Deletion_of_elements;

import java.util.Arrays;
import java.util.Scanner;

public class usingSameArrayDeletion {

    //Method for delete first elements of array:
    static void fromstart(int[]arr){
        for (int i = 0; i < arr.length -1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;

        System.out.println("Array After delete  first element of array  :"+Arrays.toString(arr));
    }

    //Method for delete last elements of array:
    static void fromlast(int[]arr){
        arr[arr.length-1]=0;

        System.out.println("Array After delete  last element of array  :"+Arrays.toString(arr));
    }

    //Method for delete specific elements
    static void delele(int[] arr,int ele){
        int index=0;
        while(arr[index]!=ele){
            index++;
        }
        for (int i = index; i < arr.length-1 ; i++) {
            arr[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter length of array : ");
        int len=sc.nextInt();

        int []arr=new int[len];
        System.out.println("Enter "+len+" array elements:");
        for (int i = 0; i <len ; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Your array before deletion :"+ Arrays.toString(arr));

        //Delete last elements of array:
       fromlast(arr);

        //Delete first element of array:
        fromstart(arr);

        System.out.println("Enter elements which want ro delete :");
        int ele=sc.nextInt();

        //Delete specific elements of array:
        delele(arr,ele);

    }
}
