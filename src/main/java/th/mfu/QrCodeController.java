package th.mfu;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QrCodeController {

    @GetMapping("/qr-code-payment")
    public String showQrCodePaymentPage() {
        return "qr_code_payment";
    }
}
