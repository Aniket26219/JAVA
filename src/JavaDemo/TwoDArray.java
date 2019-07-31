package JavaDemo;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row=0;
        int column=0;
        System.out.println("Enter no. of rows and columns :-");
        row=sc.nextInt();
        column=sc.nextInt();
        int array[][] = new int[column][row];
        for (int i = 0; i < array.length; i++) {
            for(int j=0;j<array.length;j++){
                System.out.println("Enter the value of array of "+i+" row and "+j+" column :-");
                array[i][j]=sc.nextInt();
            }
        }
        /*for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                System.out.print(i+" Row "+j+" Column = "+array[i][j]+"\t");
            }
            System.out.println();
        }*/
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
