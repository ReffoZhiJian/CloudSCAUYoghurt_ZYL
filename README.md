# CloudSCAUYoghurt_ZYL
**项目源码-码云Gittee地址：https://gitee.com/reffozhijian/CloudSCAUYoghurt_ZYL**

**项目源码-GitHub地址：https://github.com/reffozhijian/CloudSCAUYoghurt_ZYL**

#### 介绍
2022.08-2023.03———————云上华农酸奶展销部—————————负责后端开发
#### 项目描述：
采用 Spring Boot、MyBatis-Plus、Redis、MySQL 等技术实现的华农酸奶展销管理及选购平台。
#### 我的职责：
使用 Spring Boot 及 MyBatis-Plus 框架，实现展销部后台管理端及前台用户选购端的基本功能。
使用 Redis 实现验证码校验及酸奶商品等数据缓存，减小数据库压力并提高系统性能和访问速度。
通过 Linux 系统配置 MySQL 主从复制，实现读写分离，减轻数据库负担，增大系统承受能力。
使用 Nginx 对后端服务器进行反向代理，将前端静态资源部署到 Nginx 服务器中并将后端代码部
署到 Tomcat 服务器中，实现前后端工程在 Linux 系统分离部署及前台后台项目的上线访问。
使用 Git、Maven 工具对项目进行版本管理控制及自动构建。
#### 我的成果：
完成了项目服务器端接口数据的代码开发，并优化了数据访问速度，提高系统性能，最终成功实现
前后端部署及项目上线访问。

#### 安装教程

1.  在src/main/resources/ **application.yml** 文件中修改Redis、MySQL的账户地址及密码等（修改为自己的）；
2.  在自己的本地数据库新建SCAUYoghurt数据库，并在该数据库下运行src/main/resources/ **SCAUYoghurt.sql** 文件，启动自己在yml文件中相应的Redis等配置；
3.  在IDEA中运行src/main/java/com/zylstudy/SCAUYoghurt/**SCAUYoghurtApplication.java**文件；
4.  成功运行完上述文件后，访问  http://localhost:8080/backend/page/login/login.html  地址即可进入华农酸奶展销部后台管理端，访问
    http://localhost:8080/front/page/login.html  （并开启F12调试页面视图效果为手机app模式）即可进入华农酸奶展销部前台用户端（手机登录验证码在IDEA控制台查看获取）；
