package th.mfu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
public String getProducts(Model model) {
    List<Product> products = productRepository.findAll();
    model.addAttribute("products", products);
    return "products"; // ให้มีไฟล์ HTML ชื่อ products.html
}

}


