package com.ik.toyproject.board.entity;

import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@NoArgsConstructor
@Table(name = "TB_UPLOAD_FILE")
@ToString(exclude = "board")
@DynamicInsert
@DynamicUpdate
@Entity
public class Upfile {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long upfileNo;
    private String fileName;

    private long filesize;

    @ColumnDefault("0")
    private int downCount;
    
    private String originalFileName;

    @ManyToOne
    @JoinColumn(name = "boardNo")
    private Board board;
}
