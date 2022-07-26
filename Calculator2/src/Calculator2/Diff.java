package Calculator2;

import static org.junit.Assert.*;

import org.junit.Test;

import Calculator2.Calculator2;

public class Diff {

	@Test
	public void test() {
		//Create new object of calculator class
		Calculator2 obj3=new Calculator2();
		int output_z=obj3.diff(8,4);
		//Test output
		assertEquals(4,output_z);
	}

}
