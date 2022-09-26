package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/tests"}, //feature'u her yere yazabilirim
        glue = {"tests"}   //glue için sadece java dosyaları yazarız o yüzden by tests den başladı
        //glue stepdefs leri içierir. stepdefs lerde java class larıdır. o yüzden sadece tests yazdık

)

public class RunnerHepsiburada extends AbstractTestNGCucumberTests {
}
