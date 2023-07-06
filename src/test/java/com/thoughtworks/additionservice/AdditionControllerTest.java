package com.thoughtworks.additionservice;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionControllerTest {

    @Test
    public void returnsOk() {
        String expectedBody = "0";
        ResponseEntity<String> expectedResponse = ResponseEntity.ok().body(expectedBody);

        AdditionController controller = new AdditionController();
        ResponseEntity<String> actualResponse = controller.handle(0);

        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    public void acceptsInput() {
        String expectedBody = "1";

        AdditionController controller = new AdditionController();
        ResponseEntity<String> actualResponse = controller.handle(1);

        assertEquals(expectedBody, actualResponse.getBody());
    }

}
