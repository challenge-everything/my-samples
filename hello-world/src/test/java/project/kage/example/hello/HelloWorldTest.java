package project.kage.example.hello;

import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	private HelloWorld sut;

	@Before
	public void setUp() {
		sut = new HelloWorld();
	}

	@Test
	public final void test() {
		assertThat(sut.execute(), org.hamcrest.CoreMatchers.is("Hello World!"));
	}

}
