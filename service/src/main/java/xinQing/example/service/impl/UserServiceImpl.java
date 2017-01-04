package xinQing.example.service.impl;

import org.springframework.stereotype.Service;
import xinQing.example.dto.UserDto;
import xinQing.example.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/4.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    /** 随便返回下 */
    public List<UserDto> findAll() {
        List<UserDto> userDtos = new ArrayList<UserDto>();
        userDtos.add(new UserDto(1L, "2343546@gmail.com"));
        userDtos.add(new UserDto(2L, "77879@163.com"));
        return userDtos;
    }
}
