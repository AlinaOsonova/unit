import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.CashbackHackService;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void test1() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        int actual = service.remain(999);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test3() {
        int actual = service.remain(1001);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void test4() {
        int actual = service.remain(500);
        int expected = 500;
        Assert.assertEquals(actual, expected);
    }

}

