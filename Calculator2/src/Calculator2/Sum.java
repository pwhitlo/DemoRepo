package Calculator2;

import static org.junit.Assert.*;

import org.junit.Test;

import Calculator2.Calculator2;

public class Sum {

	@Test
	public void test() {
		//Create new object of calculator class
		Calculator2 obj2=new Calculator2();
		int output_x=obj2.sum(4,8);
		//Test output
		assertEquals(12,output_x);
	}

}
