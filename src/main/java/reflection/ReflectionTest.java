package reflection;

import addressbook.AddressBook;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException {
        //to load
        Class<AddressBook> cls1 = AddressBook.class;
        Class<AddressBook> cls2 = (Class<AddressBook>) new AddressBook().getClass();
        Class<?> cls3 = Class.forName("addressbook.AddressBook");
        inspectClass(cls1);

        AddressBook addressBook = new AddressBook();
        manipulateObject(addressBook);

        invokeMethodOfAnObject(addressBook);
    }
    private static void invokeMethodOfAnObject( Object obj ) {
        Class<?> cls = obj.getClass();

        try {
            cls.getDeclaredMethod(null);
            Method method = cls.getDeclaredMethod("set name", String.class);
            method.invoke(obj, null);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void manipulateObject(AddressBook addressBook) {

    Class<?> clsClass = addressBook.getClass();
    Field [] fields = clsClass.getDeclaredFields();

        try {
            //potencially we may get an no such field exception if
            //we pass a filed name that does not exist
            Field field = clsClass.getDeclaredField("contacts");
            System.out.println(addressBook.getContacts());
            //change the access modifier from private to public
            field.setAccessible(true);
            //read the value of a specific field
            field.get(addressBook);
            System.out.println(field.get(addressBook));
            //modify the value of a field of the object
            field.set(addressBook, "rubiba");
            System.out.println(field.get(addressBook));
            System.out.println(addressBook.getContacts());

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }


    private static void inspectClass(Class<AddressBook> cls) {
        cls.getDeclaredConstructors();
        Method[] ms = cls.getDeclaredMethods();
        for(int i = 0; i < ms.length; i++) {
            System.out.println("method name is" + ms[i].getName());
            System.out.println("method type is" + ms[i].getParameters());

        }
        for(Field field : cls.getDeclaredFields()) {
            System.out.println("field name is" + field.getName());
            System.out.println("field type is" + field.getType());
        }
        for (Annotation annotation : cls.getAnnotations()){
            System.out.println("annotation type is" + annotation.annotationType());
        }
    }
}
