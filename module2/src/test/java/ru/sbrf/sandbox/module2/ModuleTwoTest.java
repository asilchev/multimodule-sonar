package ru.sbrf.sandbox.module2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ModuleTwoTest {

	@Test
	public void method1() {
		ModuleTwo moduleOne = new ModuleTwo();
		Assert.assertEquals(moduleOne.method1(), "METHOD 1");
	}
}
