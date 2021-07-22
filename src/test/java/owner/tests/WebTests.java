package owner.tests;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import owner.configs.WebConfig;

public class WebTests {
    private WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

    @Test
    public void testWebRemote() {
        Assertions.assertEquals("firefox", config.getBrowser());
        Assertions.assertEquals("67.0", config.getBrowserVersion());
        Assertions.assertEquals(true, config.isRemote());
    }

    @Test
    public void testWebLocal() {
        Assertions.assertEquals("chrome", config.getBrowser());
        Assertions.assertEquals("89.0", config.getBrowserVersion());
        Assertions.assertEquals(false, config.isRemote());

    }
}
