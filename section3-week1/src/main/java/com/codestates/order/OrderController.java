package com.codestates.order;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/orders", produces = MediaType.APPLICATION_JSON_VALUE)

public class OrderController {
    @PostMapping
    public String postOrder(@RequestParam("memberId") long memberId,
               // postOrder() : 회원 고객이 주문한 커피 주문 정보를 등록해주는 핸들러 메서드
               // 어떤 고객 : 회원 식별자(memberId), 어떤 커피 : 커피 식별자(coffeeId)
                            @RequestParam("coffeeId") long coffeeId) {
        System.out.println("# memberId: " + memberId);
        System.out.println("# memberId: " + coffeeId);

        String response =
                "{\"" +
                        "memberId\":\""+memberId+"\"," +
                        "\"coffeeId\":\""+coffeeId+"\"" +
                "}";
        return response;

    }
    @GetMapping("/{order-id}")
    public String getOrder(@PathVariable("order-id") long orderId) {
        // getOrder() : 특정 주문 정보를 클라이언트 쪽에 제공하는 핸들러 메서드
        System.out.println("# orderId: " + orderId);

        // not implementation
        return null;
    }
    @GetMapping
    public String getOrders() {
        // getOrders() : 주문 목록을 클라이언트에게 제공하는 핸들러 메서드
        System.out.println("# get Orders");
        // not iplementation
        return null;
    }
}
