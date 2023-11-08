package th.mfu;

import java.util.Scanner;

public class BookingInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Hotel Booking System");

        // Booking information
        System.out.print("Enter check-in date (YYYY-MM-DD): ");
        String checkInDate = scanner.next();

        System.out.print("Enter check-out date (YYYY-MM-DD): ");
        String checkOutDate = scanner.next();

        System.out.print("Enter the number of guests: ");
        int numGuests = scanner.nextInt();

        System.out.println("\nBooking Information:");
        System.out.println("Check-in Date: " + checkInDate);
        System.out.println("Check-out Date: " + checkOutDate);
        System.out.println("Number of Guests: " + numGuests);

        scanner.close();
    }
}
