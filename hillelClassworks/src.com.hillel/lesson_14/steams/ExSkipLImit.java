package lesson_14.steams;



import java.util.List;
import java.util.stream.Collectors;
import lesson_14.streamExample.businessObject.User;
import lesson_14.streamExample.businessObject.enumerators.Sex;
import lesson_14.streamExample.businessObject.service.UserService;

public class ExSkipLImit {
    public static void main(String[] args) {
        List<User> users = UserService.getUserList();
        users.forEach(User::print);

        System.out.println("---------");
        List<String> userFullName =
                users
                        .stream()
                        .skip(3)
                        .limit(10)
                        .filter(u -> u.getSex().equals(Sex.FEMALE))
                        .skip(3)
                        .peek(u-> u.setFullName(u.getFirstName() + " " + u.getLastName()))
                        .map(User::getFullName)
                        .collect(Collectors.toList());

        userFullName.forEach(System.out::println);
    }
}
