package com.example.filesandfolders;

import com.example.filesandfolders.models.File;
import com.example.filesandfolders.models.Folder;
import com.example.filesandfolders.models.User;
import com.example.filesandfolders.repositories.FileRepo;
import com.example.filesandfolders.repositories.FolderRepo;
import com.example.filesandfolders.repositories.UserRepo;
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
	@Autowired
	UserRepo userRepo;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFileAndFolderThenSave() {

		User Alice = new User("Alice");
		userRepo.save(Alice);

		Folder folder = new Folder("Folder1", Alice);
		folderRepo.save(folder);

		File file1 = new File("name", "rb", "4KB", folder);
		fileRepo.save(file1);

		folder.addFile(file1);
		folderRepo.save(folder);
	}

	@Test
	public void createUserAndFolderThenSave() {

		User Alice = new User("Alice");
		userRepo.save(Alice);
		Folder folder = new Folder("Folder1", Alice);
		folderRepo.save(folder);
		Alice.addFolder(folder);
		userRepo.save(Alice);

	}
}
