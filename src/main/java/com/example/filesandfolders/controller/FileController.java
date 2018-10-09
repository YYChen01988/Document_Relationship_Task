package com.example.filesandfolders.controller;

import com.example.filesandfolders.repositories.FileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/files")
public class FileController {
    @Autowired
    FileRepo fileRepo;
}
