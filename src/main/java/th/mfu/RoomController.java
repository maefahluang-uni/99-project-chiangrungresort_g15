package th.mfu;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RoomController {
    private HashMap<Integer, Room> roomMap = new HashMap<>();
    private int nextId = 1;
    

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @GetMapping("/rooms")
    public String listRooms(Model model) {
        model.addAttribute("rooms", roomMap.values());
        return "list-room";
    }

    @GetMapping("/add-room")
    public String addARoomForm(Model model) {
        model.addAttribute("room", new Room(null, nextId, null, null));
        return "add-room-form"; 
    }

    @PostMapping("/rooms")
    public String saveRoom(@ModelAttribute Room room) {
        int id = nextId++; 
        room.setId(id);
        roomMap.put(id, room); 
        return "redirect:/rooms";
    }

    @GetMapping("/delete-room/{id}")
    public String deleteRoom(@PathVariable int id) {
        Room inst = roomMap.getOrDefault(id, null);
        if (inst != null) {
            roomMap.remove(id);
        }
        return "redirect:/rooms"; 
    }

    @GetMapping("/delete-room")
    public String removeAllRooms() {
        roomMap.clear();
        nextId = 1;
        return "redirect:/rooms";
    }
}
