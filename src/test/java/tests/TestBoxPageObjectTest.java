package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBoxPageObjectTest extends TestBase {

    @Test
    void fillFormTest() {
        open("automation-practice-form");
        $("#userName").setValue("Bony");
        $("#userEmail").setValue("Bony@man.com");
        $("#currentAddress").setValue("Some place 1");
        $("#permanentAddress").setValue("Another place 2");
        $("#submit").click();

        $("#output #name").shouldHave(text("Bony"));
        $("#output #email").shouldHave(text("Bony@man.com"));
        $("#output #currentAddress").shouldHave(text("Some place 1"));
        $("#output #permanentAddress").shouldHave(text("Another place 2"));
    }

}
