package Controller;

import Service.TestService;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class TestController {
        private TestService testService;

        public TestController(TestService testService) {
            this.testService = testService;
        }
        public void testM(){
            testService.test();

        }
    }

