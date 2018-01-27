package ua.com.owu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.DriverManager;

@Configuration
@EnableTransactionManagement
public class DataConfig {

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost/db2030config");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setPassword("root");
        dataSource.setUsername("root");
        return dataSource;
    }
}
