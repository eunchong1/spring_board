package com.codingrecipe.board.entity;

import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/* 시간 정보 entity */

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public class BaseEntity {
    @CreationTimestamp
    @Column(updatable = false) // updatable = false : 수정할 떄 관여x
    private LocalDateTime createdTime;

    @UpdateTimestamp
    @Column(insertable = false) //i nsertable = false : 입력될 Eo 관여x
    private LocalDateTime updatedTime;
}
