package JavaDemo;

import java.util.Scanner;

public class Calci {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,n;
        do {
            System.out.println("1: Addition\n2: Substraction\n3: Multiplication\n4: Division\n5: Exit\n Select Your Choice:-");
            n=sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter two numbers to be added:-");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    int add = a + b;
                    System.out.println("Addition of "+a+ " and "+b+" :- " + add);
                    break;
                case 2:
                    System.out.println("Enter two numbers to be substracted:-");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    int sub = a - b;
                    System.out.println("Substraction of "+a+" and "+b+" :-" + sub);
                    break;
                case 3:
                    System.out.println("Enter two numbers to be multiplied:-");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    int mul = a * b;
                    System.out.println("Multiplication of "+a+" and "+b+" :-" + mul);
                    break;
                case 4:
                    System.out.println("Enter two numbers to be divided:-");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    int div = a / b;
                    System.out.println("Division of "+a+" and "+b+" :-" + div);
                    break;
                case 5:
                    System.exit(0);
            }
        }while (n<5);
    }
}
