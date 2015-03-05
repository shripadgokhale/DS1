package com.testproject.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.testproject.model.FileInfo;

/**
 * The class <code>DirectoryServiceTest</code> contains tests for the class <code>{@link DirectoryService}</code>.
 *
 * @generatedBy CodePro at 3/4/15 2:20 PM
 * @author sgokhale
 * @version $Revision: 1.0 $
 */
public class DirectoryServiceTest {
	/**
	 * Run the DirectoryService() constructor test.
	 *
	 * @generatedBy CodePro at 3/4/15 2:20 PM
	 */
	@Test
	public void testDirectoryService_1()
		throws Exception {
		DirectoryService result = new DirectoryService();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the FileInfo getStructureInfo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/15 2:20 PM
	 */
	@Test
	public void testGetStructureInfo_1()
		throws Exception {
		DirectoryService fixture = new DirectoryService();
		fixture.walker = new DirectoryWalker();
		String path = "";

		FileInfo result = fixture.getStructureInfo(path);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FileInfo getStructureInfo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/15 2:20 PM
	 */
	@Test
	public void testGetStructureInfo_2()
		throws Exception {
		DirectoryService fixture = new DirectoryService();
		fixture.walker = new DirectoryWalker();
		String path = "";

		FileInfo result = fixture.getStructureInfo(path);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FileInfo getStructureInfo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/15 2:20 PM
	 */
	@Test
	public void testGetStructureInfo_3()
		throws Exception {
		DirectoryService fixture = new DirectoryService();
		fixture.walker = new DirectoryWalker();
		String path = "";

		FileInfo result = fixture.getStructureInfo(path);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FileInfo getStructureInfo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/15 2:20 PM
	 */
	@Test
	public void testGetStructureInfo_4()
		throws Exception {
		DirectoryService fixture = new DirectoryService();
		fixture.walker = new DirectoryWalker();
		String path = "";

		FileInfo result = fixture.getStructureInfo(path);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/4/15 2:20 PM
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
	 * @generatedBy CodePro at 3/4/15 2:20 PM
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
	 *
	 * @generatedBy CodePro at 3/4/15 2:20 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DirectoryServiceTest.class);
	}
}