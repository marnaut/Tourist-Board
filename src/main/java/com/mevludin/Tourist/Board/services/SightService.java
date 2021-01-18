package com.mevludin.Tourist.Board.services;

import com.mevludin.Tourist.Board.repositories.SightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SightService {
    @Autowired
    private SightRepository sightRepository;

}
