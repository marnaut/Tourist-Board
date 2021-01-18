package com.mevludin.Tourist.Board.controllers;

import com.mevludin.Tourist.Board.services.SightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SightController {
    @Autowired
    private SightService sightService;

}
