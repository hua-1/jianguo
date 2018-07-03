package huating.biz.service.userServices;

import huating.biz.dao.UserDao;
import huating.biz.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {
    @Autowired
    private UserDao userDao;

    public void  test1(){
        List<User> all = userDao.queryList();
        System.out.printf("all"+all.size());
    }
}
