import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice = 10;
        String name = "";
        
        System.out.print("Please enter your name => ");
        name = s.nextLine();
        while (choice != 2) {
            System.out.println("\n1. Say Hi");
            System.out.println("2. Exit the app");
            System.out.print("Choice => ");
            choice = s.nextInt();

            switch(choice){
                case 1: System.out.println("Hi, " + name);
                break;
                case 2: System.out.println("Bye!");

            }
        }
    }
}