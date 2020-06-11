package com.promineotech.qAEngine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.qAEngine.service.SearchService;


@RestController
@RequestMapping("/search")
public class SearchController {

	@Autowired
	private SearchService service;
	
	@RequestMapping(value="/{keyword}", method=RequestMethod.GET)
	public ResponseEntity<Object> search(@RequestParam String keyword) {
		try {
			return new ResponseEntity<Object>(service.search(keyword), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
}
