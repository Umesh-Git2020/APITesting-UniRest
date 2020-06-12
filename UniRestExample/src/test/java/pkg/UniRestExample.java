package pkg;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UniRestExample {
	public void GetMethodExample() throws UnirestException
	{
		HttpResponse<JsonNode> jsonResponse = 
				Unirest.get("http://dummy.restapiexample.com/api/v1/employees").asJson();
		System.out.println("Status code is :" +jsonResponse.getStatus());
		System.out.println("Status text is :" +jsonResponse.getStatusText());
		System.out.println("message is: " +jsonResponse.getBody());

	}
	public void PostMethodExample() throws UnirestException
	{
		HttpResponse<JsonNode> jsonResponse = Unirest.post("http://dummy.restapiexample.com/api/v1/create").
				body("{\"name\":\"Thetha\",\"salary\":\"30000\",\"age\":\"23\"}").asJson();
		System.out.println("Status code :" +jsonResponse.getStatus());
		System.out.println("Status message: " +jsonResponse.getStatusText());
		System.out.println("Body is :" +jsonResponse.getBody());
	}
	public void PutMethodExample() throws UnirestException
	{
		HttpResponse<JsonNode> jsonResponse = Unirest.
				put("http://dummy.restapiexample.com/api/v1/update/55").
				body("{\"name\":\"Thetha\",\"salary\":\"30000\",\"age\":\"24\"}").asJson();
		System.out.println("Status code :" +jsonResponse.getStatus());
		System.out.println("Status message: " +jsonResponse.getStatusText());
		System.out.println("Body is :" +jsonResponse.getBody());
	}
	public void DeleteMethodExample() throws UnirestException
	{
		HttpResponse<JsonNode> jsonResponse = Unirest.
				delete("http://dummy.restapiexample.com/api/v1/update/55").asJson();
		System.out.println("Status code :" +jsonResponse.getStatus());
		System.out.println("Status message: " +jsonResponse.getStatusText());
		System.out.println("Body is :" +jsonResponse.getBody());
	}
	
	public static void main(String[] args) throws UnirestException {
		UniRestExample response = new UniRestExample();
		response.GetMethodExample();
		response.PostMethodExample();
		response.PutMethodExample();
		response.DeleteMethodExample();

	}

}
