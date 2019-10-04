package rocks.zipcodewilmington;

import jdk.nashorn.internal.AssertsEnabled;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    @Test

    public void addCatTest(){
        Cat cat = new Cat(null,null,null);

        CatHouse.add(cat);

        int expected = 0;

        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void addTest(){
        Cat cat = new Cat(null,null,null);
        CatHouse.add(cat);

        int actual = 0;

        int expected = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removeCatTest(){
        Cat cat = new Cat(null,null,null);
        CatHouse.remove(cat);

        int actual = 0;

        int expected = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void idRemoveTest(){
        Cat cat = new Cat(null,null,9);
        CatHouse.remove(cat);
        int actual = 9;

        int expected = cat.getId();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getCatByIdTest(){
        Cat cat = new Cat(null,null,9);
        CatHouse.getCatById(9);
        int actual = 9;
        int expected = cat.getId();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void numberOfCatsTest(){
        Cat cat = new Cat(null,null,null);
        CatHouse.getNumberOfCats();
        int actual = 0;

        int expected = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
}
