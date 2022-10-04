package infinite.JUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployTest {

	@Test
	public void testToString(){
		
	}
	
	@Test
	public void testGetterAndSetters(){
		Employ employ1 = new Employ();
		employ1.setEmpno(1);
		employ1.setName("Sireesha");
		employ1.setGender(Gender.FEMALE);
		employ1.setDept("Java");
		employ1.setDesign("Programmer");
		employ1.setBasic(84832);
		
		assertEquals(1,employ1.getEmpno());
		assertEquals("Sireesha",employ1.getName());
		assertEquals(Gender.FEMALE,employ1.getGender());
		assertEquals("Java",employ1.getDept());
		assertEquals("Programmer",employ1.getDesign());
		assertEquals(84832,employ1.getBasic(),0);
	}
	
	@Test
	public void testConstructor() {
		Employ employ1 = new Employ();
		assertNotNull(employ1);
		
		Employ employ2 = new Employ(1, "Javed Khan", Gender.MALE,
				"Java","Programmer",88424);
		assertEquals(1,employ2.getEmpno());
		assertEquals("Javed Khan",employ2.getName());
		assertEquals(Gender.MALE,employ2.getGender());
		assertEquals("Java",employ2.getDept());
		assertEquals("Programmer",employ2.getDesign());
		assertEquals(88424,employ2.getBasic(),0);
	}

}
