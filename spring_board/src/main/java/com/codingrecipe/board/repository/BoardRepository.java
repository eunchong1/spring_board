package com.codingrecipe.board.repository;

import com.codingrecipe.board.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> { //JpaRepository 상속 받을 떄 엔티티 클래스 이름, 엔티티 클래스가 가진 pk타입을 적어 줌
}

//repository는 기본적으로 엔티티 클래스만 받아 줌
