package xinQing.client.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import xinQing.api.dto.UserDto;
import xinQing.client.service.UserService;

import java.util.List;

/**
 * 注意，这个是Spring的@Service
 *
 * 是服务消费端的业务逻辑，可能需要调用多个dubbo服务
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    /**
     * 这里注入dubbo的服务
     */
    @Reference
    private xinQing.api.service.UserService userService;


    public List<UserDto> findAll() {
        return userService.findAll();
    }
}
