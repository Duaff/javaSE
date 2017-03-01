package nio;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by dafu on 2017/3/1.
 */
public class ReadAndShow {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream(ReadAndShow.class.getResource("/dafu.txt").getFile());
        FileChannel channel = stream.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        channel.read(buffer);
        buffer.flip();
        int i = 0;
        while (buffer.hasRemaining()) {
            byte b = buffer.get();
            System.out.println("Char" + i + ":" + (char) b);
            i++;
        }
        channel.close();
//        ReadAndShow show = new ReadAndShow();
//        show.test();
    }

    void test() {
        System.out.println(this.getClass().getResource("/dafu.txt").getFile());
    }
}
