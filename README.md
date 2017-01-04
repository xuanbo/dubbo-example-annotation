#   说明

[dubbo 的入门例子(一)](http://www.github.com/xuanbo/dubbo-example)

这是 dubbo 的入门例子(二)。

#   项目结构

*   api。client和server都依赖的功用api(将server的服务接口抽离)
*   server。服务提供方。可以修改为web项目，在listen中启动。方便起见就不配置数据源什么的了。。
*   client。服务消费方。Spring Mvc Restful。

#   运行测试

参考入门例子(一)

按照顺序启动后，浏览器访问client中的url即可。

#   备注

zookeeper没有配置集群，实际中怎么配，百度即可，然后修改相应的dubbo配置文件。

需要的童鞋去看这几个哥们的博客吧：

*   [dubbo学习及集成zookeeper集群部署](http://blog.csdn.net/lexang1/article/details/52526352)
*   [zookeeper集群配置及伪集群配置](http://www.cnblogs.com/lee-mj/p/5082896.html)