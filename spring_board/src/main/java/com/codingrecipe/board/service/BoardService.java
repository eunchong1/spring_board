package com.codingrecipe.board.service;

import com.codingrecipe.board.dto.BoardDTO;
import com.codingrecipe.board.entity.BoardEntity;
import com.codingrecipe.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/*
 DTO -> Entity (Entity Class 에서 진행)
 Entity -> DTO (DTO Class 에서 진행)

- Controller로 부터 넘겨받을 때는 DTO로 받고 Repository에 넘겨줄 때는 Entity 클래스로 변환해서 넘겨줌
- DB 조회 등을 하면 Repository에서 Entity로 데이터를 받아옴. 그걸 Controller에 리턴할 때는 DTO로 넘겨줌
- Entity 클래스는 DB와 직접 연관되기 때문에 최대 Service 클래스 까지만 오도록 해야함.
*/

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository; //주입받아야 하기때문에 생성자 주입방식 사용
    public void save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);//boardDTO를 repository로 넘겨줌 * alt+enter : 좌변 자동완성
        //Entity를 save 메소드로 넘겨주면 insert 쿼리가 나감
        boardRepository.save(boardEntity); //매개변수를 entity 클래스 타입으로 받음. (리턴도 엔티티 클래스)
    }
}
