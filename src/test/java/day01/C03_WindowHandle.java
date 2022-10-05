package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        System.out.println(driver.getWindowHandle());//hashcode verdi CDwindow-D5E1B8AFEDF7B47706E791D4C5546651
     //Farkli pencereler arasinda gezebilmek icin   getWindowHandle()   methodunu kullaniriz

    }
}
