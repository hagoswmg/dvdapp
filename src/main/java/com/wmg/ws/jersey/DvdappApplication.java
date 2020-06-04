package com.wmg.ws.jersey;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import io.swagger.jaxrs.config.BeanConfig;

@ApplicationPath("/api")
public class DvdappApplication extends Application {
	
	@Autowired
	Environment env;
	
	public DvdappApplication(@Context ServletConfig servletConfig) {
		ServletContext servletContext = servletConfig.getServletContext();
		String contextPath = servletContext.getContextPath();
		
		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setVersion("1.1");
		beanConfig.setTitle("DVD Catalog API");
		beanConfig.setBasePath(contextPath + "/api");
		beanConfig.setResourcePackage("com.wmg.ws.jersey");
		beanConfig.setScan(true);
		
		System.out.println("Servelet Context = " + servletContext);
		System.out.println("Context Path = " + contextPath);
		System.out.println("servletConfig.getServletName() = " + servletConfig.getServletName());
	}

}
