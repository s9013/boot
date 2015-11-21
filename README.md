# Boot

## 构建项目
	STS构建maven项目

## git
	echo # boot >> README.md
	git init
	git add README.md
	git commit -m "first commit"
	git remote add origin git@github.com:s9013/boot.git
	git push -u origin master

## spring mvc
日志使用sl4j logback

错误
		maven 项目出现 java.lang.ClassNotFoundException: org.springframework.web.context.ContextLoaderListener
		http://www.cnblogs.com/zhouyalei/archive/2011/11/30/2268606.html
		.项目根目录下的.classpath,找到 
		修改
		<classpathentry kind="con" path="org.eclipse.m2e.MAVEN2_CLASSPATH_CONTAINER">
			<attributes>
				<attribute name="org.eclipse.jst.component.dependency" value="/WEB-INF/lib"/>
			</attributes>
		</classpathentry>



数据库连接mysql
		<!-- mysql -->
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.37</version>
		</dependency>


## jpa
连接池 c3p0
	<!--spring data jpa -->
		<dependency>
			<groupId>org.springframework.data</groupId>
			<artifactId>spring-data-jpa</artifactId>
			<version>1.9.0.RELEASE</version>
		</dependency>
		<!--hibernate -->
		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-entitymanager</artifactId>
			<version>5.0.1.Final</version>
		</dependency>
		<!-- c3p0 -->
		<dependency>
			<groupId>c3p0</groupId>
			<artifactId>c3p0</artifactId>
			<version>0.9.1.2</version>
		</dependency>

