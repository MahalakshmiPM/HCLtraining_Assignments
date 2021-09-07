package LambdaPack;

public class student {
String name;
int id;
int age;
public student(String name, int id, int age) {
	super();
	this.name = name;
	this.id = id;
	this.age = age;
}
@Override
public String toString() {
	return "student [name=" + name + ", id=" + id + ", age=" + age + "]";
}


}
