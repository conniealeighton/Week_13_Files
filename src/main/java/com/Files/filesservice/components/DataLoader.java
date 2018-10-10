package com.Files.filesservice.components;

import com.Files.filesservice.models.File;
import com.Files.filesservice.models.Folder;
import com.Files.filesservice.models.User;
import com.Files.filesservice.repository.FileRepository;
import com.Files.filesservice.repository.FolderRepository;
import com.Files.filesservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception{

        User user1 = new User("Connie");
        userRepository.save(user1);

        Folder folder1 = new Folder("folder 1", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("folder2", user1);
        folderRepository.save(folder2);

        File file1 = new File("file 1", "01", 50, folder1);
        fileRepository.save(file1);

    }
}