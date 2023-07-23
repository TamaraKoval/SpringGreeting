package Spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class MainController {
    @GetMapping("/greeting" )
    public String greeting(@RequestParam(required = false, defaultValue = "Toma") String name, Model model) {
        model.addAttribute( "name", name);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String date = simpleDateFormat.format(new Date());
        model.addAttribute( "date", date);
        return "greeting" ;
    }
}