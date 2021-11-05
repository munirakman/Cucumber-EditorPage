package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@editor",

        dryRun = false
        // dryrun = true dediğimizde testi çalıştırmadan bize  eksik adımı verir.
        // dryRun = false yaparsak testi çalıştırır, eksik bir adımla karşılaşırsa
        // test failed olur ve bize eksik adimi raporlar
)

public class Runner {


}
