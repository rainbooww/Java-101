package org.waspec;
/**
 * Created by wei on 2/20/15.
 */

import java.io.*;

public class Practice {
    public static void main(String[] args) {
            try {
            FileReader fileReader = new FileReader("/Users/wei/Documents/Computer Science/Numbers.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while(true) {
                String line = bufferedReader.readLine();
                System.out.println(line);
                if (line==null){
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("file was not found");
        } catch (IOException e) {
            System.out.println("Reading error");
        }
    }
}

/*public class Practice {
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
}*/

/*public class Practice {

    public static void main(String[] args) {
        Student[] student = new Student [10];
        for (int i = 0; i <10 ; i++) {
            student[i] = new Student();
            student[i].score=i*10;
        }

        for(Student copy: student){
            copy.score = copy.score +1;
        }

        for (Student copy:student){
            System.out.println(copy.score);
        }
    }
}

class Student{
    int score;
}*/

/*public class Practice {

    public static void main(String[] args) {
        int [] A= new int[10];
        for (int i = 0; i <A.length ; i++) {
            A[i]= i*10;
        }

        for (int finger:A) {
            finger = finger +1;
        }

        for(int copy:A){
            System.out.println(copy);
        }
    }
}*/

/*public class Practice {

    public static void main(String[] args) {
        int[]A= new int[10];
        for (int i = 0; i <A.length ; i++) {
            A[i]=i*10;
        }
        for (int i = 0; i <A.length ; i++) {
            System.out.println(A[i]);
        }
    }
}*/
/*
public class Practice {

    public static void main(String[] args) {
        int elem=3;
        int[]A={1,2,3,4,5,6};
        removeElement(A,elem);
        for (int i = 0; i <A.length-1; i++) {
            System.out.print(A[i]);

        }

    }

    public static int removeElement(int[]A,int elm){
        int i=0;
        int j=0;
        while(i<A.length) {
            if (A[i]!= elm){
                A[j]=A[i];
                j++;
            }
            i++;
        }
        return j;
    }

}
*/

/*public class Practice {

    public static void main(String[] args) {
        char[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverse(myArray, 2, 7);
        String string = new String(myArray);
        System.out.println(string);
    }

    public static void reverse(char []myArray, int startIndex, int endIndex){
        int leftIndex = startIndex;
        int rightIndex= endIndex;
        char temp;
        while (leftIndex<=rightIndex){
            temp = myArray[leftIndex];
            myArray[leftIndex]= myArray[rightIndex];
            myArray [rightIndex]= temp;
            leftIndex++;
            rightIndex--;
        }
    }
}*/


/*Define array
public class Practice {

    public static void main(String[] args) {
        int[][] array = new int[3][];
        array[0]= new int[10];
        array[1]= new int [8];
        array[2]= new int[6];
    }
}*/



//constructor
/*public class Practice {

    public static void main(String[] args) {
        Student student= new Student(5,"Tim");
        System.out.println("this student's name and id is:"+student.id+" "+ student.name);
    }
    }

class Student{
    public int id;
    public String name;

    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }
}*/

// try...catch, throws Exception
/*public class Practice {

    public static void main(String[] args) {
        Student student= new Student();
        try{
            student.setAge(3000);
            System.out.println(student.getAge());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class Student{

    public int age;
    public String name;

    public void setAge(int age) throws Exception{
        if (age>6 && age<80)
        this.age=age;
        else {
            String message=String.format("this age value %d is invalid.",age);
            throw new Exception(message);
        }
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
       return this.name;
    }
}*/

//interface
/*public class Practice {

    public static void main(String[] args) {
        Weapon myWeapon2 = new RocketLauncher();
        Weapon myWeapon1 = new Tank();
      myWeapon1.fire();
       myWeapon2.fire();
    }


    interface Vehicle {
        public abstract void run();
    }

    interface Weapon {
       public abstract void fire();
    }

    static class Tank implements Vehicle, Weapon{
        @Override
        public void run() {
            System.out.println("I am running on battlefield");
        }

        @Override
        public void fire() {
            System.out.println("bang");
        }
    }

    static class RocketLauncher implements Weapon {
        @Override
        public void fire() {
            System.out.println("3,2,1, launch");
        }
    }
}*/

//constructor overload
/*public class Practice {

    public static void main(String[] args) {
        Student students= new Student(5, "Tim");
        System.out.printf("this student %s's id is %d.\n",students.name,students.id);

    }
}

class Student{

    public Student(int id){
        this.id=id;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    protected int id;

    protected String name;
}*/


//method overload
/*
public class Practice {

    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        int result= calculator.minus(3,5);
        System.out.println(Math.abs(result));
        System.out.println(Math.abs(calculator.minus(3.2,7.6)));
        System.out.println(calculator.minus(3.2,7.6,2.1));
    }
}

class Calculator{
    public int minus(int a,int b){
        return a-b;
    }

    public double minus(double x, double y){
        return x-y;
    }

    public double minus(double x, double y, double z){
        return x-y-z;
    }
}
*/

//1+2+...+100
/*public class Practice {

    public static void main(String[] args) {
        int result1 = addMethod1(100);
        int result2= addMethod2(99);
        int result3= addMethod3(98);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }


    public static int addMethod1(int x){
        int result = (1+x)*x/2;
        return result;
    }

    public static int addMethod2(int x){
        int result=0;
        for (int i = 1; i <=x ; i++) {
            result+=i;
        }
        return result;
    }

    public static int addMethod3(int x){
        int result =0;
        if (x==1){
            result=1;
        }else{
            result= x+addMethod3(x-1);
        }
        return result;
    }

}*/
