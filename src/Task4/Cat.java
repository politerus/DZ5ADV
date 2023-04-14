package Task4;

import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<?> cl = Animal.class;
        Animal cat = new Animal();
        System.out.println(cat.toString());

        Field newType = cl.getDeclaredField("type");
        newType.set(cat, "Кіт");

        Field newAge = cl.getDeclaredField("age");
        ((Field) newAge).setAccessible(true);
        newAge.setInt(cat, 8);

        Field newName = cl.getDeclaredField("name");
        newName.setAccessible(true);
        newName.set(cat, "Персик");

        System.out.println(cat.toString());

    }
}
/*
Створіть 2 класи, Animal та Cat.
 У класі Animal ініціалізуйте 3 поля різних модифікаторів.
  У класі Cat використовуючи рефлексію, отримайте доступ до полів класу
  Animal та змініть вміст кожного з полів.
 */