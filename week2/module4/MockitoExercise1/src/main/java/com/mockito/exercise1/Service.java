package com.mockito.exercise1;

public class Service {
	private ExternalAPI api;
	
	public Service(ExternalAPI api) {
		this.api = api;
	}
	
	public String data() {
		return this.api.getData();
	}
	

}
