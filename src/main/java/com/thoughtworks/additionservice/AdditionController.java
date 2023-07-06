package com.thoughtworks.additionservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class AdditionController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> handle(Integer firstInput, Integer secondInput) {
        if (firstInput == null || secondInput == null) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok().body(Integer.toString(firstInput + secondInput));
    }
}
