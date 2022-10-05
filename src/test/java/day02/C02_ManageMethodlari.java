package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        /*Yeni bir Class olusturalim.C06_ManageWindow
        Amazon soyfasina gidelim. https://www.amazon.com/
        Sayfanin konumunu ve boyutlarini yazdirin
        Sayfayi simge durumuna getirin
        simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        Sayfayi fullscreen yapin
        Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        Sayfayi kapatin
       */


            System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            //Amazon soyfasina gidelim. https://www.amazon.com/
            driver.get("https://www.amazon.com");

            //Sayfanin konumunu ve boyutlarini yazdirin
            System.out.println("Pencere konumu = "+driver.manage().window().getPosition()); // Açılan browser'ın konumu verir
            System.out.println("Pencere olculeri = "+driver.manage().window().getSize()); // Açılan browser'ın olcülerini verir

            //Sayfayi simge durumuna getirin
            driver.manage().window().minimize(); // Pencereyi simge durumuna getirir

           //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
            Thread.sleep(3000);
            driver.manage().window().maximize();

            //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
            System.out.println("Yeni Pencere konumu = "+driver.manage().window().getPosition());
            System.out.println("Yeni Pencere olculeri = "+driver.manage().window().getSize());


            //Sayfayi fullscreen yapin
            Thread.sleep(3000);
            driver.manage().window().fullscreen();


            //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
            System.out.println("Fullscreen Pencere konumu = "+driver.manage().window().getPosition());
            System.out.println("Fullscreen Pencere olculeri = "+driver.manage().window().getSize());

            //Sayfayi kapatin
            Thread.sleep(3000);
            driver.close();
        }
    }


/*

Pencere konumu = (10, 10)
Pencere olculeri = (945, 1020)
Yeni Pencere konumu = (-8, -8)
Yeni Pencere olculeri = (1936, 1056)
Fullscreen Pencere konumu = (0, 0)
Fullscreen Pencere olculeri = (1920, 1080)





 */










