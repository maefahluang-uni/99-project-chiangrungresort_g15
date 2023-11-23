package th.mfu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreditCardController {

    @GetMapping("/credit-card-payment")
    public String showCreditCardPaymentPage() {
        return "credit_card_payment";
    }
}
