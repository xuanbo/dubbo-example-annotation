package xinQing.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import xinQing.example.dto.UserDto;
import xinQing.example.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/1/4.
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public List<UserDto> list() {
        return userService.findAll();
    }

}
