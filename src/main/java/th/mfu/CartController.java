package th.mfu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CartController {

    @GetMapping("/addToCart")
    public String addToCart(@RequestParam(name = "menuName") String menuName,
                            @RequestParam(name = "quantity") int quantity,
                            @RequestParam(name = "price") double price,
                            Model model) {
        // ส่งข้อมูลไปยังหน้า cart.html
        model.addAttribute("menuName", menuName);
        model.addAttribute("quantity", quantity);
        model.addAttribute("price", price);
        return "cart";
    }
}