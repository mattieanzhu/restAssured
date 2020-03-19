package vehicleTests;

import org.junit.Assert;


import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class responseTest {
	
	@Test
	public void validation_of_Response() {
		Response response = RestAssured.get("https://swapi.co/api/vehicles");
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
}
