package tutorial;

import com.opensymphony.xwork2.ActionSupport;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {

	private HelloWorld hello_world;

	protected void setUp() throws Exception {
		hello_world = new HelloWorld();
	}

	public void testExecute() throws Exception {
		String result = hello_world.execute();
		assertTrue("Expected a success result!", ActionSupport.SUCCESS.equals(result));
		assertTrue("Expected the default message!", HelloWorld.MESSAGE.equals(hello_world.getMessage()));
	}

}
