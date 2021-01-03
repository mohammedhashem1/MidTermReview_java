package mapreviewmidterm;

import java.util.Stack;

public class StackInfo {
    // Lifo =last in first out
   static Stack<String> obj=new Stack<>();

    public static void main(String[] args) {
        obj.push("Apple");
        obj.push("Orange");
        obj.push("Grapes");
        obj.push("Potato");
        obj.push("Parata");
        System.out.println(obj);
        System.out.println(obj.clone());
        System.out.println("*****************");
    //    System.out.println(obj.pop());// poll(); and pop(); /  Retrieve the value and delete the element
        System.out.println(obj.pop());// poll(); and pop(); /  Retrieve the value and delete the element
        System.out.println("****************************");
        System.out.println(obj.pop());// poll(); and pop(); /  Retrieve the value and delete the element
  //      System.out.println(obj.pop());// poll(); and pop(); /  Retrieve the value and delete the element
        System.out.println("*********************************************");
        System.out.println(obj.pop());// poll(); and pop(); /  Retrieve the value and delete the element
//obj.peek();
        System.out.println(obj.peek());
        System.out.println(obj.pop());

    }

}
