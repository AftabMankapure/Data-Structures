package Deletion_of_elements;

import java.util.Arrays;
import java.util.Scanner;

public class usingNewArrayDeletion {
    
    //Deletion from start
    static void fromStart(int[]arr){
        int []newArr=new int[arr.length-1];
        for (int i = 0; i < arr.length-1 ; i++) {
            newArr[i]=arr[i+1];
        }
        System.out.println("Array after delete first elements of arrar "+Arrays.toString( newArr));
    }

    //Deletion form end
    static void fromend(int[]arr){
        int newArr[]=new int[arr.length-1];
        for (int i = 0; i < newArr.length ; i++) {
            newArr[i]=arr[i];
        }

        System.out.println("Array after delete last element of array:"+Arrays.toString(newArr));
    }

    //Delete specific element from array
    static void delele(int[]arr,int ele){
        int newArr[]=new int[arr.length-1];
        for (int i = 0,k=0; i < arr.length; i++) {
            if (arr[i]!=ele){
                newArr[k]=arr[i];
                k++;
            }
        }
        System.out.println("Array after deletion of "+ele+ " from arrray :"+Arrays.toString(newArr));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter length of array :");
        int len= sc.nextInt();

        int []arr=new int[len];
        System.out.println("Enter "+ len+"  array element:");
        for (int i = 0; i <len ; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println("Your array before deletion:"+ Arrays.toString(arr));
        
        //Deletion form start
        fromStart(arr);

        //Deletion of last element of array
        fromend(arr);

        System.out.println("Your array before deletion:"+ Arrays.toString(arr));
        System.out.println("Enter which you want to delete:");
        int ele= sc.nextInt();

        //Delete specific element form arrray
        delele(arr,ele);
    }
}

/*
Output
Enter length of array :
5
Enter 5  array element:
11
22
33
44
55
Your array before deletion:[11, 22, 33, 44, 55]
Array after delete first elements of arrar [22, 33, 44, 55]
Array after delete last element of array:[11, 22, 33, 44]
Your array before deletion:[11, 22, 33, 44, 55]
Enter which you want to delete:
33
Array after deletion of 33 from arrray :[11, 22, 44, 55]

 */