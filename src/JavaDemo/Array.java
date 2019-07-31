package JavaDemo;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        /*int array[]={1,2,3,4,5,6};
        for(int i=0;i<6;i++){
            System.out.println("Array :-"+array[i]);
        }*/
        Scanner sc = new Scanner(System.in);
        int row=0;
        int column=0;
        System.out.println("Enter no. of columns and rows :-");
        row=sc.nextInt();
        column=sc.nextInt();
        int array[][] = new int[column][row];
        for (int i = 0; i < array.length; i++) {
            for(int j=0;j<array.length;j++){
                System.out.println("Enter the value of array of "+i+" of "+j+" :-");
                array[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
