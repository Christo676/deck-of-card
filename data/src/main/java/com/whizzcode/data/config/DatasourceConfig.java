package com.whizzcode.data.config;

import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {

  @Bean
  public DataSourceConnectionProvider connectionProvider(final DataSource dataSource) {
    return new DataSourceConnectionProvider(new TransactionAwareDataSourceProxy(dataSource));
  }

  @Bean
  public DefaultConfiguration configuration(
      final DataSourceConnectionProvider dataSourceConnectionProvider) {
    DefaultConfiguration jooqConfiguration = new DefaultConfiguration();
    jooqConfiguration.set(dataSourceConnectionProvider);
    return jooqConfiguration;
  }

  @Bean
  public DefaultDSLContext dsl(final DefaultConfiguration defaultConfiguration) {
    return new DefaultDSLContext(defaultConfiguration);
  }
}
