package com.canon;

import org.junit.Test;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/10 15:02
 * @Description:测试java动态编译(有点问题,但是不想搞了)
 */
public class JavaCompilerTest {


    @Test
    public void testJavaCompilerFun() throws Exception {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int run = compiler.run(null, null, null, "D:\\JavaCompilerTest.java");

        System.out.println(run);

        // 加载classLorder
        URL[] urls = new URL[] {new URL("file:\\D:\\JavaCompilerTest.java")};
        URLClassLoader loader = new URLClassLoader(urls);
        // 根据类名获取class对象
        Class<?> clazz = loader.loadClass("JavaCompilerTest");
        Method method = clazz.getMethod("Mian");
        method.invoke(clazz.newInstance(), new String[]{});
    }
}
