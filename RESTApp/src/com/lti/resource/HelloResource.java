package com.lti.resource;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloResource {
	/*
	 http://localhost:8080/RESTApp/api/hello
	 @GET
	public String hello() {
		return "Hello from JAX-RS";
	}
	http://localhost:8080/RESTApp/api/hello?name=Smriti
	@GET
	public String hello(@QueryParam("name") String name) {
		return "Hello " + name + ". Welcome to JAX-RS";
	}
	//http://localhost:8080/RESTApp/api/hello/Smriti
	@Path("/{name}")
	@GET
	public String hello(@PathParam("name") String name) {
		return "Hello " + name + ". Welcome to JAX-RS";
	}
	*/
	//Matrix Param
	//http://localhost:8080/RESTApp/api/hello;name=Smriti
	@GET
	public String hello(@MatrixParam("name") String name) {
		return "Hello " + name + ". Welcome to JAX-RS";
	}
	
	
}
