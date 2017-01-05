package xinQing.server.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import xinQing.api.dto.UserDto;
import xinQing.api.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * 注意：这里是dubbo的@Service
 *
 * `@Component` 被Spring管理，声明一个Bean
 * `@Service`就是dubbo本身的注解,接口暴露
 */
@Component
@Service
public class UserServiceImpl implements UserService {

    /** 随便返回下 */
    public List<UserDto> findAll() {
        List<UserDto> userDtos = new ArrayList<UserDto>();
        userDtos.add(new UserDto(1L, "2343546@gmail.com"));
        userDtos.add(new UserDto(2L, "77879@163.com"));
        return userDtos;
    }
}
