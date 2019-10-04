package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setName(){
    Cat cat = new Cat(null,null,null);

    String givenName = "alpha";

    cat.setName(givenName);

    String catName = cat.getName();

    Assert.assertEquals(givenName,catName);
    }


    @Test
    public void testSpeak(){
        Cat cat = new Cat(null,null,null);

        String speak = "meow!";

        cat.speak();

        String givenSpeak = cat.speak();

        Assert.assertEquals(speak,givenSpeak);



    }
    @Test
    public void SetBirthDate(){
        Cat cat = new Cat(null,null,null);
       Date date = new Date();

       cat.setBirthDate(date);

       Date currentDate = cat.getBirthDate();

       Assert.assertEquals(currentDate,date);



    }
    @Test
    public void setEat(){
        Cat cat = new Cat(null,null,null);
        Food food = new Food();
        cat.eat(food);
        int expected = 1;
        int actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected,actual);

    }
    @Test

    public void getId(){
        Cat cat = new Cat(null,null,20);
        int expected = 20;
        int actual = cat.getId( );
        Assert.assertEquals(expected,actual);

        }

        @Test
    public void testInheritance(){
        Cat cat = new Cat(null,null,null);
            System.out.println(cat instanceof Animal);
        }
        @Test
    public void testInheritanceMammal(){
        Cat cat = new Cat(null,null,null);
            System.out.println(cat instanceof Mammal);
        }

 }

