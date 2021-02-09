package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.GMIBankPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.MyMethods;

public class RegistrationUnsuccessful {

    GMIBankPage page=new GMIBankPage();

    @Given("kullanici ana sayfaya gider")
    public void kullanici_ana_sayfaya_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("kullanici profil logolu dropdowndan register linkine tiklar")
    public void kullanici_profil_logolu_dropdowndan_register_linkine_tiklar() {
        MyMethods.waitAndClick(page.profilLogoluDropdown,1);
        MyMethods.waitAndClick(page.registerLinki,1);
    }

    @Given("kullanici ssn numarasini girer")
    public void kullanici_ssn_numarasini_girer() {

    }
}
