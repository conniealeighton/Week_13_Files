package com.Files.filesservice.repository;

import com.Files.filesservice.models.Folder;
import com.Files.filesservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
