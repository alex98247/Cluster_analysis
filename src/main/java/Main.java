import db.*;
import models.Person;
import tools.Generator;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> generate = Generator.generate(10000);
        PersonDao executor = new PersonDaoImpl();
        executor.insert(generate);

    }
}
