# springboot-quartz

### springboot-quartz项目说明
`springboot`整合`quartz`框架`demo`工程

### 整合步骤
- 引入依赖
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-quartz</artifactId>
    <version>2.1.1.RELEASE</version>
</dependency>
```
- 添加注解
```
@SpringBootApplication
@EnableScheduling
public class SpringbootQuartzApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootQuartzApplication.class, args);
    }

}
```
在启动类上添加`@EnableScheduling`注解
- 定义任务
```
@Component
public class ScheduledTasks {
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    /**
     * 每隔5s打印时间
     * */
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("The time now is : " + LocalDateTime.now().format(dateTimeFormatter));
    }
}
```
定义了一个reportCurrentTime任务，任务方法名任意，通过`@Scheduled`标注这个方法是一个任务，并且通过`fixedRate`指定定时时间
- 启动项目
启动项目发现控制台打印如下：
```
The time now is : 2019-10-15 14:10:18
The time now is : 2019-10-15 14:10:23
The time now is : 2019-10-15 14:10:28
The time now is : 2019-10-15 14:10:33
The time now is : 2019-10-15 14:10:38
The time now is : 2019-10-15 14:10:43
The time now is : 2019-10-15 14:10:48
```