import java.io.*;
import java.util.ArrayList;


public class FileManager {
        public static void saveBooks(ArrayList<Book> books){

    try{

        FileWriter writer = new FileWriter("books.txt");


        for(Book book : books){

            writer.write(
                book.bookId + "," +
                book.title + "," +
                book.author + "," +
                book.isIssued
            );


            writer.write("\n");

        }


        writer.close();


        System.out.println("Books saved successfully");


    }
    catch(IOException e){

        System.out.println("Error saving books");

    }

}
public static void saveMembers(ArrayList<Member> members){

    try{

        FileWriter writer = new FileWriter("members.txt");


        for(Member member : members){


            writer.write(
                member.memberId + "," +
                member.memberName
            );


            writer.write("\n");

        }


        writer.close();


        System.out.println("Members saved successfully");


    }
    catch(IOException e){

        System.out.println("Error saving members");

    }

}

}