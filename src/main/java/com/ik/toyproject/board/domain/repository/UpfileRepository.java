package com.ik.toyproject.board.domain.repository;

import com.ik.toyproject.board.domain.entity.Upfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpfileRepository extends JpaRepository<Upfile, Long> {
}
