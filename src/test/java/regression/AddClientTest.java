package regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddClient;
import pages.Login;
import pages.Menu;

public class AddClientTest {
    WebDriver driver;
    @BeforeClass
    public void doLogin()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/ip");

        Login login = new Login(driver);
        login.setUsername("amolujagare@gmail.com");
        login.setPassword("admin123");
        login.clickLogin();
    }

    @Test
    public void addClientTest()
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        // -------- Fill Add Client Form --------
        AddClient addClient = new AddClient(driver);

        addClient.enterClientName("Amol");
        addClient.enterClientSurname("Ujagare");

        addClient.enterAddress(
                "Shivaji Nagar",
                "Near Bus Stand",
                "Pune",
                "Maharashtra",
                "411005"
        );

        addClient.enterContactInfo(
                "020123456",
                "020654321",
                "9876543210",
                "amol@testmail.com",
                "www.amolujagare.com"
        );

        addClient.enterTaxesInfo(
                "VAT12345",
                "TAX98765"
        );

        // -------- Save --------
      //  addClient.clickSave();
    }
}
