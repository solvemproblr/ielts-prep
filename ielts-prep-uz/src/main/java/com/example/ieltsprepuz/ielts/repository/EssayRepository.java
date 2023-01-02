package com.example.ieltsprepuz.ielts.repository;

import com.example.ieltsprepuz.ielts.entity.Essay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EssayRepository extends JpaRepository<Essay, Long> {
}
