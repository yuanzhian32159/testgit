package com.yuan.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class sd {
    @RequestMapping("a")
    public String s() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
//        String s = objectMapper.writeValueAsString(f);
        return "A";
    }
}
