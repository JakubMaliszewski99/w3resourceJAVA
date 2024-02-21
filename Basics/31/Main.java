/*31. Write a Java program to check whether Java is installed on your computer.
Expected Output

Java Version: 1.8.0_71                                                            
Java Runtime Version: 1.8.0_71-b15                                                
Java Home: /opt/jdk/jdk1.8.0_71/jre                                               
Java Vendor: Oracle Corporation                                                   
Java Vendor URL: http://Java.oracle.com/                                          
Java Class Path: . */

public class Main{
    public static void main(String[] args) {
        //Java version
        System.out.println("Java Version: " + System.getProperty("java.version"));
        //Runtime version
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        //Java home directory
        System.out.println("Java Home: " + System.getProperty("java.home"));
        //Java vendor name
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        //Java vendor URL
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        //Java class path
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
    }
}