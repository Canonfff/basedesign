package com.canon.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/8 11:00
 * @Description:
 */
public final class PropertiesFileUtil {
    private static final String DEFAULT_ENCODING = "UTF-8";
    private static Logger logger = LoggerFactory.getLogger(PropertiesFileUtil.class);
    private static Properties defaultProperties = null;

    private static String defaultFileName = "init.properties";

    static {
        defaultProperties = System.getProperties();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream resourceAsStream = loader.getResourceAsStream(defaultFileName);
        try {
            defaultProperties.load(resourceAsStream);
        } catch (IOException e) {
            logger.error("load defalut properties fail,place check config, exception {}", e);
        }
    }

    /**
     * 获取配置文件数据
     * @param key
     * @return
     */
    public static String getProperties(String key) {
        Assert.notNull(key, "文件参数不能为空");
        return defaultProperties.getProperty(key);
    }

    public static Properties readConfigByFileName(String fileName) {
        Assert.notNull(fileName, "fileName cannot be null");
        InputStream resource = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
        try {
            defaultProperties.load(resource);
        } catch (IOException e) {
            throw new RuntimeException("load properties fail,place check config",e);
        }
        return defaultProperties;
    }


}
