package org.example.study.jvm;

/**
 * @Author qiu
 * @Date 2020/12/20 14:50
 */
public class ClassLoaderScopeTest {

    public static void main(String[] args) {
        // 查看BootStrap的加载范围
        String pathBoot = System.getProperty("sun.boot.class.path");
        System.out.println(pathBoot.replaceAll(";", System.lineSeparator()));

        System.out.println("------------------------------------");

        // 查看ExtClassLoader的加载范围
        String pathExt = System.getProperty("java.ext.dirs");
        System.out.println(pathExt.replaceAll(";", System.lineSeparator()));

        System.out.println("------------------------------------");

        // 查看AppClassLoader的加载范围
        String pathApp = System.getProperty("java.class.path");
        System.out.println(pathApp.replaceAll(";", System.lineSeparator()));
    }
}
