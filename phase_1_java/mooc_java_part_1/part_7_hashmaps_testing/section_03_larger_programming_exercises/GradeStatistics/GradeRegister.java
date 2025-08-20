import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        }
    }

    public double averageGrade() {
        if (grades.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public double passingGrade() {
        int sum = 0;
        int count = 0;

        for (int grade : grades) {
            if (grade >= 50) {
                sum += grade;
                count++;
            }
        }

        return count > 0 ? (double) sum / count : 0;
    }

    public double passPercentage() {
        if (grades.isEmpty()) {
            return 0;
        }

        int count = 0;

        for (int grade : grades) {
            if (grade >= 50) {
                count++;
            }
        }

        return 100.0 * count / grades.size();
     }

     public void gradeDistribution() {
        int[] gradeCounter = new int[6];

         for (int grade : grades) {
             if (grade < 50) {
                 gradeCounter[0]++;
             } else if (grade < 60) {
                 gradeCounter[1]++;
             } else if (grade < 70) {
                 gradeCounter[2]++;
             } else if (grade < 80) {
                 gradeCounter[3]++;
             } else if (grade < 90) {
                 gradeCounter[4]++;
             } else {
                 gradeCounter[5]++;
             }
         }

         for (int i = 5; i >= 0; i--) {
             System.out.print(i + ": ");
             for (int j = 0; j < gradeCounter[i]; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
     }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }
}
