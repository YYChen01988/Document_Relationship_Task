package com.example.filesandfolders.component;

import com.example.filesandfolders.models.File;
import com.example.filesandfolders.models.Folder;
import com.example.filesandfolders.repositories.FileRepo;
import com.example.filesandfolders.repositories.FolderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeds implements ApplicationRunner {
    @Autowired
    FolderRepo folderRepo;
    @Autowired
    FileRepo fileRepo;

    public DataSeeds() {
    }

    public void run(ApplicationArguments args){

        Folder week1 = new Folder("Week1");
        folderRepo.save(week1);
        Folder week2 = new Folder("Week2");
        folderRepo.save(week2);

        File rubyProject = new File("Ruby Project", "rb", "2KB", week1);
        fileRepo.save(rubyProject);
        File rubyProject2 = new File("Ruby Project2", "rb", "3KB", week1);
        fileRepo.save(rubyProject2);
        File JavaScriptProject = new File("JavaScript Project", "js", "3KB", week2);
        fileRepo.save(JavaScriptProject);

    }
}
