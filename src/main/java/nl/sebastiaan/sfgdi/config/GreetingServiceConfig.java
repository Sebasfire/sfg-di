package nl.sebastiaan.sfgdi.config;

import nl.sebastiaan.sfgdi.datasource.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(SfgConstructorConfig.class)
@Configuration
public class GreetingServiceConfig {
    @Bean
    FakeDataSource fakeDataSource(@Value("${sebas.username}") String username,
                                  @Value("${sebas.password}") String password,
                                  @Value("${sebas.jdbcurl}") String jdbcurl) {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcurl(jdbcurl);
        return fakeDataSource;
    }
}
