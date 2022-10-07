package infinite.LeaveProject;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

import org.junit.Test;

public class EmployTest {

	@Test 
	public void testToString() {
		Employ employ3 = new Employ(1, "Javed Khan", "javed@khan.com", "6942069420", Date.valueOf("2022-08-18"), "Java", 1000, 10);
		String result = "Employ [empId=" + 1 + ", Name=" + "Javed Khan" + ", Email=" + "javed@khan.com" + ", Mob=" + "6942069420" + ", DOJ=" + Date.valueOf("2022-08-18")
				+ ", Dept=" + "Java" + ", mId=" + 1000 + ", leaveAvail=" + 10 + "]";
		assertEquals(result, employ3.toString());
	}
	@Test
	public void testGetterAndSetter(){
		Employ employ1 = new Employ();
		employ1.setEmpId(1);
		employ1.setName("Javed Khan");
		employ1.setDept("Java");
		employ1.setEmail("javed@khan.com");
		employ1.setMob("6942069420");
		employ1.setDOJ(Date.valueOf("2022-08-18"));
		employ1.setmId(1000);
		employ1.setLeaveAvail(10);
		
		
		assertEquals(1, employ1.getEmpId());
		assertEquals("Javed Khan", employ1.getName());
		assertEquals("Java", employ1.getDept());
		assertEquals("javed@khan.com", employ1.getEmail());
		assertEquals("6942069420", employ1.getMob());
		assertEquals(Date.valueOf("2022-08-18"), employ1.getDOJ());
		assertEquals(1000, employ1.getmId());
		assertEquals(10, employ1.getLeaveAvail());
	}
	
	@Test
	public void testConstructor(){
		Employ employ1 = new Employ();
		assertNotNull(employ1);
		
		Employ employ2 = new Employ(1, "Javed Khan", "javed@khan.com", "6942069420", Date.valueOf("2022-08-18"), "Java", 1000, 10);
		assertEquals(1, employ2.getEmpId());
		assertEquals("Javed Khan", employ2.getName());
		assertEquals("javed@khan.com", employ2.getEmail());
		assertEquals("6942069420", employ2.getMob());
		assertEquals(Date.valueOf("2022-08-18"), employ2.getDOJ());
		assertEquals("Java", employ2.getDept());
		assertEquals(1000, employ2.getmId());
		assertEquals(10, employ2.getLeaveAvail()); 
	}
}


