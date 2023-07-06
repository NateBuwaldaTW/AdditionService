package com.thoughtworks.additionservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionControllerTest {

    @Test
    public void returnsOk() {
        ResponseEntity<String> expectedResponse = ResponseEntity.ok().build();

        AdditionController controller = new AdditionController();
        ResponseEntity<String> actualResponse = controller.handle();

        assertEquals(expectedResponse, actualResponse);
    }

}
