import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;

    @Test
    public void myTest(){
        //open browser
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/home");  //without history
        // способ 2    with history
        //wd.navigate().to("https://telranedu.web.app/home");



    }
}
