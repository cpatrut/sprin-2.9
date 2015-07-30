package ro.catalin.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.test.web.servlet.MockMvc;

import com.sun.xml.internal.ws.util.pipe.StandalonePipeAssembler;

import ro.catalin.HomeController;

public class testHomePage {

	@Test
	public void testHomePage() throws Exception{
		HomeController homeController = new HomeController();
		assertEquals("home",homeController.home());
	}
}
