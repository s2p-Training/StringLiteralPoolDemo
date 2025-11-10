package org.example;

import org.openjdk.jol.vm.VM;

public class Main {
    public static void main(String[] args)
    {
        String sData1 = "S2P Java";
        String sData2 = new String("S2P Java");
        String sData3 = "S2P Java";

        long address1 = VM.current().addressOf(sData1);
        long address2 = VM.current().addressOf(sData2);
        long address3 = VM.current().addressOf(sData3);

        // Comparing Memory Address
        System.out.println("Comparing Memory Address");
        System.out.println(address1 == address2);
        System.out.println(address1 == address3);

        // Comparing Content Of Object
        System.out.println("Comparing Object Content");
        System.out.println(sData1.equals(sData2));
        System.out.println(sData1.equals(sData3));

    }
}