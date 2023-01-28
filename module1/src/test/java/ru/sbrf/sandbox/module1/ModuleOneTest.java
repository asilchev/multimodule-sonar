package ru.sbrf.sandbox.module1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ModuleOneTest {

	@Test
	public void method1() {
		ModuleOne moduleOne = new ModuleOne();
		Assert.assertEquals(moduleOne.method1(), "METHOD 1");
	}
	
	@Test
	public void method2() {
		ModuleOne moduleOne = new ModuleOne();
		Assert.assertEquals(moduleOne.method2(), "METHOD 2");
	}
	
}
