package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LinkText_PartialLinkText {
    public static void main(String[] args) throws InterruptedException {


        // amazon anasayfaya gidin

        System.setProperty("webdriver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");


        // Gift Cards linkine tiklayin

        // driver.findElement(By.linkText("Gift Cards")).click(); çalıştı
        // driver.findElement(By.partialLinkText("Gift")).click(); // calisti
        driver.findElement(By.partialLinkText("Gif")).click();
        //bazen a tagı arasında ne varsa almak gerekebilir.
        //amazona gidip gift cards sekmesine şncele diyoruz gelen html kodlarından
        //url ismini alıyoruz

        /*
        locator olarak By.linkText() kullaniyorsak <a> </a> arasindaki tum karakterleri
        kullanmaliyiz. boşluk, özel karakter, harf veya rakam olmasina bakmaksizin
        tüm araligi kopyalamaliyiz.

        eger tümm yaziyi degil de, bir kismini kullanmak isterseniz
        By.linktext() yerine By.partiallinktext kullanabilirsiniz.
         */


        // linkin bizi Gift Cards sayfasina yonlendirdigini test edin
        //bunun için gift cards sayfası acıldıgında gift cards yazısının görünür olgunu test edelim

        WebElement giftCardyaziElementi = driver.findElement(By.className("nav-menu-logo"));

        if (giftCardyaziElementi.isDisplayed()){
            System.out.println("Gift Cards testi PASSED");
        }else {
            System.out.println("Gift Cards testi FAILED");
        }

        //sayfayı kapatın
        Thread.sleep(3000);
        driver.close();















    }
}
