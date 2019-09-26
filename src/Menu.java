import java.util.Scanner;

public class Menu {

    public void ctdkBacThang() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Nhập số time: ");
        int time =  sc.nextInt();
        if (time < 10) {
            System.out.println("Good morning!");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }

    public void doMenu() {




        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");

            }
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.doMenu();
        //menu.ctdkBacThang();
    }
}