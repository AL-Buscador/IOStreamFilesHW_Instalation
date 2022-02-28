package Home;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String path = "D:\\Мои документы\\Java Files\\JavaHW\\Games";
        StringBuilder log = new StringBuilder();
        File gamesPath = new File(path);

        File temp = new File(gamesPath, "temp");
        log.append(CreatinMethods.creatDir(temp));
        log.append("\n");

        File Temp = new File(path + "\\temp\\temp.txt");
        log.append(CreatinMethods.creatFile(Temp));
        log.append("\n");

        File res = new File(gamesPath, "res");
        log.append(CreatinMethods.creatDir(res));
        log.append("\n");

        File src = new File(gamesPath, "src");
        log.append(CreatinMethods.creatDir(src));
        log.append("\n");

        File savegames = new File(gamesPath, "savegames");
        log.append(CreatinMethods.creatDir(savegames));
        log.append("\n");

        File pathMain = new File(path + "\\src");
        File main = new File(pathMain, "main");
        log.append(CreatinMethods.creatDir(main));
        log.append("\n");

        File test = new File(pathMain, "test");
        log.append(CreatinMethods.creatDir(test));
        log.append("\n");

        File Main = new File(path + "\\src\\main\\Main.java");
        log.append(CreatinMethods.creatFile(Main));
        log.append("\n");

        File Utils = new File(path + "\\src\\main\\Utils.java");
        log.append(CreatinMethods.creatFile(Utils));
        log.append("\n");

        File pathRes = new File(path + "\\res");
        File drawables = new File(pathRes, "drawables");
        log.append(CreatinMethods.creatDir(drawables));
        log.append("\n");

        File vectors = new File(pathRes, "vectors");
        log.append(CreatinMethods.creatDir(vectors));
        log.append("\n");

        File icons = new File(pathRes, "icons");
        log.append(CreatinMethods.creatDir(icons));
        log.append("\n");

        try (FileWriter writer = new FileWriter(Temp, true)) {
            writer.write(log.toString());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}