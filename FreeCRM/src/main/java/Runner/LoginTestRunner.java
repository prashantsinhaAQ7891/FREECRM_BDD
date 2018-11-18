package Runner;

import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "G:\\SeleniumNew\\FreeCRM\\src\\main\\java\\Features\\login.feature"
			,glue={"/FreeCRM/src/main/java/StepDefn/LoginStepDefn.java"}
		)

public class LoginTestRunner {

}
