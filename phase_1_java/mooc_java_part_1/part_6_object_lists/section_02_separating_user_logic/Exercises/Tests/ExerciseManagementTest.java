import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExerciseManagementTest {

    @Test
    public void exerciseListEmptyAtBeginning() {
        ExerciseManagement management = new ExerciseManagement();
        assertEquals(0, management.exerciseList().size());
        System.out.println("Exercise list is empty");
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        var management = new ExerciseManagement();
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
        System.out.println("Exercise list has 1 exercise");
    }
}
