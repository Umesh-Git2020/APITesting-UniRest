package pkg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionExample {
	public void getMethodExample() throws IOException
	{
		URL url = new URL("http://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		int statuscode = connection.getResponseCode();
		System.out.println("status code is:" + statuscode);
		String statusMessage = connection.getResponseMessage();
		System.out.println("status code is:" + statusMessage);
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null)
		{
			buffer.append(line);
		}
		System.out.println(buffer);
	}
	public void PostMethodExample() throws IOException
	{
		URL url = new URL("http://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		String jsonBody = "{\"name\":\"Thetha\",\"salary\":\"30000\",\"age\":\"23\"}";
		byte[] inputJson = jsonBody.getBytes();
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputJson);
		int statuscode = connection.getResponseCode();
		System.out.println("status code is:" + statuscode);
		String statusMessage = connection.getResponseMessage();
		System.out.println("status code is:" + statusMessage);
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null)
		{
			buffer.append(line);
		}
		System.out.println(buffer);
	}
	public void PutMethodExample() throws IOException
	{
		URL url = new URL("http://dummy.restapiexample.com/api/v1/update/55");
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		String jsonBody = "{\"name\":\"Thetha\",\"salary\":\"30000\",\"age\":\"24\"}";
		byte[] inputJson = jsonBody.getBytes();
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputJson);
		int statuscode = connection.getResponseCode();
		System.out.println("status code is:" + statuscode);
		String statusMessage = connection.getResponseMessage();
		System.out.println("status code is:" + statusMessage);
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null)
		{
			buffer.append(line);
		}
		System.out.println(buffer);
	}
	public void DeleteMethodExample() throws IOException
	{
		URL url = new URL("http://dummy.restapiexample.com/api/v1/delete/55");
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("DELETE");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		int statuscode = connection.getResponseCode();
		System.out.println("status code is:" + statuscode);
		String statusMessage = connection.getResponseMessage();
		System.out.println("status code is:" + statusMessage);
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null)
		{
			buffer.append(line);
		}
		System.out.println(buffer);
	}
	public static void main(String[] args) throws IOException
	{

		HttpURLConnectionExample Connection = new HttpURLConnectionExample();
		Connection.getMethodExample();
		Connection.PostMethodExample();
		Connection.PutMethodExample();
		Connection.DeleteMethodExample();
	}


}
