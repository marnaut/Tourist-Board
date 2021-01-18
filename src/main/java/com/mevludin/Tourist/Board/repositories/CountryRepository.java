package com.mevludin.Tourist.Board.repositories;

import com.mevludin.Tourist.Board.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
