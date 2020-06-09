package com.wmg.ws.jersey;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.swagger.jaxrs.config.BeanConfig;

public class SwaggerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setTitle("DVD Catalog API - Swagger Docz");
        beanConfig.setVersion("1.0.0");
        beanConfig.setBasePath("/apidocs");
        beanConfig.setSchemes(new String[]{"http", "https"});
        beanConfig.setResourcePackage("com.wmg.ws.jersey");
        beanConfig.setScan(true);
        
        log.trace("Swagger Servlet Initialized");
        log.trace("swagger available at" + beanConfig.getHost() + beanConfig.getBasePath());
        
        System.out.println("swagger available at: " + beanConfig.getHost() + beanConfig.getBasePath());
    }
}