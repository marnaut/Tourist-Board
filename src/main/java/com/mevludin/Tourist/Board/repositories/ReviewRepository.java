package com.mevludin.Tourist.Board.repositories;

import com.mevludin.Tourist.Board.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
