package annotations;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class properties {
	Properties property;
	FileInputStream fi;
	
	  @Test
  public void f() throws IOException {
	
		  fi = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/annotations/config.properties");
		  property = new Properties();
		  property.load(fi);
		  System.out.println(property.getProperty(("Name")));
		  System.out.println(property.getProperty(("version")));
		  
	  
  }
}
