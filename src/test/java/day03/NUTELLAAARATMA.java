package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class NUTELLAAARATMA {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //a. web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //b. Search(ara) “Nutella”
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("nutella", Keys.ENTER);

        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucu = driver.findElements(By.className("sg-col-inner"));
        String sonucYazisi = aramaSonucu.get(0).getText();
        System.out.println(sonucYazisi);

        //d. Sadece sonuç sayısını yazdırınız
        String[] sonucYazisiE = sonucYazisi.split(" ");
        System.out.println("Nutella arama sonucu = " + sonucYazisiE[2]);

        // Sonuc sayısını LAMBDA ile yazdırınız
        Arrays.stream(sonucYazisi.split(" ")).limit(3).skip(2).forEach(System.out::println);

        //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        List<WebElement> ilkResim = driver.findElements(By.className("s-image"));
        WebElement ilkResimWE = ilkResim.get(0);
        ilkResimWE.click();

        //Sayfayı kapatınız


    }
}
/*

1-48 of 111 results for "nutella"
Nutella arama sonucu = 111
111



 */