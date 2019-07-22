package com.example.demo;

import com.example.demo.jdbc.PersonJdbcDao;
import com.example.demo.model.Book;
import com.example.demo.model.Person;
import com.example.demo.model.Publisher;
import com.example.demo.repo.BookRepo;
import com.example.demo.repo.PersonRepo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@Slf4j
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJdbcDao personJdbcDao;

    @Autowired
    PersonRepo personRepo;

    @Autowired
    private BookRepo bookRepo;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        logger.info("user id 10001 -> {}", personRepo.findById(10001));

//        logger.info("All Users -> {}", personJdbcDao.findAll());
//        logger.info("Find User 10001 -> {}", personJdbcDao.findById(10001));
//        logger.info("Delete User 10002 -> {}", personJdbcDao.deleteById(10002));
////        logger.info("Find User 10002 -> {}", personJdbcDao.findById(10002));
//        logger.info("All Users -> {}", personJdbcDao.findAll());
//        logger.info("New Person -{}", personJdbcDao.insert(new Person(10004, "Tara", "CHicago", new Date())));
//        logger.info("New Person -{}", personJdbcDao.insert(new Person(10002, "Andy", "CHicago", new Date())));
        bookRepo.save(new Book("Book 1", new Publisher("Pub A"), new Publisher("Publisher B")));

    }
}
