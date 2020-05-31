package com.wmg.ws.jersey.repository;

import java.util.List;

import com.wmg.ws.jersey.model.DVD;

public interface DvdRepository {

	List<DVD> findAll();

}