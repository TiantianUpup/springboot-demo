# springboot-postgresql

### springboot-postgresql介绍
springboot配置mybatis连接postgresql

### springboot配置mybatis连接postgresql步骤
- 添加依赖
```
<!-- postgresql -->
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
</dependency>

<!-- mybatis -->
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
</dependency>
```

- 配置postgresql数据源
```
spring.datasource.platform=postgres
spring.datasource.url=jdbc:postgresql://127.0.0.1:5432/traindb?currentSchema=data
spring.datasource.username=postgres
spring.datasource.password=123456
spring.datasource.driverClassName=org.postgresql.Driver
```

**总结：**  
连接postgresql数据库非常简单，只是将mysql数据库地址替换为postgresql数据库地址即可，在将数据库驱动替换为对应驱动即可