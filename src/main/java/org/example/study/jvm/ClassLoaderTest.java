package org.example.study.jvm;

/**
 * @Author qiu
 * @Date 2020/12/20 14:41
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        // 查看核心类库的classLoader，因为BootStrap是用的C++写的，java中没有对应的类，所以返回的是null
        System.out.println(String.class.getClassLoader());
        // 查看扩展库的classLoader
        System.out.println(sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader());
        // 查看自定义类的classLoader
        System.out.println(ClassLoaderTest.class.getClassLoader());
    }
}
