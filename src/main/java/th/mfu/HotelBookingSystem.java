package th.mfu;

import java.util.Scanner;

public class HotelBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Room types
        String[] roomTypes = {"Single", "Double", "Suite", "Deluxe"};

        System.out.println("Welcome to the Hotel Booking System");
        System.out.println("Available Room Types:");

        for (int i = 0; i < roomTypes.length; i++) {
            System.out.println((i + 1) + ". " + roomTypes[i]);
        }

        System.out.print("Select a room type (1-" + roomTypes.length + "): ");
        int roomTypeChoice = scanner.nextInt();

        if (roomTypeChoice < 1 || roomTypeChoice > roomTypes.length) {
            System.out.println("Invalid choice. Exiting.");
            return;
        }

        String selectedRoomType = roomTypes[roomTypeChoice - 1];

        // Customer information
        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your surname: ");
        String surname = scanner.next();

        System.out.print("Enter your email: ");
        String email = scanner.next();

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.next();

        // Booking information
        System.out.print("Enter check-in date (YYYY-MM-DD): ");
        String checkInDate = scanner.next();

        System.out.print("Enter check-out date (YYYY-MM-DD): ");
        String checkOutDate = scanner.next();

        System.out.print("Enter the number of guests: ");
        int numGuests = scanner.nextInt();

        // Display booking confirmation
        System.out.println("\nBooking Confirmation:");
        System.out.println("Room Type: " + selectedRoomType);
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Check-in Date: " + checkInDate);
        System.out.println("Check-out Date: " + checkOutDate);
        System.out.println("Number of Guests: " + numGuests);

        System.out.println("Your room has been booked. Thank you!");

        scanner.close();
        //
    }
}
