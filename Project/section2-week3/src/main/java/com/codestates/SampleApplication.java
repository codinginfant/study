
package com.codestates;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(path = "/v1/message")



public class SampleApplication {
    @GetMapping
    public String getMessage() {                    // -> getMessage() 메서드는 Framework. 애플리케이션 흐름의 주도권이 Framework에 있음
        String message = "hello world";
        return StringUtils.upperCase(message);      // -> StringUtils 클래스는 Library. 개발자가 작성. 애플리케이션 흐름의 주도권이 개발자에게
                                                    //  StringUtils 클래스의 upperCase() 메서드의 message 변수를 대문자로 변환
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }
}
