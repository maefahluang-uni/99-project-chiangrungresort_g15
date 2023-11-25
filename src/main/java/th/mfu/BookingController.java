package th.mfu;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.objenesis.instantiator.gcj.GCJInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookingController {
    private int nextId = 1;
    private HashMap<Integer, Booking> bookingMap = new HashMap<Integer, Booking>();

    @InitBinder
    public final void initBinderUsuriesFormValidator(final WebDataBinder binder, final Locale locale) {
        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @GetMapping("/bookings")
    public String listBookings(Model model) {
        model.addAttribute("bookings", bookingMap.values());
        return "booking";
    }

    @GetMapping("/bookings/new")
    public String createBookingForm(Model model) {
        Booking booking = new Booking(null, null, null, null, null, null, nextId);
        model.addAttribute("booking", booking);
        return "create_booking";
    }

    @PostMapping("/bookings")
    public String saveBooking(@ModelAttribute Booking con) {
        con.setId(nextId);
        bookingMap.put(nextId, con);
        nextId++;
        return "redirect:/bookings";
    }

    @GetMapping("/delete-booking/{id}")
    public String deleteBooking(@PathVariable int id) {
        bookingMap.remove(id);
        return "redirect:/bookings";
    }

    @GetMapping("/delete-booking")
    public String removeAllBookings() {
        bookingMap.clear();
        nextId = 1;
        return "redirect:/bookings";
    }

}
