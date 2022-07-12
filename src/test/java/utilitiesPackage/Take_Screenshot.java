package utilitiesPackage;

import driverPackage.PageDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebElement;

import java.io.File;

public class Take_Screenshot {
   //take screenshot for view full port

        public void screenshot(String name){
            String strtime=setdate();
            File scFile=((Take_Screenshot) PageDriver.getCurrentDriver().getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scFile, new File("./image/" + strtime + "_" + name + ".png"));
        }

    // Take a screenshot for specific element

        public void screenshot(String name, WebElement element){
            String strtime=setdate();
            File scFile = element.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scFile, new File("./image/" + strtime + name + ".png"));

        }

    // Take a screenshot for full view port and attest to allure report
    @Step("Taking a screenshot for {0}")
    public static void takeScreenShot(String name) {
        Allure.addAttachment(name, new ByteArrayInputStream(
                ((TakesScreenshot) PageDriver.getCurrentDriver()).getScreenshotAs(OutputType.BYTES)));
    }


    // Convert current data time to string
    public String setdate() {
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyymmdd_HHmmss");
        String strdate = formatter.format(date);
        return strdate;
    }


}
