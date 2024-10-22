package org.example;

import org.example.Ecosystems.EcoCRUD;
import org.example.Ecosystems.Ecosystem;
import org.example.animals.Animal;
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

        Herbivore deer = new Herbivore("deer", 100, Arrays.asList(plant0,plant1), 20,15);
        Herbivore cow = new Herbivore("cow", 80,Arrays.asList(plant2,plant3), 20,15);

        List<Plant> plants = Arrays.asList(plant0,plant1,plant2,plant3);

        List<Animal> animals = Arrays.asList(deer,cow);

        Ecosystem ecosystem0 = new Ecosystem("Test", plants, animals,resources,15, 45, 20,78);

        ecosystem0.getStatus();

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
                        Scanner scanResource = new Scanner(System.in);
                        String res = scanResource.nextLine();
                        newR.add(res);
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

                        switch (choice){
                            //создание травы
                            case 1 -> {
                                Plant grass = new Plant("grass", population,Arrays.asList("nitrogen"), 10, 30, 20,60);
                                newP.add(grass);
                                break;
                            }
                            //создание моркови
                            case 2 -> {
                                Plant carrot = new Plant("carrot", population,Arrays.asList("nitrogen","potassium"), 20, 30, 15,40);
                                newP.add(carrot);
                                break;
                            }
                            //создание кукурузы
                            case 3 -> {
                                Plant corn = new Plant("corn", population,Arrays.asList("nitrogen", "sulfur"), 22, 30, 15,55);
                                newP.add(corn);
                                break;
                            }
                            //создание дерева
                            case 4 -> {
                                Plant tree = new Plant("tree", population,Arrays.asList("magnesium"), 15, 30, 20,43);
                                newP.add(tree);
                                break;
                            }
                            //создание ягод
                            case 5 -> {
                                Plant berries = new Plant("berries", population,Arrays.asList("nitrogen"), 16, 30, 20,30);
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

                // Добавление животных в экосистему
                System.out.println("Enter the animal that will be in the ecosystem");
                choiceRes = 0;
                while (choiceRes != 2) {

                    System.out.println("1. Add new animal");
                    System.out.println("2. Don't add and continue");
                    choiceRes = scanner.nextInt();
                    if (choiceRes != 2){

                        Scanner scanAnimal = new Scanner(System.in);

                        System.out.println("Enter the name of the animal");
                        String name = scanAnimal.nextLine();

                        System.out.println("Enter the animal population");
                        int population = scanAnimal.nextInt();

                        System.out.println("Enter animal food");

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