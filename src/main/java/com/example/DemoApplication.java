package com.example;

import com.google.common.collect.Lists;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @PostMapping("/numbers")
    public ResponseEntity<List<String>> strings(@RequestBody DataEntity entity ) {
        return ResponseEntity.ok().body(Lists.newArrayList("one", "two", "three", "four", "five"));
    }


}
