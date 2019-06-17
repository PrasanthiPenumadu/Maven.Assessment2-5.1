package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<_> {
    List<Object> al=new ArrayList<Object>();
    public Shelter() {

        throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
   List<Integer> list=new ArrayList<>();

    public int size() {

      return al.size();

    }

    public void add(Object object) {
        al.add(object);
    }

    public Boolean contains(Object object) {
        return null;
    }

    public void remove(Object object) {
        al.remove(object);
    }

    public Object get(Integer index) {
        return null;
    }

    public Integer getIndexOf(Object ageable) {
        return 0;
    }
}