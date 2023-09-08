package com.codingrecipe.board.dto;

import lombok.*;

import java.time.LocalDateTime;

// DTO(Data Transfer Object) : 데이터를 전송할 때 사용하는 객체 , VO, Bean
// Entity는 목적이 다름
@Getter
@Setter
@ToString // 필드 값 확인, 필수는 아님
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits; //조회수
    private LocalDateTime boardCreatedTime; //글 작성시간
    private LocalDateTime boardUpdatedTime; //글 수정시간

}
