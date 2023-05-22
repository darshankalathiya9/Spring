package com.JDBC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.JDBC.Dao.StudentDao;

@Configuration
//@ComponentScan(basePackages = "com.JDBC.Dao")
public class JDBCConfig {

	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		return ds;
	}

	@Bean("JDBCTemplate")
	public JdbcTemplate getJDBCTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
	}

	@Bean("studentDao")
	public StudentDao studentDao() {
		StudentDao studentDao = new StudentDao();
		studentDao.setJdbcTemplate(getJDBCTemplate());
		return studentDao;
	}

}
