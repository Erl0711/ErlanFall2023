package com.fall23.ui.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfigReader {

    //предназначен для расширения
    private static Properties properties;

    //Мы запрещаем, не хотим соз-ть объекты этого класса // Singleton (Одиночка)
    private ConfigReader(){

    }

    // Статический блок
    static {
      try {
          String path = "src/main/resources/drivers/application.properties";
          //Ложим данные с application
          FileInputStream inputStream = new FileInputStream(path);
          properties = new Properties();
          //загружаем в пропертиес
          properties.load(inputStream);
          //закрываем загрузку
          inputStream.close();
      }
      //IO - input output
      catch (IOException e) {
          throw new RuntimeException("File not found");
      }
    }

    //Создаем метод для возвращения значения с пропертиис

    public static String getValue(String key){
        return properties.getProperty(key).trim();
    }

    //Проверяем наш метод
    public static void main(String[] args) {
        System.out.println(getValue("browser"));
    }

}
