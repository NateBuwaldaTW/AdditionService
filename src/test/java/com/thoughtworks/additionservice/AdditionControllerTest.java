package com.thoughtworks.additionservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionControllerTest {

    private AdditionController controller;

    @BeforeEach
    void setUp() {
        controller = new AdditionController();
    }

    @Test
    public void returnsOk() {
        String expectedBody = "0";
        ResponseEntity<String> expectedResponse = ResponseEntity.ok().body(expectedBody);

        ResponseEntity<String> actualResponse = controller.handle(0, 0);

        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    public void acceptsInput() {
        String expectedBody = "1";

        ResponseEntity<String> actualResponse = controller.handle(1, 0);

        assertEquals(expectedBody, actualResponse.getBody());
    }

    @Test
    public void doesNotAllowNullInputRespondsBadRequest() {
        ResponseEntity<Object> expectedResponse = ResponseEntity.badRequest().build();

        ResponseEntity<String> actualResponse = controller.handle(null, 2);

        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    public void addsTwoInputsTogether() {
        String expectedBody = "3";

        ResponseEntity<String> actualResponse = controller.handle(1, 2);

        assertEquals(expectedBody, actualResponse.getBody());
    }

}
