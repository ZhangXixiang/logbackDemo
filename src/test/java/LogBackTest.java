import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description: [测试logback日志]
 * @author: zxx
 * @createDate: 16/9/22 14:43
 * @version: [v1.0]
 */
public class LogBackTest {
    private  Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {

        LogBackTest logback = new LogBackTest();
        for(int i = 0 ; i < 10000 ; i ++){
        logback.testLog(i);}
    }

    private void testLog(int i ) {
        logger.debug("========="+i+"print debug log.");
        logger.info("========="+i+"print debug log.");
        logger.info("print info log.");
        logger.error("print error log.");
        logger.info("print info log.");
        logger.error("print error log.");
        logger.info("print info log.");
        logger.error("print error log.");
    }
}