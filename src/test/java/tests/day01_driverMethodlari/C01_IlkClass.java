package tests.day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {

        /*test için her class oluşturduğumuzda ilk yapmamız gereken
        WebDriver objesi oluşturmaktır.
        webdriver objesi istediğimiz browser in bir kopyasını olusturup
        istediğimiz web islemleri yapacak

        her browser ın dosyası farklı oldugundan projemizde
        kullanmak istediğimiz her browserın driverini
        selenium.dev deki browser bölümünden indirip projemize
        kopyalıyoruz.*/


     //her class'da o class'da kullanacagımız browserı tanıtmalıyız.
     System.setProperty("webdriver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");

    //webDriver objesi oluşturulaım
        WebDriver driver=new ChromeDriver();

        //artik bu driver objesi ile istenen otomasyonları yapabiliriz.
        driver.get("https://www.amazon.com");






    }
}
