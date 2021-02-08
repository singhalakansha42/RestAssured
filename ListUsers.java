package Practice.Rest;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;
//import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
//import junit.framework.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ListUsers {

	@Test(priority = 0)
	public void ListOfUsers() {
		CommonMethods.ApplicationBaseUri();
		String response = given().when().get("/api/users?page=2").then().assertThat().statusCode(200).extract()
				.response().asString();
		System.out.println("====================List Of Users==========================================");
		PayloadValidation.ListofUsers_Payload();
	}

	@Test(priority = 1)
	public void SingleUser() {
		System.out.println("=============Test for Single User=====================================");
		CommonMethods.ApplicationBaseUri();
		String singleuserrespponse = given().log().all().when().get("/api/users/2").then().statusCode(200).assertThat()
				.log().all().extract().response().asString();
		System.out.println(singleuserrespponse);
		System.out.println("2");
	}

	@Test(priority = 2)
	public void SingleUserNotFound() {
		CommonMethods.ApplicationBaseUri();
		String usernotfound = given().log().all().when().get("/api/users/23").then().log().all().statusCode(404)
				.assertThat().extract().response().asString();
		System.out.println(usernotfound);
		System.out.println("=============Test for Single User Not Found=====================================");
	}

	@Test(priority = 3)
	public void ListofResources() {
		CommonMethods.ApplicationBaseUri();
		String resourcesresponse = given().when().get("/api/unknown").then().log().all().statusCode(200).assertThat()
				.extract().response().asString();
		System.out.println(resourcesresponse);
		PayloadValidation.listResources();
		System.out.println("=============Test Executed for List resources========================");
	}

	@Test(priority = 4)
	public void singleResource() {
		CommonMethods.ApplicationBaseUri();
		String singleresourceResponse = given().log().all().when().get("/api/unknown/2").then().statusCode(200)
				.assertThat().extract().response().asString();
//		//JsonPath js = CommonMethods.rawToJson(singleresourceResponse);
//		String actualname = js.getString("name");
//		System.out.println(actualname);
//		int id = js.getInt("id");
//		assertEquals(actualname, "fuchsia rose");
//		assertEquals(id, "2");

	}
}
