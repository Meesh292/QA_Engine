package com.promineotech.qAEngine.view;

import com.promineotech.qAEngine.entity.Question;
import com.promineotech.qAEngine.entity.Response;

public class SearchResults {

	public Long keyword;
	
	private Iterable<Question> questionResults;
	
	private Iterable<Response> responseResults;
	
	private Iterable<Question> getQuestionResults() {
		return questionResults;
	}
	
	private Iterable<Response> getResponseResults() {
		return responseResults;
	}

	public void setQuestionResults(Iterable<Question> questionResults) {
		this.questionResults = questionResults;
	}
	public void setResponseResults(Iterable<Response> responseResults) {
		this.responseResults = responseResults;
	}
}