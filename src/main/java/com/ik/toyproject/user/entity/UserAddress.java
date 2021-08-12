package com.ik.toyproject.user.entity;


import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@ToString(exclude = "user")
@DynamicInsert
@DynamicUpdate
@Table(name = "TB_USER_ADDRESS")
@NoArgsConstructor
@Entity
public class UserAddress {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long seq;
    private String postNo;
    private String address;
    private String addressDetail;

    @OneToOne
    @JoinColumn(name = "userNo")
    private UserMain user;

}
