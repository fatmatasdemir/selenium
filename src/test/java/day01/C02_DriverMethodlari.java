package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe ");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        // Amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");

        // Kaynak kodlarin icinde "Gatewey" kelimesinin oldugunu test ediniz
        // System.out.println(driver.getPageSource()); // sayfadaki kaynak kodlarini gösterir

        String istenenKelime="Gateway";    //"Gatewayasss" YAZARSAK failed YAZAR cunku yok
        if (driver.getPageSource().contains(istenenKelime)){
            System.out.println("PageSource testi PASSED");

        }else System.out.println("PageSource testi FAILED");

      driver.close(); // SAYFAYI KAPATIR
       //  driver.quit();   // birden fazla sayfa varsa hepsini kapatir

    }
}
