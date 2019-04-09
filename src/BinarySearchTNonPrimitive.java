class Student
{
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
class  Node
{
    public Student data;
    public Node left;
    public Node right;

    public Node(Student data) {
        this.data = data;
        this.left=null;
        this.right=null;
    }
}
public class BinarySearchTNonPrimitive {
    public static Node insert(Node root,Node newnode)
    {
        if(root==null)
        {
            root=newnode;
        }
        if(root.data.rollno>newnode.data.rollno)
        {
            if(root.left==null)
                root.left=newnode;
            else
                insert(root.left,newnode);
        }
        else if(root.data.rollno<newnode.data.rollno)
        {
            if(root.right==null)
                root.right=newnode;
            else
                insert(root.right,newnode);
        }
        return root;
    }
    public static void inOrderDisplay(Node root)
    {
        if(root==null)
            return;
        inOrderDisplay(root.left);
        System.out.println(root.data);
        inOrderDisplay(root.right);
    }
    public static void main(String[] args) {

        Node Root=insert(null,new Node(new Student(8,"NIK")));
        insert(Root,new Node(new Student(17,"Amit")));
        insert(Root,new Node(new Student(56,"Amit")));
        insert(Root,new Node(new Student(38,"Amit")));
        insert(Root,new Node(new Student(45,"Amit")));
        insert(Root,new Node(new Student(3,"Amit")));
        insert(Root,new Node(new Student(18,"Amit")));
        insert(Root,new Node(new Student(90,"Amit")));
        inOrderDisplay(Root);
    }
}
