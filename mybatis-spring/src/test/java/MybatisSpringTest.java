import com.ms.mapper.UserMapper;
import com.ms.mapper.UserMapperImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/11/30
 */
public class MybatisSpringTest {

    @Test
    public void queryUser() {
        /*try {
            String file = "mybatis-config.xml";
            InputStream input = Resources.getResourceAsStream(file);
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(input);
            SqlSession sqlSession = sessionFactory.openSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> users = mapper.queryUser();
            users.stream().forEach((user) ->{
                System.out.println(user);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = applicationContext.getBean("userMapper",UserMapper.class);
        userMapper.queryUser();
    }
}
