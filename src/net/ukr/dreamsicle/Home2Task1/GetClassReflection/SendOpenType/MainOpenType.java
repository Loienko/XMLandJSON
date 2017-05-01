package net.ukr.dreamsicle.Home2Task1.GetClassReflection.SendOpenType;

import net.ukr.dreamsicle.Home2Task1.GetClassReflection.Worker.FileWorker;

import java.lang.reflect.Field;

/**
 * Created by Yura on 01.05.2017.
 */
public class MainOpenType {
    public static void main(String[] args) {
        FileWorker fw = new FileWorker("a.txt");
        Class <?> cl = fw.getClass();
        Field fieldOne;
        String text = " ";
        try {
            fieldOne = cl.getDeclaredField("fileName");
            text = (String) fieldOne.get(fw);
        } catch (NoSuchFieldException | SecurityException
                | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(text);
    }
}