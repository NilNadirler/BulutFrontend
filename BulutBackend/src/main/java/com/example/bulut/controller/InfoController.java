package com.example.bulut.controller;

import com.example.bulut.entity.Info;
import com.example.bulut.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping(value = "/api/info/" )
public class InfoController {

    @Autowired
    InfoService infoService;

    @PostMapping("add")
    public ResponseEntity<?> Add(@RequestBody Info info){
        return ResponseEntity.ok(this.infoService.save(info));
    }

}
