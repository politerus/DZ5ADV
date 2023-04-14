package Task3;

import java.lang.reflect.*;

public class MyClass {
    private int someField;
    public String anotherField;
    protected double lastField;

    public void someMethod(int i, int b){ }

    private void someMethod(String anotherField){
        this.anotherField = anotherField;
    }

    protected int anotherMethod(){
        return 0;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "someField=" + someField +
                ", anotherField='" + anotherField + '\'' +
                ", lastField=" + lastField +
                '}';
    }

    public MyClass(int someField, String anotherField) {
        this.someField = someField;
        this.anotherField = anotherField;
    }

    private MyClass(){

    }
}

class Main{
    public static void main(String[] args) {

        Class <?> cl = MyClass.class;

        System.out.println("Class name: " + "\n" + "\t" + cl.getName());

        Field[] fieldsMod = MyClass.class.getDeclaredFields();

        System.out.println("Fields: ");

        for (Field elem : fieldsMod) {
            elem.setAccessible(true);
            Class<?> fieldType = elem.getType();
            int mod = elem.getModifiers();
            System.out.println("\t" + elem.getName() + " " + fieldType.getName() + " " + Modifier.toString(mod));
        }

        Method[] methods = MyClass.class.getDeclaredMethods();

        System.out.println("Methods: ");

        for (Method elem : methods) {
            elem.setAccessible(true);
            Class<?> methodType = elem.getReturnType();
            int mod = elem.getModifiers();
            System.out.println(elem.getName() + "\n" + "\t" + methodType.getName() + " " + Modifier.toString(mod));
            Class[] parameters = elem.getParameterTypes();
            for (Class param : parameters ) {
                System.out.println("\t"  + "\tParam: "  + param.getName());
            }
        }

        Constructor[] constructors = cl.getDeclaredConstructors();

        System.out.println("Constructors: ");

        for (Constructor elem : constructors) {
            elem.setAccessible(true);
            System.out.println("\t" + elem.getName());
            Class[] paramTypes = elem.getParameterTypes();
            for (Class param : paramTypes) {
                System.out.println("\t" + "\tParam: " + param.getName() );
            }
        }
    }
}
/*
Створіть клас, в ньому визначте 3 поля,
до цих полів створіть конструктори та методи.
 Використовуючи рефлексію отримайте всю інформацію про поля,
  методи, конструктори, а також модифікатори доступу.
 */