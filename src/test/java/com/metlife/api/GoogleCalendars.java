package com.metlife.api;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GoogleCalendars {
    @Test
    public void createCalendar(){

        String calendarId = given()
                .baseUri("https://www.googleapis.com/calendar/v3")
                .headers("Authorization","Bearer ya29.a0AfB_byCSLcKbMmFVHxYlP-bYBiYQgZlyaxru4vfa-QUjmH92NcuKu53ic0kI9dMOf3OXsLCsnU3aWs19Rz8n7NbYZkjONvApTrJSjK6yXMCdqwSMp2__z-Ehf-sUbzPtI5HzzWzd5A4Sa1EkvLVm_9chr1NqqZBDF6sTZwaCgYKAY0SAQ4SFQHGX2Mib8kM9hvv4MwZHqfpA9VexQ0173")
                .body("{\"summary\":\"Rest-assred-calendar\"}")
                .when()
                .post("/calendars")
                .body()
                .jsonPath()
                .get("id");

    }
}
