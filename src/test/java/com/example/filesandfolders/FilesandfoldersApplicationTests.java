package com.example.filesandfolders;

import com.example.filesandfolders.repositories.FileRepo;
import com.example.filesandfolders.repositories.FolderRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesandfoldersApplicationTests {

	@Autowired
	FolderRepo folderRepo;
	@Autowired
	FileRepo fileRepo;

	@Test
	public void contextLoads() {
	}



}
