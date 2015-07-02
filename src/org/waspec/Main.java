package org.waspec;
import javax.xml.bind.SchemaOutputResolver;
import java.util.*;

public class Main{
    private static final int ONE=1;
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<String, Integer>();
        for (int i = 0; i <args.length ; i++) {
            if (!m.containsKey(args)){
                m.put(args[i],ONE);
            }
            else{
                int freq = m.get (args[i]);
                m.put(args[i],freq +1);
            }
        }
        System.out.println(m.size() + " distinct words detected:");
    }
}

/*public class Main{
    public static void main(String[] args){
        List<String> c = new ArrayList<String>();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        for (int i = 0; i <c.size() ; i++) {
            String s= c.get(i);
            System.out.println(s);
        }

        Collection<String> c2= new HashSet<String>();
         c2.add("aaa");c2.add("bbb");c2.add("ccc");
            for (Iterator<String>it = c2.iterator();it.hasNext();){
                String s = it.next();
                System.out.println(s);
        }
    }
}

class MyName implements Comparable<MyName> {
    int age;

    public int compareTo(MyName mn){
        if(this.age> mn.age) return 1;
        else if (this.age<mn.age) return -1;
        else return 0;
    }
}*/
/*
public class Main {
    String name;

    public static void main(String[] args) {
        Person p = new Person("Peter");
        String m = p.greet("Wei");
        System.out.println(m);
    }
}

    class Person {
        String name;
        public Person(String personName) {
            name = personName;
        }

        public String greet(String yourName) {
            return String.format("Hi %s, my name is %s.\n", name, yourName);
        }
    }*/





/*
public class Main {
    public static void main(String[] args) {
        Map m1 = new HashMap<>();
        Map m2 = new HashMap<>();
        m1.put("one",1);//aUTO-BOXING，JDK1.5以后可以这样写
        m1.put("two",2);//自动把基础类型的值转换成一个对象
        m1.put("three",3);
        m2.put("A",1);
        m2.put("B", 2);
        System.out.println((m1.size()));//3
        System.out.println(m1.containsKey("one"));//true
        System.out.println(m2.containsValue(1));//true
        if(m1.containsKey("two")){
            int i=(Integer)m1.get("two");//自动解包
            System.out.println(i);//2
        }
        Map m3= new HashMap<>(m1);
        m3.putAll(m2);
        System.out.println(m3);//{A=1, B=2, two=2, three=3, one=1}
    }
}
*/

/*public class Main {
    public static void main(String[] args) {
    List l1= new LinkedList<>();
        List l2 = new LinkedList<>();
        for (int i = 0; i <=9 ; i++) {
            l1.add("a"+i);
        }
        System.out.println(l1);//[a0,a1,....a9]
        Collections.shuffle(l1);;
        System.out.println(l1);//[a0,a3,a5...a7]
        Collections.reverse(l1);
        System.out.println(l1);//[a7,...a3,a0]
        Collections.sort(l1);
        System.out.println(Collections.binarySearch(l1,"a5"));//5
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        List l1 = new LinkedList<>();
        for (int i = 0; i <=5; i++) {
            l1.add("a"+i);
        }
        System.out.println(l1);//[a0,a1,a2,a3,a4,a5]
        l1.add(3, "a100");
        System.out.println(l1);//[a0,a1,a2,a100,a3,a4,a5]
        l1.set(6, "a200");
        System.out.println(l1);//[a0,a1,a2,a100,a3,a4,a200]
        System.out.println((String)l1.get(2)+" ");//a2
        System.out.println(l1.size());//7
        System.out.println(l1.indexOf("a3"));//4
        l1.remove(1);
        System.out.println(l1);//[a0,a2,a100,a3,a4,a200]
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Set s1= new HashSet<>();
        Set s2= new HashSet<>();
        s1.add("a"); s1.add("b"); s1.add("c");
        s2.add("d");s2.add("a");s2.add("b");

        Set sn= new HashSet<>(s1);
        sn.retainAll(s2);// 求交集：a,b
        Set su= new HashSet<>(s1);//S1所有元素拷贝到SU里
        su.addAll(s2);//  把S2所有元素添加到SU，重复的被过滤掉，ABCD
        System.out.println(sn);
        System.out.println(su);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int copy:arr){
          System.out.println(copy);
      }

      Collection c= new ArrayList<>();
        c.add(new String("aaa"));
        c.add(new String("bbb"));
        c.add(new String("ccc"));
        for (Object copy:c){
            System.out.println(c);
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Collection c= new HashSet<>();
        c.add("hello");
        c.add(new Integer(100));
        c.add(new Name("f1","l1"));
        c.remove("hello");//removed
        c.remove(new Integer(100));//removed
        System.out.println(
                c.remove(new Name("f1","l1")));//false,did not remove,不指向同一对象
        System.out.println(c.size());
        System.out.println(c.toString());

    }
}

class Name{
    public String firstName,lastName;
    public Name (String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String toString(){
        return firstName + " " + lastName;
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        String[] s = {"微软", "IBM", "SUN", "ORACLE", "APPLE"};
        String[] sBak = new String[6];
        System.arraycopy(s, 0, sBak, 0, s.length);
        for (int i = 0; i < sBak.length; i++) {
            System.out.print(sBak[i] + " ");
        }

        System.out.println();
        int[][] intArray={{1,2},{1,2,3},{3,4}};
        int[][] intArrayBak= new int[3][];
        System.arraycopy(intArray,0,intArrayBak,0,intArray.length);
        intArrayBak[2][1]=100;

        for (int i = 0; i <intArray.length ; i++) {
            for (int j = 0; j <intArray[i].length ; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/
/*public class Main {
    public static void main(String[] args) {
        String[][]s;
        s= new String[3][];
        s[0]= new String[2];
        s[1]= new String[3];
        s[2]= new String[2];
        for (int i = 0; i <s.length ; i++) {
            for (int j = 0; j <s[i].length ; j++) {
                s[i][j]= new String(" 我的位置是："+i+","+j+" ");
            }
        }
        for (int i = 0; i <s.length ; i++) {
            for (int j = 0; j <s[i].length ; j++) {
                System.out.println(s[i][j]+ " ");
            }
            System.out.println();
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int a[][] = {{1, 2}, {3, 4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print
                        ("a[" + i + "][" + j + "]=" + a[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int[] a = {1, 3, 6, 8, 9, 10, 12, 18, 20, 34};
        int i = 12;
        System.out.println(search(a,12));//普通查找
        System.out.println(binarySearch(a, 12));// 6
    }

    public static int search(int[] a, int num) {
        for (int i = 0; i < a.length; i++) {
            if (num == a[i]) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] a, int num) {
        if (a.length == 0) return -1;

        int startPos = 0;
        int endPos = a.length - 1;
        int m = (startPos + endPos) / 2;
        while (startPos <= endPos) {
            m = (startPos + endPos) / 2;//  记得写
            if (num == a[m]) return m;
            if (num > a[m]) {
                startPos = m + 1;
            }
            if (num < a[m]) {
                endPos = m - 1;
            }
        }
        return -1;
    }
}*/



/*public class Main {
    public static void main(String[] args) {
        KidCircle kc= new KidCircle(5);//封装好后别人用起来简单
        int countNum = 0;
        Kid k=kc.first;
        while (kc.count > 1){
            countNum++;
            if(countNum == 3){
                countNum = 0;
                kc.delete(k);
            }
            k = k.right;
        }
        System.out.println(kc.first.id);
    }
}

class Kid {
    int id;
    Kid left;
    Kid right;
}

class KidCircle{
    int count=0;
    Kid first, last;

    KidCircle(int n){
        for (int i = 0; i <n ; i++) {
            add();
        }
    }

    void add(){// 往圈里添加一个小孩（宾语往往是方法的参数)
        Kid k=new Kid();
        k.id = count;// Count from 0, similar to array
        if (count<=0){// 圈里一个小孩也没有
            first=k;
            last=k;
            k.left=k;
            k.right=k;
        }else {
            last.right=k;//最后一个人的右手等于新添加小孩
            k.left=last;//新小孩左手是最后小孩
            k.right=first;//新小孩右手拉第一小孩
            first.left=k;//第一小孩左手拉新小孩
            last=k;//最后小孩变新添加小孩
        }
         count++;//1 more child added
    }

    void delete(Kid k){
        if (count<=0){
            return;
        }else if (count==1){
            first = last = null;
        }else {
            k.left.right=k.right;//k小孩左边的人的右手拉住了右边的人
            k.right.left=k.left;//没有引用指向它，自己会释放

            if(k==first) {
                first = k.right;//如果把第一个给删了，它右边的变第一
            }else if (k==last){
                last=k.left;//实现双向回环链表
            }
        }
        count--;
    }
}*/

/*public class Main {

    public static void main(String[] args) {
        Date[] date = new Date[5];
        date[0]= new Date(2004, 5, 1);
        date[1]= new Date(2004, 5, 4);
        date[2]= new Date(2008, 7, 8);
        date[3]= new Date(2007, 6, 4);
        date[4]= new Date(2006, 4, 3);

        bubbleSort(date);

        for (int i = 0; i <date.length ; i++) {
            System.out.println(date[i]+" ");
        }
    }

    public static Date[] bubbleSort(Date[] a){
        int len= a.length;
        for (int i = len-1; i >=1; i--) {
            for (int j = 0; j <=i-1 ; j++) {
                if (a[j].compare(a[j+1]) >0){
                    Date temp= a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
}

class Date {
    int year;
    int month;
    int day;

    public Date(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }

    public int compare(Date date){
        return year>date.year?1
            :year<date.year?-1
            :month>date.month? 1
                :month<date.month? -1
                :day>date.day?1
                :day<date.day?-1:0;
    }

    public String toString(){//需要把引用类型变量的地址转变成字符串
        return "Year:Month:Day--"+ year +". "+ month+ ". " + day;
    }
}*/

/*public class Main {
    public static void main(String[] args) {
    int[]a= new int[]{1,3,2,5,7,9,8,4,6};
        for (int i = 0; i <a.length; i++) {
            System.out.print(a[i]);
        }
        selectionSort(a);
        System.out.println();
        for (int i = 0; i <a.length; i++) {
            System.out.print(a[i]);
        }
    }

    public static void selectionSort(int[] a){
        int k,temp;
        for (int i = 0; i <a.length; i++) {
            k=i;
            for (int j = k+1; j <a.length ; j++) {//拿出I后的每一个数
                 if(a[j]<a[k]){
                     k=j;
                 }
            }//做完内层遍历

            if(k!=i){
                 temp=a[i];
                a[i]=a[k];
                a[k]=temp;
            }
        }
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        int a[]={2, 9, 8};
        Date days[] = {
                new Date(2004, 4, 1),//不要写成引号！
                 new Date(2004, 4, 2),
                new Date(2004, 4, 3)
        };//记得写引号！
    }
}

class Date{
    int year;
    int month;
    int date;

    public Date(int y, int m, int d) {
        year = y;
        month = m;
        date = d;
    }
}*/

/*public class Main {

    public static void main(String[] args) {
    Person Tom=new Person(1,25);
           Person john= new Person(2,27);
    }
}

class Person{
    int id;
    int age=20;

    Person(int id, int age){
        this.id=id;
        this.age=age;
    }
}*/

/*public class Main {
    public static void main(String[] args) {
      say("Tim");

    }

    public static void say(String who) {
        Thread mainThread=Thread.currentThread();//拿到主线程
        System.out.println(mainThread.getName());//main

        for (int i = 0; i < 10; i++) {
            String message = String.format("%s says ｛%d｝", who, i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(message);
        }

    }

    public static void eat(){
        System.out.println("eat eat eat");
    }
}*/

/*
public class Main {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader= new InputStreamReader(System.in);
        BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
        while(true){//只要电池一直有电
            try {
                String className=bufferedReader.readLine();
                String classFullName=String.format("org.waspec.%s",className);
                Class reflectedClass=Class.forName(classFullName);
                Animal animal=(Animal)(reflectedClass.newInstance());//半晚绑定
                animal.speak();//给什么动物都可以调
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                System.out.println("ding dong");//按错了，没有小动物的时候
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
interface Animal{
    public abstract void speak();
}

class Automan implements Animal{
    @Override
    public void speak() {
        System.out.println("i love fighting");

    }
}

class Cat implements Animal{
    public void speak(){
        System.out.println("miao miao miao ");
    }
}

class Dog implements Animal{
    public void speak(){
        System.out.println("wolf wolf ");
    }
}

class Duck implements Animal{
    public void speak(){
        System.out.println("gua gua gua ");
    }
}
*/



/*public class Main {
    public static void main(String[] args) {
        try {
            Class reflectClass= Class.forName("org.waspec.Student");
            Object object=reflectClass.newInstance();
            Method reflectedMethod=reflectClass.getDeclaredMethod("speak");
            reflectedMethod.invoke(object);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}*/

/*public class Main{
    public static void main(String[] args) {
        try {

            Class reflectClass= Class.forName("org.waspec.Student");//抓到类的镜像
            Object object= reflectClass.newInstance();
            Method reflectedMethod = reflectClass.getDeclaredMethod("speak");
            reflectedMethod.invoke(object);//晚绑定和动态编程结合在一起
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            System.out.println(" no such a method");
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        try {
           Student student= Student.class.newInstance();//reflection
            student.speak();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}*/

/*class Student{
    public int id;
    public String name;
    public void speak(){
        System.out.println("hello");
    }
}*/

/*
public class Main{
    public static void main(String[] args){
    Node graph= buildGraph();
        BFT2(graph);
    }
    public static void BFT2(Node node){
        Set<Node> accessedNodes= new HashSet<Node>();
        Queue<Node> queue= new LinkedList<Node>();

        queue.add(node);
        while (!queue.isEmpty()){
            Node accessingNode=queue.poll();

            if(accessedNodes.contains(accessingNode)){
                continue;
            }

            System.out.println(accessingNode.payload);

            accessedNodes.add(accessingNode);

            for (Node child:accessingNode.children){
                queue.add(child);
            }
        }
    }


    public static void BFT1(Node node){
       Set<Node> accessedNodes= new HashSet<Node>();
        Queue<Node> queue= new LinkedList<Node>();
        queue.add(node);

        accessedNodes.add(node);
        while (!queue.isEmpty()){
            Node head=queue.poll();
            System.out.println(head.payload);
            for (Node child:head.children){
                if (!accessedNodes.contains(child)){
                    queue.add(child);

                    accessedNodes.add(child);
                }
            }
        }
    }

    public static void DFT(Node node, Set<Node> accessedNodes){
        System.out.println(node.payload);
        accessedNodes.add(node);
        for (Node child:node.children){
            if(!accessedNodes.contains(child)){
                DFT(child,accessedNodes);
            }
        }
    }

    public static Node buildGraph(){
        Node node1= new Node(1);
        Node node2=new Node(2);
        Node node3= new Node(3);
        Node node4= new Node(4);
        Node node5= new Node(5);
        //add children
        node1.children.add(node2);
        node1.children.add(node3);
        node2.children.add(node4);
        node2.children.add(node5);
        node3.children.add(node5);
        node4.children.add(node3);
        node4.children.add(node5);

        return node1;
    }

}

class Node{
    public Node(int payload) {
        this.payload = payload;
        this.children= new ArrayList<Node>();
    }

    public int payload;
    public List<Node> children;
}
*/


/*public class Main {
//使用字典检索学生
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<Integer, String>(); //所有集合只能容纳引用类型
        for (int i = 1; i <= 50; i++) {
            Student student = new Student();
            student.id = i;
            student.name = String.format("Student_%d", student.id);
            students.put(student.id, student.name);
        }
        System.out.println(students.size());//50
        System.out.println(students.get(50));//Student_50

// 使用list链表检索
        List<Student> studentList = new ArrayList<Student>();
        for (int i = 1; i <= 50; i++){
            Student student= new Student();
            student.id=i;
            student.name=String.format("Student_%d\n",student.id);
            studentList.add(student);
        }
        System.out.println(studentList.size());//50

         int targetId=50;
        for (Student s:studentList){
            if(s.id==targetId){
                System.out.println(s.name);//Student_50
                break;
            }
        }
    }
}
class Student{


    public int id;//一般当作KEY
    public String name;
}*/


/*public class Main {

    public static void main(String[] args) {
        TreeNode node=buildATree();
        System.out.println(levelOrderBottom(node) + " ");

    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        levelOrderBottomHelper(root,result,1);
        return result;
            }

    public static void levelOrderBottomHelper(TreeNode root, List<List<Integer>> result, int level){
        if (root==null){
            return;
        }
        List<Integer> list;
        if (result.size()<level){
            list= new ArrayList<Integer>();
            result.add(0,list);
        }else{
            list= result.get(result.size()-level);
        }
        list.add(root.payload);
        levelOrderBottomHelper(root.leftChild, result, level + 1);
        levelOrderBottomHelper(root.rightChild, result, level + 1);
    }

    public static void postorderDFT(TreeNode root, int level) {
        if(root==null){
            return;
        }
level++;
            if (root.leftChild!=null){
                postorderDFT(root.leftChild,level);
            }
        if (root.rightChild!=null) {
            postorderDFT(root.rightChild, level);
        }
        System.out.printf("%d is level %d\n",root.payload,level);
        }
    public static void inorderDFT(TreeNode root){
        if(root==null) {
            return;
        }
            inorderDFT(root.leftChild);
            System.out.println(root.payload);
            inorderDFT(root.rightChild);
        }
    public void preorderDFT(TreeNode root) {
        if (root != null) {
            System.out.println(root.payload);
            preorderDFT(root.leftChild);
            preorderDFT(root.rightChild);
        }
    }
    public static TreeNode buildATree(){
        TreeNode root= new TreeNode(3);
        root.leftChild=new TreeNode(9);
        root.rightChild= new TreeNode (20);
        root.rightChild.leftChild= new TreeNode(15);
        root.rightChild.rightChild=new TreeNode(7);

        return root;
    }

    }

class TreeNode{

    public TreeNode(int payload) {
        this.payload = payload;
    }
    public boolean isAccessed;
    public int payload;
    public TreeNode leftChild;
    public TreeNode rightChild;
}*/

/*public class Main {

    public static void main(String[] args) {
        Node  aTree = buildATree();
        BFT(aTree);
    }
    public static void BFT(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        while(queue.peek()!=null){
            Node node= queue.poll();
            System.out.print(node.payload);
            queue.offer(node.leftChild);
            queue.offer(node.rightChild);
        }
    }

    public static void postorderDFT(Node root, int level){ //后序遍历
        if(root==null){
            return;
        }
        level++;
        postorderDFT(root.leftChild, level);
        postorderDFT(root.rightChild, level);
        System.out.printf("%d on level %d\n",root.payload, level);
    }
    public static Node buildATree() {
        Node root = new Node(1);
        root.leftChild = new Node(2);
        root.rightChild = new Node(3);

        root.leftChild.leftChild = new Node(4);
        root.leftChild.rightChild = new Node(5);

        root.rightChild.leftChild = new Node(6);
        root.rightChild.rightChild = new Node(7);

        return root;
    }
    }

class Node{
    public Node(int payload){
        this.payload=payload;
    }

    public int payload;
    public Node leftChild;
    public Node rightChild;
}*/
/*
public class Main {

    public static void main(String[] args) {
        Node  aTree = buildATree();
        postorderDFT(aTree, 0);
    }

    public static void postorderDFT(Node root, int level){ //后序遍历
        if(root==null){
            return;
        }
        level++;
        postorderDFT(root.leftChild, level);
        postorderDFT(root.rightChild, level);
        System.out.printf("%d on level %d\n",root.payload, level);
    }

    public static Node buildATree() {
        Node root = new Node(1);
        root.leftChild = new Node(2);
        root.rightChild = new Node(3);

        root.leftChild.leftChild = new Node(4);
        root.leftChild.rightChild = new Node(5);

        root.rightChild.leftChild = new Node(6);
        root.rightChild.rightChild = new Node(7);

        return root;
    }
}

class Node{
    public Node(int payload){
        this.payload=payload;
    }

    public int payload;
    public Node leftChild;
    public Node rightChild;
}
*/


/*
public class Main {
    public static void main(String[] args) {
        Queue<Student> studentQueue = new LinkedList<Student>();
        Student student1 = new Student(1);
        Student student2 = new Student(2);
        Student student3 = new Student(3);
       */
/* studentQueue.offer(student1);
        studentQueue.offer(student2);
        studentQueue.offer(student3);*//*


       */
/*Student temp= studentQueue.peek();
        System.out.println(temp.id);*//*
 //1

       */
/* Student temp1=studentQueue.poll();
        System.out.println(temp1.id); //拽出来的学生是1
        System.out.println(studentQueue.size()); //2*//*


        Student temp2= studentQueue.peek();
        System.out.println(temp2);//null
        Student temp3=studentQueue.poll();
        System.out.println(temp3);

    }
}
*/

/*public class Main {
    public static void main(String[] args) {
        Queue<Student> studentQueue = new LinkedList<Student>();
        Student student1 = new Student(1);
        Student student2 = new Student(2);
        Student student3 = new Student(3);
        *//*studentQueue.add(student1);
        studentQueue.add(student2);
        studentQueue.add(student3);*//*
        try {
            Student stu = studentQueue.element();
            Student stu1=studentQueue.remove();

        }catch(NoSuchElementException e){
            System.out.println("the queue is empty");
        }

        Boolean stu2=studentQueue.add(student1);
        System.out.println(stu2);
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        Stack<Student> studentStack= new Stack<Student>();
        Student student1= new Student(1);
        Student student2=new Student(2);
        Student student3=new Student(3);
         studentStack.push(student1);
        studentStack.push(student2);
        studentStack.push(student3);
        System.out.println(studentStack.size()); //3

        Student student=studentStack.peek();
        System.out.println(student.id); //3
        System.out.println(studentStack.size());//3

        Student s=studentStack.pop();
        System.out.println(s.id); //3
        System.out.println(studentStack.size()); //2

        Student student4=new Student(4);
        studentStack.add(1,student4);
        System.out.println(studentStack.size());//3

        for (Student copy:studentStack){
            System.out.println(copy.id); // print 1, 4, 2
        }
        int index=studentStack.search(student2);
        System.out.printf("the index is %d\n",index);//the index is
    }
}
class Student{
    public Student(int id){
        this.id=id;
    }
    public int id;
｝
 public class Main {
    public static void main(String[] args) {
        Queue<Student> studentQueue = new LinkedList<Student>();
        Student student1 = new Student(1);
        Student student2 = new Student(2);
        Student student3 = new Student(3);
        studentQueue.offer(student1);
        studentQueue.offer(student2);
        studentQueue.offer(student3);
        System.out.println(studentQueue.size());
        Student temp=studentQueue.poll();
        System.out.println(temp.id);
        System.out.println(studentQueue.size());
    }
}

class Student{
    public Student(int id){
        this.id=id;
    }
    public int id;
}
*/

/*
public class Main {
    public static void main(String[] args) {
         List<Student> myList= new ArrayList<Student>();
        myList.add(new Student(1));
        myList.add(new Student(2));
        myList.add(new Student(3));
        myList.add(new Student(4));
        myList.add(new Student(5));

        List<Student> sub=myList.subList(1,3);
        for (Student l:sub){
            System.out.println(l.id);
        }

    }
}


class Student{
    public Student(int id){
        this.id=id;
    }

    public int id;
}*/

/*public class Main {
    public static void main(String[] args) {
        Human human1= new American();
        human1.greeting();
        human1.setAge(20);
        System.out.println(human1.getAge());

        Human human2=new Chinese();
        human2.greeting();
        human2.setAge(20);
        System.out.println(human2.getAge());

        Human chinese = new Chinese();
        chinese.greeting();
        chinese.setAge(20);
        System.out.println(chinese.getAge());

        Human abc=new ABC();
        abc.greeting();
        abc.setAge(20);
        System.out.println(abc.getAge());
    }
}

interface Human{
    void greeting();
      void setAge(int age);
    int getAge();
}

class American implements Human {
    private int age;
    @Override
    public void greeting() {
        System.out.println("hello");

    }

    @Override
    public void setAge(int age) {
    this.age=age;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}

abstract class ChineseBase implements Human{
     int age;
    @Override
    public void greeting() {
        System.out.println("ni hao");
    }

    @Override
    public void setAge(int age) {
    this.age=age;
    }

    @Override
    public abstract int getAge();

}

class Chinese extends ChineseBase{
    @Override
    public  int getAge(){
        return this.age+1;
    }
}

class ABC extends ChineseBase{
    @Override
    public int getAge(){
        return this.age;
    }
}*/

/*public class Main {
    public static void main(String[] args) {
    Teacher teacher= new Teacher() {
        @Override
        public void teach() {
            System.out.println("I teach");
        }
    };
        teacher.teach();
        Class someClass=  teacher.getClass();
        System.out.println(someClass);
    }
}

interface Teacher{
    void teach();
}*/

/*public class Main {
    public static void main(String[] args) {
    Human human= new Human() {
        @Override
        public void think() {
            System.out.println("who i am");
        }
    };
        human.think();
        Class someClass= human.getClass();
        System.out.println(someClass);
    }
}

interface Human{
    void think();
}*/
/*
public class Main {
    public static void main(String[] args) {
     Teacher teacher= new EnglishTeacher();
        teacher.teach();
        teacher.sleep();
        teacher.speak();
    }
}
abstract class Teacher{
    public abstract void teach();

    public int age;

    public void sleep(){
        System.out.println("zzz");
    }

    public void speak(){
        System.out.println(String.format("I am %d years old.",this.age));
    }
    }

class ComputerTeacher extends Teacher{
    @Override
    public void teach(){
    System.out.println("I teach java");
    }
}

class EnglishTeacher extends Teacher{
    @Override
    public void teach(){
        System.out.println("I teach english ");
    }
}
*/

/*import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while(true){
            try {
            System.out.println("Please input 2 integer:");

            String content1 = bufferedReader.readLine();
            Integer integer1 = Integer.parseInt(content1);
            String content2 = bufferedReader.readLine();
            Integer integer2 = Integer.parseInt(content2);

            Calculator calculator = new Calculator();
            int result = calculator.add(integer1, integer2);
            System.out.println(String.format("%d+%d=%d\n", integer1, integer2, result));
            if (result == 99) {
                System.out.println("GAME OVER");
                break;
            }

        } catch (IOException e) {
            System.out.println("Input error");
        }catch (NumberFormatException e){
            System.out.println("Please input number only!");
        }
    }
}
}

class Calculator{
    public int add(int a, int b){
        return a+b;
    }
}*/

/*
public class Main {
    public static void main(String[] args) {
        String s = "AaaABBBcc$^%dfsfdCCOOKK99876_haHA";
        int lCount = 0, uCount = 0, oCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                lCount++;
            } else if (c >= 'A' && c <= 'Z') {
                uCount++;
            } else {
                oCount++;
            }

        }
            System.out.println(lCount+" "+uCount+" "+oCount);

        }
    }*/


//sxt Dataoutput and ByteArray.
/*public class Main {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);

        try {
            dos.writeDouble(Math.random());
            dos.writeBoolean(true);
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            System.out.println(bais.available());
            DataInputStream dis = new DataInputStream(bais);
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            dos.close();
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}*/




/*
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("/Users/wei/Desktop/FileReader.rtf");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            Integer sum=0;
            while (true) {
                String line = bufferedReader.readLine();
                System.out.println(line);
                if (line == null) {
                    break;
                } else {
                    sum +=Integer.parseInt(line);
                }
            }

            System.out.println(sum);


            BufferedWriter writer= new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("/Users/wei/Desktop/FileReader.rtf"), "utf-8"));
            writer.write(sum.toString());
            writer.close();
        }
            catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("reading error");
        }
    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        while (true) {
            try {
                System.out.println("Please input 2 integer:");
                String content1 = bufferedReader.readLine();
                Integer integer1 = Integer.parseInt(content1);
                String content2 = bufferedReader.readLine();
                Integer integer2 = Integer.parseInt(content2);

                content1="20";
                content2="30";
                //Integer.parseInt(content1);
               // Integer.parseInt(content2);

                Calculator calculator = new Calculator();
                int result = calculator.add(integer1, integer2);
                System.out.println(String.format("%d+%d=%d", integer1, integer2, result));
                if (result == 99) {
                    System.out.println("Game over");
                    break;
                }
            } catch (IOException e) {
                System.out.println("Input error.");
            } catch (NumberFormatException e) {
                System.out.println("Please input correct format");
            }
        }
    }
}

class Calculator{
    public int add(int a, int b){
        return a+b;
    }
}
*/


//83. Remove Duplicates from Sorted List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
/*public class Main {
    public static void main(String[] args) {
        ListNode head;
        ListNode p = new ListNode(1);
        p.next = new ListNode(2);
        p.next.next = new ListNode(2);
        p.next.next.next= new ListNode(3);
        p.next.next.next.next = new ListNode(4);



        ListNode PrintPoint =  ListNode.deleteDuplicates(p);

        do{
            System.out.println(PrintPoint.val);
            PrintPoint= PrintPoint.next;

        } while (PrintPoint!=null);
    }
}

    class ListNode{
        public static ListNode deleteDuplicates(ListNode head) {
            if(head == null || head.next == null)
                return head;

            ListNode q = head;
            ListNode p = head;

            while (q!= null && q.next != null)
            {
                while (p != null && p.next != null) {
                    if (p.val == p.next.val) {
                        p.next = p.next.next;
                    } else {
                        p = p.next;
                    }
                }
                q = q.next;
                p = q;
            }
            return head;
        }

        int val;
        ListNode next;
        ListNode(int x){
            val=x;
            next=null;
        }
    }*/



//70. Climbing Stairs: time exceeds limit

/*
public class Main {
    public static int stairs;

    public static void main(String[] args) {
        int[] result = new int[6];
        System.out.println(result[5]);
    }

    public static int climbStairs(int stairs) {
        int[] result={};
        result[0]=0;
        result[1]=1;
        result[2]=2;
         for (int i=3; i<=stairs;i++) {
            result[i]= result [i - 2] + result[i-1];
        }
        return result[stairs];
    }
}*/




//27. Remove Element: good job!
    /*public class Main {
        public static void main (String[] args) {
            int elem = 3;
            int[] A = {1, 2, 3, 4, 5, 6, 7};
           removeElement(A,elem);
            for (int i = 0; i < A.length-1; i++) {
                System.out.print(A[i] + " ");
            }
        }

        public static int removeElement(int[] A, int elem) {
            int i=0;
            int j=0;
            while (i< A.length) {
                if (A[i]!=elem){
                    A[j]=A[i];
                    j++;
                }
                i++;
            }
           return j;
        }
    }*/


//13. roman to integer
/*class class Main{
    public static void main (String[] args){

        public int c2n (char c){
        switch(c){
            case ('I'):return 1;
            break;
            case ('V'):return 5;
            break;
            case 'X': return 10;
            break;
            case 'L': return 50;
            break;
            case 'C': return 100;
            break;
            case 'D': return 500;
            break;
            case 'M': return 1000;
            break;
            default: return "error";
        }
    }

    int romanToInt (string s){
    int result=0;
    for (int i=0; i<s.size();i++){
    if (i>0 && c2n(s[i]) > c2n(s[i-1]) {
        result += (c2n(s[i] - 2*c2n(s[i-1]));
        }else{
        result += c2n(s[i]);
        }
        }
        return result;
        }
}*/

// bubbleSort
/*public class Main {
    public static void main(String[] args) {
        int[] a = {5, 2, 4, 3, 7, 6, 1};
        bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

        public static void bubbleSort(int[]a) {
        int len = a.length;
        for (int i = len - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (a[j] > a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

}*/







/*public class Main {
    public static void main(String[] args) {
        Students students= new Students();
        try {
            students.setAge(300);
            System.out.println(students.getAge());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Students{
    public int age;

    public void setAge(int age) throws Exception {
        if (age>=6 && age <=90){
        this.age=age;
    }else{
            String message=String.format("The age value %d is not valid.",age);
            throw new Exception(message);
        }
    }

     public int getAge(){
         return this.age;
     }
}*/

/*public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <100 ; i+=2) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = 0; i <100 ; i++) {
            if (i%2==1){
                System.out.print(i);
            }
        }
        System.out.println();
        for (int i = 0; i <100 ; i++) {
            if (i%2==0){
                System.out.print(i);
            }
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.print(i+" ");
            i++;
        } while (i < 20);

        System.out.println();

        int n=1;
        while(n>0) {
            System.out.print(n+" ");
            n++;
            if (n==20)
                break;
        }

        System.out.println();

        for (int j = 1; j < 20; j++) {
            System.out.print(j+ " ");
        }
    }
}*/

/*public class Main {

    public static void main(String[] args) {
        Truck myTruck= new Truck();
        myTruck.run();
        Tank myTank = new Tank();
        myTank.run();
    }
}

interface Runnable{
  void run();
}

class Truck implements Runnable{

    @Override
    public void run() {

    }
}

class Tank{
    public void run(){
        System.out.println("I am running on battlefield");
    }
}*/


/*
public class Main {

    public static void main(String[] args) {
        System.out.println(addMethod1(100));
        System.out.println(addMethod2(100));
        System.out.println(addMethod3(100));
    }

    public static int addMethod1(int i){
       int result= (1+i)*i/2;
        return result;
    }

    public static int addMethod2(int i){
        int result =0;
        for ( i = 1; i <=100 ; i++) {
            if (i == 1) {
                result = 1;
            } else {
                result += i;
            }
        }
        return result;
    }

    public static int addMethod3(int i){
        int result=0;
        if (i==1){
            result=1;
        }else{
            result = i+ addMethod3(i-1);
        }
        return result;
    }
}
*/

