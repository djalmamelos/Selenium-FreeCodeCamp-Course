package Part3_4.com.demoqa.test.part3.javascript;
import Part3_4.com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

public class JavaScriptTest extends BaseTest {

    @Test
    public void testScrollingToElement() {
        homePage.goToForms(); // <- agora `homePage` será inicializada corretamente
    }
}




