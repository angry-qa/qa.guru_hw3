import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Homework3TestClass {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void searchJUnitTest(){
        open("https://github.com/");
        $(byName("q")).setValue("Selenide").pressEnter();
        $("ul.repo-list li a").click();
        $(byText("Wiki")).click();
        $(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }

}
