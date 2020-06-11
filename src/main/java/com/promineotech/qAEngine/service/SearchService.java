package com.promineotech.qAEngine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.qAEngine.repository.ResponseRepository;
import com.promineotech.qAEngine.view.SearchResults;
import com.promineotech.qAEngine.repository.QuestionRepository;

@Service
public class SearchService {

	@Autowired
	private ResponseRepository repo;

	@Autowired
	private QuestionRepository questionRepo;

	public SearchResults search(String keyword) throws Exception {
		SearchResults results = new SearchResults();
		if (keyword == null) {
			throw new Exception("Keyword cannot be null.");
		}
		
		results.setQuestionResults(questionRepo.findByContentContaining(keyword));
		results.setResponseResults(repo.findByContentContaining(keyword));
		
		return results;
	}

	
}
