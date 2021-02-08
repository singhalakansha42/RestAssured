package Practice.Rest;

public class Reqres_Payload {

	public static String ListUsers() {
		return "{\r\n" + "    \"page\": 2,\r\n" + "    \"per_page\": 6,\r\n" + "    \"total\": 12,\r\n"
				+ "    \"total_pages\": 2,\r\n" + "    \"data\": [\r\n" + "        {\r\n" + "            \"id\": 7,\r\n"
				+ "            \"email\": \"michael.lawson@reqres.in\",\r\n"
				+ "            \"first_name\": \"Michael\",\r\n" + "            \"last_name\": \"Lawson\",\r\n"
				+ "            \"avatar\": \"https://s3.amazonaws.com/uifaces/faces/twitter/follettkyle/128.jpg\"\r\n"
				+ "        },\r\n" + "        {\r\n" + "            \"id\": 8,\r\n"
				+ "            \"email\": \"lindsay.ferguson@reqres.in\",\r\n"
				+ "            \"first_name\": \"Lindsay\",\r\n" + "            \"last_name\": \"Ferguson\",\r\n"
				+ "            \"avatar\": \"https://s3.amazonaws.com/uifaces/faces/twitter/araa3185/128.jpg\"\r\n"
				+ "        },\r\n" + "        {\r\n" + "            \"id\": 9,\r\n"
				+ "            \"email\": \"tobias.funke@reqres.in\",\r\n"
				+ "            \"first_name\": \"Tobias\",\r\n" + "            \"last_name\": \"Funke\",\r\n"
				+ "            \"avatar\": \"https://s3.amazonaws.com/uifaces/faces/twitter/vivekprvr/128.jpg\"\r\n"
				+ "        },\r\n" + "        {\r\n" + "            \"id\": 10,\r\n"
				+ "            \"email\": \"byron.fields@reqres.in\",\r\n"
				+ "            \"first_name\": \"Byron\",\r\n" + "            \"last_name\": \"Fields\",\r\n"
				+ "            \"avatar\": \"https://s3.amazonaws.com/uifaces/faces/twitter/russoedu/128.jpg\"\r\n"
				+ "        },\r\n" + "        {\r\n" + "            \"id\": 11,\r\n"
				+ "            \"email\": \"george.edwards@reqres.in\",\r\n"
				+ "            \"first_name\": \"George\",\r\n" + "            \"last_name\": \"Edwards\",\r\n"
				+ "            \"avatar\": \"https://s3.amazonaws.com/uifaces/faces/twitter/mrmoiree/128.jpg\"\r\n"
				+ "        },\r\n" + "        {\r\n" + "            \"id\": 12,\r\n"
				+ "            \"email\": \"rachel.howell@reqres.in\",\r\n"
				+ "            \"first_name\": \"Rachel\",\r\n" + "            \"last_name\": \"Howell\",\r\n"
				+ "            \"avatar\": \"https://s3.amazonaws.com/uifaces/faces/twitter/hebertialmeida/128.jpg\"\r\n"
				+ "        }\r\n" + "    ],\r\n" + "    \"ad\": {\r\n"
				+ "        \"company\": \"StatusCode Weekly\",\r\n" + "        \"url\": \"http://statuscode.org/\",\r\n"
				+ "        \"text\": \"A weekly newsletter focusing on software development, infrastructure, the server, performance, and the stack end of things.\"\r\n"
				+ "    }\r\n" + "}";

	}

	public static String ListResource() {
		return "{\r\n" + "    \"page\": 1,\r\n" + "    \"per_page\": 6,\r\n" + "    \"total\": 12,\r\n"
				+ "    \"total_pages\": 2,\r\n" + "    \"data\": [\r\n" + "        {\r\n" + "            \"id\": 1,\r\n"
				+ "            \"name\": \"cerulean\",\r\n" + "            \"year\": 2000,\r\n"
				+ "            \"color\": \"#98B2D1\",\r\n" + "            \"pantone_value\": \"15-4020\"\r\n"
				+ "        },\r\n" + "        {\r\n" + "            \"id\": 2,\r\n"
				+ "            \"name\": \"fuchsia rose\",\r\n" + "            \"year\": 2001,\r\n"
				+ "            \"color\": \"#C74375\",\r\n" + "            \"pantone_value\": \"17-2031\"\r\n"
				+ "        },\r\n" + "        {\r\n" + "            \"id\": 3,\r\n"
				+ "            \"name\": \"true red\",\r\n" + "            \"year\": 2002,\r\n"
				+ "            \"color\": \"#BF1932\",\r\n" + "            \"pantone_value\": \"19-1664\"\r\n"
				+ "        },\r\n" + "        {\r\n" + "            \"id\": 4,\r\n"
				+ "            \"name\": \"aqua sky\",\r\n" + "            \"year\": 2003,\r\n"
				+ "            \"color\": \"#7BC4C4\",\r\n" + "            \"pantone_value\": \"14-4811\"\r\n"
				+ "        },\r\n" + "        {\r\n" + "            \"id\": 5,\r\n"
				+ "            \"name\": \"tigerlily\",\r\n" + "            \"year\": 2004,\r\n"
				+ "            \"color\": \"#E2583E\",\r\n" + "            \"pantone_value\": \"17-1456\"\r\n"
				+ "        },\r\n" + "        {\r\n" + "            \"id\": 6,\r\n"
				+ "            \"name\": \"blue turquoise\",\r\n" + "            \"year\": 2005,\r\n"
				+ "            \"color\": \"#53B0AE\",\r\n" + "            \"pantone_value\": \"15-5217\"\r\n"
				+ "        }\r\n" + "    ],\r\n" + "    \"ad\": {\r\n"
				+ "        \"company\": \"StatusCode Weekly\",\r\n" + "        \"url\": \"http://statuscode.org/\",\r\n"
				+ "        \"text\": \"A weekly newsletter focusing on software development, infrastructure, the server, performance, and the stack end of things.\"\r\n"
				+ "    }\r\n" + "}";
	}

	public static String loginUnsuccessfull() {
		return "{\r\n" + "\"email\": \"peter@klaven\"\r\n" + "}";
	}
}
