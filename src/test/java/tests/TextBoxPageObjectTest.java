package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class TextBoxPageObjectTest extends TestBase {

    String name = "Bony";
    String email = "Bony@man.com";
    String currentAddress = "Some place 1";
    String permanentAddress = "Another place 2";


    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void fillFormTestPageObject() {
        textBoxPage.
                openPage()
                .removeBanners()

                .setName(name)
                .setEmail(email)
                .setCurrentAddress(currentAddress)
                .setPermanentAddress(permanentAddress)
                .submit()

                .checkResult("Name:", name)
                .checkResult("Email:", email)
                .checkResult("Current Address :", currentAddress)
                .checkResult("Permananet Address :", permanentAddress);
    }

}
