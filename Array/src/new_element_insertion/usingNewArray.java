//Insert array elements using new array:
                        // 1.  At start of array
                        // 2.  At end of array
                        // 3.  At specific position of array
package new_element_insertion;

import java.util.Arrays;
import java.util.Scanner;

public class usingNewArray {

    // Function for insert at start of array
    static void atstart(int[]arr,int ele){
        int newArr[]=new int[arr.length+1];
        for (int i = 0; i < arr.length ; i++) {
            newArr[i+1]=arr[i];
        }
        newArr[0]=ele;

        System.out.println("New array after insert "+ ele+ " at start :"+ Arrays.toString(newArr));
    }

    // Function for insert at end of  array
    static void atend(int[] arr,int ele){
        int newArr[]=new int[arr.length+1];
        for (int i = 0; i < arr.length ; i++) {
            newArr[i]=arr[i];
        }
        newArr[newArr.length-1]=ele;

        System.out.println("New array after insert "+ ele+" at end : "+Arrays.toString(newArr));
    }

    // Function for insert at specific position of array
    static void atpos(int[] arr,int pos,int ele){
        int newArr[]=new int[arr.length+1];
        for (int i = 0; i <newArr.length ; i++) {
            if(i<pos-1){
                newArr[i]=arr[i];
            }
            else if(i==pos-1){
                newArr[i]=ele;
            }
            else {
                newArr[i]=arr[i-1];
            }
        }

        System.out.println("Array after insert "+ele +" at "+pos+" of array: "+Arrays.toString(newArr));
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter lenght of array :");
        int len=sc.nextInt();
        int arr[]=new int[len];

        System.out.println("Enter "+len+" array elements :");
        for (int i = 0; i <len ; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter new elements which you want to enter :");
        int ele=sc.nextInt();

        //Insertion at start of array :
        atstart(arr,ele);

        //insertion atb end of array:
        atend(arr,ele);

        System.out.println("Enter position where you want insert new elements :");
        int pos= sc.nextInt();

        //insert at any specific position
        atpos(arr,pos,ele);

    }
}

 /*Output:
         Enter lenght of array :3
         Enter 3 array elements :
         1
         2
         3
         Enter new elements which you want to enter :
         22
         New array after insert 22 at start :[22, 1, 2, 3]
         New array after insert 22 at end : [1, 2, 3, 22]
         Enter position where you want insert new elements :
         2
         Array after insert 22 at 2 of array: [1, 22, 2, 3]

*/