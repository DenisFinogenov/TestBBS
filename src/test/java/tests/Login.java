package tests;

import org.testng.annotations.Test;

public class Login extends BaseTest {
    @Test
    public void correctLogin() {
        driver.get("https://bendamotorcyclerussia.ru/?ysclid=mo8cegcel5884419397");
    }
}
