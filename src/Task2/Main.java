package Task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void getInfo(Object obj){

        Class<?> cl = obj.getClass();

        String str = (char) 27 + "[34m";
        String str1 = (char) 27 + "[35m";
        System.out.println(str + "Class:");

        System.out.println(str1 + "\t" + cl.getName());

        Field[] fields = cl.getFields();

        System.out.println(str + "Fields:");

        for (Field field : fields) {
            Class fieldType = field.getType();
            System.out.println(str + "\tName: " + str1 + "\n" + "\t" + field.getName());
            System.out.println(str + "\tType: " + str1 + "\n" + "\t" + fieldType.getName());
            System.out.println();
        }

        Method[] methods = cl.getMethods();

        System.out.println(str + "Methods:");

        for (Method method : methods) {
            System.out.println(str + "\tName: " + str1 + "\n" + "\t" +  method.getName());
            System.out.println(str + "\tReturn type: " + str1 + "\n" + "\t" +  method.getReturnType().getName());
            Class[] paramTypes = method.getParameterTypes();
            System.out.println(str + "\tParam types: ");
            for (Class<?> paramType : paramTypes) {
                System.out.println(str1 +"\t" + paramType.getName());
            }
            System.out.println();
        }

        Constructor[] constructors = cl.getConstructors();

        System.out.println(str + "Constructors:");

        for (Constructor constructor : constructors) {
            System.out.println(str + "\tName: " + str1 + "\n" + "\t" + constructor.getName());
            Class[] paramTypes = constructor.getParameterTypes();
            System.out.println(str + "\tParam types: ");
            for (Class<?> paramType : paramTypes) {
                System.out.println(str1 +"\t" + paramType.getName());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyClass cl = new MyClass();
        getInfo(cl);

    }




}






/*
Напишіть програму, яка виводитиме всю інформацію про клас,
 користувач сам вибирає, який саме клас цікавить.
 */