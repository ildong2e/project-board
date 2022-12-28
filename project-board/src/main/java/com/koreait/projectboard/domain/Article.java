package com.koreait.projectboard.domain;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Index;
import javax.persistence.Table;
import java.time.LocalDateTime;


// Article (게시글)

@Getter
@ToString
@Table(indexes = {
        @Index(columnList = "title"),
        @Index(columnList = "hashtag"),
        @Index(columnList = "createdAt"),
        @Index(columnList = "createdBy")
})
public class Article {
    private Long id;
    private String title;   // 제목
    private String content; // 본문
    private String hashtag; // 해시태그
    private LocalDateTime createdAt;    // 생성일시
    private String createdBy;   // 생성자
    private LocalDateTime modifiedAt;   // 수정일시
    private String modifiedBy;  // 수정자
}
