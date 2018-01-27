package ua.com.owu.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MainContrlore {

     public String home(){
         return "index";
     }
}
