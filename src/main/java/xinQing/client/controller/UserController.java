package xinQing.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import xinQing.api.dto.UserDto;
import xinQing.client.service.UserService;

import java.util.List;

//import javax.annotation.Resource;

@RestController
public class UserController {

    /* 注入client的mvc服务，在controller层直接注入dubbo服务会出现问题 */
    @Autowired //或@Resource
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<UserDto> list() {
        return userService.findAll();
    }

}
