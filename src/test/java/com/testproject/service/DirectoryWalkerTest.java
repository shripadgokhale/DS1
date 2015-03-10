package com.testproject.service;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;
import com.testproject.model.DirInfo;

/**
 * The class <code>DirectoryWalkerTest</code> contains tests for the class <code>{@link DirectoryWalker}</code>.
 *
 * @author sgokhale
 * @version $Revision: 1.0 $
 */
public class DirectoryWalkerTest {
	/**
	 * Run the DirectoryWalker() constructor test.
	 *
	 */
	@Test
	public void testDirectoryWalker_1()
		throws Exception {
		DirectoryWalker result = new DirectoryWalker();
		assertNotNull(result);
	}

	/**
	 * Run the void clear(String) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testClear_1()
		throws Exception {
		DirectoryWalker fixture = new DirectoryWalker();
		String path = "";


		// add additional test code here
	}

	/**
	 * Run the ArrayList<DirInfo> getFilesList() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetFilesList_1()
		throws Exception {
		DirectoryWalker fixture = new DirectoryWalker();

		ArrayList<DirInfo> result = fixture.getFilesList();

		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void resetFilesList() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testResetFilesList_1()
		throws Exception {
		DirectoryWalker fixture = new DirectoryWalker();

		fixture.resetFilesList();
	}

	/**
	 * Run the DirInfo walk(String) method test.
	 *
	 * @throws Exception
	 *

	 */
	@Test
	public void testWalk_1()
		throws Exception {
		DirectoryWalker fixture = new DirectoryWalker();
		String path = "";

		DirInfo result = fixture.walk(path);
		assertNotNull(result);
	}

	/**
	 * Run the DirInfo walk(String) method test.
	 *
	 * @throws Exception
	 */
	@Test
	public void testWalk_2()
		throws Exception {
		DirectoryWalker fixture = new DirectoryWalker();
		String path = "d://";

		DirInfo result = fixture.walk(path);

		assertNotNull(result);
	}


	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 */
	@Before
	public void setUp()
		throws Exception {
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 */
	@After
	public void tearDown()
		throws Exception {
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DirectoryWalkerTest.class);
	}
}