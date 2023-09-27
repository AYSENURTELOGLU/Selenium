package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_driverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);

        //sayfa basliginin "smile more" içerdiğini test edin
        String expectedTitleIcerik="Smile more";
        String actualTitle= driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Amazon Title testi  PASSED");
        }else{
            System.out.println("Amazon Title testi  FAILED");
        }

        //youtube anasayfaya gidin
        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(3000);

        //url'in "youtube" içerdiğini test edin
        String expectedUrlIcerik="youtube";
        String actualUrl= driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Youtube url testi  PASSED");
        }else{
            System.out.println("Youtube url testi  FAILED");
        }

        //tekrar amazon anasayfaya donun ve url'in "ramazon" içermediğini test edin.
        driver.navigate().back();
        Thread.sleep(3000);

        //aynı pencerede geri gitme işlemi yapar.
        String unExpectedUrlIcerik="ramazon";
        actualUrl= driver.getCurrentUrl();
        if (actualUrl.contains(unExpectedUrlIcerik)){
            System.out.println("Amazon url testi  FAILED");
        }else{
            System.out.println("Amazon url testi  PASSED");
        }

        //tekrar youtube anasayfaya gidin.
        driver.navigate().forward();
        Thread.sleep(3000);

        //sayfa kaynak kodlarinda "müzik" geçtiğini test edin.
        String expectedSayfaIcerik="müzik";
        String actualSayfaKaynakKodlari= driver.getWindowHandle();
        if (actualSayfaKaynakKodlari.contains(expectedSayfaIcerik)){
            System.out.println("Youtube kaynak kodu testi  PASSED");
        }else{
            System.out.println("Youtube kaynak kodu testi  FAILED");
        }

        //sayfayi kapatin.
        Thread.sleep(3000);
        driver.close();





    }
}
