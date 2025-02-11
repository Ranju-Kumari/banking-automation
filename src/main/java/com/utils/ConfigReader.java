package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties;

    public ConfigReader() {
        properties = new Properties();
        try {

            String userDir = System.getProperty("user.dir");

            // Specifying the relative path from the user directory
            String relativeFilePath = "src\\config";

            // Combining the user directory and relative file path
            String fullPath = userDir + File.separator + relativeFilePath;

            FileInputStream inputStream = new FileInputStream(fullPath);
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return properties.getProperty("url");
    }

    public String getUsername() {
        return properties.getProperty("username");
    }

    public String getPassword() {
        return properties.getProperty("password");
    }
}
