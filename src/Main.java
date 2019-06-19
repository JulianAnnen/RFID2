import gnu.io.*;
import com.fazecast.jSerialComm.*;
import java.util.Enumeration;

public class Main{
    public static void main(String[] args){
        test();
        EinfachSenden einfachSenden = new EinfachSenden();
        einfachSenden.run();
    }

    static void test() {
        System.out.println("Test started");
        //System.out.println(java.library.path);
        CommPortIdentifier serialPortId;
        //static CommPortIdentifier sSerialPortId;
        Enumeration enumComm;
        //SerialPort serialPort;
        enumComm = CommPortIdentifier.getPortIdentifiers();
        while (enumComm.hasMoreElements()) {
            serialPortId = (CommPortIdentifier) enumComm.nextElement();
            if (serialPortId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                System.out.println(serialPortId.getName());
            }
        }
        System.out.println("Finished successfully");
    }

}