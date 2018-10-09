package com.example.filesandfolders;

import com.example.filesandfolders.models.File;
import com.example.filesandfolders.models.Folder;
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

	@Test
	public void createFileAndFolderThenSave() {

		Folder folder = new Folder("Folder1");
		folderRepo.save(folder);

		File file1 = new File("name", "rb", "125kb", folder);
		fileRepo.save(file1);

		folder.addFile(file1);
		folderRepo.save(folder);
	}
}
