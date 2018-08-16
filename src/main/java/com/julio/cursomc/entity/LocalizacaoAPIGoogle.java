package com.julio.cursomc.entity;

import java.util.List;

public class LocalizacaoAPIGoogle {

	private List<ResultsAPIGoogle> results;
	private String status;

	public List<ResultsAPIGoogle> getResults() {
		return results;
	}

	public void setResults(List<ResultsAPIGoogle> results) {
		this.results = results;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
