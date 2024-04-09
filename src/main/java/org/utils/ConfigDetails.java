package org.utils;

import api.lib.URI;

import java.io.*;
import java.util.Properties;

public class ConfigDetails {

    public String Execution_Type;
    public String Environment;
    public FilloCatcher filloCatcher;

    public ConfigDetails() {
        try {
            initializeEnvDetails();
            this.filloCatcher = new FilloCatcher();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getPropertyValue(String propertyName) {
        String directory = System.getProperty("user.dir");
        String propFileName = directory + "/Config.properties";
        File file = new File(propFileName);
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prop = new Properties();
        try {
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String propertyValue = prop.getProperty(propertyName);
        return propertyValue;
    }


    public void initializeEnvDetails() throws Exception {
        Properties testEnv = new Properties();
        InputStream input1 = new FileInputStream("Config.properties");
        testEnv.load(input1);
    }



}
