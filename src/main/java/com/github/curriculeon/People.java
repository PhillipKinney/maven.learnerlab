package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

public class People {
    List<Person> personList;

    public People(){
        this(new ArrayList<>());
    }

    public People(List<Person> personList){
        this.personList = personList;
    }
     public void add(Person person){
        this.personList.add(person);
     }

     public Person findById(Long id) {
         for (int i = 0; i < personList.size(); i++) {
             Person person = personList.get(i);
             if (person.getId() == id) {
                 return person;
             } else {
                 continue;
             }
         }
         return null;
     }

  public void remove(Person someSpecifiedPerson){
      personList.remove(someSpecifiedPerson);
  }
  public void removeAll(){
      personList.clear();
  }
  public int count(){
      return personList.size();
  }
  public Person[] toArray(){
      int arrayLength = personList.size();
      Person[] newArray = new Person[arrayLength];
      return personList.toArray(newArray);
  }
}
