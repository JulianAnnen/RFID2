import gnu.io.CommPortIdentifier;

import java.util.Enumeration;

class TestClass {
    static String test() {
        String serialName = null;
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
                serialName = serialPortId.getName();
                System.out.println(serialPortId.getName());
            }
        }
        return serialName;
    }


}