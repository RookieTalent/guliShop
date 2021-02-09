package run.lin.app.ware;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import run.lin.app.ware.service.UndoLogService;


@RunWith(SpringRunner.class)
@SpringBootTest
class GuliWareApplicationTests {

    @Autowired
    private UndoLogService undoLogService;

    @Test
    void contextLoads() {
        System.out.println(undoLogService);
    }

}
