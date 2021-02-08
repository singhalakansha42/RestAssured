package Practice.Rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;

public class LearningRestApi {
	@Test
	public void GetResponse() {
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		// Response response = get("/booking");
		given().log().all().when().get("/booking").then().log().all().statusCode(200)
				.body("bookingid", Matchers.hasSize(10)).body("bookingid[3]", equalTo(7));
	}
}
