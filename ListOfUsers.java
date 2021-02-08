package ParcticeReqres;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfUsers {
	@Test
	public void Listofusers() {
		RestAssured.baseURI = "https://reqres.in/";
		Response listOfUsers = get("/api/users/2");
		List<Map<String, String>> map = listOfUsers.jsonPath().getList("data");
		List<String> emails = new ArrayList<String>();
		emails.add("michael.lawson@reqres.in");
		emails.add("lindsay.ferguson@reqres.in");
		emails.add("tobias.funke@reqres.in");
		emails.add("byron.fields@reqres.in");
		emails.add("george.edwards@reqres.in");
		emails.add("rachel.howell@reqres.in");
		List<String> first_name = new ArrayList<String>();
		first_name.add("Michael");
		first_name.add("Lindsay");
		first_name.add("Tobias");
		first_name.add("Byron");
		first_name.add("George");
		first_name.add("Howell");
		List<String> last_name = new ArrayList<String>();
		last_name.add("Lawson");
		last_name.add("Ferguson");
		last_name.add("Funke");
		last_name.add("Fields");
		last_name.add("Edwards");
		last_name.add("Howell");
		List<String> avatar = new ArrayList<String>();
		avatar.add("https://s3.amazonaws.com/uifaces/faces/twitter/follettkyle/128.jpg");
		avatar.add("https://s3.amazonaws.com/uifaces/faces/twitter/araa3185/128.jpg");
		avatar.add("https://s3.amazonaws.com/uifaces/faces/twitter/vivekprvr/128.jpg");
		avatar.add("https://s3.amazonaws.com/uifaces/faces/twitter/russoedu/128.jpg");
		avatar.add("https://s3.amazonaws.com/uifaces/faces/twitter/mrmoiree/128.jpg");
		avatar.add("https://s3.amazonaws.com/uifaces/faces/twitter/hebertialmeida/128.jpg");
		Map<String,String> responseEmails = new HashMap<String,String>();
		Map<String,String> responsefirstName = new HashMap<String,String>();
		Map<String,String> responselastName = new HashMap<String,String>();
		Map<String,String> responseavatar = new HashMap<String,String>();
		for (Map<String, String> user : map) {
			user.get("emails");
			user.get("first_name");
			user.get("last_name");
			user.get("avatar");
			
		}
		Assert.assertEquals(true, responseEmails.equals(emails));
		Assert.assertEquals(true, responsefirstName.equals(first_name));
		Assert.assertEquals(true, responselastName.equals(last_name));
		Assert.assertEquals(true, responseavatar.equals(avatar));
		
	}

}
