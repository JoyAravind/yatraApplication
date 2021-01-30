package yantra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtilities {

	public String getProperties(String key) throws IOException
	{
		FileInputStream file = new FileInputStream(IConstanets.filepath);
		Properties pobj=new Properties();
		pobj.load(file);
		String value = pobj.getProperty(key);
		return value;
	}
	
	/*public String getObject(String key) throws IOException
	{
		FileInputStream fileob = new FileInputStream(IConstanets.Intuitpath);
		Properties pobj=new Properties();
		pobj.load(fileob);
		String value = pobj.getProperty(key);
		return value;
	}*/
}
