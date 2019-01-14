package impl;

import services.TestService;

/**
 * 业务项目测试业务实现类
 */
public class TestServiceImpl implements TestService {

    public String testService() {
        return "这是测试seivice项目发出的信息！！";
    }
}
