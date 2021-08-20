package com.ik.toyproject.user.domain.entity;

import com.ik.toyproject.board.domain.entity.Board;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@ToString(exclude = "boards")
@DynamicInsert
@DynamicUpdate
@Table(name = "TB_USER_MAIN")
@NoArgsConstructor
@Entity
public class UserMain {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userNo;
    private String userid;
    private String userpwd;
    private String userName;
    private String userNumber;
    private String userMobile;
    private String userEmail;
    private char deleteYn;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp regDate;

    @OneToMany(mappedBy = "userMain",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Board> boards;

    @OneToOne(mappedBy = "user",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private UserAddress userAddress;

}
