package com.koreait.projectboard.domain;

import java.time.LocalDateTime;
// ArticleComment(댓글)
public class ArticleComment {
    private long id;
    private long article_id;
    private String content;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
