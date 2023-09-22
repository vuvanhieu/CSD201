## LinkedList Exercises
### Q1+Q2+Q3:
1. Tạo một lớp Student với các thông tin: student code, full name, date of birth, address, lass code. Xây dựng 2 constructors để khởi tạo và 1 method hiển thị thông tin.
```cpp
class Student{String studentCode, fullName, dateOfBirth, address, classCode;
Student(){}
Student(String code, String name, String dob, String addr, String class){studentCode= code; fullName = name; 
dateOfBirth = dob; address=addr; classCode = code}
public String toString(){
    return "("+studentCode+ ","+fullName+ ", " + dateOfBirth+ ", " +  address+ ", " + classCode + ") ";
}
}
```

2. Tạo một lớp Node trong một danh sách đơn, thông tin của Node có dữ liệu như một đối tượng Student. Xây dựng các Constructors cho lớp Node.
```cpp
class Node{Student info; Node next;
    Node(){}
    Node(Student x, Node q){info = x; next = q;}
    Node(Student x){this.info = x;  this.next = null;}
}
```

3. Tạo một danh sách liên kết đơn thực hiện được các chức năng như lớp Main ở mục 4.
```cpp
class MyList{Node head, tail;
    MyList(){head = tail = null;}
    //1.hien thi 1 node
    void visit(Node p){if(p!=null) System.out.print(p.info);}
    //2. hien thi thong tin toan bo
    voide traversal(){Node p = head;
        while(p!=null){visit(p); p = p.next;}
        System.out.println();
    }
    //3. Kiem tra danh sach rong
    boolean isEmpty(){return head==null;}
    //4. Xoa danh sach
    void clear(){head = tail = null;}
    //5. Them sinh vien vao cuoi danh sach
    void addLast(Student x){....}
    //6. Them sinh vien vao dau danh sach
    void addFirst(Student x){....}
    //7. Tim sinh vien theo ten
    Student searchByName(String name){
        Node current = head;
        while (current !=null){
            if (current.info.fullName.equals(name)){
                return current.info;
            }
            current = current.next;
        }
        return null;
    }
    //8. Tim sinh vien theo ma lop
    Student searchByClassCode(String code){....}
    
    //10. Chèn một sinh viên vào sau sinh viên đã biết
    void insertAfter(Student newStudent, Student existStudent){
        Node current = head;
        while (current!=null){
            if(current.info.equals(exitsStudent)){
                Node newNode = new Node(newStudent, current.next);
                current.next = newNode;
                if (current == tail){tail = newNode;}
                return;
            }
            current = current.next;
        }
        System.out.println("not Exits")
    }
    
}
```
4. Xây dựng lớp Main để thử nghiệm chương trình
```cpp
public class Main{
    public static void main(String [] args){
        MyList t = new MyList();
        Student st1 = new Student("ST001","Nguyen Van A", "01.1.2004", "Hoan Kiem", "SE10001");
        Student st2 = new Student("ST002","Nguyen Van B", "01.1.2004", "Hoan Kiem", "SE10001");
        t.addLast(st1);
        t.addLast(st2);
        t.traversal();
        //tim sinh vien theo ten
        String searchName = "Nguyen Van A";
        Student resultSearchByName = t.searchByName(searchName);
        
    }
}
```
    1. Thêm một sinh viên vào cuối
    2. Thêm một sinh viên vào đầu
    3. Tìm theo tên
    4. Tìm theo mã lớp
    5. Chèn một sinh viên vào sau sinh viên đã biết
    6. Chèn một sinh viên vào trước sinh viên đã biết
