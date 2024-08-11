interface StackInterface {
    void display();
    void push(int data);
    int pop();
}
//this keyword is only used if there is an instance variable initialized in the class
class StackClass implements StackInterface {
    int size;
    int top;
    int stack[];
    StackClass(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    public void push(int data) {
        if(top<size-1) {
            stack[++top] = data;
            System.out.println(data+" Pushed Successfully");
        }
        else {
            System.out.println("Overflow");
        }
    }
    public int pop() {
        if(top<0) {
            System.out.println("Underflow");
            return -1;
        }
        else {
            int item = stack[top--]; 
            return item; 
        }
    }
    public void display(){ 
        if(top>=0) {
            System.out.println("Elements in stack are :");
            for(int i=0;i<=top;i++) {
                System.out.println(stack[i]);
            }
        }
        else {
            System.out.println("Stack is empty");
        }
    }
}
public class exp6_5 {
    public static void main(String[] args) {
        StackClass sc = new StackClass(5);
        sc.push(8);
        sc.push(10);
        sc.push(11);
        sc.push(9);
        sc.push(7);
        sc.display();
        System.out.println("Popped item is : "+sc.pop());
        System.out.println("Stack after popping item : ");
        sc.display();

}
}