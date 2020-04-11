package jenkins.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IdFromFilenameTest {

	@Test
	final void testIdFromFilenameRegularName() {
		String filename = "hello123.txt";
		IdStrategy.CaseSensitive getFilename = new IdStrategy.CaseSensitive();
		getFilename.idFromFilename(filename);
		assertEquals(filename,getFilename);
	}
	
	
	@Test
	final void testIdFromFilenameDollar() {
		String filename = "hello$3456.txt";
		IdStrategy.CaseSensitive getFilename = new IdStrategy.CaseSensitive();
		getFilename.idFromFilename(filename);
		assertEquals("hello4V",getFilename);
	}
	

}
