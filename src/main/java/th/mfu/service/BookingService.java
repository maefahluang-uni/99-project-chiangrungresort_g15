package th.mfu.service;

import java.util.List;

import th.mfu.entity.Booking;

public interface BookingService {
    List<Booking> getAllBookings();

    Booking saveBooking(Booking booking);

    Booking getBookingById(Long id);

    Booking updateBooking(Booking booking);

    void deleteBookingById(Long id);
}