package th.mfu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    
    }
    @RestController
        public class BookingController {

    @PostMapping("/bookRoom")
    public String bookRoom(@RequestBody BookingRequest request) {
        // Handle the booking logic here using the request data
        return "Your room has been booked. Thank you!";
    }
}

    public class BookingRequest {
    // Define fields for the booking request (room type, name, etc.)
    // Provide getters and setters
    
}
}
