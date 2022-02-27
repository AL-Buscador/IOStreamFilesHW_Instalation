package Home;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StringBuilder log = new StringBuilder();
        File gamesPath = new File("D:\\Мои документы\\Java Files\\JavaHW\\Games");

        File temp = new File(gamesPath, "temp");
        log.append(CreatinMethods.creatDir(temp));

        File Temp = new File("D:\\Мои документы\\Java Files\\JavaHW\\Games\\temp\\temp.txt");
        log.append(CreatinMethods.creatFile(Temp));

        File res = new File(gamesPath, "res");
        log.append(CreatinMethods.creatDir(res));

        File src = new File(gamesPath, "src");
        log.append(CreatinMethods.creatDir(src));

        File savegames = new File(gamesPath, "savegames");
        log.append(CreatinMethods.creatDir(savegames));

        File pathMain = new File("D:\\Мои документы\\Java Files\\JavaHW\\Games\\src");
        File main = new File(pathMain, "main");
        log.append(CreatinMethods.creatDir(main));

        File test = new File(pathMain, "test");
        log.append(CreatinMethods.creatDir(test));

        File Main = new File("D:\\Мои документы\\Java Files\\JavaHW\\Games\\src\\main\\Main.java");
        log.append(CreatinMethods.creatFile(Main));

        File Utils = new File("D:\\Мои документы\\Java Files\\JavaHW\\Games\\src\\main\\Utils.java");
        log.append(CreatinMethods.creatFile(Utils));

        File pathRes = new File("D:\\Мои документы\\Java Files\\JavaHW\\Games\\res");
        File drawables = new File(pathRes, "drawables");
        log.append(CreatinMethods.creatDir(drawables));

        File vectors = new File(pathRes, "vectors");
        log.append(CreatinMethods.creatDir(vectors));

        File icons = new File(pathRes, "icons");
        log.append(CreatinMethods.creatDir(icons));

        try (FileWriter writer = new FileWriter(Temp, true)) {
            writer.write(log.toString());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}

