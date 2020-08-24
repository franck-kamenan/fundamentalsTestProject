package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ForestNoteBook
{
    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private int plantCount;
    private int animalCount;
    private List<Plant> plants;
    private List<Animal> animals;

    public List<Carnivore> getCarnivores()
    {
        return carnivores;
    }
    public void setCarnivores(List<Carnivore> carnivores)
    {
        this.carnivores = carnivores;
    }
    public List<Omnivore> getOmnivores()
    {
        return omnivores;
    }
    public void setOmnivores(List<Omnivore> omnivores)
    {
        this.omnivores = omnivores;
    }
    public List<Herbivore> getHerbivores()
    {
        return herbivores;
    }
    public void setHerbivores(List<Herbivore> herbivores)
    {
        this.herbivores = herbivores;
    }
    public int getPlantCount()
    {
        return plantCount;
    }
    public int getAnimalCount()
    {
        return animalCount;
    }
    //public void addPlant(Plant plant)
    //public void addAnimal(Animal animal)
    /*public void printNotebook(HashSet<String> ongesorteerdeTePrinten)
    {
        System.out.println(ongesorteerdeTePrinten);
    }*/
    public void printNotebook(ArrayList<String> TePrinten)
    {
        System.out.println(TePrinten);
    }
    public void sortAllPlantsByName(ArrayList<String> plantsByName)
    {
        Collections.sort(plantsByName);
        System.out.println(plantsByName);
    }
    public void sortAllAnimalsByName(ArrayList<String> animalsByName)
    {
        Collections.sort(animalsByName);
        System.out.println(animalsByName);
    }
    //public void printHeavyAnimalsCount()
    //public void printTallAnimals()
}
