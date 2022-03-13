import com.epam.task2.entity.User;
import com.epam.task2.logic.MyException;
import com.epam.task2.logic.MyPattern;
import com.epam.task2.logic.Util;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.*;

public class App {
    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = Util.input(scanner);
        while (!(MyPattern.CompareName(name))) {
            System.out.println("Please enter your name:");
            name = Util.input(scanner);
        }

        System.out.println("Please enter your age:");
        String age = Util.input(scanner);
        while (!(MyPattern.CompareAge(age))) {
            System.out.println("Please enter your age:");
            age = Util.input(scanner);
        }

        System.out.println("Please enter your phone number - 9 digits:");
        String phoneNumber = Util.input(scanner);
        while (!(MyPattern.ComparePhone(phoneNumber))) {
            System.out.println("Please enter your phone number - 9 digits:");
            phoneNumber = Util.input(scanner);
        }

        User user = new User(name, Integer.parseInt(age), Integer.parseInt(phoneNumber));

//        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
//        Validator validator = validatorFactory.getValidator();
//
//        Set<ConstraintViolation<User>> violations = validator.validate(user);
//        for (ConstraintViolation<User> violation : violations) {
//            System.out.println(violation.getMessage());
//        }

        List list = Arrays.asList(user);
        System.out.println(list.toString());

    }
}
