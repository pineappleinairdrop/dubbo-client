package xinQing.client.service.impl;

import xinQing.api.dto.UserDto;
import xinQing.client.service.UserService;

import java.util.List;


/**
 * 注意，这个是Spring的@Service
 *是服务消费端的业务逻辑，可能需要调用多个dubbo服务
 */
@org.springframework.stereotype.Service("userApi")
public class UserServiceImpl implements UserService {

    /**
     * 这里注入dubbo的服务
     */
    @com.alibaba.dubbo.config.annotation.Reference
    private xinQing.api.service.UserApi userApi;


    public List<UserDto> findAll() {
        return userApi.findAll();
    }
}
