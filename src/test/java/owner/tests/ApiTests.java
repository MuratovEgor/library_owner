package owner.tests;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import owner.configs.ApiConfig;

public class ApiTests {
    private ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());

    @Test
    public void testApiConfig() {
        Assertions.assertEquals("https://ya.ru", config.getUrl());
        Assertions.assertEquals("qwertyuiop123456789)@", config.getToken());
    }
}
