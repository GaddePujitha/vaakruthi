package com.vaakruthi.restfull;


	import javax.ws.rs.GET;
	import javax.ws.rs.Path;
	import javax.ws.rs.Produces;
	import javax.ws.rs.core.MediaType;

	@Path("/Vaakruthi")

	public class Restfull {
		@GET
		@Produces(MediaType.TEXT_PLAIN)
		public String sayHello() {
			return "Hello Vaakruthi";
		}
		@GET
		@Produces(MediaType.TEXT_XML)
		public String sayXML() {
			return "<?xml version=\"1.0\"?>"+"<hello>Hello vaakruthi</hello>";
		}
		@GET
		@Produces(MediaType.TEXT_HTML)
		public String sayHTML() {
			return "<html><title>Hello vaakruthi</title><body><h1>Hello Vaakruthi</h1></body></html>";
		}
		}

