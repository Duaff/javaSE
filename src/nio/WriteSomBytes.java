package nio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by dafu on 2017/3/1.
 */
public class WriteSomBytes {
    private static final byte message[] = {12, 32, 43, 56, 76, 34, 53, 34, 54, 2};

    public static void main(String[] args) {
        FileOutputStream stream = null;
        FileChannel channel = null;
        String fileName = "E:\\workspace\\javaEE\\src\\nio\\writesomebytes.txt";
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                System.out.println(file.createNewFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            stream = new FileOutputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (stream != null) {
            channel = stream.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            for (int i = 0; i < message.length; i++) {
                buffer.put(message[i]);
            }
            buffer.flip();
            try {
                channel.write(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
