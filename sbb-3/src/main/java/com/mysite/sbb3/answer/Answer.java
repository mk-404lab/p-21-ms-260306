package com.mysite.sbb3.answer;


import com.mysite.sbb3.question.Question;
import com.mysite.sbb3.user.SiteUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;
    private LocalDateTime modifyDate;

    @ManyToOne
    private Question question;

    @ManyToOne
    private SiteUser author;

    @ManyToMany
    Set<SiteUser> voter;
}