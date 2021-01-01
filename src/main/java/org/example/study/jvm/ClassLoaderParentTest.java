package org.example.study.jvm;

/**
 * @Author qiu
 * @Date 2020/12/20 14:51
 */
public class ClassLoaderParentTest {
    public static void main(String[] args) {
        // 查看当前类的classLoader
        System.out.println(ClassLoaderParentTest.class.getClassLoader());
        // 查看当前类的classLoader是那个classLoader加载的
        System.out.println(ClassLoaderParentTest.class.getClassLoader().getClass().getClassLoader());
        // 查看当前类的classLoader的parentClassLoader是谁
        System.out.println(ClassLoaderParentTest.class.getClassLoader().getParent());
        // 查看当前类的classLoader的parentClassLoader的parentClassLoader是谁
        System.out.println(ClassLoaderParentTest.class.getClassLoader().getParent().getParent());
    }
}
