package com.testproject.service;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;
import com.testproject.model.DirInfo;

/**
 * The class <code>DirectoryWalkerTest</code> contains tests for the class <code>{@link DirectoryWalker}</code>.
 *
 * @generatedBy CodePro at 3/4/15 2:39 PM
 * @author sgokhale
 * @version $Revision: 1.0 $
 */
public class DirectoryWalkerTest {
	/**
	 * Run the DirectoryWalker() constructor test.
	 *
	 * @generatedBy CodePro at 3/4/15 2:39 PM
	 */
	@Test
	public void testDirectoryWalker_1()
		throws Exception {
		DirectoryWalker result = new DirectoryWalker();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void clear(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/15 2:39 PM
	 */
	@Test
	public void testClear_1()
		throws Exception {
		DirectoryWalker fixture = new DirectoryWalker();
		String path = "";

		fixture.clear(path);

		// add additional test code here
	}

	/**
	 * Run the ArrayList<DirInfo> getFilesList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/15 2:39 PM
	 */
	@Test
	public void testGetFilesList_1()
		throws Exception {
		DirectoryWalker fixture = new DirectoryWalker();

		ArrayList<DirInfo> result = fixture.getFilesList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void resetFilesList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/15 2:39 PM
	 */
	@Test
	public void testResetFilesList_1()
		throws Exception {
		DirectoryWalker fixture = new DirectoryWalker();

		fixture.resetFilesList();

		// add additional test code here
	}

	/**
	 * Run the DirInfo walk(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/15 2:39 PM
	 */
	@Test
	public void testWalk_1()
		throws Exception {
		DirectoryWalker fixture = new DirectoryWalker();
		String path = "";

		DirInfo result = fixture.walk(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.canWrite(Unknown Source)
		//       at com.testproject.model.DirInfo.<init>(DirInfo.java:52)
		//       at com.testproject.service.DirectoryWalker.walk(DirectoryWalker.java:50)
		assertNotNull(result);
	}

	/**
	 * Run the DirInfo walk(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/15 2:39 PM
	 */
	@Test
	public void testWalk_2()
		throws Exception {
		DirectoryWalker fixture = new DirectoryWalker();
		String path = "";

		DirInfo result = fixture.walk(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.canWrite(Unknown Source)
		//       at com.testproject.model.DirInfo.<init>(DirInfo.java:52)
		//       at com.testproject.service.DirectoryWalker.walk(DirectoryWalker.java:50)
		assertNotNull(result);
	}

	/**
	 * Run the DirInfo walk(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/15 2:39 PM
	 */
	@Test
	public void testWalk_3()
		throws Exception {
		DirectoryWalker fixture = new DirectoryWalker();
		String path = "";

		DirInfo result = fixture.walk(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.canWrite(Unknown Source)
		//       at com.testproject.model.DirInfo.<init>(DirInfo.java:52)
		//       at com.testproject.service.DirectoryWalker.walk(DirectoryWalker.java:50)
		assertNotNull(result);
	}

	/**
	 * Run the DirInfo walk(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/4/15 2:39 PM
	 */
	@Test
	public void testWalk_4()
		throws Exception {
		DirectoryWalker fixture = new DirectoryWalker();
		String path = "";

		DirInfo result = fixture.walk(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.canWrite(Unknown Source)
		//       at com.testproject.model.DirInfo.<init>(DirInfo.java:52)
		//       at com.testproject.service.DirectoryWalker.walk(DirectoryWalker.java:50)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/4/15 2:39 PM
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
	 * @generatedBy CodePro at 3/4/15 2:39 PM
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
	 * @generatedBy CodePro at 3/4/15 2:39 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DirectoryWalkerTest.class);
	}
}