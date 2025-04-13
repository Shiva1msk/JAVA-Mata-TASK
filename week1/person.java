package week1;
public class person {
    String name;
    int age;
    person(){
        name="ram";
        age=10;
    }
    person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("name "+name+" age "+age);
    }   
    public static void main(String[] args) {
        person p=new person("sachin",25);
        // System.out.println(p.name);
        p.display();
    }
}
