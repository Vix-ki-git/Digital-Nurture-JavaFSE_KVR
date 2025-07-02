package com.exercise2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.Mockito.*;


class MockitoInteractions {

	@Test
	void testInteractions() {
		ExternalAPI api = Mockito.mock(ExternalAPI.class);
		
		Service s = new Service(api);
		
		s.fetchData();
		
		//verifying if getData() was called
		
		verify(api).getData();
	}

}
