package controller;

import impl.TestServiceImpl;
import org.junit.jupiter.api.Test;

/**
 * 测试空气器类
 */
public class TestController {

    @Test
    public  void test1 (){

        TestServiceImpl testServiceimpl = new TestServiceImpl();
        System.out.println(testServiceimpl.testService());

    }
}
