package huating.biz.dao;

import huating.biz.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserDao {
    @Select("select id from t_user")
    List<User> queryList();
}
