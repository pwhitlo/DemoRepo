package Calculator2;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ Square.class, Sum.class,Diff.class })
public class AllTests
{
	@Test
	public void testSum() 
	{
		//Create new object of calculator class
		Calculator2 obj2=new Calculator2();
		int output_x=obj2.sum(4,8);
		//Test output
		assertEquals(12,output_x);
	}
	@Test
	public void testSquare() {
		Calculator2 obj1=new Calculator2();
		int output_f=obj1.square(4);
		//Test output
		assertEquals(16,output_f);;
	}
	@Test
	public void testDiff() {
		//Create new object of calculator class
		Calculator2 obj3=new Calculator2();
		int z=obj3.diff(8,4);
		//Test output
		assertEquals(4,z);
	}

}
