package com.testingMeven.myTestMaven;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class api_testing {
		
	    @Test
		public static void testRestAP(){
			//RestAssured RES = new RestAssured();
			
			// TODO Auto-generated method stub
			Response respon;
			respon=when().get("http://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=78010162718be12966b6dd44ddeb22ef");
			respon.getStatusCode();
			System.out.println("Print the responce : "+ respon.getStatusCode());

		}

	//@Test
	public static void testRestAP2(){
		//RestAssured RES = new RestAssured();
		
		// TODO Auto-generated method stub
		Response respon1;
		respon1=when().get("http://api.openweathermap.org/data/2.5/weather");
		respon1.getStatusCode();
		System.out.println("Print the responce : "+ respon1.getStatusCode());

	}

	//@Test
	public static void testRestAP3(){
		//RestAssured RES = new RestAssured();
		
		// TODO Auto-generated method stub
		Response respon1;
		respon1=given().param("q", "London").param("appid", "78010162718be12966b6dd44ddeb22ef").when().get("http://api.openweathermap.org/data/2.5/weather");
		respon1.getStatusCode();
		System.out.println("Print the responce : "+ respon1.getStatusCode());
	}

	//@Test
	public static void testRestAP4(){
		//RestAssured RES = new RestAssured();
		
		// TODO Auto-generated method stub
		//Response respon1;
		given().param("q", "London").param("appid", "78010162718be12966b6dd44ddeb22ef")
		.when().get("http://api.openweathermap.org/data/2.5/weather")
		.then().assertThat().statusCode(200);
		//respon1.getStatusCode();
		//System.out.println("Print the responce : "+ respon1.getStatusCode());

	}

	@Test
	public static void testRestAP5(){
		//RestAssured RES = new RestAssured();
		
		// TODO Auto-generated method stub
		Response respon1;
		respon1=given().param("q", "London").param("appid", "78010162718be12966b6dd44ddeb22ef")
		.when().get("http://api.openweathermap.org/data/2.5/weather");
		
		respon1.asString();
		System.out.println("Print the responce : "+ respon1.asString());

	}

	//getmethod
	
	@Test
	public static void testRestAP6(){
		//RestAssured RES = new RestAssured();
		
		// TODO Auto-generated method stub
		Response respon1;
		respon1=given().param("q", "London").param("appid", "78010162718be12966b6dd44ddeb22ef")
		.when().get("http://api.openweathermap.org/data/2.5/weather");
		
		respon1.asString();
		System.out.println("Print the responce : "+ respon1.asString());

	}
	
	//put method
	@Test
	public static void testRestAP7(){
		//RestAssured RES = new RestAssured();
		
		// TODO Auto-generated method stub
		Response respon1;
		respon1=(Response) given().param("key", "value").param("key", "value").body("")
		.when().contentType(ContentType.XML).post("");
	
		System.out.println("Print the responce : "+ respon1.asString());

	}


	}

