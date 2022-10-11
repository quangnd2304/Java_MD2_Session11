package session11;

import java.util.Stack;

public class BaiTap4 {
    public static void main(String[] args) {
        //Chuyen doi tu he thap phan sang he nhi phan su dung stack
        int num = 19;
        int numSave = num;
        //Khoi tao doi tuong Stack
        Stack<Integer> myStack = new Stack<>();
        //Chuyen doi num thanh nhi phan
        while (num / 2 != 0) {
            int soDu = num % 2;
            myStack.push(soDu);
            num = num / 2;
        }
        myStack.push(num);
        System.out.printf("So thap phan %d chuyen thanh he nhi phan: ", numSave);
        while(!myStack.isEmpty()){
            System.out.printf("%d\t",myStack.pop());
        }
    }
}
