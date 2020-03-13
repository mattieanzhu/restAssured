package vehicleTests;

import org.junit.Assert;

import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class validationTest {
	@Test
	public void getResponse() {
		Response response = RestAssured.get("https://swapi.co/api/vehicles");
		String responseBody = response.getBody().asString();
		Assert.assertEquals(responseBody.contains("Sand Crawler"), true);
	}
}

