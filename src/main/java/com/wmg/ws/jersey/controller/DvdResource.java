package com.wmg.ws.jersey.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.wmg.ws.jersey.model.DVD;
import com.wmg.ws.jersey.repository.DvdRepository;
import com.wmg.ws.jersey.repository.DvdRepositoryStub;

@Path("/dvds")
public class DvdResource {
	
	DvdRepository dvdRepository = new DvdRepositoryStub();
	
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<DVD> getDvds() {
        return dvdRepository.findAll();
    }
}
