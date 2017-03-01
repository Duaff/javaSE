package nio;

import java.nio.ByteBuffer;

/**
 * Created by dafu on 2017/3/1.
 */
public class TypesInByteBuffer {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(64);
        buffer.putInt(30);
        buffer.putLong(1000000000000000L);
        buffer.putDouble(Math.PI);

        buffer.flip();
        System.out.println(buffer.getInt());
        System.out.println(buffer.getLong());
        System.out.println(buffer.getDouble());
    }
}
