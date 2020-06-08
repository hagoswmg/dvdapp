package com.wmg.ws.jersey;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import io.swagger.jaxrs.config.BeanConfig;

public class SwaggerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setTitle("DVD Catalog API - Swagger Docs");
        beanConfig.setVersion("1.0.0");
        beanConfig.setBasePath("/apidocs");
        beanConfig.setSchemes(new String[]{"http", "https"});
        beanConfig.setResourcePackage("com.wmg.ws.jersey");
        beanConfig.setScan(true);
    }
}