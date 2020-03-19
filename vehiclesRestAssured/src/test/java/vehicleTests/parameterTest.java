package vehicleTests;

import org.junit.Assert;


import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.get;



public class parameterTest {
	
	@Test
	public void parameterTest() {
		String model = get("https://swapi.co/api/vehicles/").then().extract().path("results[0].model");
		Assert.assertEquals(model, "Digger Crawler");
			
	}
}
