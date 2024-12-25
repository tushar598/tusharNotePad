# TusharNotePad

TusharNotePad is a Java-based Notepad application developed using the AWT and Swing frameworks. It offers a simple, intuitive interface for basic text editing operations, similar to a classic notepad.

---

## Features

- *File Operations:*
  - Create a new file
  - Open existing files
  - Save files
  - Save As functionality

- *Edit Operations:*
  - Cut, copy, and paste text
  - Select All
  - Undo and Redo (if supported in version)

- *Search Operations:*
  - Find specific text within the document
  - Replace functionality (optional enhancement)

- *User-Friendly Interface:*
  - Developed using Swing components like JMenu, JTextArea, and JFileChooser.

---

## Screenshots

### Main Interface
![Main Interface](https://github.com/user-attachments/assets/b571ef70-275a-4484-838e-81aef2e0ed4c)
![Main Interface](https://github.com/user-attachments/assets/4606fdf6-24ae-404b-a0fd-81aed6992861)
![Main Interface](https://github.com/user-attachments/assets/8b929de1-af8b-43d4-9fb4-b2820ef1922e)

### Search File Content
![Seach File Content](https://github.com/user-attachments/assets/56d1255b-4b68-425d-891e-0d32d2f14c2d)
 
### Open File Dialog
![Open File Dialog](https://github.com/user-attachments/assets/e27f4fc4-1ded-4b62-a807-ac2c33933487)

### Save File Dialog
![Save File Dialog](https://github.com/user-attachments/assets/be871568-e928-4fb0-8352-794018cdffd7)


---

## How to Run the Application

### Prerequisites

- JDK (Java Development Kit) 8 or above installed.
- NetBeans IDE (optional, for modifications).

### Steps to Run

1. Clone the repository:

   bash
   git clone https://github.com/tushar598/tusharNotePad.git
   

2. Navigate to the project directory:

   bash
   cd tusharNotePad
   

3. Compile the project using the terminal:

   bash
   javac -d bin src/*.java
   

4. Run the application:

   bash
   java -cp bin TexteditorGUI
   

---

## Project Structure

The project contains the following key files:

- *TexteditorGUI.java*: Contains the main GUI logic, menu bar setup, and file operations.
- *Utils.java* (if available): Helper methods for file reading and writing.
- *resources/*: Contains any additional assets like icons or default text files.

---

## Future Enhancements

- Add support for themes (dark mode, light mode).
- Implement advanced search and replace functionality.
- Enable real-time collaboration using sockets or web protocols.
- Integrate spell-checking functionality.

---

## Contributing

Contributions are welcome! Feel free to fork the repository, create a new branch, and submit a pull request with your proposed changes.

---

## License

This project is licensed under the MIT License. See the LICENSE file for details.

---

## Acknowledgements

- Developed using Java Swing and AWT frameworks.
- Inspired by classic text editing applications.

---

## Contact

For queries or suggestions, reach out to [tushar598](https://github.com/tushar598).
