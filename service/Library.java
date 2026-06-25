package service;
import java.util.ArrayList;

import model.Book;
import model.Member;


public class Library {


    ArrayList<Book> books;
    ArrayList<Member> members;


    public Library(){

        books = FileManager.loadBooks();
        members = FileManager.loadMembers();

    }
    public void addBook(Book book){

    books.add(book);
    FileManager.saveBooks(books);

    System.out.println("Book added successfully");

}

    public void addMember(Member member){

        members.add(member);
        
        FileManager.saveMembers(members);
        System.out.println("Member added successfully");

    }
    public void displayBooks(){

    if(books.isEmpty()){

        System.out.println("No books available.");

    }
    else{

        for(Book book : books){

            book.displayBook();
            System.out.println("----------------");

        }

    }

}
public void displayMembers(){

    if(members.isEmpty()){

        System.out.println("No members available.");

    }
    else{

        for(Member member : members){

            member.displayMember();
            System.out.println("----------------");

        }

    }

}
public void issueBook(int bookId, int memberId){

    Book selectedBook = null;
    Member selectedMember = null;


    // Find book
    for(Book book : books){

        if(book.getBookId() == bookId){

            selectedBook = book;
            break;

        }

    }


    // Find member
    for(Member member : members){

        if(member.getMemberId() == memberId){

            selectedMember = member;
            break;

        }

    }


    if(selectedBook == null){

        System.out.println("Book not found.");
        return;

    }


    if(selectedMember == null){

        System.out.println("Member not found.");
        return;

    }


    if(selectedBook.isIssued()){

        System.out.println("Book already issued.");
        return;

    }


    selectedBook.setIssued(true);

    selectedMember.getBorrowedBooks().add(selectedBook);
    FileManager.saveBooks(books);


    System.out.println("Book issued successfully.");

}
public void returnBook(int bookId, int memberId){


    Book selectedBook = null;
    Member selectedMember = null;



    // Find book

    for(Book book : books){

        if(book.getBookId() == bookId){

            selectedBook = book;
            break;

        }

    }



    // Find member

    for(Member member : members){

        if(member.getMemberId() == memberId){

            selectedMember = member;
            break;

        }

    }



    if(selectedBook == null){

        System.out.println("Book not found.");
        return;

    }


    if(selectedMember == null){

        System.out.println("Member not found.");
        return;

    }



    if(!selectedBook.isIssued()){

        System.out.println("This book is already available.");

        return;

    }



    selectedBook.setIssued(false);


    selectedMember.getBorrowedBooks().remove(selectedBook);

    FileManager.saveBooks(books);
    System.out.println("Book returned successfully.");

}
public void searchBook(String title){


    boolean found = false;


    for(Book book : books){

        
        if(book.getTitle().trim().equalsIgnoreCase(title.trim())) {


            System.out.println("Book Found");

            book.displayBook();

            found = true;


        }

    }



    if(!found){

        System.out.println("Book not found.");

    }

}



}