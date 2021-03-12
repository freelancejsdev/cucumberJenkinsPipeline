package steps;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.DriverFactory;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Hooks
{
    public String fileName;
    public String filePath;


    @Before
    public void setUp()
    {
        DriverFactory.getDriver();
    }







    public void takeScreenshot() {

        Date d = new Date();

        fileName = d.toString().replace(":", "_").replace(" ", "_")+".png";

        filePath = System.getProperty("user.dir")+"/target/cucumber-reports/advanced-reports/extentreports/"+fileName;

        File scrFile = ((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.FILE);


        try {

            FileUtils.copyFile(scrFile, new File(filePath));

        } catch (IOException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

        }

        try {

            ExtentCucumberAdapter.getCurrentStep().addScreenCaptureFromPath(fileName);

        } catch (IOException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

        }

    }
    @After
    public void tearDown(Scenario scenario)
    {


        if (scenario.isFailed()) {
            takeScreenshot();
            TakesScreenshot ts = (TakesScreenshot) DriverFactory.driver;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }

        DriverFactory.closeDriver();
    }


}
