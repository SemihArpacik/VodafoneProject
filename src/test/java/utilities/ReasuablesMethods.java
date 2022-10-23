package utilities;

import org.openqa.selenium.JavascriptExecutor;

public class ReasuablesMethods {


    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void JSEScrollBy() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,500)");
        waitFor(2);

    }



}
