public  class Main {
    public static void main(String[] args) {
        Person man = new Person("Борис", 20);
        Person man1 = new Person();
        man.talk();
        man1.move();
    }
}

//    Создать класс Person, который содержит:
//
//        переменные fullName, age;
//        методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
//        Добавьте два конструктора  - Person() и Person(fullName, age).
//        Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой
//        - Person(fullName, age).