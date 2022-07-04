import com.microsoft.demo.Demo;

import java.math.BigDecimal;

import org.junit.Test;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);

        BigDecimal result = Pi.computePi(100000);
    }

    @Test
    public void test_method_2() {
    }

    
}