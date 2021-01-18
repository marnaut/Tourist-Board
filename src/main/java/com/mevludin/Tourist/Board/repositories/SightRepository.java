package com.mevludin.Tourist.Board.repositories;

import com.mevludin.Tourist.Board.models.Sight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SightRepository extends JpaRepository<Sight, Long> {
}
