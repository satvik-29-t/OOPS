package JAVA;
import java.util.Scanner;

public class OOP2{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String name;
        System.out.println("Enter your name : ");
        name = sc.next();

        int ID;
        System.out.println("Enter your ID number : ");
        ID = sc.nextInt();

        int Bus;
        System.out.println("Enter your bus route number : ");
        Bus = sc.nextInt();

        System.out.println("The student data is given below ");
        System.out.println("Name : " + name);
        System.out.println("ID : " + ID);
        System.out.println("Bus Route Number : " + Bus);
    }
}
