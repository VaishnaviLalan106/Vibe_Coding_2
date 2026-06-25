package service;

import java.io.*;
import java.util.ArrayList;
import model.Book;
import model.Member;


public class FileManager {
        public static void saveBooks(ArrayList<Book> books){

    try{

        FileWriter writer = new FileWriter("books.txt");


        for(Book book : books){

            writer.write(
                book.getBookId() + "," +
                book.getTitle() + "," +
                book.getAuthor() + "," +
                book.isIssued()
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
                member.getMemberId() + "," +
                member.getMemberName()
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
public static ArrayList<Book> loadBooks(){

    ArrayList<Book> books = new ArrayList<>();

    try{

        FileReader reader = new FileReader("books.txt");

        BufferedReader br = new BufferedReader(reader);


        String line;


        while((line = br.readLine()) != null){

            String data[] = line.split(",");


            String bookId = data[0];

            String title = data[1];

            String author = data[2];

            boolean isIssued = Boolean.parseBoolean(data[3]);


            Book book = new Book(title,author,Integer.parseInt(bookId));


            book.setIssued(isIssued);


            books.add(book);

        }


        br.close();


    }
    catch(IOException e){

        System.out.println("No book data found.");

    }


    return books;

}
public static ArrayList<Member> loadMembers(){

    ArrayList<Member> members = new ArrayList<>();

    try{

        FileReader reader = new FileReader("members.txt");

        BufferedReader br = new BufferedReader(reader);


        String line;


        while((line = br.readLine()) != null){


            String data[] = line.split(",");


            int id = Integer.parseInt(data[0]);

            String name = data[1];


            Member member = new Member(
                    id,
                    name
            );


            members.add(member);

        }


        br.close();


    }
    catch(IOException e){

        System.out.println("No member data found.");

    }


    return members;

}
}