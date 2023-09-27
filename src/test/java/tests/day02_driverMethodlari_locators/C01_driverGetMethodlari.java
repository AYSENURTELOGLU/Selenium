package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverGetMethodlari {

    public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        System.out.println("Title: "+driver.getTitle());
        //konsolda gösterir.
        System.out.println("Url: "+ driver.getCurrentUrl());
        System.out.println("================================");
        System.out.println(driver.getPageSource());
        //html kodlarını getirir konsola. ve tüm scriptleri getirir.

        System.out.println("Window handle değeri: "+ driver.getWindowHandle());
        //C47DF6D61C05927850207674B1E9B221
        System.out.println("Window handle değleri seti: " + driver.getWindowHandles());
        //[C47DF6D61C05927850207674B1E9B221]
        /*
        Webdriver her pencereye unique bir window handle değeri
        atamasi yapar. her run etmede farklı değer gelir. bir test class'i
        çalışmaya başladıktan sonra birden fazla pencerede açabilir.
        bu durumda tek bir window handle değeri değil açılan sayfa adedince
        window handle değerlerimiz olur.
        birden fazla element olunca selenium onları set'e koymayı uygun görmüş.
         */


        Thread.sleep(13000);
        driver.close();







    }

}
