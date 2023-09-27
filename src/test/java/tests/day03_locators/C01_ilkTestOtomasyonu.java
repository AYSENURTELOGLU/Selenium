package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_ilkTestOtomasyonu {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        //arama kutusuna nutella yazdirip aratin
        //once arama kutusunu findElement() ve Locator ile driver a tanıtıp
        //o webelementi bu class'da kullanabileceğim şekilde kaydetmeliyim.
        WebElement aramaKutusu =driver.findElement(By.id("twotabsearchtextbox"));
        //ctrl c + ctrl f + ctrl v

        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit(); // arama kutusu üzerinde enter a basar.

        //arama sonuclarinin nutella içerdigini test edin.

       // WebElement aramaSonucElementi= driver.findElement(By.className("sg-col-inner"));

        //a-section a-spacing-small a-spacing-top-small bunda çalışmadı.
        //InvalidSelectorException:Compound class names not permitted
        // nutella arıyor deavmını getirmmiyor.
        //By.className locator'i class attribute'unun değeri boşluk
        //icerdiginde saglikli calismaz.
        //sg-col-inner olan başka bir classla deneyelim.

        //cogunlukla class ismi ayni özelliklerdeki webeleemntleri gruplandirmak icin kullanilir.
        //biz de class degeri  sg-col-inner arattigimizda 73 tane webelemnt buldu

        List<WebElement> elemenlerListesi =driver.findElements(By.className("sg-col-inner"));
        String actualAramaSonuc = elemenlerListesi.get(0).getText();
        String expectedIcerik="Nutella";

        if (actualAramaSonuc.contains(expectedIcerik)){
            System.out.println("ilk otomasyon testi PASSED");
        }else {
            System.out.println("ilk otomasyon testi Faıled");
        }

        Thread.sleep(5000);
        driver.close();






    }
}
