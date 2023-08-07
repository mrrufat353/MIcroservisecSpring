package Service;

import Dao.TestDao;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final TestDao testDao;

    public TestService(TestDao testDao) {
        this.testDao = testDao;
    }
    public void test(){
        System.out.println("Men Revanam Pehlevanam");
    }
}