package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClient {

    WebDriver driver;

    public AddClient(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // -------- Buttons (Header) --------
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btnSave;

    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    WebElement btnCancel;

    public void clickSave() {
        btnSave.click();
    }

    public void clickCancel() {
        btnCancel.click();
    }

    // -------- Personal Information (Text Fields only) --------
    @FindBy(xpath = "//input[@id='client_name']")
    WebElement clientName;

    @FindBy(xpath = "//input[@id='client_surname']")
    WebElement clientSurname;

    public void enterClientName(String name) {
        clientName.clear();
        clientName.sendKeys(name);
    }

    public void enterClientSurname(String surname) {
        clientSurname.clear();
        clientSurname.sendKeys(surname);
    }

    // -------- Address (Text Fields) --------
    @FindBy(xpath = "//input[@id='client_address_1']")
    WebElement address1;

    @FindBy(xpath = "//input[@id='client_address_2']")
    WebElement address2;

    @FindBy(xpath = "//input[@id='client_city']")
    WebElement city;

    @FindBy(xpath = "//input[@id='client_state']")
    WebElement state;

    @FindBy(xpath = "//input[@id='client_zip']")
    WebElement zipCode;

    public void enterAddress1(String street1) {
        address1.clear();
        address1.sendKeys(street1);
    }

    public void enterAddress2(String street2) {
        address2.clear();
        address2.sendKeys(street2);
    }

    public void enterCity(String cityName) {
        city.clear();
        city.sendKeys(cityName);
    }

    public void enterState(String stateName) {
        state.clear();
        state.sendKeys(stateName);
    }

    public void enterZipCode(String zip) {
        zipCode.clear();
        zipCode.sendKeys(zip);
    }

    public void enterAddress(String street1, String street2, String cityName, String stateName, String zip) {
        enterAddress1(street1);
        enterAddress2(street2);
        enterCity(cityName);
        enterState(stateName);
        enterZipCode(zip);
    }

    // -------- Contact Information (Text Fields) --------
    @FindBy(xpath = "//input[@id='client_phone']")
    WebElement phone;

    @FindBy(xpath = "//input[@id='client_fax']")
    WebElement fax;

    @FindBy(xpath = "//input[@id='client_mobile']")
    WebElement mobile;

    @FindBy(xpath = "//input[@id='client_email']")
    WebElement email;

    @FindBy(xpath = "//input[@id='client_web']")
    WebElement web;

    public void enterPhone(String phoneNumber) {
        phone.clear();
        phone.sendKeys(phoneNumber);
    }

    public void enterFax(String faxNumber) {
        fax.clear();
        fax.sendKeys(faxNumber);
    }

    public void enterMobile(String mobileNumber) {
        mobile.clear();
        mobile.sendKeys(mobileNumber);
    }

    public void enterEmail(String emailId) {
        email.clear();
        email.sendKeys(emailId);
    }

    public void enterWeb(String webAddress) {
        web.clear();
        web.sendKeys(webAddress);
    }

    public void enterContactInfo(String phoneNumber, String faxNumber, String mobileNumber, String emailId, String webAddress) {
        enterPhone(phoneNumber);
        enterFax(faxNumber);
        enterMobile(mobileNumber);
        enterEmail(emailId);
        enterWeb(webAddress);
    }

    // -------- Taxes Information (Text Fields) --------
    @FindBy(xpath = "//input[@id='client_vat_id']")
    WebElement vatId;

    @FindBy(xpath = "//input[@id='client_tax_code']")
    WebElement taxCode;

    public void enterVatId(String vat) {
        vatId.clear();
        vatId.sendKeys(vat);
    }

    public void enterTaxCode(String tax) {
        taxCode.clear();
        taxCode.sendKeys(tax);
    }

    public void enterTaxesInfo(String vat, String tax) {
        enterVatId(vat);
        enterTaxCode(tax);
    }

    // -------- One-shot helper (fills only allowed fields) --------
    public void fillClientForm(
            String name,
            String surname,
            String street1,
            String street2,
            String cityName,
            String stateName,
            String zip,
            String phoneNumber,
            String faxNumber,
            String mobileNumber,
            String emailId,
            String webAddress,
            String vat,
            String tax
    ) {
        enterClientName(name);
        enterClientSurname(surname);

        enterAddress(street1, street2, cityName, stateName, zip);

        enterContactInfo(phoneNumber, faxNumber, mobileNumber, emailId, webAddress);

        enterTaxesInfo(vat, tax);
    }
}
