package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * Created by: Daniels
 * Date: 13/04/2021
 * Description:
 */
@Controller
public class PastFormController {
    @PostMapping("/profile")
    public String submit(@RequestParam(name="user_name", required=false, defaultValue="Anonimo") String user_name, String user_pass, ModelMap model) {
        model.addAttribute("user_name", user_name);
        return "profile";
    }
}
