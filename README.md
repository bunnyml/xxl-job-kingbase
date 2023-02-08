# xxl-job-kingbase
基于xxl-job 2.3.1兼容kingbaseV8R3版本
​
**1、版本信息**
```
xxl-job：2.3.1
金仓kingbase：V8R3
lib中包含驱动jar包
doc中包含金仓建表语句
```
**2、需要修改的部分**

- 2.1 xxl-job-admin包下的pom.xml，增加kingbase jar包，jar我已放在了上面github项目中
![image](doc/images/pom%E4%BF%AE%E6%94%B9.png)
- 2.2 修改xxl-job-admin包下的application.properties文件中的数据库链接相关配置
![image](doc/images/application%E4%BF%AE%E6%94%B9.png)
- 2.3 修改xxl-job-admin包下mybatis-mapper中的所有xml文件，去掉了所有xml文件中的`号，以兼容kingbase，自行全局替换
- 2.4 修改XxlJobLogMapper.xml文件下的此语句
![image](doc/images/%E8%AF%AD%E6%B3%95%E5%85%BC%E5%AE%B9.png)
- 2.5 修改XxlJobRegistryMapper.xml中的这两个SQL以兼容kingbase语法
![image](doc/images/%E5%87%BD%E6%95%B0%E6%9B%BF%E6%8D%A2.png)
**3. 其他使用配置请参考官方文档**
```
https://www.xuxueli.com/xxl-job/#%E6%BA%90%E7%A0%81%E4%BB%93%E5%BA%93%E5%9C%B0%E5%9D%80
```