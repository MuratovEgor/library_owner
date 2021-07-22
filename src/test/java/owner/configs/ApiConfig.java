package owner.configs;

//1. Базовый url
// 2. Токен
//Токен нужно передавать защищенно:
// 1. Через файл на файловой системе
// 2. Через системные property

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "file:src/test/resources/api.properties"
})
public interface ApiConfig extends Config {

    @Key("baseUrl")
    String getUrl();

    @Key("token")
    String getToken();


}
