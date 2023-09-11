package com.codingrecipe.board.controller;

import com.codingrecipe.board.dto.BoardDTO;
import com.codingrecipe.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService; //생성자 주입방식으로 의존성 주입
    @GetMapping("/save")
        public String saveForm() {
            return "save";
        }

    @PostMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO) { //form에서 보낸 데이터를 받는 부분
        System.out.println("boardDTO = " + boardDTO);
        // 저장하러 가는 부분 (Service)
        boardService.save(boardDTO);

        return "index";
    }
}
