package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Bush;
import be.intecbrussel.the_notebook.entities.plant_entities.Flower;
import be.intecbrussel.the_notebook.entities.plant_entities.Tree;
import be.intecbrussel.the_notebook.entities.plant_entities.Weed;
import be.intecbrussel.the_notebook.service.ForestNoteBook;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class NatureApp
{
    public static void main(String[] args)
    {
        ForestNoteBook myForestNoteBook = new ForestNoteBook();

        Tree myTree = new Tree("MyTreeName");
        Tree myOtherTree = new Tree("MyOtherTreeName");
        Flower myFlower = new Flower("MyFlowerName");
        Weed myWeed = new Weed("MyWeedName");
        Bush myBush = new Bush("MyBushName");

        Herbivore myHerbivore = new Herbivore("MyHerbivoreName");
        Herbivore myOtherHerbivore = new Herbivore("MyOtherHerbivoreName");
        Herbivore myThirdHerbivore = new Herbivore("MyThirdHerbivoreName");
        Carnivore myCarnivore = new Carnivore("MyCarnivoreName");
        Carnivore myOtherCarnivore = new Carnivore("MyOtherCarnivoreName");
        Carnivore myThirdCarnivore = new Carnivore("MyThirdCarnivoreName");
        Omnivore myOmnivore = new Omnivore("MyOmnivoreName");
        Omnivore myOtherOmnivore = new Omnivore("MyOtherOmnivoreName");
        Omnivore myThirdOmnivore = new Omnivore("MyThirdOmnivoreName");

        ArrayList<String> tegenGekomen = new ArrayList<>();
        tegenGekomen.add(myTree.getName());
        tegenGekomen.add(myOtherTree.getName());
        tegenGekomen.add(myFlower.getName());
        tegenGekomen.add(myWeed.getName());
        tegenGekomen.add(myBush.getName());
        tegenGekomen.add(myHerbivore.getName());
        tegenGekomen.add(myOtherHerbivore.getName());
        tegenGekomen.add(myThirdHerbivore.getName());
        tegenGekomen.add(myCarnivore.getName());
        tegenGekomen.add(myOtherCarnivore.getName());
        tegenGekomen.add(myThirdCarnivore.getName());
        tegenGekomen.add(myOmnivore.getName());
        tegenGekomen.add(myOtherOmnivore.getName());
        tegenGekomen.add(myThirdOmnivore.getName());
        System.out.println(tegenGekomen);
        myForestNoteBook.printNotebook(tegenGekomen);

        /*HashSet<String> ongesorteerde = new HashSet<>();
        ongesorteerde.add(myTree.getName());
        ongesorteerde.add(myOtherTree.getName());
        ongesorteerde.add(myFlower.getName());
        ongesorteerde.add(myWeed.getName());
        ongesorteerde.add(myBush.getName());
        ongesorteerde.add(myHerbivore.getName());
        ongesorteerde.add(myOtherHerbivore.getName());
        ongesorteerde.add(myThirdHerbivore.getName());
        ongesorteerde.add(myCarnivore.getName());
        ongesorteerde.add(myOtherCarnivore.getName());
        ongesorteerde.add(myThirdCarnivore.getName());
        ongesorteerde.add(myOmnivore.getName());
        ongesorteerde.add(myOtherOmnivore.getName());
        ongesorteerde.add(myThirdOmnivore.getName());*/

        ArrayList<String> afzonderlijkHerbivore = new ArrayList<>();
        afzonderlijkHerbivore.add(myHerbivore.getName());
        afzonderlijkHerbivore.add(myOtherHerbivore.getName());
        afzonderlijkHerbivore.add(myThirdHerbivore.getName());
        myForestNoteBook.printNotebook(afzonderlijkHerbivore);

        ArrayList<String> afzonderlijkCarnivore = new ArrayList<>();
        afzonderlijkCarnivore.add(myCarnivore.getName());
        afzonderlijkCarnivore.add(myOtherCarnivore.getName());
        afzonderlijkCarnivore.add(myThirdCarnivore.getName());
        myForestNoteBook.printNotebook(afzonderlijkCarnivore);

        ArrayList<String> afzonderlijkOmnivore = new ArrayList<>();
        afzonderlijkOmnivore.add(myOmnivore.getName());
        afzonderlijkOmnivore.add(myOtherOmnivore.getName());
        afzonderlijkOmnivore.add(myThirdOmnivore.getName());
        myForestNoteBook.printNotebook(afzonderlijkOmnivore);

        ArrayList<String> allPlants = new ArrayList<>();
        allPlants.add(myTree.getName());
        allPlants.add(myOtherTree.getName());
        allPlants.add(myFlower.getName());
        allPlants.add(myWeed.getName());
        allPlants.add(myBush.getName());
        myForestNoteBook.sortAllPlantsByName(allPlants);

        ArrayList<String> allAnimals = new ArrayList<>();
        allAnimals.add(myHerbivore.getName());
        allAnimals.add(myOtherHerbivore.getName());
        allAnimals.add(myThirdHerbivore.getName());
        allAnimals.add(myCarnivore.getName());
        allAnimals.add(myOtherCarnivore.getName());
        allAnimals.add(myThirdCarnivore.getName());
        allAnimals.add(myOmnivore.getName());
        allAnimals.add(myOtherOmnivore.getName());
        allAnimals.add(myThirdOmnivore.getName());
        myForestNoteBook.sortAllAnimalsByName(allAnimals);

        myForestNoteBook.printNotebook(allPlants);
        myForestNoteBook.printNotebook(allAnimals);
    }
}
