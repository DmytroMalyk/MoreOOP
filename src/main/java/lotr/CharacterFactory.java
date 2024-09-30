package lotr;


import java.util.Set;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

import org.reflections.Reflections;


public class CharacterFactory {
    Reflections reflections = new Reflections("com.my.project");

    public Character createCharacter() throws InstantiationException, IllegalAccessException, 
 IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);
        int randomIndex = new Random().nextInt(subTypes.size());
        int i = 0;
        for (Class<? extends Character> element : subTypes) {
            if (i == randomIndex) {
                Character result = element.getDeclaredConstructor().newInstance();
                return result;
            }
            i++;
        }
        throw new IllegalStateException("Unexpected error while creating a character.");
    }
}
