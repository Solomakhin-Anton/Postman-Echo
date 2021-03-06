package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalToObject;

public class PostmanEchoTest {
    @Test
    void shouldPostToPostman() {

        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("datas", equalToObject("some data"))
        ;
    }
}

