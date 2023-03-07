package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.playClasses.MySingletonClass;

public class MySingletonClassTest {
	
	MySingletonClass mySingleton;

	@Test
	public void NotNullTest() {
		
		MySingletonClass singleton  = MySingletonClass.getInstance();			
		assertNotNull(singleton);
	}
	
	@Test
	public void EqualsTest() {
		
		MySingletonClass singleton = MySingletonClass.getInstance();
		MySingletonClass singleton2 = MySingletonClass.getInstance();
		
		assertSame(singleton, singleton2);
	}
	
	@Test
	public void EqualsTest2() {
		
		MySingletonClass singleton = MySingletonClass.getInstance();
		MySingletonClass singleton2 = MySingletonClass.getInstance();
		
		int hashCode1 = singleton.hashCode();
		int hashCode2 = singleton2.hashCode();
		
		assertTrue(hashCode1 == hashCode2);
	}
	

}
