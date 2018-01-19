package com.hanoa;

import com.hanoa.mapper.UserMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;


@SpringBootApplication
public class HanccoaApplication {
	@Resource
	private UserMapper userMapper;

	public static void main(String[] args) {
		SpringApplication.run(HanccoaApplication.class, args);
	}


}
