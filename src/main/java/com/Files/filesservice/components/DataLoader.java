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

    public DataLoader(){}

    public void run(ApplicationArguments args){
        Folder folder = new Folder("folder 1");
        folderRepository.save(folder);

        User user = new User("Connie");
        userRepository.save(user);

        File file = new File("file 1", "01", 50, folder);
        fileRepository.save(file);

    }
}