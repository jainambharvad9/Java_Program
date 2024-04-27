/*as we pass simple var to method we can also pass obj */

class Person{
    String name;
    int age;
    Person(){}
    Person(String name,int age){
        this.name = name;
        this.age= age;

    } 
    void show(){
        System.out.println("name is "+ name);
        System.out.println("age is"+ age);
    }
    void check (Person p){
        if(p.age > this.age){
            System.out.println("elder is "+ this.name);
        }else {
            System.out.println(this.age);
        }
    }

    }

public class Demo5 {
    public static void main(String[] args) {
        Person p1 = new Person("rj",55);
        Person p2 = new Person("JD",45);
        System.out.println(" **** person 1 *****");

        p1.show();
        System.out.println("**** person*****");

        p2.show();
        p1.check(p2);
    }
}
