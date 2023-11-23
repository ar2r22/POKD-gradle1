import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    @Test
    void openMainPage() {
        open("http://srv-dev-rrsys-avanpost/oauth2/authorize?response_type=code&client_id=pokd-test&scope=openid+profile+permissions&redirect_uri=https%3A%2F%2Fk8s.supercode.ru%3A3500%2Fokd%2Fdev-okd-ui%2F");
        $(byName("username")).setValue("apokd");
        $(byName("password")).setValue("aPOKD10").pressEnter();

        //sleep(5000);

        $("[data-v-389cd7e2]").shouldBe(visible); //видно кнопку Инспектор



    }
}
