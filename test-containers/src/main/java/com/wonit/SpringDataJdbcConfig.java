package com.wonit;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.jdbc.datasource.embedded.DataSourceFactory;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
@EnableJdbcRepositories // Repository 에 대한 구현을 만듦
class SpringDataJdbcConfig extends AbstractJdbcConfiguration { // default Bean 을 만듦

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder.derivedFrom()
        return builder.setType(EmbeddedDatabaseType.).build();
    }
}
