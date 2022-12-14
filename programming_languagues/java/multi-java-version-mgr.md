# Java 多版本并存管理



## 为何需要同时使用多个Java版本？

众所周知，`JDK`和许多软件一样，也是随着时间在迭代，不断的更新其功能以及修复问题。而在一个团队中，稳定的`JDK`版本较为重要，使得团队协作有一个统一的认知进行协作。

而除此之外，又需要对新版本的特性进行研究或者学习，因此在本机环境中存在多个`JDK`版本显然成了一个非常常见的使用方式。根据自身或项目需要切换不同的`JDK`版本。



## 如何管理并切换？

在使用`node`时，接触过`nvm`之类快捷的`node`版本管理和切换工具，因此`Google`了一下，找到了`jenv`这个通过命令行切换`JDK`版本的工具。通过其[官方文档](https://www.jenv.be/)查看还是非常不错的，可以设置全局的、每个目录的，以及shell的`JDK`版本。

### 命令行

在这里，以`mac`系统为例，所下载并安装的`JDK`均保存在目录`/Library/Java/JavaVirtualMachines/`之下，如图所示：

![image-20221101151732840](https://motionless-images.oss-cn-hangzhou.aliyuncs.com/imagesimage-20221101151732840.png)

可以看到，我在本机安装了三个`JDK 11.0`，一个`JDK 1.8` 以及一个 `JDK 17`的版本。其中`JDK 11.0`作为我近期主要是用的版本，我还分别安装了三个不同`JVM`的版本。



### maven 工程

TODO：

### gradle 工程

TODO：



### IDEA

TODO:

## 已经有了Docker这样的容器化技术后，这个还需要特别关注吗？

需要的，因为`docker`容器化是指明确指定程序运行所依赖的`JDK`版本是多少，如果本身不确定`JDK`版本的特性变化，将导致基础镜像版本错误，导致程序运行失败。
