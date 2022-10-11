import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Khoi tao Stack tu constructor default cua lop Stack
        Stack<String> myStack = new Stack<>();
        //empty(): boolean --> Chua co du lieu: true, nguoc lai la false
        System.out.println(myStack.empty());
        //push(): them phan tu vao tren cung
        myStack.push("Quyen Anh");
        myStack.push("Hoang Hung");
        myStack.push("Quyen Anh");
        //peek(): Tra ve phan tu nam tren cung
        System.out.println("Phan tu nam phia tren cung: ");
        System.out.println(myStack.peek());
        System.out.println("Lay phan tu tren cung va xoa phan tu: ");
        System.out.println(myStack.pop());
        //search(Object o): Kiem tra doi tuong o co trong stack hay khong
        System.out.println(myStack.search("Quyen Anh"));
        //In thong tin myStack
        System.out.println("Cac phan tu trong myStack: ");
        for (String str : myStack) {
            System.out.println(str);
        }


    }
}