# Virtual Dictionary 📖

A simple desktop dictionary application built with **Java** and **JavaFX**. The application allows users to search for words and display their corresponding meanings through a graphical user interface.

## Features

- Search for words using a text field.
- Display word definitions.
- Provide feedback when a word cannot be found.
- Handle empty search input.
- Interactive Search button.
- Simple and user-friendly graphical interface.

## Technologies Used

- **Java 17** – Programming language.
- **JavaFX 21.0.2** – Graphical user interface.
- **Maven** – Dependency management and application launching.
- **IntelliJ IDEA** – Development environment.

## Project Structure

The application follows the **Model-View-Controller (MVC)** design pattern.

| Class | Responsibility |
|---|---|
| `Dictionary` | Stores words and their meanings and retrieves definitions. |
| `DictionaryController` | Handles search requests and manages search feedback. |
| `DictionaryView` | Creates and displays the JavaFX graphical interface. |
| `Main` | Launches the JavaFX application. |

## How It Works

1. The user enters a word into the search field.
2. The user clicks the Search button.
3. The View sends the entered word to the Controller.
4. The Controller searches the Dictionary Model.
5. The matching definition or an appropriate error message is displayed in the interface.

## Example Searches

| Search Input | Expected Result |
|---|---|
| `apple` | A red fruit. |
| `computer` | An electronic device. |
| `book` | A collection of written pages. |
| `banana` | Word not found |
| Empty input | Please enter a word |

## Running the Application

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA.
3. Ensure Maven dependencies have been loaded.
4. Run the application using the JavaFX Maven plugin:

   `javafx:run`

## Learning Objectives

This project was developed to practice:

- JavaFX GUI development.
- Event-driven programming.
- Handling button click events.
- Using Java collections (`HashMap`).
- Exception handling.
- Implementing the Model-View-Controller (MVC) architecture.

## Author

Developed as part of an Object-Oriented Programming course assignment.

---

**Project:** Virtual Dictionary  
**Status:** Completed and functional 🎉
