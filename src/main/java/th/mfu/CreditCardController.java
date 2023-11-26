package th.mfu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CreditCardController {

    @GetMapping("/credit-card-payment")
    public String showCreditCardPaymentPage() {
        return "credit_card_payment";
    }

    @PostMapping("/credit-card-payment")
    public String handleCreditCardPayment(@RequestParam(name = "cardNumber") String cardNumber,
                                          @RequestParam(name = "cvv") String cvv,
                                          @RequestParam(name = "expirationDate") String expirationDate) {
        return "payment_confirmation"; 
    }
}

