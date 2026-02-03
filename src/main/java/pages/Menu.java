package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {

    WebDriver driver;

    public Menu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ---------------- Dashboard ----------------
    @FindBy(xpath = "//a[normalize-space()='Dashboard']")
    WebElement dashboard;

    public void clickDashboard() {
        dashboard.click();
    }

    // ---------------- Clients ----------------
    @FindBy(xpath = "//span[normalize-space()='Clients']")
    WebElement clients;

    @FindBy(xpath = "//a[normalize-space()='Add Client']")
    WebElement addClient;

    @FindBy(xpath = "//a[normalize-space()='View Clients']")
    WebElement viewClients;

    public void clickAddClient() {
        clients.click();
        addClient.click();
    }

    public void clickViewClients() {
        clients.click();
        viewClients.click();
    }

    // ---------------- Quotes ----------------
    @FindBy(xpath = "//span[normalize-space()='Quotes']")
    WebElement quotes;

    @FindBy(xpath = "//a[normalize-space()='Create Quote']")
    WebElement createQuote;

    @FindBy(xpath = "//a[normalize-space()='View Quotes']")
    WebElement viewQuotes;

    public void clickCreateQuote() {
        quotes.click();
        createQuote.click();
    }

    public void clickViewQuotes() {
        quotes.click();
        viewQuotes.click();
    }
}