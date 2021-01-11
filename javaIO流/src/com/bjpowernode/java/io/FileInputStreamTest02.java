package com.bjpowernode.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
对第一个程序进行改进。循环方式。
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:\\course\\北京bjpowernode\\code\\JavaProject\\JavaSE\\javaIO流\\temp");

           /* while (true) {
                int readData = fis.read();
                if (readData == -1) {
                    break;
                }
                System.out.println(readData);
            }*/

            //改造while循环
            int readDate = 0;
            while ((readDate = fis.read()) != -1) {
                System.out.println(readDate);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
