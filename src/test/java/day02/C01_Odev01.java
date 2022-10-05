package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Odev01 {


    public static void main(String[] args) {

         /*
        Yeni bir package olusturalim : day01
Yeni bir class olusturalim : C03_GetMethods
Amazon sayfasina gidelim. https://www.amazon.com/
Sayfa basligini(title) yazdirin
Sayfa basliginin “Amazon” icerdigini test edin
Sayfa adresini(url) yazdirin
Sayfa url’inin “amazon” icerdigini test edin.
Sayfa handle degerini yazdirin
Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
Sayfayi kapatin.
         */
        //  Yeni bir package olusturalim : day01
        //  Yeni bir class olusturalim : C03_GetMethods

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1) Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        // 2) Sayfa basligini(title) yazdirin
        System.out.println("Actual title :" + driver.getTitle());

        //3)  Sayfa basliginin “Amazon” icerdigini test edin
        String actalTitle = driver.getTitle();
        String expecteWord ="Amazon";

        if (actalTitle.contains(expecteWord)){
            System.out.println("Expected Word is PAASED");
        }else System.out.println("Expected Word is FAILED");

        // 4) Sayfa adresini(url) yazdirin
        System.out.println("Url: " + driver.getCurrentUrl());


        // 5)  Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl=driver.getCurrentUrl();
        String arananKelime="amazon";
        if (actualUrl.contains( arananKelime )) {
            System.out.println("Aranan kelime  PAASED");
        }else{
            System.out.println("Aranan kelime FAILED");
        }

        //6)Sayfa handle degerini yazdirin
        System.out.println("Sayfanın handle değeri : " + driver.getWindowHandle());

        // 7) Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String kaynakKodlari = driver.getPageSource();
        String kaynakKodlarindaArananKelime = "Gateway";
        if (kaynakKodlari.contains(kaynakKodlarindaArananKelime)) {
            System.out.println("Kaynak kodu testi PASSED");
        } else {
            System.out.println("Kaynak kodu testi FAILED");
        }

        // 8) Sayfayi kapatin.
        driver.close();
    }

}

/*
CONSOL CIKTISI
Actual title :Amazon.com. Spend less. Smile more.
Expected Word is PAASED
Url: https://www.amazon.com/
Wanted Word is PAASED
Sayfan?n handle de?eri : CDwindow-3BB0345CF6A6EC299628F70064D202CB
Kaynak kodu testi PASSED






 */


