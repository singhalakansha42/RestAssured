package Practice.Rest;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONObject;
import org.junit.Assert;
//import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
//import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class PayloadValidation {
	@Test
	public static void ListofUsers_Payload() {
		JsonPath js = new JsonPath(Reqres_Payload.ListUsers());
		int count = js.getInt("data.size()");
		System.out.println(count);
		int id = js.getInt("data[0].id");
		String email = js.get("data[0].email");
		String firstName = js.get("data[0].first_name");
		String lastName = js.get("data[0].last_name");
		String avatar = js.get("data[0].avatar");
		for (int i = 0; i < count; i++) {
			System.out.println(js.getInt("data[" + i + "].id"));
			System.out.println(js.get("data[" + i + "].email"));
			System.out.println(js.get("data[" + i + "].first_name"));
			System.out.println(js.get("data[" + i + "].last_name"));
			System.out.println(js.get("data[" + i + "].avatar"));
			int ad_count = js.getInt("ad.size()");
			System.out.println(ad_count);
			String company = js.get("ad.company");
			System.out.println(company);
			String url = js.get("ad.url");
			System.out.println(url);
			String text = js.get("ad.text");
			System.out.println(text);
		}

	}

	@Test
	public static void listResources() {
		JsonPath jse = new JsonPath(Reqres_Payload.ListResource());
		int datacount = jse.getInt("data.size()");
		System.out.println("Size of data array is:" + datacount);
		for (int i1 = 0; i1 < datacount; i1++) {
			System.out.println("Id is :" + jse.getInt("data[" + i1 + "].id"));
			System.out.println("Name is :" + jse.get("data[" + i1 + "].name"));
			System.out.println("Year is :" + jse.get("data[" + i1 + "].year"));
			System.out.println("color is : " + jse.get("data[" + i1 + "].color"));
			System.out.println("Pantone value is :" + jse.get("data[" + i1 + "].pantone_value"));
		}
		for (int i = 0; i < datacount; i++) {

			String data_name = jse.get("data[" + i + "].name");
			if (data_name.equalsIgnoreCase("blue turquoise")) {

				int year1 = jse.get("data[" + i + "].year");
				System.out.println(year1);
				break;
			}

		}
		int ad = jse.getInt("ad.size()");
		System.out.println("Size od ad is:" + ad);
		System.out.println("Name of the company is: " + jse.getString("ad.company"));
		System.out.println("Name of the company is: " + jse.getString("ad.url"));
		System.out.println("Name of the company is: " + jse.getString("ad.text"));
	}

}
