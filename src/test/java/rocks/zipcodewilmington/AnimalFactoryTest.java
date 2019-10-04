package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createDog(){
        Dog dog = AnimalFactory.createDog("fido",new Date(0));
        Assert.assertEquals("fido",dog.getName());
        Assert.assertEquals(new Date(0),dog.getBirthDate());

    }
    @Test

    public void createCat(){
        Cat cat = AnimalFactory.createCat("loki",new Date(0));
        Assert.assertEquals("loki",cat.getName());
        Assert.assertEquals(new Date(0),cat.getBirthDate());

    }
}

