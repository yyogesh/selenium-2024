package com.properties;

import com.contants.Constants;
import com.utilities.PropertyFileReader;

import java.util.Properties;

public class DataLoader {
    private static Properties props;

  private DataLoader() {
     String env = Constants.ENVIROMENT;

      switch (env) {
          case "qa":
              props = PropertyFileReader.loadFile(Constants.MOCK_QA_DATA_FILE);
              break;
          case "prod" :
              props = PropertyFileReader.loadFile(Constants.MOCK_PROD_DATA_FILE);
              break;
          default:
              break;
      }
  }

    private static final DataLoader instance = new DataLoader();

    public static DataLoader getInstance() {
        return instance;
    }

    private String getPropertyValue(String key) {
        return props.getProperty(key);
    }

    public String getAppUrl() {
        return this.getPropertyValue("app_url");
    }

    public String getUserName() {
        return this.getPropertyValue("username");
    }

    public String getPassword() {
        return this.getPropertyValue("password");
    }

}
