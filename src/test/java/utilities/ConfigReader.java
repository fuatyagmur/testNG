package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;

    static {
        String dosyaYolu="configuration.properties";
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            //fis dosya yolunu tanimladigimiz configuration.properties dosyasini okudu

            properties=new Properties();
            properties.load(fis);   //fis'in okudugu bilgileri properties'e yukledi



        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static String getProperty(String key){

        /*
        Test methodundan yolladigimiz String key degerini alip,
        properties classindan  getProperties() methodunu kullanarak bu key'e ait value'u bize getirdi.
         */


        return properties.getProperty(key);
    }





}