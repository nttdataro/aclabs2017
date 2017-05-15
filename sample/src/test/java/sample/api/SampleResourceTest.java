package sample.api;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import ro.nttdata.ligaaclabs.sample.api.SampleResource;
import ro.nttdata.ligaaclabs.sample.business.control.SampleController;
import ro.nttdata.ligaaclabs.sample.business.data.DetailedSampleDO;
import ro.nttdata.ligaaclabs.sample.business.data.SampleDO;

public class SampleResourceTest {
	private static final String ENTITY_ID = "ENTITY_ID";
	
	@Rule 
	public MockitoRule mockitoRule = MockitoJUnit.rule(); 
	
	@InjectMocks
	private SampleResource resourceUnderTest;
	
	@Mock
	private SampleController sampleController;
	
	@Test
	public void testGetSampleEntities(){
		// given
		List<SampleDO> sampleEntities = new ArrayList<>();
		when(sampleController.getSampleObjects()).thenReturn(sampleEntities);
		
		// when
		Response response =  resourceUnderTest.getSampleEntities();
		
		// then
		assertEquals(200, response.getStatus());
		assertEquals(sampleEntities, response.getEntity());
	}
	
	@Test
	public void testGetSampleEntity(){
		// given
		DetailedSampleDO sampleDO = new DetailedSampleDO();
		when(sampleController.getSampleEntity(ENTITY_ID)).thenReturn(sampleDO);
		
		// when
		Response response =  resourceUnderTest.getSampleEntity(ENTITY_ID);
		
		// then
		assertEquals(200, response.getStatus());
		assertEquals(sampleDO, response.getEntity());
	}
}
