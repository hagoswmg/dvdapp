package com.wmg.ws.jersey.repository;

import java.util.ArrayList;
import java.util.List;

import com.wmg.ws.jersey.model.DVD;

public class DvdRepositoryStub implements DvdRepository {

	@Override
	public List<DVD> findAll() {
		List<DVD> dvdList = new ArrayList<>();
		
		dvdList.add(new DVD("Paul Dano", "Wildlife", "2018"));
		dvdList.add(new DVD("Spike Lee", "Bamboozled", "2000"));
		dvdList.add(new DVD("Claire Denis", "	Let the Sunshine In", "2017"));
		
		return dvdList;
	}
}
