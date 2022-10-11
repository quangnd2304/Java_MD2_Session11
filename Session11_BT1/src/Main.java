import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Khoi tao 1 doi tuong Stack
        Stack<Integer> myStack = new Stack<>();
        //KHoi tao 1 mang so nguyen
        int[] arrInt = {2,4,5,8,1};
        //Day du lieu tu arrInt sang myStack
        for (int i = 0; i < arrInt.length; i++) {
            myStack.push(arrInt[i]);
        }
        //Day du lieu tu myStack de sang arrInt
//        int index = 0;
//        while(myStack.size()!=0){
//            arrInt[index] = myStack.pop();
//            index++;
//        }
//        while (!myStack.isEmpty()){
//            System.out.println(myStack.pop());;
//        }

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = myStack.pop();
        }
        //In ra gia tri cua mang sau khi dao nguoc
        System.out.println("Gia tri cua mang sau khi dao nguoc: ");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("%d\t",arrInt[i]);
        }
    }
}