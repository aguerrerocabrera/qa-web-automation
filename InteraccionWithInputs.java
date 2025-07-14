package web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteraccionWithInputs {

    public static void main(String[] args) throws InterruptedException { //crear metodo apra indicar el controlador que descargamos//

//Instruccion con dos parametros (tipo de driver y ruta a donde esta el driver)//
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        //instanacia el primer objeto//
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //utilizar el navegador//
        driver.get("http://opencart.abstracta.us/");


        //agregamos el producto en el cuadro de texto que queremos buscar//
        WebElement inputSearch = driver.findElement(By.xpath("//*[@id='search']/input"));
        //metodo sendkeys es para ingresar texto en un input//
        inputSearch.sendKeys("Iphone");
        Thread.sleep(5000);

        WebElement buttonsearch = driver.findElement(By.xpath("//*[@id='search']/span/button"));
        buttonsearch.click();
        Thread.sleep(5000);

        //WebElement imgresponsive = driver.findElement(By.xpath("//*[@id='content']/div[3]/div/div/div[2]/div[2]/button[1]"));
        //imgresponsive.click();//

        WebElement imgresponsive = driver.findElement(By.xpath("//*[@id='content']/div[3]/div/div/div[2]/div[2]/button[1]"));
        imgresponsive.click();
        Thread.sleep(5000);

        //WebElement buttonCartadd = driver.findElement(By.xpath("//*[@id='button-cart']"));
        //buttonCartadd.click();
        //Thread.sleep(5000);

        WebElement buttondetalles = driver.findElement(By.xpath("//*[@id='cart']"));
        buttondetalles.click();
        Thread.sleep(5000);

        WebElement linkViewCart = driver.findElement(By.xpath("//*[@id='cart']/ul/li[2]/div/p/a[1]"));
        linkViewCart.click();
        Thread.sleep(5000);


        //ejecucion de lo que estamos hrealizando, instrucciones, etc//
        //con close cerramos la conexion entre el browser y el driver//
        driver.close();
        //con driver quit, cerramos por completo la sesion//
        driver.quit();

    }
}

