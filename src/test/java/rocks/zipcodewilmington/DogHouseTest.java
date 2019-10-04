package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;
import java.util.IdentityHashMap;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    @Test
    public void addDog(){
        Dog dog = new Dog(null,null,null);

        DogHouse.add(dog);
        int expected = 0;
        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void removeIdTest(){
        Dog dog = new Dog(null,null,9);
        DogHouse.remove(dog);

        int actual = 9;
        int expected = dog.getId();

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void removeDogTest(){
        Dog dog = new Dog(null,null,null);
        DogHouse.remove(dog);
        int actual = 0;
        int expected = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void getDogByIdTest(){
    Dog dog = new Dog(null,null,9);

    DogHouse.getDogById(9);

    int actual = 9;

    int expected = dog.getId();

    Assert.assertEquals(expected,actual);

    }
    @Test
    public void getNumberOfDogsTest(){
    Dog dog = new Dog(null,null,null);
    DogHouse.getNumberOfDogs();
    int actual = 0;

    int expected = DogHouse.getNumberOfDogs();

    Assert.assertEquals(expected,actual);
    }
}
