2021/02/21



## 1. 环境准备

### 1.1 从github新建java项目，并导入到IDEA中：

- GitHub 新建一个 repository, 勾选

<img src="img/Screenshot 2021-02-21 at 12.36.11.png" style="zoom:10%"/>

- 将项目git clone到本地，Intellij idea打开本地项目
- Java工程命名规范
- - com + 公司名 + 项目名 + 模块名.……
- org + 政府机构名 + 项目名 + 模块名.……
- 建立 Java Project文件架构
    - java-base-project 初始包含文件

<img src="img/Screenshot 2021-02-21 at 12.43.45.png" alt="Screenshot 2021-02-21 at 12.43.45" style="zoom:60%;" />

- - - 其中“.gitignore”文件的作用是：项目中有部分文件例如日志和编译后class等不需提交到代码库，就让这些文件被忽略。例如，我们可以自己加上

      ```
      #idea
      .idea/
      ```

      让idea文件夹中所有文件，不让其上传到github上

<img src="img/Screenshot 2021-02-21 at 12.52.00.png" alt="Screenshot 2021-02-21 at 12.52.00" style="zoom:40%;" />




```
Java-test-project
│---README.md
│---LICENSE
│---.gitignore    
│
└───.idea
│   │---modules.xml
│   │   ... 
│
└───doc
│   │---file.md
│   │   ... 
│ 
└───src
│   └───main  
│   │	│	└───java
│   │   │		└───com.gs.testproject
│  	│	│				│---file.class
│  	│	│				│	...  
│   │   │           
│   │   └───resources  
│   │   │   ...
│		│		│
│   └───test(test文件结构与main一致)  
│   	│	└───java
│       │		└───com.gs.testproject
│  		│				│---filetest.class
│  		│				│	...
│       │           
│       └───resources  
│       │   ...
```


- 点亮文件夹颜色 project setting --> Modules
- 快捷键 cmd + ;

<img src="img/Screenshot 2021-02-21 at 20.11.03.png" alt="Screenshot 2021-02-21 at 20.11.03" style="zoom:30%;" />

###  1.2 安装并配置Maven

- 定义： Maven是包管理工具（类比GitHub）

- 命令行下载到本地文件夹后，使用快捷键”cmd + , “
- 打开preferences --> Build, Executioin --> Maven --> 选本地文件 -->勾选所有override


- wget https://mirrors.tuna.tsinghua.edu.cn/apache/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz

- tar xzvf apache-maven-3.6.3-bin.tar.gz


<img src="img/Screenshot 2021-02-21 at 20.48.14.png" alt="Screenshot 2021-02-21 at 20.48.14" style="zoom:30%;" />



### 1.3 Maven引入Junit依赖

- 鼠标右击java-test-project项目名称 --> add framework support --> bu勾选maven

- 此时在java-test-project子目录下就会出现pom.xml文件了

  <img src="img/Screenshot 2021-02-21 at 20.54.52.png" alt="Screenshot 2021-02-21 at 20.54.52" style="zoom:60%;" />

```
package com.gs.testproject;

import org.junit.Assert;
import org.junit.Test;

public class testHello {
    @Test
    public void firstTest() {
        Assert.assertTrue(true);
    }
}
```






