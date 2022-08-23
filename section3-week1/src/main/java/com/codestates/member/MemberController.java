package com.codestates.member;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/v1/members")  // (1) produces 설정 제거됨
//@RequestMapping(value = "/v1/members", produces = {MediaType.APPLICATION_JSON_VALUE})
                                    // produces : 응답 데이터를 어떤 미디어 티압으로 클라이언트에게 전송할 것인지

public class MemberController {
    @PostMapping        // 클라이언트의 요청 데이터를 서버에 생성할 때 사용하는 애너테이션
    public ResponseEntity postMember(@RequestParam("email") String email,       // postMember() : 회원정보 등록해주는 핸들러 메서드
                             @RequestParam("name") String name,         // postMember()의 현 리턴 타입은 String -> JSON으로 바꿔줘야야
                             @RequestParam("phone") String phone) {
        // RequestParam : 핸들러 메서드의 파라미터 종류 중 하나 (쿼리, 폼 전달받을 때)

        System.out.println("# email : " + email);
        System.out.println("# name : " + name);
        System.out.println("# phone : " + phone);

//        코드 개선이 필요한 부분 (JSON을 수작업으로 작성중)
//        String response =
//                "{\"" +
//                        "email\":\""+email+"\"," +
//                        "\"name\":\""+name+"\",\"" +
//                        "phone\":\"" + phone+
//                "\"}";
//        return response;
//    }

        // (2) JSON 문자열 수작업을 Map 객체로 대체
        Map<String, String> map = new HashMap<>(); // map 객체로 리턴해 JSON 형식으로 자동 변환
        map.put("email", email);
        map.put("name", name);
        map.put("phone", phone);

        // (3) 리턴 값을 ResponseEntity 객체로 변경
        return new ResponseEntity<>(map, HttpStatus.CREATED);
        // ResponseEntity 객체 생성하면서 응답데이터(map)와 HTTP 응답상태 함께 전달

    @GetMapping("/{member-id}")             // @GetMapping : 클라이언트가 서버에 리소스 조회할 때 사용하는 에너테이션
    public String getMember(@PathVariable("member-id")long memberId) { // @PathVariable : 핸들러 메서드의 파라미터 중 하나. 중괄호 안의 문자열과 동일해야
        System.out.println("# memberId: " + memberId);

        // not implementation

        // (4) 리턴 값을 ResponseEntity 객체로 변경
        return new ResponseEntity<>(HttpStatus.OK);
            // ResponseEntity 객체 리턴하면서 HTTP 응답상태 OK로 전달
    }

    @GetMapping
    public ResponseEntity getMembers() {
        System.out.println("# get Members");

        // not implementation

        //(5) 리턴 값을 ResponseEntity 객체로 변경
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
