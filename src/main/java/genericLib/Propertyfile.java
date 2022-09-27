 package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Propertyfile {
	
	public String getData(String key) throws FileNotFoundException {
		
	
	Properties p = new Properties();
    FileInputStream fis=new FileInputStream(AutoConstant.propertyfilePath);
    return p.getProperty(key);
	}

}
