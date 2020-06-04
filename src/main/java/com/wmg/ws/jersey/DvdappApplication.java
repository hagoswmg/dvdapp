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

	public DvdappApplication(@Context ServletConfig servletConfig) {
		ServletContext servletContext = servletConfig.getServletContext();
		String contextPath = servletContext.getContextPath();
		
		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setVersion("1.0");
		beanConfig.setTitle("DVD Catalog API");
		beanConfig.setBasePath("/api");
		beanConfig.setResourcePackage("com.wmg.ws.jersey");
		beanConfig.setSchemes(new String[] {"http", "https"});
		beanConfig.setScan(true);
		
		System.out.println("Servelet Context = " + servletContext);
		System.out.println("Context Path = " + contextPath);
		System.out.println("servletConfig.getServletName() = " + servletConfig.getServletName());
	}
}
