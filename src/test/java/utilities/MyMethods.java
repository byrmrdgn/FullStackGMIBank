package utilities;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class MyMethods {

    public static void wait(int seconds){
        try {
            Thread.sleep(seconds*500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitAndClick(WebElement element,int timeouts){
        for (int i=0;i<timeouts;i++){
                try {
                   wait(timeouts);
                   element.click();
                }catch (WebDriverException e){
                    wait(1);
                }
        }
    }
}
