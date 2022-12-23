package com.example.ieltsprepuz.repository;

import com.example.ieltsprepuz.entity.Speaking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeakingRepository extends JpaRepository<Speaking, Long> {
}
