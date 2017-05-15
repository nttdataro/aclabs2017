package ro.nttdata.ligaaclabs.sample.business.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

/**
 * Unit test for {@link SampleDO}: only for demonstrating purposes for basic
 * usage of JUnit - data objects are not normally unit tested, since they should
 * be covered by unit tests of the control layer.
 *
 */
public class SampleDOTest {

	private static final long ID = 1L;
	private static final String NAME = "DO_NAME";

	private SampleDO sampleDO;

	@Before
	public void init() {
		sampleDO = new SampleDO();
	}

	@Test
	public void tesGetId(){
		// given
		sampleDO.setId(ID);
		
		// when
		long id = sampleDO.getId();
		
		// then
		assertEquals(ID, id);
	}
	
	@Test
	public void tesGetName(){
		// given
		sampleDO.setName(NAME);
		
		// when
		String name = sampleDO.getName();
		
		// then
		assertEquals(NAME, name);
	}
	
	@Test
	public void testSetCreatedTimestampNotNull(){
		testSetCreatedTimestamp(new Date());
	}
	
	@Test
	public void testSetCreatedTimestampNull(){
		testSetCreatedTimestamp(null);
	}
	
	private void testSetCreatedTimestamp(Date createdTimestamp){
		// when
		sampleDO.setCreatedTimestamp(createdTimestamp);
		
		// then
		assertEquals(createdTimestamp, sampleDO.getCreatedTimestamp());
	}

}
