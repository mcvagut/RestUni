package bo.edu.ucb.ing.restuni;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan("bo.edu.ucb.ing.restuni.dao")
public class RestUniApplication {
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		factoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
		return factoryBean.getObject();
	}
	public static void main(String[] args) {
		SpringApplication.run(RestUniApplication.class, args);
	}

}
