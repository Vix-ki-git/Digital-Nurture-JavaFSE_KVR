package com.mockito.exercise1;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;

class MockingTest {

	@Test
	void test() {
		//mock of external api
		ExternalAPI mockApi = Mockito.mock(ExternalAPI.class);
		
		//stub method of external api that returns the value "Mock Data"
		when(mockApi.getData()).thenReturn("Mock Data");
		
		Service s = new Service(mockApi);
		
		System.out.println(s.data());
		
		
	}

}
