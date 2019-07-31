package JavaDemo;

import java.util.Scanner;

public class OneDArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=0;
        System.out.println("Enter the size of array =");
        size=sc.nextInt();
        int array[]=new int[size];
        for (int i=0;i<array.length;i++){
            System.out.println("Enter the "+i+" value of array =");
            array[i]=sc.nextInt();
        }
        System.out.println("Array :-");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
    }
}
