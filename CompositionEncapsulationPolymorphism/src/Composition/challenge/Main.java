package Composition.challenge;

public class Main {
    Wall wall1 = new Wall("West");
    Wall wall2 = new Wall("East");
    Wall wall3 = new Wall("South");
    Wall wall4 = new Wall("North");

    Ceiling ceiling = new Ceiling(12, 55);

    Bed bed = new Bed("Modern", 4,3,2,1);

    Lamp lamp = new Lamp("Classic", false, 75);

    Bedroom newRoom = new Bedroom("Rodrigo´s", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

    //newRoom.makeBed();
    //newRoom.getLamp.turnOn();

    //duas formas de acessar métodos
    //1) através de uma função implementada na classe composta que chama uma função pelo seu atributo
    //2) através de um método get.

    
    
    
    
}
