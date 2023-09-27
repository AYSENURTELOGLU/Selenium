package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassNameLocatori {
    public static void main(String[] args) throws InterruptedException {
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

        //3- Category bolumundeki elementleri locate edin
        List<WebElement> kategoriList= driver.findElements(By.className("panel-title"));

        //4- Category bolumunde 3 element oldugunu test edin
        int expectedKategoriSayisi=3;
        int actualKategoriSayisi= kategoriList.size();

        if (actualKategoriSayisi==expectedKategoriSayisi){
            System.out.println("kategori sayisi testi PASSED");
        }else{
            System.out.println("kategori sayisi testi FAILED");
        }

        //5- Category isimlerini yazdirin
        //System.out.println(kategoriList);
        //webelementlerden olusan bir listeyi direk yazdıramayız.
        //webelementler üzerindeki yazıları yazdırmak istersek
        //herbir elementi ele alıp üzerindeki texti get.text ile almalaıyız.
        //bunnuda for each loop ile her web elementi alıp üzerindeki yazıyı yazdırabiliriz
        for (WebElement each:kategoriList
             ) {
            System.out.println(each.getText());
        }


        //6- Sayfayi kapatin

        Thread.sleep(5000);
        driver.close();






    }
}
