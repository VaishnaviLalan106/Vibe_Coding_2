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
            System.out.println("4. View Members");
            System.out.println("5. Issue Book");
            System.out.println("6.  Return Book");
            System.out.println("7. Search Book");
            System.out.println("8. Exit");


            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch(choice){


                case 1:

                    scanner.nextLine(); // clears leftover enter key

System.out.print("Enter book title: ");
String title = scanner.nextLine();


System.out.print("Enter author name: ");
String author = scanner.nextLine();


System.out.print("Enter book ID: ");
int id = scanner.nextInt();


                    Book newBook = new Book(title, author, id);
                    library.addBook(newBook);
                    break;



                case 2:

                    library.displayBooks();
                    break;



                case 3:

                    scanner.nextLine();

    System.out.print("Enter member ID: ");
    int memberId = scanner.nextInt();


    scanner.nextLine();


    System.out.print("Enter member name: ");
    String memberName = scanner.nextLine();



    Member newMember = new Member(
            memberId,
            memberName
    );


    library.addMember(newMember);
                    break;



                case 4:

                    library.displayMembers();
                    break;



                case 5:

                    System.out.print("Enter book ID to issue: ");
                    int bookId = scanner.nextInt();

                    System.out.print("Enter member ID: ");
                    int issueMemberId = scanner.nextInt();

                    library.issueBook(bookId, issueMemberId);
                    break;



                case 6:

                    System.out.print("Enter book ID: ");
    int returnBookId = scanner.nextInt();


    System.out.print("Enter member ID: ");
    int returnMemberId = scanner.nextInt();



    library.returnBook(returnBookId, returnMemberId);
                    break;
                
                case 7:
                scanner.nextLine();


                System.out.print("Enter book title: ");

                String searchTitle = scanner.nextLine();


                library.searchBook(searchTitle);
                    break;
                
                case 8:
                    
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:

                    System.out.println("Invalid choice");

            }

        }


    }

}