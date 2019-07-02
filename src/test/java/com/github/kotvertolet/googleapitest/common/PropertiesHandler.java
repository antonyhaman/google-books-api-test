package com.github.kotvertolet.googleapitest.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.github.kotvertolet.googleapitest.common.Constants.PROJECT_PROPERTIES_FILENAME;
import static com.github.kotvertolet.googleapitest.common.Constants.RESOURCES_PATH;

public class PropertiesHandler {

    private static PropertiesHandler instance;
    private Properties properties = new Properties();

    private PropertiesHandler() {
    }

    public static PropertiesHandler getInstance() {
        if (instance == null) {
            instance = new PropertiesHandler();
        }
        return instance;
    }

    public Properties getProperties(final String propertiesFilename) {
        try (FileInputStream stream = new FileInputStream(String.format(RESOURCES_PATH, propertiesFilename))) {
            properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public Properties getProjectProperties() {
        return getProperties(PROJECT_PROPERTIES_FILENAME);
    }
}
