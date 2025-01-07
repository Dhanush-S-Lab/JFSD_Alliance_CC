import java.util.Scanner;
public class Jfsd{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); //obj creation

        //Variable Declaration
        /*
        
        Syntax: datatype variableName = value;

        // compile time initiailization
    
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40;
        float e = 50.5;
        double f = 60.5;
        char g = 'A';
        boolean h = true;

        runtime initialization

        byte a;

        */

       int by = 34;
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40;

        c = sc.nextInt();
        d= sc.nextLong();
        by = sc.nextInt();
        
        String s;

        s = sc.nextLine(); // line input with space
        s = sc.next(); // without space

        System.out.println(b+" "+c);
        System.out.print(b+" "+c);
        System.out.printf("%d %d",b,c);
    }
}