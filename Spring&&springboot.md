Demo1实现了spring框架三种方法的实现，应用xml配置文件，注解和配置类，进行自动装配，
Demo2实现了spring-boot的相关操作，如banner的更改，配置文件profile的更改，通过配置文件访问页面，以及监听器的应用和日志的生成等方法功能




## Spring讲解

##三种方式

###方法一Xml配置

Bean标签

​                                            

构造方法注入



属性注入



两种方式的依赖注入，构造器是先执行的后执行的是set，尽量少用构造器，在初始化的时候就会启动构造器，避免在初始化的时候进行依赖注入。Set方式在容器一开始的时候不会实例化，

生命周期




Bean的作用范围
scope                          ：Bean的作用范围

 singleton                  ：默认的，Spring会采用单例模式创建这个对象。

prototype       		 ：多例模式。（Struts2**和Spring整合一定会用到）**

request            	 ：应用在web项目中，Spring创建这个类以后，将这个类存入到request范围中。

session             ：应用在web项目中，Spring创建这个类以后，将这个类存入到session范围中。

globalsession  ：应用在web项目中，必须在porlet环境下使用。但是如果没有这种环境，相对于session。

​

ApplicationContextAware

bean可以通过ApplicationContextAware以编程方式操作创建它们的方法，或者通过将引用转换为此接口的已知子类（例如ConfigurableApplicationContext，公开其他功能）来操作。有时这种能力很有用; 但是，通常你应该避免它，因为它将代码耦合到Spring并且不遵循Inversion of Control样式，[1见开发者文档]

@Required 注释适用于bean属性setter方法但必须填充，否则会报错，并且@option注解可以不填充。Aware 接口是容器提供访问资源的渠道Bean 父类容器的扩展

###方法二注解

  
@Compoment
相当于在spring容器中写入一个bean标签

自动装配 
@Autowired

按文件目录获取配置文件
FileSystemXmlApplicationContext


打印容器中bean的个数
int count = context.getBeanDefinitionCount();
		System.out.println("bean的个数:"+ count);
		String[] names = context.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name+ "");
			Object bean = context.getBean(name);
			System.out.println(bean.getClass());
		}


@Autowired注解可以应用于构造器，set方法，私有属性。

@Primary注解，Autowired按类型加载时如果有多个相同类型，会优先primary

@Resource=@Autowired+@Qualifer

@postConstruct初始化时预先填充

@PreDestory销毁时行动

###方法三配置类


@Congiguration
设置bean标签   
@Bean


容器一

ApplcationContext

容器二
AnnotationConfigApplicationContext


输出：
String zz = context.getBean("sumBean",SumBean.class).toString();
		System.out.println(zz);


   

##  SpringBoot初识

\1. 建立项目


注意：application.java扫描本目录及其子目录下的其他文件所有其他文件应在其包下建立。

欢迎横幅
banner.txt



使用springb-boot-devtools可以实现热部署

使用ApplicationRunner或CommandLineRunner


通过配置文件为属性赋值


   

.yml配置高于.propertise


   逻辑建立地址
@RequestMapping



 

 

## springboot深入

   


如果没有active，会执行默认配置文件，但现在执行的是hello配置文件
spring:
  profile: 
    active: 
name1: aaaa
---
 
spring: 
  profile: goodbye,dev
name1: cccc

---

spring:
  profile: hello
name1: bbbb

---

配置日志
@PostConstruct
	public void queryObligations() {  
		LOGGER.debug("Sample Debug Message");
		LOGGER.info("Sample info Message");
		LOGGER.trace("Sample trace Message");
		LOGGER.error("Sample error Message");
		LOGGER.warn("Sample warn Message");  
    }


在配置文件中：
logging.level.root=info
logging.leave.org.springframework.web=info
logging.file=my.log


admin监控：

Spring Boot Admin 是一个针对spring-boot的actuator接口进行UI美化封装的监控工具。实现对多个spring boot应用进行监控，每个客户端应用可以通过HTTP或者使用 Eureka注册到admin server中进行展示。

   
