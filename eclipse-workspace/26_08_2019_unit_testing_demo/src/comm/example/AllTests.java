package comm.example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCalculator.class, TestComputeClass.class, TestMyClass.class })
public class AllTests {

}
