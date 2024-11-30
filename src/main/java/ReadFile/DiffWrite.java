package ReadFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DiffWrite {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss-SSS");

    public static void main(String[] args) throws IOException {
        File in = new File("D:\\Java\\Java 2\\Productstar\\in.txt");
        File out = new File("D:\\Java\\Java 2\\Productstar\\out.txt1");

        copyFile(in, out);
        copyFileNio(in, out);
    }

    static void copyFile(File in, File out) throws IOException{
        System.out.println("Before read: " + sdf.format(new Date()));

        try(FileInputStream fis = new FileInputStream("D:\\Java\\Java 2\\Productstar\\in.txt");
            FileOutputStream fos = new FileOutputStream("D:\\Java\\Java 2\\Productstar\\out.txt")) {
            byte[] buf = new byte[1024];
            int i = 0;
            while ((i = fis.read(buf)) != -1) {
                fos.write(buf, 0, i);
            }
        } catch (Exception e) {
            throw e;
        }
        System.out.println ("After read: " + sdf.format(new Date()));
    }

    static void copyFileNio(File in, File out) throws IOException {

        System.out.println("Before read: " + sdf.format(new Date()));

        try(FileChannel inChannel = new FileInputStream(in).getChannel();
            FileChannel outChannel = new FileOutputStream(out).getChannel()){
            inChannel.transferTo(0,inChannel.size(), outChannel);

        } catch (IOException e) {
            throw e;
        }

        System.out.println("Before read: " + sdf.format(new Date()));
    }
}