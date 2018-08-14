package main;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("/index.html")
@ComponentScan({"controller","service"})
public class ProjectMain {
    public static void main(String[] args) {
        SpringApplication.run(ProjectMain.class, args);
    }
}
