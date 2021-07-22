package owner.configs;

//1. Имя браузера
//2. Версия браузера
//3. Локальный или удаленный (RemoteWebDriver)
//Сделать два вида конфигурационных файлов:
//1. Для локального запуска на chrome
// 2. Для удаленного запуска на selenoid
//Сделать возможность с помощью одной системной переменной переключать запуск с локального на удаленный.


import org.aeonbits.owner.Config;
@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources("classpath:${stage}.properties")
public interface WebConfig extends Config {

    @Key("browser")
    String getBrowser();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("isRemote")
    Boolean isRemote();

}
