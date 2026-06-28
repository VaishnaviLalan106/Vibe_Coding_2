# 📚 Library Management System

A console-based **Library Management System** developed using **Core Java**.

This project was created as a learning project to understand Java fundamentals, Object-Oriented Programming, project structure, collections, and file handling.

The main focus of this project is implementing the complete backend logic of a library system without using external databases or frameworks.

---

# 🚀 Features

The application provides the following functionalities:

✅ Add new books  
✅ Display all books  
✅ Add library members  
✅ Display all members  
✅ Issue books to members  
✅ Return issued books  
✅ Search books by title  
✅ Save data permanently  
✅ Load previous data automatically when the application starts  

---

# 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- ArrayList Collection Framework
- File Handling
- VS Code

---

# 🧠 Concepts Implemented

## Object-Oriented Programming

The project follows OOP principles using different classes:

### Book Class
Handles book-related information:

- Book ID
- Book title
- Author name
- Availability status

### Member Class
Handles member information:

- Member ID
- Member name
- Borrowed books list

### Library Class
Works as the main service layer:

- Adding books
- Adding members
- Issuing books
- Returning books
- Searching books

### FileManager Class
Responsible for data storage operations.

---

# 💾 Data Storage

Instead of using a database or JSON libraries, this project uses **text file storage** to understand Java file handling concepts.

The application stores data in:

data/books.txt
data/members.txt

The stored information includes:

- Book ID
- Book title
- Author
- Issue status

When the application starts, existing records are automatically loaded from these files.

---

# 🔄 Application Flow

          Main.java
              |
              |
              ↓
          Library.java
              |
              |
              ↓
        FileManager.java
              |
              |
              ↓
         Text Files
    (books.txt / members.txt)


The user interacts with the console menu.

The Library class manages operations, while FileManager handles saving and loading data.

---

# 📌 Learning Outcomes

Through this project, I learned:

- Creating and organizing Java packages
- Implementing OOP concepts practically
- Using ArrayList to manage objects
- Working with constructors and methods
- Implementing file reading and writing
- Creating a layered project structure
- Debugging Java errors related to packages and classes

---

# 🔮 Future Improvements

The current version focuses on backend implementation and core Java learning.

Possible future enhancements:

- Add JavaFX graphical user interface
- Create a web version using Spring Boot
- Connect with MySQL database
- Add user authentication
- Add advanced search and filtering
- Improve user interface design

---

# 🎯 Project Purpose

This project was developed to strengthen practical Java programming skills and understand how backend logic works before moving towards frameworks and advanced technologies.

---

# 👩‍💻 Author

**Vaishnavi L**
