package Calculator2;

import static org.junit.Assert.*;

import org.junit.Test;

import Calculator2.Calculator2;

public class Square {

	@Test
	public void test() {
		Calculator2 obj1=new Calculator2();
		int output_f=obj1.square(4);
		//Test output
		assertEquals(16,output_f);;
	}

}
