package com.exercise2;

public class Service {
	private ExternalAPI api;
	
	public Service(ExternalAPI api) {
		this.api = api;
	}
	
	public String fetchData() {
		return this.api.getData();
	}

}
