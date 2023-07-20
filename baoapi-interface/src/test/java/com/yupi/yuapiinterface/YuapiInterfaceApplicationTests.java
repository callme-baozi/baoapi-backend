package com.baozi.baoapiinterface;

import cn.hutool.http.HttpUtil;
import com.baozi.baoapiclientsdk.client.baoApiClient;
import com.baozi.baoapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * 测试类
 *
 */
@SpringBootTest
class baoapiInterfaceApplicationTests {

    @Resource
    private baoApiClient baoApiClient;

    @Test
    void contextLoads() {
        String result = baoApiClient.getNameByGet("baozi");
        System.out.println(result);

        User user = new User();
        user.setUsername("baozi");
        String usernameByPost = baoApiClient.getUsernameByPost(user);
        System.out.println(usernameByPost);
    }

}
