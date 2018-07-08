import com.mkyong.Chapter_2.CDPlayer;
import com.mkyong.Chapter_2.OtherConfig;
import com.mkyong.Chapter_3.ColdDayService;
import com.mkyong.Chapter_3.WeatherService;
import com.mkyong.config.AppConfig;
import com.mkyong.config.Knight;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class, OtherConfig.class})
@ActiveProfiles("test")
public class TestAble {

    @Autowired
    private CDPlayer cdPlayer;
    @Autowired
    private Environment environment;
    @Autowired
    @Qualifier("getTaskForKnight_New")
    private Knight knight;
    @Autowired
    private WeatherService weatherService;
    @Autowired
    ColdDayService coldDayService;

    @Test
    public void testCDplayer() {
        cdPlayer.play();

    }

    @Test
    public void testKight() {
        knight.playMusic();

    }

    @Test
    public void weather() {
        System.out.println("--------------------------------check-------------------------------------");
        System.out.println(weatherService.forecast());
        System.out.println(environment.getActiveProfiles()[0].toString());
        System.out.println("---------------------------------------------------------------------");
    }
}
