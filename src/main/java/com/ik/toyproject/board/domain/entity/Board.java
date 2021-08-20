package com.ik.toyproject.board.domain.entity;

import com.ik.toyproject.user.domain.entity.UserMain;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@NoArgsConstructor
@Table(name = "TB_BOARD")
@ToString(exclude = "userMain")
@DynamicInsert
@DynamicUpdate
@Entity
public class Board {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long boardNo;
    @Column(length = 100, nullable = false)
    private String boardTitle;
    @Column(length = 500)
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

    @OneToMany(mappedBy = "board",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Upfile> upfiles;

}
