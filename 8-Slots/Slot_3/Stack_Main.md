## 2.Tao class Main
```cpp
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(s:"Enter size stack:");
        int n = sc.nextInt;
        stack st = new stack(n);
        
        boolean flag = true;
        int val;
        int pos = 0;
        
        while (flag){
            System.out.println(x:"1. Push item in Stack");
            System.out.println(x:"2. Pop item out from Stack");
            System.out.println(x:"3. View Stack");
            System.out.println(x:"4. Exit");
            
            System.out.println(s:"Enter Choice:");
            int choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.print(s:"Enter value:");
                    val = sc.nextInt();
                    st.push(val);
                    break;
                
                case 2:
                    System.out.println(st.pop());
                    break;
                    
                case 3:
                    st.display();
                    break;
                
                case 4:
                    flag = false;
                    break;
                    
                default:
                    System.out.println(x:"Invalid Choice");
            }
            System.out.println();
        }
    }
}
```
