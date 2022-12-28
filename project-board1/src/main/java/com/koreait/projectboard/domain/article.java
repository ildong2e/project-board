package com.koreait.projectboard.domain;

import java.time.LocalDateTime;
// Article (게시글)
public class article {
    private long id;
    private String content;
    private String hashtag;
    private LocalDateTime datetime;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
