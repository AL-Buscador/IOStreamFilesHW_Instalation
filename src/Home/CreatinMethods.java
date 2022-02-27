package Home;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class CreatinMethods {
    public static String creatDir(File temp) {
        String text;
        if (temp.mkdir()) {
            Date time = new Date();
            text = time + " Каталог " + "\"" + temp.getName() + "\"" + " создан.";
        } else {
            Date time = new Date();
            text = time + "Oшибка.";
        }
        return text;
    }

    public static String creatFile(File temp) {
        String text = null;
        try {
            if (temp.createNewFile()) {
                Date time = new Date();
                text = time + " файл " + "\"" + temp.getName() + "\"" + " создан.";
            }
        } catch (IOException ex) {
            Date time = new Date();
            text = time + ex.getMessage();
        }
        return text;
    }
}