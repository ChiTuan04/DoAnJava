package com.vanlang.DoAnJava.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String homePage(Model model) {
        return "HTML/home";
    }

    @GetMapping("/giohang")
    public String giohang() {
        return "HTML/giohang";
    }

    @GetMapping("/dong-ho")
    public String dongho() {
        return "HTML/dong-ho";
    }

    @GetMapping("/casio")
    public String casio() {
        return "HTML/casio";
    }

    @GetMapping("/rolex")
    public String rolex() {
        return "HTML/rolex";
    }

    @GetMapping("/phukien")
    public String phukien() {
        return "HTML/phukien";
    }

    @GetMapping("/thongtin")
    public String thongtin() {
        return "HTML/thongtin";
    }

    @GetMapping("/dichvu")
    public String dichvu() {
        return "HTML/dichvu";
    }

    @GetMapping("/dangky")
    public String dangky() {
        return "HTML/dangky";
    }

    @GetMapping("/dangnhap")
    public String dangnhap() {
        return "HTML/dangnhap";
    }
}
