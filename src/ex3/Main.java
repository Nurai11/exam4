package ex3;

import ex3.enam.AnimalsType;
import ex3.models.Cat;
import ex3.models.Dog;
import ex3.models.Parrot;
import ex3.models.Pet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<AnimalsType, List<Pet> > petMap = new HashMap<>();
        petMap.put(AnimalsType.CAT, Arrays.asList(new Cat("AL")));
        petMap.put(AnimalsType.DOG, Arrays.asList(new Dog("Ash")));
        petMap.put(AnimalsType.PARROT, Arrays.asList(new Parrot("Kyle")));

        System.out.println(petMap);
        System.out.println(petMap.keySet());

    }
}
