package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkOtomasyonTesti {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2. Yeni bir class olusturalim : C03_GetMethods
        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //4. Sayfa basligini(title) yazdirin
        System.out.println("Title: " + driver.getTitle());
        //5. Sayfa basliginin “Amazon” icerdigini test edin
        String expectedIcerik="Amazon";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedIcerik)) {
            System.out.println("Title testi  PASSED");
        }else{
            System.out.println("Title testi  FAILED");
            System.out.println("Sayfadaki actual title: " + actualTitle);
            }

        //6. Sayfa adresini(url) yazdirin
        System.out.println("Actual sayfa Url'i: " + driver.getCurrentUrl());
        //7. Sayfa url’inin “amazon” icerdigini test edin.
        String expectedUrlIcerik= "amazon";
        String actualUrlIcerik= driver.getCurrentUrl();
        if (actualUrlIcerik.contains(expectedUrlIcerik)) {
            System.out.println("Url testi  PASSED");
        }else {
            System.out.println("Url testi  FAILED");
        }

        //8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String expectedSayfaIcerigi="alisveris";
        String actualsayfaKaynakKodlari=driver.getPageSource();

        if (actualsayfaKaynakKodlari.contains(expectedIcerik)){
            System.out.println("Sayfa kaynagi testi  PASSED");
        }else {
            System.out.println("Sayfa kaynagi  FAILED");
            System.out.println("sayfa kaynak kodlari ' "+ expectedSayfaIcerigi+ " 'kelimesi icermiyor");
        }

        //10. Sayfayi kapatin.
        Thread.sleep(3000);
        driver.close();


}
}
