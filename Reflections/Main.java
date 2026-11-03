import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Test {
    String name;
    int age;
    void setName(String name){
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) {
        // class level info
        Class <?> text = Test.class;
        System.out.println(text.getName());
        System.out.println(text.getSimpleName()); 
        
        // fields 
        for (Field field : text.getDeclaredFields()) {
            System.out.println(field.getName());
            System.out.println(field.getType());
        }
        // Method Related Info
        for(Method method:text.getDeclaredMethods()){
            System.out.println(method.getName());
            System.out.println(method.getReturnType());
            for(Class<?> parameter : method.getParameterTypes()){
                 System.out.println(parameter.getName());
            }
        }

        // constructors
        for(Constructor<?> constructor : text.getDeclaredConstructors()){
            System.out.println(constructor);
        }

        // E. Check the class's modifiers

        System.out.println(Modifier.toString(text.getModifiers()));

        // create an object using the Class object
        Test obj = (Test) text.getDeclaredConstructor().newInstance();
        obj.setName("Rahul");
        text.getDeclaredField("name");

    }
}