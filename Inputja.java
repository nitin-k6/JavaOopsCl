import java.util.Scanner;
public class Inputja{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in); // System.in is standard input stream
    System.out.println("Enter first number");
    int a =scanner.nextInt();
    System.out.println("Enter second number");
    int b=scanner.nextInt();
    int c = a + b;
    System.out.println("The sum is " + c);
    scanner.close(); // if we don't write .close() function then it will resource leak error but still we could run the program

    }
}

