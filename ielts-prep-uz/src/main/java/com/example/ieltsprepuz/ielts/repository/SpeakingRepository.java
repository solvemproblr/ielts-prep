package com.example.ieltsprepuz.ielts.repository;

import com.example.ieltsprepuz.ielts.entity.Speaking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeakingRepository extends JpaRepository<Speaking, Long> {
}
