package th.mfu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @Autowired
    private MenuRepository menuRepository;

    @GetMapping("/all")
    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    @PostMapping("/add")
    public Menu addMenu(@RequestBody Menu menu) {
        // ตรวจสอบว่าเมนูมีอยู่แล้วหรือไม่
        Menu existingMenu = menuRepository.findByName(menu.getName());
        if (existingMenu != null) {
            existingMenu.setQuantity(existingMenu.getQuantity() + menu.getQuantity());
            return menuRepository.save(existingMenu);
        } else {
            return menuRepository.save(menu);
        }
    }
    // MenuController.java}


    @DeleteMapping("/remove/{id}")
    public void removeMenu(@PathVariable Long id) {
        // ลบเมนูโดยตรงหรือตัดจำนวนลงหากมีมากกว่า 1
        Menu menu = menuRepository.findById(id).orElse(null);
        if (menu != null) {
            if (menu.getQuantity() > 1) {
                menu.setQuantity(menu.getQuantity() - 1);
                menuRepository.save(menu);
            } else {
                menuRepository.deleteById(id);
            }
        }
    }
}

