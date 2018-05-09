package com.javeriana.util;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.config.SwaggerContextService;
import io.swagger.models.Contact;
import io.swagger.models.Info;
import io.swagger.models.License;
import io.swagger.models.Swagger;
import io.swagger.models.Tag;

public class Bootstrap extends HttpServlet{
	
	/**
	 * 
	 */

	@Override
	public void init(ServletConfig config) throws ServletException{
		
		Info info = new Info()
				.title("Calculadora -Swagger")
				.description("Taller de Swagger")
				.termsOfService("http://swagger.io/terms/")
			    .contact(new Contact()
			    .email("jugarcia@gmail.com"))
			    .license(new License()
			    .name("Apache 2.0")
			    .url("http://www.apache.org/licenses/LICENSE-2.0.html"));
		
		ServletContext context = config.getServletContext();
		Swagger swagger = new Swagger().info(info);

		new SwaggerContextService().withServletConfig(config).updateSwagger(swagger);
	}
	

}
