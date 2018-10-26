import javax.net.ssl.HandshakeCompletedEvent;

public class HelloJNI {  // Save as HelloJNI.java
        static {
            System.loadLibrary("HelloJNI"); // myjni.dll (Windows) or libmyjni.so (Unixes)
        }
    // Declare a native method that calls back the Java methods below
    private native int[] nativeQuickSort(int[] numbers);
    private native void Tzfe();

    // Test Driver
    public static void main(String args[]) {
        int[] numbers = {22, 58, 40,50};

        int[] results=new HelloJNI().nativeQuickSort(numbers);
        new HelloJNI().Tzfe();
        System.out.println("After QuickSort,numbers are \n");
        for (int var:results
             ) {
           System.out.println(var);
        }
    }
}