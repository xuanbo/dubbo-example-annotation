package xinQing.example.service;

import xinQing.example.dto.UserDto;

import java.util.List;

/**
 * Created by Administrator on 2017/1/4.
 */
public interface UserService {

    /* 真实情况肯定是分页的 */
    List<UserDto> findAll();

}
