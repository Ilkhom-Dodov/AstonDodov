package Task1;

public class Lesson_5 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Кузя");
        Cat cat2 = new Cat("Кнопка");
        Cat cat3 = new Cat("Барсик");
        Cat cat4 = new Cat("Айми");
        Cat cat5 = new Cat("Пушистик");
        Dog dog1 = new Dog("Пиксель");
        Dog dog2 = new Dog("Тамерлан");

        cat1.run(150); // Проверяем бег кота на расстояние до предельного
        cat1.run(60); // Проверяем что кот не сможет пробежать больше 200 метров

        cat2.swim(1); // Проверяем что кот не сможет плыть

        dog1.run(450); // Проверяем бег собаки на расстояние до предельного
        dog1.run(100); // Проверяем что собака не сможет пробежать больше 500 метров

        dog2.swim(10); // Проверяем навык плавания собаки на предельное расстояние
        dog2.swim(1); // Проверям что собака не сможет проплыть больше 10 метров

        Bowl.addFood(20); // Добавляем еду в миску

        cat1.eatFromBowl(10); // Проверяем, что кот поел и стал сытым
        cat2.eatFromBowl(20); // Проверяем, что второй кот не притронулся к еде, так как в ней недостаточно еды

        System.out.println("\n" + Bowl.getValue()); // Проверяем, что после подхода второго кота в миске осталось 10 еды

        Bowl.addFood(90); // Снова наполняем миску

        Cat[] cats = new Cat[5]; // Создаем и наполняем массив котов
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;
        cats[3] = cat4;
        cats[4] = cat5;

        getNumberOfAnimalsCatsAndDogs(); // Вызываем в консоль количество кошек, собак и животных в общем

        feedArrayOfCats(cats); // Кормим массив котов
    }

    private static void getNumberOfAnimalsCatsAndDogs() {
        System.out.println("Общее количество животных - " + Animal.getNumberOfAnimals());
        System.out.println("Количество котов/кошек - " + Cat.getNumberOfCats());
        System.out.println("Количество собак - " + Dog.getNumberOfDogs());
    }

    private static void feedArrayOfCats(Cat[] array) {
        for (Cat cat : array) {
            cat.eatFromBowl(30);
            if (!cat.askIfCatIsFull()) {
                System.out.print(", " + cat.getName() + " остался голоден \n");
            }
        }
    }

}
