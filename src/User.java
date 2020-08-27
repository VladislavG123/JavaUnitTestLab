public class User {
    private int id;
    private String name;
    private int age;
    private Sex sex;

    public User(int id, String name, int age, Sex sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}

/*
* Создать такие методы как:
- создание списка всех пользователей
- создание списка пользователей по полу
- создать метод который возвращает пользователей в общем списке,
и посчитать количество по половому признаку
- Посчитать общую сумму по возрасту пользователей, так же учесть
по признаку пола
- Посчитать средний возраст, как общий так и по признаку пола.
*/