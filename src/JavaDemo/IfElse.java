package JavaDemo;

import java.util.Scanner;

public class IfElse {

    private void checkIfElse(int num){
        if(num%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:-");
        int num=sc.nextInt();
        IfElse demo= new IfElse();
        demo.checkIfElse(num);
    }

}
