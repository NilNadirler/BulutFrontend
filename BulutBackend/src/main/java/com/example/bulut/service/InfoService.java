package com.example.bulut.service;

import com.example.bulut.entity.Info;
import com.example.bulut.repo.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {


     @Autowired
     private InfoRepository infoRepository;


    public Info save(Info info){
        return infoRepository.save(info);

    }

}
