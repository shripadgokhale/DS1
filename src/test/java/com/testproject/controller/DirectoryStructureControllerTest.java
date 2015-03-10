package com.testproject.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.ModelAndViewAssert;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.testproject.model.FileInfo;
import com.testproject.service.DirectoryService;
import com.testproject.service.DirectoryWalker;

/**
 * The class <code>DirectoryStructureControllerTest</code> contains tests for the class <code>{@link DirectoryStructureController}</code>.
 *
 * 
 * @author sgokhale
 * @version $Revision: 1.0 $
 */
public class DirectoryStructureControllerTest {
	/**
	 * Run the DirectoryStructureController() constructor test.
	 *
	 */
	@Test
	public void testDirectoryStructureController_1()
		throws Exception {
		DirectoryStructureController result = new DirectoryStructureController();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the ModelAndView enterFile() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testEnterFile_1()
		throws Exception {
		DirectoryStructureController fixture = new DirectoryStructureController();
		fixture.list = new DirectoryService();

		ModelAndView result = fixture.enterFile();

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "enterfile");
	}

	/**
	 * Run the ModelAndView fail(Model) method test.
	 *
	 * @throws Exception
a	 *
	 */
	@Test
	public void testFail_1()
		throws Exception {
		DirectoryStructureController fixture = new DirectoryStructureController();
		fixture.list = new DirectoryService();
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.fail(model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "fail");
		assertEquals(1, model.size());
		assertEquals("Login Failed", model.get("message"));
	}

	/**
	 * Run the ModelAndView showInfo(String,Model) method test.
	 *
	 * @throws Exception
	 */
	@Test
	public void testShowInfo_1()
		throws Exception {
		DirectoryStructureController fixture = new DirectoryStructureController();
		DirectoryService ds =  new DirectoryService();
		ds.setWalker(new DirectoryWalker());
		 fixture.list =ds;
		String path1 = "d:\\shri1234";
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.showInfo(path1, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		//ModelAndViewAssert.assertViewName(result, "fail");
		assertEquals(1, model.size());
		//assertEquals("Invalid path", model.get("message"));
	}

	/**
	 * Run the ModelAndView showInfo(String,Model) method test.
	 *
	 * @throws Exception
	 */
	@Test
	public void testShowInfo_2()
		throws Exception {
		DirectoryStructureController fixture = new DirectoryStructureController();
		fixture.list = new DirectoryService();
		String path = "";
		ExtendedModelMap model = new ExtendedModelMap();

		ModelAndView result = fixture.showInfo(path, model);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "fail");
		assertEquals(1, model.size());
		assertEquals("Invalid path", model.get("message"));
	}

	/**
	 * Run the FileInfo showJsonInfo(String,Model) method test.
	 *
	 * @throws Exception
	 */
	@Test
	public void testShowJsonInfo_1()
		throws Exception {
		DirectoryStructureController fixture = new DirectoryStructureController();
		fixture.list = new DirectoryService();
		String path = "";
		ExtendedModelMap model = new ExtendedModelMap();

		FileInfo result = fixture.showJsonInfo(path, model);

		// add additional test code here
		assertEquals(null, result);
		assertEquals(0, model.size());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DirectoryStructureControllerTest.class);
	}
}