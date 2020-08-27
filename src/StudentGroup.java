import java.util.ArrayList;
import java.util.stream.Collectors;

public class StudentGroup {
    private ArrayList<User> users = new ArrayList<>();

    public StudentGroup(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<User> getUsersBySex(Sex sex){
        return users.stream().filter(user -> user.getSex().getName().equals(sex.getName()))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<User> getAll(){
        return users;
    }

    public long getAmountBySex(Sex sex){
        return users.stream().filter(user -> user.getSex().getName().equals(sex.getName()))
                .count();
    }

    public long getAmountByAge(int age){
        return users.stream().filter(user -> user.getAge() == age).count();
    }

    public long getAmountByAgeAndSex(int age, Sex sex){
        return getUsersBySex(sex).stream().filter(user -> user.getAge() == age).count();
    }

    public double getAverageAge(){
        long sum = 0;
        for (var user: users) {
            sum += user.getAge();
        }

        return users.size() / (sum * 1.0);
    }

    public double getAverageAgeBySex(Sex sex){
        var collection = getUsersBySex(sex);

        long sum = 0;
        for (var user: collection) {
            sum += user.getAge();
        }

        return collection.size() / (sum * 1.0);
    }

}
