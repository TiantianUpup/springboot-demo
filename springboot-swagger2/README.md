# SpringBoot整合Swagger2

### 整合步骤
### 添加依赖
```
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
</dependency>

<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
</dependency>
```

### 添加swagger2配置类：Swagger2Configuration.java
```
@Configuration
@EnableSwagger2
public class Swagger2Configuration {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //暴露API的包名
                .apis(RequestHandlerSelectors.basePackage("com.h2t.study.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("SpringBoot整合Swagger2")
                .version("1.0")
                //描述
                .description("API 描述")
                .build();
    }
}
```

### 测试控制类：
```
@RestController
public class TestController {
    @ApiOperation(value = "测试接口",notes = "传入字符串",httpMethod = "GET")
    @ApiImplicitParam(dataType = "string",name = "str",value = "字符串",required = true)
    @GetMapping("/test")
    public Object test(@RequestParam("str") String str) {
        return str;
    }
}
```

### 启动程序
访问http://ip:port/swagger-ui.html，访问页面如下：

![首页](https://upload-images.jianshu.io/upload_images/9358011-ffa3f048eeb0c560.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

访问接口：

![接口](https://upload-images.jianshu.io/upload_images/9358011-3b22bbf79491bc20.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
包含了方法请求类型、`API`、`API`说明、参数说明。还可以在上面做测试



