import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Library library = new Library();


        Scanner scanner = new Scanner(System.in);



        while(true){


            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Add Member");
            System.out.println("4. Exit");


            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();



            switch(choice){


                case 1:

                    System.out.println("Add Book selected");
                    break;



                case 2:

                    System.out.println("View Books selected");
                    break;



                case 3:

                    System.out.println("Add Member selected");
                    break;



                case 4:

                    System.out.println("Exiting...");
                    System.exit(0);



                default:

                    System.out.println("Invalid choice");

            }

        }


    }

}