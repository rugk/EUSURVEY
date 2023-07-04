package com.ec.survey.model.survey;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "COMMENT_LIKES", indexes = {@Index(name = "COMMENTLIKE_IDX", columnList = "ANSWER_COMMENT_ID, ANSWER_SET_CODE")})
public class CommentLike implements java.io.Serializable  {
    private Integer id;
    private Integer answerCommentId;    //which comment was liked
    private String uniqueCode;      //the code of the answerSet of the person that liked this comment

    public CommentLike() {}

    public CommentLike(Integer answerCommentId, String uniqueCode) {
        this.answerCommentId = answerCommentId;
        this.uniqueCode = uniqueCode;
    }

    @Id
    @Column(name = "COMMENT_LIKE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="ANSWER_COMMENT_ID")
    public Integer getAnswerCommentId() {
        return answerCommentId;
    }
    public void setAnswerCommentId(Integer answerCommentId) {
        this.answerCommentId = answerCommentId;
    }

    @Column(name="ANSWER_SET_CODE")
    public String getUniqueCode() {
        return uniqueCode;
    }
    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }
}
