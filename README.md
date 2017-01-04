#   说明

[dubbo 的入门例子(一)](http://www.github.com/xuanbo/dubbo-example)

这是 dubbo 的入门例子(二)。

本例子做了什么？
```
1.在之前的基础上使用了dubbo提供的注解(不然100个接口，配置文件要配置100个暴露接口？)
2.服务消费者为Spring Mvc项目，调用dubbo服务，对外提供restful服务。
3.把dubbo服务暴露的接口单独抽离出一个模块，服务提供者和消费者都依赖该模块。
```

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

#   学习中遇到的坑！！

dubbo的Spring依赖跟自己的冲突！！！

如何解决：
```
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>dubbo</artifactId>
    <version>2.5.3</version>
    <exclusions>
        <exclusion>
            <artifactId>spring</artifactId>
            <groupId>org.springframework</groupId>
        </exclusion>
    </exclusions>
</dependency>
```

controller中注入dubbo服务为null！！！

如何解决：
```
1.只将dubbo服务注入到服务消费者的Service或Repository中而不是Controller中，其实大部分时候都可如此(你可能要调用多个服务)
2.去掉web.xml中listener，将全部配置都放到springMvc-servlet.xml，这样只生成一个上下文，能防止dubbo和spring扫描Bean出现的问题。
3.将dubbo的配置集成到springMvc-servlet.xml配置中，这样可以保证两个上下文。
```

如果大家也遇到了，可以结合本工程的配置，参考下面的博客(我也是从中解决的问题)。

*   [springMVC中使用dubbo注解配置的问题](http://blog.csdn.net/qq_16414307/article/details/50328481)
*   [Dubbo基于注解方式的配置](http://blog.csdn.net/lzxadsl/article/details/48494917)