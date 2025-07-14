package web.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestWithSelenium {

    public static void main(String[] args) { //crear metodo apra indicar el controlador que descargamos//

        //Instruccion con dos parametros (tipo de driver y ruta a donde esta el driver)//
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        //instanacia el primer objeto//
        WebDriver driver = new ChromeDriver();

        //utilizar el navegador//
        driver.get("http://opencart.abstracta.us/");

        //ejecucion de lo que estamos hrealizando, instrucciones, etc//
        //con close cerramos la conexion entre el browser y el driver//
        driver.close();
        //con driver quit, cerramos por completo la sesion//
        driver.quit();




    }
}
