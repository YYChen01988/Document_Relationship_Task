package com.example.filesandfolders.repositories;

import com.example.filesandfolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepo extends JpaRepository<File, Long> {
}
