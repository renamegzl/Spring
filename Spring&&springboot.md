## Spring讲解

##三种方式

###方法一Xml配置

Bean标签

​    ![1543145408083](C:\Users\ADMINI~1\AppData\Local\Temp\1543145408083.png)                                              

构造方法注入

   ![1543145449217](C:\Users\ADMINI~1\AppData\Local\Temp\1543145449217.png)

属性注入

   ![1543145465848](C:\Users\ADMINI~1\AppData\Local\Temp\1543145465848.png)

两种方式的依赖注入，构造器是先执行的后执行的是set，尽量少用构造器，在初始化的时候就会启动构造器，避免在初始化的时候进行依赖注入。Set方式在容器一开始的时候不会实例化，

生命周期

   ![1543145494636](C:\Users\ADMINI~1\AppData\Local\Temp\1543145494636.png)

这种写法会造成耦合，并不推荐

   ![1543145508868](C:\Users\ADMINI~1\AppData\Local\Temp\1543145508868.png)

Bean的作用范围

​      ![1543145521460](C:\Users\ADMINI~1\AppData\Local\Temp\1543145521460.png)![1543150726229](C:\Users\ADMINI~1\AppData\Local\Temp\1543150726229.png)

ApplicationContextAware

bean可以通过ApplicationContextAware以编程方式操作创建它们的方法，或者通过将引用转换为此接口的已知子类（例如ConfigurableApplicationContext，公开其他功能）来操作。有时这种能力很有用; 但是，通常你应该避免它，因为它将代码耦合到Spring并且不遵循Inversion of Control样式，[1见开发者文档]

@Required 注释适用于bean属性setter方法但必须填充，否则会报错，并且@option注解可以不填充。Aware 接口是容器提供访问资源的渠道Bean 父类容器的扩展

###方法二注解

![1543150876635](C:\Users\ADMINI~1\AppData\Local\Temp\1543150876635.png)   

相当于在spring容器中写入一个bean标签

自动装配 

![1543150899887](C:\Users\ADMINI~1\AppData\Local\Temp\1543150899887.png)

  

按文件目录获取配置文件

   ![1543150922198](C:\Users\ADMINI~1\AppData\Local\Temp\1543150922198.png)

打印容器中bean的个数

   ![1543150956087](C:\Users\ADMINI~1\AppData\Local\Temp\1543150956087.png)

@Autowired注解可以应用于构造器，set方法，私有属性。

@Primary注解，Autowired按类型加载时如果有多个相同类型，会优先primary

@Resource=@Autowired+@Qualifer

@postConstruct初始化时预先填充

@PreDestory销毁时行动

###方法三配置类

   ![1543150997235](C:\Users\ADMINI~1\AppData\Local\Temp\1543150997235.png)

设置bean标签   

![1543151007256](C:\Users\ADMINI~1\AppData\Local\Temp\1543151007256.png)

容器一

   ![1543151018948](C:\Users\ADMINI~1\AppData\Local\Temp\1543151018948.png)

容器二

   ![1543151028481](C:\Users\ADMINI~1\AppData\Local\Temp\1543151028481.png)

输出：

   ![1543151037893](C:\Users\ADMINI~1\AppData\Local\Temp\1543151037893.png)

![1543151052840](C:\Users\ADMINI~1\AppData\Local\Temp\1543151052840.png)

   

##  SpringBoot初识

\1. 建立项目

   

​      ![1543151067390](C:\Users\ADMINI~1\AppData\Local\Temp\1543151067390.png)

![1543151078223](C:\Users\ADMINI~1\AppData\Local\Temp\1543151078223.png)

![1543151087942](C:\Users\ADMINI~1\AppData\Local\Temp\1543151087942.png)

注意：application.java扫描本目录及其子目录下的其他文件所有其他文件应在其包下建立。

欢迎横幅

   ![1543151161166](C:\Users\ADMINI~1\AppData\Local\Temp\1543151161166.png)

关于@SpringBootApplication

   ![1543151176185](C:\Users\ADMINI~1\AppData\Local\Temp\1543151176185.png)

使用springb-boot-devtools可以实现热部署

使用ApplicationRunner或CommandLineRunner

   ![1543151184615](C:\Users\ADMINI~1\AppData\Local\Temp\1543151184615.png)

通过配置文件为属性赋值

   ![1543151196689](C:\Users\ADMINI~1\AppData\Local\Temp\1543151196689.png)

![1543151203615](C:\Users\ADMINI~1\AppData\Local\Temp\1543151203615.png)

   

.yml配置高于.propertise

关于占位符的更多扩展：

   ![1543151215535](C:\Users\ADMINI~1\AppData\Local\Temp\1543151215535.png)

@ConfigurationPropertie

   ![1543151223716](C:\Users\ADMINI~1\AppData\Local\Temp\1543151223716.png)

   逻辑建立地址

![1543151249381](C:\Users\ADMINI~1\AppData\Local\Temp\1543151249381.png)

监听器demo

   ![1543151266730](C:\Users\ADMINI~1\AppData\Local\Temp\1543151266730.png)

 

 

 

 

 

## springboot深入

   

   ![1543151303218](C:\Users\ADMINI~1\AppData\Local\Temp\1543151303218.png)

![1543151314769](C:\Users\ADMINI~1\AppData\Local\Temp\1543151314769.png)

如果没有active，会执行默认配置文件，但现在执行的是hello配置文件

配置日志

   ![1543151333726](C:\Users\ADMINI~1\AppData\Local\Temp\1543151333726.png)

在配置文件中：

   ![1543151340955](C:\Users\ADMINI~1\AppData\Local\Temp\1543151340955.png)

![1543151352789](C:\Users\ADMINI~1\AppData\Local\Temp\1543151352789.png)

admin监控：

Spring Boot Admin 是一个针对spring-boot的actuator接口进行UI美化封装的监控工具。实现对多个spring boot应用进行监控，每个客户端应用可以通过HTTP或者使用 Eureka注册到admin server中进行展示。

   