package com.evanson.requests.controller;

import java.util.List;

import com.evanson.requests.dataobject.Request;
import com.evanson.requests.dataobject.RequestRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestsController {

    private RequestRepository requestRepository;

    public RequestsController(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    @RequestMapping("/hello")
    public String getHello() {
        return "hello world";
    }

    @RequestMapping("/requestsByName")
    public List<Request> getRequestsByName(String requestor) {
        return requestRepository.findByRequestor(requestor);
    }

}