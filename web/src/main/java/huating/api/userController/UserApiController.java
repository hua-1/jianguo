package huating.api.userController;

import huating.biz.service.userServices.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {

    @Autowired
    private UserServices userServices;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test12() {
        userServices.test1();
    }
}
