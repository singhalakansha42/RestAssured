package ParcticeReqres;

import org.json.simple.JSONObject;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import static io.restassured.RestAssured.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

public class Login_Unsuccessful {
//	@Test(priority = 0)
//	public void LoginUnsuccessfull() {
//		RestAssured.baseURI = "https://reqres.in/";
//		JSONObject requestParams = new JSONObject();
//		requestParams.put("email", "peter@klaven");
//		Response response = given().header("Content-Type", "application/json").body(requestParams.toJSONString())
//				.post("/api/login");
//		Assert.assertEquals(response.getStatusCode(), 400);
//		Assert.assertEquals(response.jsonPath().getString("error"), "Missing password");
//	}
//
//	@Test
//	public void create() {
//		RestAssured.baseURI = "https://reqres.in/";
//		JSONObject reqParams = new JSONObject();
//		reqParams.put("name", "morpheus");
//		reqParams.put("job", "leader");
//		Response res = given().header("Content-Type", "application/json").body(reqParams).post("/api/users");
//		int statusCode = res.getStatusCode();
//		Assert.assertEquals(statusCode, 201);
//		String name = res.jsonPath().get("name");
//		Assert.assertEquals(name, "morpheus");
//		String job = res.jsonPath().getString("job");
//		Assert.assertEquals(job, "leader");
//		ResponseBody body = res.getBody();
//		String bodyAsString = body.asString();
//
//		int j = (int) (Math.random() * 1000);
//		String id = Integer.toString(j);
//
//		char[] s = id.toCharArray();
//
//		if (s.length == 3) {
//			System.out.println("Generated id " + id + " has correct length");
//			for (int i = 0; i < s.length; i++) {
//				try {
//					int a = Integer.parseInt(String.valueOf(s[i]));
//					System.out.println("char at " + i + " value is : " + a);
//				} catch (NumberFormatException n) {
//					System.out.println("Invalid number format in ID");
//					break;
//				}
//				if (i == s.length - 1) {
//					System.out.println("Genrated ID " + id + " id correct");
//				}
//			}
//		} else {
//			System.out.println("ID length is not 3");
//		}
//
//		// String id=res.jsonPath().getInt(id.length());
//
//		Assert.assertEquals(bodyAsString.contains("id"), true);
//		String pattern = "YYYY-MM-dd'T'HH:mm";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
//		String date = simpleDateFormat.format(new Date());
//		Assert.assertEquals(bodyAsString.contains(date), true);
//	}
//
//	@Test(priority = 1)
//	public void loginSuccessfull() {
//		JSONObject requestParams = new JSONObject();
//		requestParams.put("email", "eve.holt@reqres.in");
//		requestParams.put("password", "cityslicka");
//		Response res = given().header("Content-Type", "application/json").body(requestParams.toJSONString())
//				.post("/api/login");
//		Assert.assertEquals(res.getStatusCode(), 200);
//		Assert.assertEquals(res.jsonPath().getString("token"), "QpwL5tke4Pnpja7X4");
//
//	}
//
//	@Test
//	public void registerUnsuccessfull() {
//		RestAssured.baseURI = "https://reqres.in/";
//		// JSONObject requestParams = new JSONObject();
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("email", "sydney@fife");
//		Response response1 = given().header("Content-Type", "application/json").body(map).post("/api/register");
//		Assert.assertEquals(response1.getStatusCode(), 400);
//		Assert.assertEquals(response1.jsonPath().getString("error"), "Missing password");
//
//	}
//
//	@Test
//	public void registerSuccessfull() {
//		RestAssured.baseURI = "https://reqres.in/";
//		JSONObject requestParams = new JSONObject();
//		requestParams.put("email", "eve.holt@reqres.in");
//		requestParams.put("password", "pistol");
//		Response res = given().log().all().header("Content-Type", "application/json").body(requestParams.toJSONString())
//				.post("/api/register").then().assertThat().statusCode(200).extract().response();
//		System.out.println(res);
//		int statuscode = res.getStatusCode();
//		System.out.println("status code of:" + statuscode);
//		Assert.assertEquals(statuscode, 200);
//		String getid = res.jsonPath().getString("id");
//		Assert.assertEquals(getid, "4");
//		String token = res.jsonPath().getString("token");
//		Assert.assertEquals(token, "QpwL5tke4Pnpja7X4");
//	}
//
//	@Test
//	public void deleterequest() {
//		Response res = given().delete("/api/users/2");
//		int deletestatusCode = res.getStatusCode();
//		System.out.println("delete status code: " + deletestatusCode);
//		Assert.assertEquals(deletestatusCode, 204);
//	}
//
//	@Test
//	public void put_update() {
//		RestAssured.baseURI = "https://reqres.in/";
//		Map<String, String> updateDetails = new HashMap<String, String>();
//		updateDetails.put("name", "morpheus");
//		updateDetails.put("job", "zion resident");
//		System.out.println(updateDetails);
//		Response response = given().contentType(ContentType.JSON).body(updateDetails).put("/api/users/2").then()
//				.assertThat().log().all().statusCode(200).extract().response();
//		ResponseBody body = response.getBody();
//		String bodyAsString = body.asString();
//		String pattern = "yyyy-mm-dd'T'HH:mm:ss.SSS'Z'";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//		String date = simpleDateFormat.format(new Date());
//		Assert.assertEquals(bodyAsString.contains("date"), true);
//		Assert.assertEquals(response.getStatusCode(), 200);
//		Assert.assertEquals(response.jsonPath().getString("name"), "morpheus");
//		Assert.assertEquals(response.jsonPath().getString("job"), "zion resident");
//		System.out.println();
//
//	}

	@Test
	public void singleUser() {
		RestAssured.baseURI = "https://reqres.in/";
		Response res = given().get("/api/users/2").then().assertThat().statusCode(200).extract().response();
		System.out.println(res.asString());
		ResponseBody body = res.getBody();
		String bodyAsString = body.asString();
		Assert.assertEquals(bodyAsString.contains("2"), true);
		Assert.assertEquals(bodyAsString.contains("Janet"), true);
		Assert.assertEquals(bodyAsString.contains("Weaver"), true);
		Assert.assertEquals(bodyAsString.contains("janet.weaver@reqres.in"), true);
		Assert.assertEquals(bodyAsString.contains("https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg"),
				true);
		Assert.assertEquals(bodyAsString.contains("StatusCode Weekly"), true);
		Assert.assertEquals(bodyAsString.contains("http://statuscode.org/"), true);
		Assert.assertEquals(bodyAsString.contains(
				"A weekly newsletter focusing on software development, infrastructure, the server, performance, and the stack end of things."),
				true);
	}

//	@Test
//	public void singleResource() throws JsonProcessingException {
//		RestAssured.baseURI = "https://reqres.in/";
//		Response sr = when().get("/api/unknown/2").then().statusCode(200).assertThat().statusCode(200).extract()
//				.response();
//
//		ResponseBody body = sr.getBody();
//		Assert.assertEquals(body.asString().contains("2"), true);
//		Assert.assertEquals(body.asString().contains("fuchsia rose"), true);
//		Assert.assertEquals(body.asString().contains("2001"), true);
//		Assert.assertEquals(body.asString().contains("#C74375"), true);
//		Assert.assertEquals(body.asString().contains("17-2031"), true);
//		Assert.assertEquals(body.asString().contains("StatusCode Weekly"), true);
//		Assert.assertEquals(body.asString().contains(
//				"A weekly newsletter focusing on software development, infrastructure, the server, performance, and the stack end of things"),
//				true);
//
//	}
//	@Test
//	public void patch_update() {
//		RestAssured.baseURI = "https://reqres.in/";
//		Map<String, String> updateDetails = new HashMap<String, String>();
//		updateDetails.put("name", "morpheus");
//		updateDetails.put("job", "zion resident");
//		Response response = given().contentType(ContentType.JSON).body(updateDetails).patch("/api/users/2").then()
//				.assertThat().log().all().statusCode(200).extract().response();
//		ResponseBody body = response.getBody();
//		String bodyAsString = body.asString();
//		String pattern = "YYYY-MM-dd'T'HH:mm";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
//		String date = simpleDateFormat.format(new Date());
//	
//		System.out.println(date);
//		Assert.assertEquals(bodyAsString.contains(date), true);
//		Assert.assertEquals(response.getStatusCode(), 200);
//		Assert.assertEquals(response.jsonPath().getString("name"), "morpheus");
//		Assert.assertEquals(response.jsonPath().getString("job"), "zion resident");
//		System.out.println();
//
//	}
//	@Test
//	public void assertListResponse() {
//		RestAssured.baseURI = "https://reqres.in/";
//		Response listOfUser = get("/api/users?page=2");
//		List<Map<String, String>> map = listOfUser.jsonPath().getList("data");
//		
//		List<String> emails = new ArrayList<String>();
//		emails.add("michael.lawson@reqres.in");
//		emails.add("lindsay.ferguson@reqres.in");
//		emails.add("tobias.funke@reqres.in");
//		emails.add("byron.fields@reqres.in");
//		emails.add("george.edwards@reqres.in");
//		emails.add("rachel.howell@reqres.in");
//		
//		List<String> responseEmails = new ArrayList<String>();
//		for (Map<String, String> user : map) {
//			System.out.println(user.get("email"));
//			responseEmails.add(user.get("email"));
//		}
//		Assert.assertEquals(true, responseEmails.equals(emails));
//	}
//	
//	@Test
//	public void listResources() {
//		RestAssured.baseURI = "https://reqres.in/";
//		Response response = get("/api/unknown");
//			List<Map<String, String>> map = response.jsonPath().getList("data");
//			
//			List<String> name = new ArrayList<String>();
//			name.add("cerulean");
//			name.add("fuchsia rose");
//			name.add("true red");
//			name.add("aqua sky");
//			name.add("tigerlily");
//			name.add("blue turquoise");
//			
//			List<String> responsename = new ArrayList<String>();
//			for (Map<String, String> user : map) {
//				//System.out.println(user.get("name"));
//				responsename.add(user.get("name"));
//			}
//			Assert.assertEquals(true, responsename.equals(name));
//		}
}
