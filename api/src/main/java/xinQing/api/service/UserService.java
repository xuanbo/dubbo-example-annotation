package xinQing.api.service;

import xinQing.api.dto.UserDto;

import java.util.List;

/**
 * dubbo暴露的服务接口
 *
 * Created by Administrator on 2017/1/4.
 */
public interface UserService {

    /* 真实情况肯定是分页的 */
    List<UserDto> findAll();

}
