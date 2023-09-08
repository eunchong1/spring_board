package com.codingrecipe.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board")
public class BoardController {
    @GetMapping("/save")
        public String saveForm() {
            return "save";
        }

    @PostMapping("/save")
    public String save() { //form에서 보낸 데이터를 받는 부분
        return null;
    }
}
