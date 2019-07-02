package com.github.kotvertolet.googleapitest.common;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.junit.Before;

import java.util.Properties;

import static com.github.kotvertolet.googleapitest.common.Constants.*;

public class BaseTest {

    private Properties projectProperties;

    protected BaseTest() {
        projectProperties = PropertiesHandler.getInstance().getProjectProperties();
    }

    @Before
    public void setUp() throws Exception {
        String apiKey = projectProperties.getProperty(PROPERTY_API_KEY);
        if (apiKey.isEmpty()) {
            throw new RuntimeException("API key was removed because of security reasons, please set your own API key into project.properties file");
        }

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri(projectProperties.getProperty(PROPERTY_BASE_URL))
                .setBasePath(projectProperties.getProperty(PROPERTY_BOOKS_PATH))
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.ANY)
                .addHeader("Accept-Encoding", "gzip")
                .addHeader("User-Agent", "(gzip)")
                .addParam("key", projectProperties.getProperty(PROPERTY_API_KEY))
//                .addFilter(new RequestLoggingFilter())
//                .addFilter(new ResponseLoggingFilter())
                .build();
    }

    public Properties getProjectProperties() {
        return projectProperties;
    }
}
