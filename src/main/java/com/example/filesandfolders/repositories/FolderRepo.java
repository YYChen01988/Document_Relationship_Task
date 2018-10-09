package com.example.filesandfolders.repositories;

import com.example.filesandfolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepo extends JpaRepository<Folder, Long> {
}
