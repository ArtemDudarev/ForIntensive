package org.example;

import org.example.Ecosystems.EcoCRUD;
import org.example.Ecosystems.Ecosystem;
import org.example.animals.Animal;
import org.example.animals.Carnivore;
import org.example.animals.Herbivore;
import org.example.plants.Plant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Plant plant0 = new Plant("grass",1500,Arrays.asList("rock"), 15,50,15,70);
        Plant plant1 = new Plant("grass1",1500,Arrays.asList("rock","aaa"), 15,50,15,70);
        Plant plant2 = new Plant("grass2",1500,Arrays.asList("rock"), 15,50,15,70);
        Plant plant3 = new Plant("grass3",1500,Arrays.asList("rock","ddd"), 15,50,15,70);

        List<String> resources = Arrays.asList("aaa", "ddd","rock");

        Herbivore deer0 = new Herbivore("deer", 100, Arrays.asList(plant0,plant1), 20,15);
        Herbivore cow = new Herbivore("cow", 80,Arrays.asList(plant2,plant3), 20,15);

        List<Plant> plants = Arrays.asList(plant0,plant1,plant2,plant3);

        List<Animal> animals = Arrays.asList(deer0,cow);

        Ecosystem ecosystem0 = new Ecosystem("Test", plants, animals,resources,15, 45, 20,78);

        ecosystem0.getStatus();


        // Создание всех растений и животных
        Plant grass = new Plant("grass", 0,Arrays.asList("nitrogen"), 10, 30, 20,60);
        Plant carrot = new Plant("carrot", 0,Arrays.asList("nitrogen","potassium"), 20, 30, 15,40);
        Plant corn = new Plant("corn", 0,Arrays.asList("nitrogen", "sulfur"), 22, 30, 15,55);
        Plant tree = new Plant("tree", 0,Arrays.asList("magnesium"), 15, 30, 20,43);
        Plant berries = new Plant("berries", 0,Arrays.asList("nitrogen"), 16, 30, 20,30);

        Animal grasshopper = new Herbivore("grasshopper",0, Arrays.asList(grass),23,20);
        Animal rabbit = new Herbivore("rabbit",0, Arrays.asList(carrot),21,28);
        Animal mouse = new Herbivore("mouse",0, Arrays.asList(carrot,corn),23,20);
        Animal worm = new Herbivore("worm",0, Arrays.asList(grass,carrot,corn,tree),25,40);
        Animal lizard = new Herbivore("lizard",0, Arrays.asList(grass,berries),25,40);
        Animal deer = new Herbivore("deer",0, Arrays.asList(grass,berries),15,20);
        Animal elk = new Herbivore("elk",0, Arrays.asList(grass,tree),15,20);

        Animal lynx = new Carnivore("lynx", 0, Arrays.asList(rabbit, deer),15,20);
        Animal fox = new Carnivore("fox", 0, Arrays.asList(rabbit,mouse),15,20);
        Animal wolf = new Carnivore("wolf", 0, Arrays.asList(rabbit,deer,elk),15,20);
        Animal bear = new Carnivore("bear", 0, Arrays.asList(deer,elk),15,20);
        Animal frog = new Carnivore("frog", 0, Arrays.asList(grasshopper,worm),15,20);
        Animal snake = new Carnivore("snake", 0, Arrays.asList(mouse,lizard,frog),15,20);
        Animal owl = new Carnivore("owl", 0, Arrays.asList(rabbit,mouse,lizard,snake),15,20);

        // Создание меню
        System.out.println(" ===============Menu===============");
        System.out.println("|                                  |");
        System.out.println("| Enter menu number                |");
        System.out.println("|1. Create new ecosystem           |");
        System.out.println("|2. Upload ecosystem               |");
        System.out.println("|3. Quit                           |");
        System.out.println("|                                  |");
        System.out.println(" ==================================");

        Scanner scanner = new Scanner(System.in);
        int firstChoice = scanner.nextInt();

        switch (firstChoice) {
            case 1 -> {
                List<Plant> newP = new ArrayList<>();
                List<Animal> newA = new ArrayList<>();
                List<String> newR = new ArrayList<>();

                // Добавление ресурсов в экосистему
                System.out.println("Enter the resources that will be in the ecosystem");
                int choiceRes = 0;
                while (choiceRes != 2) {

                    System.out.println("1. Add new resource");
                    System.out.println("2. Don't add and continue");
                    choiceRes = scanner.nextInt();
                    if (choiceRes != 2){
                        System.out.println("Please, select resource");
                        System.out.println("1. nitrogen");
                        System.out.println("2. potassium");
                        System.out.println("3. sulfur");
                        System.out.println("4. magnesium");
                        System.out.println("5. phosphorus");

                        Scanner scanResource = new Scanner(System.in);
                        int res = scanResource.nextInt();
                        switch (res){
                            case 1 -> newR.add("nitrogen");
                            case 2 -> newR.add("potassium");
                            case 3 -> newR.add("sulfur");
                            case 4 -> newR.add("magnesium");
                            case 5 -> newR.add("phosphorus");
                        }
                    }
                }

                // Добавление растений в экосистему
                System.out.println("Enter the plant that will be in the ecosystem");
                choiceRes = 0;
                while (choiceRes != 2) {

                    System.out.println("1. Add new plant");
                    System.out.println("2. Don't add and continue");
                    choiceRes = scanner.nextInt();
                    if (choiceRes != 2){

                        Scanner scanPlant = new Scanner(System.in);

                        System.out.println("Select the plant you want to add");
                        System.out.println("1. grass");
                        System.out.println("2. carrot");
                        System.out.println("3. corn");
                        System.out.println("4. tree");
                        System.out.println("5. berries");

                        int choice = scanPlant.nextInt();

//                        System.out.println("Enter the name of the plant");
//                        String name = scanPlant.nextLine();

                        System.out.println("Enter plant population");
                        int population = scanPlant.nextInt();

                        // Пользователь выбирает растение и указывает популящию.
                        // У растения меняется популяция на ту, которую указал пользователь.
                        // И растение добавляется в коллекцию, которая потом попадёт в экосистему.
                        switch (choice){
                            //создание травы
                            case 1 -> {
                                //Plant grass = new Plant("grass", population,Arrays.asList("nitrogen"), 10, 30, 20,60);
                                grass.setPopulation(population);
                                newP.add(grass);
                                break;
                            }
                            //создание моркови
                            case 2 -> {
                                //Plant carrot = new Plant("carrot", population,Arrays.asList("nitrogen","potassium"), 20, 30, 15,40);
                                carrot.setPopulation(population);
                                newP.add(carrot);
                                break;
                            }
                            //создание кукурузы
                            case 3 -> {
                                //Plant corn = new Plant("corn", population,Arrays.asList("nitrogen", "sulfur"), 22, 30, 15,55);
                                corn.setPopulation(population);
                                newP.add(corn);
                                break;
                            }
                            //создание дерева
                            case 4 -> {
                                //Plant tree = new Plant("tree", population,Arrays.asList("magnesium"), 15, 30, 20,43);
                                tree.setPopulation(population);
                                newP.add(tree);
                                break;
                            }
                            //создание ягод
                            case 5 -> {
                                //Plant berries = new Plant("berries", population,Arrays.asList("nitrogen"), 16, 30, 20,30);
                                berries.setPopulation(population);
                                newP.add(berries);
                                break;
                            }
                            default -> System.out.println("Please, enter correct value");

                        }

//                        System.out.println("Enter the food for plant");
//                        scanPlant.nextLine();
//                        String food = scanPlant.nextLine();
//
//                        System.out.println("Enter the optimal temperature for plant");
//                        double optimalTemp = scanPlant.nextDouble();
//
//                        System.out.println("Enter the optimal humidity for plant");
//                        double optimalHumidity = scanPlant.nextDouble();
//
//                        System.out.println("Enter the optimal water for plant");
//                        double optimalWater = scanPlant.nextDouble();
//
//                        System.out.println("Enter the optimal light for plant");
//                        double optimalLight = scanPlant.nextDouble();

                        //newP.add(new Plant(name,population,food,optimalTemp,optimalHumidity,optimalWater,optimalLight));

                    }
                }

                // Пользователь выбирает животное и указывает популящию.
                // У животных меняется популяция на ту, которую указал пользователь.
                // И животное добавляется в коллекцию, которая потом попадёт в экосистему.
                System.out.println("Enter the animal that will be in the ecosystem");
                choiceRes = 0;
                while (choiceRes != 2) {

                    System.out.println("1. Add new animal");
                    System.out.println("2. Don't add and continue");
                    choiceRes = scanner.nextInt();
                    if (choiceRes != 2){

                        System.out.println("Select the animal you want to add");

                        List<String> h = Arrays.asList("===Herbivore===", "1. grasshopper", "2. rabbit", "3. mouse", "4. worm", "5. lizard", "6. deer", "7. elk");
                        List<String> c = Arrays.asList("===Carnivore===", "8. lynx", "9. fox", "10. wolf", "11. bear", "12. frog", "13. snake", "14. owl");

                        int maxLength = Math.max(h.size(), c.size());

                        for (int i = 0; i < maxLength; i++) {
                            if (i < h.size()) {
                                System.out.printf("%-20s", h.get(i));
                            } else {
                                System.out.printf("%-20s", "");
                            }

                            if (i < c.size()) {
                                System.out.printf("%s%n", c.get(i));
                            } else {
                                System.out.printf("%n");
                            }
                        }

                        Scanner scanAnimal = new Scanner(System.in);

                        int choice = scanAnimal.nextInt();

                        switch (choice){
                            case 1 -> newA.add();
                            break;
                        }

                    }
                }

                // Добавление темепратуры экосистемы
                System.out.println("Enter the ecosystem temperature");
                Scanner scanEcoValue = new Scanner(System.in);
                double temp = scanEcoValue.nextDouble();

                // Добавление влажности экосистемы
                System.out.println("Enter the ecosystem humidity");
                double humidity = scanEcoValue.nextDouble();

                // Добавление воды экосистемы
                System.out.println("Enter the ecosystem water");
                double water = scanEcoValue.nextDouble();

                // Добавление солнечного света экосистемы
                System.out.println("Enter the ecosystem light");
                double light = scanEcoValue.nextDouble();

                Ecosystem  ecosystem = new Ecosystem("A",newP,newA,newR,temp,humidity,water,light);
                EcoCRUD.saveEco(ecosystem);

                break;
            }
            case 2 -> {
                // Реализовать поиск и выведение всех экосистем
                // Далее выбор необходимой и её изменения или удаления
                EcoCRUD.findEcoByName("Some");
                break;
            }
            case 3 -> {
                System.exit(0);
                break;
            }
            default -> {
                System.out.println("Please, enter correct value");

            }
        }


    }
}