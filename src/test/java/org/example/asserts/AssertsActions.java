package org.example.asserts;

import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

public class AssertsActions {

    public void verifyResponseBody(String actual, String expected, String description){
        assertEquals(actual, expected, description);
    }

    public void verifyResponseBody(int actual, int expected, String description){
        assertEquals(actual, expected, description);
    }

    public void verifyStatusCode(Response response, int expected){
        assertEquals(response.getStatusCode(), expected);
    }

    public void verifyStringKey(String keyExpect, String keyActual){
        assertThat(keyExpect).isNotNull();
        assertThat(keyExpect).isNotBlank();
        assertThat(keyExpect).isEqualTo(keyActual);
    }

    public void verifyStringKeyNotNull(String keyExpect){
        assertThat(keyExpect).isNotNull();
        assertThat(keyExpect).isNotBlank();
    }
}
