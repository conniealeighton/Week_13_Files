package com.Files.filesservice;

import com.Files.filesservice.models.File;
import com.Files.filesservice.models.Folder;
import com.Files.filesservice.models.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesserviceApplicationTests {

	@Autowired
	File file;

	@Autowired
	Folder folder;

	@Autowired
	User user;

	@Test
	public void contextLoads() {
	}

}
