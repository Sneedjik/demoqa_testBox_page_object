package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class TextBoxPageObjectTest extends TestBase {


    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void fillFormTestPageObject() {
        textBoxPage.
                openPage()
                .removeBanners()

                .setName("Bony")
                .setEmail("Bony@man.com")
                .setCurrentAddress("Some place 1")
                .setPermanentAddress("Another place 2")
                .submit()

                .checkResult("Name:", "Bony")
                .checkResult("Email:", "Bony@man.com")
                .checkResult("Current Address :", "Some place 1")
                .checkResult("Permananet Address :", "Another place 2");
    }

}
