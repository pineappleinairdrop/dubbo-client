package xinQing.client.service;

import xinQing.api.dto.UserDto;

import java.util.List;

/**
 * 这个是client的业务逻辑定义，不要跟dubbo的服务api搞混了
 * 通常会把dubbo放在比较靠下的层次
 *
 * client的controller中调用自己的service，service可能要调用多个dubbo提供服务api。
 *
 * 直接在controller很容易出现dubbo注入为null的问题。
 *
 */
public interface UserService {

    List<UserDto> findAll();

}
