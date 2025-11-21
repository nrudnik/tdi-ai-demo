package com.example.demo.controller;

import com.example.demo.data.*;
import com.example.demo.service.S3Service;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private final S3Service s3Service;

    public ApiController(S3Service s3Service) {
        this.s3Service = s3Service;
    }

    @GetMapping("/api/images")
    public List<String> listImages() {
        //get s3 objects, is it an image, ask ai something
        List<String> files = s3Service.listFiles();

        return files;
        
    }

}