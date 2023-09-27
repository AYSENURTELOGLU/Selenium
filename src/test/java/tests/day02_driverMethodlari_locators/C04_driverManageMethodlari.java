package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_driverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //timeout ara ver demek. görev odaklı çalışır. 15 sn maximum bekleme süresidir.
        //görev daha önce tamamlanırsa, yoluna devam eder
        //15 sn içinde görev tamamlanmazsa hata verir.
        //gorev: sayfanın acilmasi ve kullanilacak elementlerin bulunmasidir.

        System.out.println("maximize size: "+driver.manage().window().getSize());
        System.out.println("maximize konum: " + driver.manage().window().getPosition());

        //windowu full screen yapın
        driver.manage().window().fullscreen();
        System.out.println("fullscreen size: "+driver.manage().window().getSize());
        System.out.println("fullscreen konum: " + driver.manage().window().getPosition());
        //size ve konumun birimi piksel,
        //window'un baslangic konumunu(200,300) ve boyutunu (500,500) yapin
        driver.manage().window().setPosition(new Point(200,300));
        driver.manage().window().setSize(new Dimension(500,500));
        System.out.println("customize size: "+driver.manage().window().getSize());
        System.out.println("customize konum: " + driver.manage().window().getPosition());





        Thread.sleep(3000);
        driver.close();






    }
}
