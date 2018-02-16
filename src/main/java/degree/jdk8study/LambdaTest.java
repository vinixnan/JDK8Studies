package degree.jdk8study;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Random;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author vinicius
 */
public class LambdaTest {

    private @Getter
    @Setter
    ArrayList<Student> students;

    public LambdaTest() {
        students = new ArrayList<>();
    }
    
    public void generateData(int qtd){
        Faker faker = new Faker();
        Random rdn=new Random();
        for (int i = 0; i < qtd; i++) {
            Student std=new Student();
            std.setName(faker.rickAndMorty().character());
            std.setScore(rdn.nextDouble()*10.0);
            std.setScore(1990+rdn.nextInt(28));
            students.add(std);
        }
    }
    
    public void findBest(int year){
        double highest=0;
        //students.fi
    }

    public static void main(String[] args) {
        LambdaTest lb=new LambdaTest();
        lb.generateData(100);
        lb.findBest(2011);
    }
}
