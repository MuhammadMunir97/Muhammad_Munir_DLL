package com.muhammad.dll;

public class Test {
    public static void main(String[] args) {
        DLL dll = new DLL();
        IntegerInput intObj = new IntegerInput();
        dll.setDLLType(intObj);
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(50);
        Node n4 = new Node(60);
        Node n5 = new Node(80);
        Node n6 = new Node(100);
        
        dll.push(n1);
        dll.push(n2);
        dll.push(n3);
        dll.push(n4);
        dll.push(n5);
        dll.push(n6);
        
        dll.printValuesForward();
        System.out.println("here backwards");
        dll.printValuesBackward();
        System.out.println(dll.pop().value);
        System.out.println("after poping");
        dll.printValuesForward();
        System.out.println("after poping");
        dll.printValuesBackward();
        
        
        System.out.println("does the dll contain 60: " + dll.contains(60));
        System.out.println("does the dll contain 100: " + dll.contains(100));
        System.out.println("the size of the array is: " + dll.size() );
        
        System.out.println("inserting a new Node with value 1000 at point 2 and seeing the result");
        dll.insertAt(new Node(1000), 2);
        dll.printValuesForward();
        
        System.out.println("removing a value at index 3");
        dll.removeAt(3);
        dll.printValuesForward();
        System.out.println(dll.isPalindrome());
        System.out.println("check to see if the true works");
        DLL dll2 = new DLL();
        dll2.setDLLType(intObj);
        Node n12 = new Node(10);
        Node n22 = new Node(20);
        Node n32 = new Node(50);
        Node n42 = new Node(50);
        Node n52 = new Node(20);
        Node n62 = new Node(10);
        
        dll2.push(n12);
        dll2.push(n22);
        dll2.push(n32);
        dll2.push(n42);
        dll2.push(n52);
        dll2.push(n62);
        System.out.println(dll2.isPalindrome());
        dll2.removeAt(0);
        dll2.printValuesForward();
       
    }
}
