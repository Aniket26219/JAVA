package JavaDemo;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int count,i1=0,i2=1,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Fibonacci Series :-");
        count=sc.nextInt();
        System.out.println("First number:-"+count);
        for(int i=0;i<=count;i++)
        {
            System.out.println(i1);
            sum=i1+i2;
            i1=i2;
            i2=sum;
        }
    }
}
