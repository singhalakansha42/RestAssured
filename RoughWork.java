package Practice.Rest;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

import io.restassured.response.Response;


import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Test
public class RoughWork {
	@Test
	public void delayedResponse() {
		RestAssured.baseURI = "https://reqres.in/";
		Response response = get("/api/users?delay=3");
			List<Map<String, String>> map = response.jsonPath().getList("data");
			
			List<String> first_name = new ArrayList<String>();
			first_name.add("George");
			first_name.add("Janet");
			first_name.add("Emma");
			first_name.add("Eve");
			first_name.add("Charles");
			first_name.add("Tracey");
			
			List<String> responsename = new ArrayList<String>();
			for (Map<String, String> user : map) {
				//System.out.println(user.get("name"));
				responsename.add(user.get("first_name"));
			}
			Assert.assertEquals(true, responsename.equals(first_name));
		}
	}
