/**
 * 2017年3月28日
 * zq
 */
package demo.springcloud.eureka.serviceaggregation.service.department;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * Package : demo.springcloud.zuul.serviceaggregation.service.department
 * 
 * @author YixinCapital -- zq 2017年3月28日 上午10:02:09
 *
 */

public class HikariCPConfig {

	@Value("${spring.datasource.url}")
	private String dataSourceUrl;

	@Value("${spring.datasource.username}")
	private String user;

	@Value("${spring.datasource.password}")
	private String password;

	@Value("${spring.datasource.driver-class-name}")
	private String dataSourceClassName;

	@Value("${spring.datasource.poolName}")
	private String poolName;

	@Value("${spring.datasource.connectionTimeout}")
	private int connectionTimeout;

	@Value("${spring.datasource.maxLifetime}")
	private int maxLifetime;

	@Value("${spring.datasource.maximumPoolSize}")
	private int maximumPoolSize;

	@Value("${spring.datasource.minimumIdle}")
	private int minimumIdle;

	@Value("${spring.datasource.idleTimeout}")
	private int idleTimeout;

	@Bean
	public HikariDataSource dataSource() {
		Properties dsProps = new Properties();
		dsProps.put("url", dataSourceUrl);
		dsProps.put("user", user);
		dsProps.put("password", password);
		dsProps.put("prepStmtCacheSize", 250);
		dsProps.put("prepStmtCacheSqlLimit", 2048);
		dsProps.put("cachePrepStmts", Boolean.TRUE);
		dsProps.put("useServerPrepStmts", Boolean.TRUE);

		Properties configProps = new Properties();
		configProps.put("dataSourceClassName", dataSourceClassName);
		configProps.put("poolName", poolName);
		configProps.put("maximumPoolSize", maximumPoolSize);
		configProps.put("minimumIdle", minimumIdle);
		configProps.put("minimumIdle", minimumIdle);
		configProps.put("connectionTimeout", connectionTimeout);
		configProps.put("idleTimeout", idleTimeout);
		configProps.put("dataSourceProperties", dsProps);

		HikariConfig hc = new HikariConfig(configProps);
		HikariDataSource ds = new HikariDataSource(hc);
		return ds;
	}

}
