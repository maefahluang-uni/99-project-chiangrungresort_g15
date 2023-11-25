package th.mfu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import th.mfu.entity.Booking;
import th.mfu.service.BookingService;

@Controller
public class BookingController {

    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        super();
        this.bookingService = bookingService;
    }

    @GetMapping("/bookings")
    public String listBookings(Model model) {
        model.addAttribute("bookings", bookingService.getAllBookings());
        return "bookings";
    }

    @GetMapping("/bookings/new")
    public String createBookingForm(Model model) {
        Booking booking = new Booking(null, null, null, null, null, null, 0);
        model.addAttribute("booking", booking);
        return "create_booking";
    }

    @PostMapping("/bookings")
    public String saveBooking(@ModelAttribute("booking") Booking booking) {
        bookingService.saveBooking(booking);
        return "redirect:/bookings";
    }

    @GetMapping("/bookings/edit/{id}")
	public String editBookingForm(@PathVariable Long id, Model model) {
		model.addAttribute("booking", bookingService.getBookingById(id));
		return "edit_booking";
	}


    @PostMapping("/bookings/{id}")
    public String updateBooking(@PathVariable Long id,
                                @ModelAttribute("booking") Booking booking,
                                Model model) {

        Booking existingBooking = bookingService.getBookingById(id);
        existingBooking.setId(id);
        existingBooking.setFirstName(booking.getFirstName());
        existingBooking.setLastName(booking.getLastName());
        existingBooking.setEmail(booking.getEmail()); 
        existingBooking.setPhone(booking.getPhone());
        existingBooking.setCheckIn(booking.getCheckIn()); 
        existingBooking.setCheckOut(booking.getCheckOut()); 
        existingBooking.setNumberOfGuests(booking.getNumberOfGuests()); 

        bookingService.updateBooking(existingBooking);
        return "redirect:/bookings";
    }

    @GetMapping("/bookings/{id}")
    public String deleteBooking(@PathVariable Long id) {
        bookingService.deleteBookingById(id);
        return "redirect:/bookings";
    }
}
