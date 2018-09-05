package x_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* Example shows that the checked exceptions like FileNotFoundException,
 * must be handled
 */

public class Example17_Throws {

	void deleteFile(File file) throws FileNotFoundException   {
		if(!file.exists()) {
			throw new FileNotFoundException("device operation performed");
	}
		file.delete(); 
	}
}
