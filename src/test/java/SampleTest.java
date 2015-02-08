import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.security.krb5.iternal.crypto.Des;

import java.net.URL;

/**
 * Created by derekngo on 2/7/15.
 */
public class SampleTest {


    @Test
    public void simpleSampleSeleniumTest() throws Exception {
        WebDriver iosDriver;
        //WebDriver selendroid;

        DesiredCapabilities caps_ios = DesiredCapabilities.iphone();
        //DesiredCapabilities caps_selendroid = DesiredCapabilities.android();

        // ios specific:
        caps_ios.setCapability("simulator", true);

        // will hang indefinitely (big timeout)
        iosDriver = new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"), caps_ios);
        //selendroid = new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"), caps_selendroid);

        iosDriver.get("http://utexas.edu");
        //selendroid.get("http://utexas.edu");


        // Expected console output:
        // /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/bin/java
        // ios driver's title: Home | The University of Texas at Austin

        // Process finished with exit code 0

        // do not use in the professional world, use loggers instead.
        System.out.println("ios driver's title: " + iosDriver.getTitle());
        //System.out.println("selendroid's title: " + selendroid.getTitle());

        iosDriver.quit();

    }


}
