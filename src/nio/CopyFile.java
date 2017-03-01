package nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by dafu on 2017/3/1.
 */
public class CopyFile {
    private static final String inFileName = "E:\\workspace\\javaEE\\src\\nio\\writesomebytes.txt";
    private static final String outFileName = "E:\\workspace\\javaEE\\src\\nio\\writesomebytes2.txt";

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(inFileName);
        FileOutputStream outputStream = new FileOutputStream(outFileName);
        FileChannel inChannel = inputStream.getChannel();
        FileChannel outChannel = outputStream.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        while (true) {
            buffer.clear();
            int i = inChannel.read(buffer);
            if (i == -1) {
                break;
            }
            buffer.flip();
        }
        outChannel.write(buffer);
        inChannel.close();
        outChannel.close();
    }
}
