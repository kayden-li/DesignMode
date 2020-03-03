#maven

**[教程](https://yq.aliyun.com/articles/38019?spm=a2c4e.11153940.0.0.1d9e663cvd4f89)**
**[视频](https://www.bilibili.com/video/av21004567?p=18)**

***

### 新建maven项目的方法：

`mvn archetype:generate "-DgroupId=com.javan.dev" "-DartifactId=MyWebApp" "-DarchetypeArtifactId=maven-archetype-webapp" "-DinteractiveMode=false"`

***

### maven依赖包的scope：

*    对于scope=compile的情况（默认scope)

        1.对主程序有效
        2.对测试程序有效
        3.参与打包
*    对于scope=test的情况

        1.对主程序无效
        2.对测试程序有效
        3.不参与打包
*    对于scope=provided的情况（servlet-api.jar）

        1.开发时依赖，对主程序有效
        2.部署时忽略，对测试程序有效
        3.由servlet容器提供，不参与打包

***

### maven依赖

1.依赖

*   可以传递的依赖在“最下面”的工程中以来一次即可
*   非compile范围的依赖不能传递

2.依赖的排除

*   在依赖中添加标签 `<exclusion></exclusion>`

3.继承

*   将jar包依赖统一提取到“父”工程中

        1、创建一个Maven工程作为父工程，打包方式设定为pom
        2、在子工程中声明对父工程的引用 <parent>...<relativePath>../Parent/pom.xml</relativePath></parent>
        3、将子工程的坐标中与父工程坐标中重复的内容删除
        4、在父工程中统一管理jar包依赖
        5、在子工程中删除依赖的版本号（配置继承后安装时要先安装父工程）

3.聚合

    一键安装各个模块工程
    配置方式：在一个“聚合工程”中配置各个参与聚合的工程
            <modeules><modeule>要聚合工程的路径</module></modules>

***
    
[maven中pom文件详解](https://yq.aliyun.com/articles/38271?spm=a2c4e.11163080.searchblog.20.66032ec1ILd8Y4)

[搭建maven私服](https://yq.aliyun.com/articles/38290?spm=a2c4e.11163080.searchblog.19.19cb2ec1D4dmGm)
