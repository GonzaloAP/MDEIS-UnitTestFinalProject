package runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import session.Session;

@RunWith(Cucumber.class)
public class Hook {
    @Before
    public void setup(){
        System.out.println("it is my before");
    }

    @After
    public void cleanup(){
        System.out.println("it is my after");
        Session.getInstance().closeSession();
    }
}
