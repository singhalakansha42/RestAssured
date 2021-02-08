package Practice.Rest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;


public class CommonMethods {
	public static JsonPath rawToJson(String response) {
		JsonPath js1 = new JsonPath(response); // for parsing json
		return js1;

	}

	public static void ApplicationBaseUri() {
		RestAssured.baseURI = "https://reqres.in/";
	}
}
