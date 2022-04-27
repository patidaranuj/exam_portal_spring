package com.example.exam_portal;

import com.example.exam_portal.controller.AdminController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
public class ExamPortalApplication {


	public static void main(String[] args) {
		SpringApplication.run(ExamPortalApplication.class, args);
	}

}
