package com.lee.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @Author： Brian
 * @Todo：基于注解
 * @Date： 2022/5/5 10:24
 * @Version： 1.0
 */
@Configuration // 表示该类是一个配置类，Spring容器的配置注解，代表aplicationContexgt.xml配置文件
@MapperScan(basePackages = "com.lee.dao") // 表示扫描该包下的所有Mapper接口
@ComponentScan(basePackages = "com.lee.service") // 表示扫描该包下的所有Service类
public class ApplicationConfig {
/**
 * 创建数据源对象，
 * @Bean注解用来生成Bean对象，和配置文件中的<bean>标签一样
 * @return
 * @throws Exception
 */
    @Bean
    public DataSource dateSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        return dataSource;
    }
    @Bean("sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        // 设置数据源
        sqlSessionFactoryBean.setDataSource(dateSource());
        // 设置MyBatis的主配置文件
        sqlSessionFactoryBean.setTypeAliasesPackage("com.lee.entity");
        /*sqlSessionFactoryBean.setMapperLocations(new Resource[]{
                new ClassPathResource("mybatis/mapper/UserMapper.xml")
        });*/
        //用于解析包含通配符的路径，解析结果为Resources数组
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:com/lee/dao/*.xml"));
        //通过SQL Session Factory Bean的getObject()方法获取SqlSessionFactory类型的实例
        return sqlSessionFactoryBean.getObject();
    }
}
