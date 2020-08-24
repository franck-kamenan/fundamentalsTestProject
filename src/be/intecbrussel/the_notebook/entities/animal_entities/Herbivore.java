package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.Set;

public class Herbivore  extends Animal
{
    private Set<Plant> plantDiet;

    public Herbivore(String name)
    {
        super(name);
    }
    public Herbivore(String name, double weight, double height, double length)
    {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet()
    {
        return plantDiet;
    }
    public void setPlantDiet(Set<Plant> plantDiet)
    {
        this.plantDiet = plantDiet;
    }

    //operation()
}
