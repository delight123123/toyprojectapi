package com.ik.toyproject.board.entity;

import com.ik.toyproject.user.entity.UserMain;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@Table(name = "TB_BOARD")
@ToString(exclude = "userMain")
@DynamicInsert
@DynamicUpdate
@Entity
public class Board {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long boardNo;
    private String boardTitle;
    private String boardContent;
    @CreationTimestamp
    private Timestamp boardReg;

    @ColumnDefault("0")
    private int readcount;

    @ColumnDefault("0")
    private Long groupno;

    @ColumnDefault("0")
    private Long step;

    @ColumnDefault("0")
    private Long sortno;

    @ColumnDefault("\'N\'")
    private String delflag;

    @ManyToOne
    @JoinColumn(name = "userNo")
    private UserMain userMain;

}
