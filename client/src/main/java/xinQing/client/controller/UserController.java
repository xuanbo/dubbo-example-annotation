package xinQing.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import xinQing.api.dto.UserDto;
import xinQing.client.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by null on 2017/1/4.
 */
@RestController
public class UserController {

    /* 注入client的服务，直接注入dubbo服务会出现很多问题 */
    @Resource
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public List<UserDto> list() {
        return userService.findAll();
    }

}
