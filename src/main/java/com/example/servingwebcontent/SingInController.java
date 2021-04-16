package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by: Daniels
 * Date: 13/04/2021
 * Description:
 */
@Controller
public class SingInController {
    @GetMapping("/singin")
    public String singin() {

        return "singin";
    }


}
