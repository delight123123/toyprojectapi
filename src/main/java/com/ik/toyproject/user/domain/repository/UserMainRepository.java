package com.ik.toyproject.user.domain.repository;

import com.ik.toyproject.user.domain.entity.UserMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMainRepository extends JpaRepository<UserMain,Long> {
}
