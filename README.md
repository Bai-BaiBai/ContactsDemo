《Spring实战(第4版)》Spring Boot章节中的小demo

功能：存储联系人的姓名、电话、email；展示所有的联系人信息

使用Mysql数据库，SpringDataJPA持久化层实现

整个项目有：
	
	Application.java : 启动类
	
	Contact.java : POJO类
	
	ContactController : 控制器类
	
	ContactRepository接口 ：实现JpaRepository接口，持久化层
	
	home.html : 主页面
	
	application.properties : 配置文件

需要注意的点：
	
	1.Spring Boot默认在application.properties中加载配置文件（如数据库连接）
	
	2.在POJO中需要注明@Entity和@Id，注意是javax.persistence包下的，@GeneratedValue自动生成主键如果是Mysql数据库需要设置 strategy=GenerationType.IDENTITY
	
	3.html静态页面需要放在src/main/resources/templates目录下（可能是MVC中的默认设置）

项目依赖：
	
	parent：spring-boot-starter-parent 2.1.1.RELEASE
	
	spring-boot-starter-web	spring-boot-starter-data-jpa mysql-connector-java spring-boot-starter-thymeleaf
	
	spring-boot-maven-plugin
