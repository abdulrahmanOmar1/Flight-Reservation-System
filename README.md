
# Flight Reservation System

## Project Overview

This project is a flight reservation system for Palestinian Airlines. It allows users to manage flights and passenger information through a graphical user interface (GUI). The system provides functionalities to add, edit, and search for flights and passengers, reserve and cancel tickets, and check if a ticket is reserved for a specific person.

## Technologies Used

### Java
The project is implemented in Java, which is an object-oriented programming language known for its portability, security features, and robust performance.

### JavaFX
JavaFX is used for building the graphical user interface (GUI) of the application. It provides a wide range of components and controls, such as buttons, labels, text fields, and layout managers, which are used to create a user-friendly interface.

### Linked List Data Structure
The project uses a linked list data structure to manage flights and passengers. The `LinkedList` class handles the creation, addition, and manipulation of flights and passengers in the list. The linked list allows for efficient insertion and deletion operations, which is essential for managing dynamic data.

### File Handling
The project includes file handling capabilities to read and write flight and passenger data from and to files. This allows the application to persist data between sessions.

## Features

1. **Display Flight Information**: View details of all available flights.
2. **Display Passenger Information for a Specific Flight**: Retrieve and display passenger details for a particular flight.
3. **Add/Edit Flight**: Add new flights or edit existing flight details.
4. **Reserve a Ticket for a Specific Flight**: Book tickets for passengers on specific flights.
5. **Cancel a Reservation**: Cancel existing reservations.
6. **Check if a Ticket is Reserved for a Specific Person**: Verify if a particular passenger has a reserved ticket.
7. **Search for a Passenger and Print All Information**: Search for a passenger across all flights and display their details.
8. **Exit**: Close the application.

## Code Structure

### Main Class
The `Main` class is the entry point of the application. It sets up the JavaFX GUI and handles user interactions. Key functionalities include:
- Initializing the primary stage and setting up the GUI components.
- Handling user actions and routing them to the appropriate methods in the `LinkedList` class.

### LinkedList Class
The `LinkedList` class manages the flights and passengers using a linked list data structure. It includes methods to:
- Add flights and passengers in sorted order.
- Search for flights and passengers.
- Edit flight details.
- Delete passengers.
- Print flight and passenger information.

### Flight Class
The `Flight` class represents a flight and contains properties such as flight number, airline name, source, destination, capacity, and passenger list. It includes methods to get and set these properties.

### Passenger Class
The `Passenger` class represents a passenger and contains properties such as flight number, ticket number, full name, passport number, nationality, and birth date. It includes methods to get and set these properties.

## User Interface

The GUI is built using JavaFX components and includes the following screens:

### Main Menu
- Buttons for accessing different functionalities such as displaying flight information, adding/editing flights, reserving tickets, and more.

### Read Data
- Allows the user to read flight and passenger data from files.

### Display Flight Information
- Displays details of all flights in a text area.

### Display Passenger Information
- Displays details of passengers for a specific flight.

### Add/Edit Flight
- Provides forms to add new flights or edit existing flight details.

### Reserve a Ticket
- Provides a form to reserve tickets for passengers on specific flights.

### Cancel Reservation
- Provides a form to cancel existing reservations.

### Check Ticket Reservation
- Allows the user to check if a ticket is reserved for a specific person.

### Search Passenger
- Allows the user to search for a passenger across all flights and display their details.

## Usage

1. Clone the repository:
    ```sh
    git clone https://github.com/abdulrahmanOmar1/flight-reservation-system.git
    ```

2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).

3. Ensure you have JavaFX set up in your project. If not, follow the instructions provided in your IDE's documentation to add JavaFX support.

4. Run the `Main` class to start the application.

5. Use the provided buttons and text fields to interact with the system and manage flight and passenger data.


---

Feel free to replace "yourusername" in the clone URL with your actual GitHub username. Let me know if you need any further adjustments or additions!
