package com.frogcrew.frogcrewapi.repository;

import com.frogcrew.frogcrewapi.model.CrewMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrewMemberRepository extends JpaRepository<CrewMember, Long> {
    boolean existsByEmail(String email);
}