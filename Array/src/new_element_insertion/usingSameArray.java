//Insert array elements using same array :
                                         // 1.  At start of array
                                         // 2.  At end of array
                                         // 3.  At specific position of array
package new_element_insertion;

import java.util.Arrays;
import java.util.Scanner;

public class usingSameArray {
    // Function for insert at end of array
    static void atend(int arr[],int len,int ele){
        arr[len]=ele;
        System.out.print("Array after insert "+ ele+" at end of array :");
        for (int i = 0; i <=len ; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    // Function for insert at start of array
    static void atstart(int []arr,int len,int ele){
        for (int i = len; i >=0 ; i--) {
            arr[i+1]=arr[i];
        }
        arr[0]=ele;

        System.out.print("\nArray after insert "+ele+" at start of array :");
        for (int i = 0; i <=len; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    // Function for insert at specific position of array
    static  void atpos(int []arr,int len,int pos,int ele ){
        for (int i = len; i >=pos-1 ; i--) {
            arr[i+1]=arr[i];
        }
        arr[pos-1]=ele;

        System.out.print("\nArray after insert "+ ele+" at position  "+ pos+" array is :");
        for (int i = 0; i <=len ; i++) {
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[10];

        System.out.println("Enter lenght of array :");
        int len= sc.nextInt();

        System.out.println("Enter "+ len +" array elements :");
        for (int i = 0; i <len ; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter new elements which want to enter in array :");
        int ele=sc.nextInt();

        System.out.println("Enter position where you  want to insert elements :");
        int pos=sc.nextInt();


        //Insert at the end of array
       atend(arr,len,ele);

       //If you want to do all operation then increment len by 1 otherwise comments other method
        len++;

        //insert at the start of array
        atstart(arr,len,ele);

        len++;
        //Insert element at specific position
        atpos(arr,len,pos,ele);
    }
}

/*
Output :

Enter lenght of array :
5
Enter 5 array elements :
1
2
3
5
5
Enter new elements which want to enter in array :
100
Enter position where you  want to insert elements :
3
Array after insert 100 at end of array : 1 2 3 5 5 100
Array after insert 100 at start of array : 100 1 2 3 5 5 100
Array after insert 100 at position  3 array is : 100 1 100 2 3 5 5 100
 */
