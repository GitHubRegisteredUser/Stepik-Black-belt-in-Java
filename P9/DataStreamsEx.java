package P9;

import java.io.*;

public class DataStreamsEx {

    public static void main(String[] args) {
        try (DataOutputStream oStream = new DataOutputStream(
                new FileOutputStream("my_test.bin"));
             DataInputStream iStream = new DataInputStream(
                     new FileInputStream("my_test.bin"))) {
            oStream.writeBoolean(true);
            oStream.writeByte(5);
            oStream.writeShort(120);
            oStream.writeInt(500);
            oStream.writeLong(1000000L);
            oStream.writeFloat(3.14F);
            oStream.writeDouble(123.456);

            System.out.println(iStream.readBoolean());
            System.out.println(iStream.readByte());
            System.out.println(iStream.readShort());
            System.out.println(iStream.readInt());
            System.out.println(iStream.readLong());
            System.out.println(iStream.readFloat());
            System.out.println(iStream.readDouble());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
