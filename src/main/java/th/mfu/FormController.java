package th.mfu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

    @RequestMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("formData", new FormData());
        return "form";
    }

    @PostMapping("/submit_form")
    public String submitForm(FormData formData) {
        // Handle form submission logic here
        // You can access form data using formData.getXXX() methods

        // For simplicity, let's just print the form data to the console
        System.out.println(formData);

        // Redirect to a success page or return a response
        return "success";
    }
}

    

