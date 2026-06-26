package backend.model;

import java.util.ArrayList;

public class Member {

    private int memberId;
    private String memberName;
    private ArrayList<Book> borrowedBooks;

    public Member(int memberId, String memberName) {

        this.memberId = memberId;
        this.memberName = memberName;

        borrowedBooks = new ArrayList<>();

    }

    public void displayMember() {

        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + memberName);

        System.out.println("Borrowed Books:");

        if (borrowedBooks.isEmpty()) {

            System.out.println("No books borrowed");

        } else {

            for (Book book : borrowedBooks) {

                System.out.println(book.getTitle());

            }

        }

    }

    public int getMemberId() {

        return memberId;

    }

    public String getMemberName() {

        return memberName;

    }

    public ArrayList<Book> getBorrowedBooks() {

        return borrowedBooks;

    }
}
