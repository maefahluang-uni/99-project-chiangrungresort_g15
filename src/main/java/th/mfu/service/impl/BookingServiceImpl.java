package th.mfu.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import th.mfu.entity.Booking;
import th.mfu.repository.BookingRepository;
import th.mfu.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

    private BookingRepository bookingRepository;

    public BookingServiceImpl(BookingRepository bookingRepository) {
        super();
        this.bookingRepository = bookingRepository;
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Booking getBookingById(Long id) {
        return bookingRepository.findById(id).orElse(null);
    }

    @Override
    public Booking updateBooking(Booking booking) {
        // Assuming that the booking with the given ID exists
        return bookingRepository.save(booking);
    }

    @Override
    public void deleteBookingById(Long id) {
        bookingRepository.deleteById(id);
    }
}
