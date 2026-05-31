package StudentGradeManager;

import java.util.TreeMap;
import java.util.Map;

public class StudentGradeManager {
    public static void main(String[] args) {
        TreeMap<String, Double> studentGrades = new TreeMap<>();

        //1. Adding students and their grades
        studentGrades.put("SV001", 85.5);
        studentGrades.put("SV002", 92.0);
        studentGrades.put("SV003", 78.2);
        studentGrades.put("SV004", 88.0);
        
        //2. Displaying all students and their grades
        System.out.println("All Students and their Grades:");
        for (Map.Entry<String, Double> entry: studentGrades.entrySet()){
            System.out.println("Grades of " + entry.getKey() + ": " +entry.getValue());
        }
         //3. Retrievng a specific student's grade
         String studentId = "SV002";
         Double grade = studentGrades.get(studentId);
         System.out.println("Search result of " + studentId + ": " + (grade != null ? grade : "not found"));

        //4. maximum and minimum grades
        Double maxGrade = Double.MIN_VALUE;
        Double minGrade = Double.MAX_VALUE;
        for(Double value : studentGrades.values()){
            if (value > maxGrade) 
                maxGrade = value;
            if (value < minGrade)
                minGrade = value;
        }
        System.out.println("maximum grade:" + maxGrade);
        System.out.println("minimum grade:" + minGrade);
        
        // 5. update a student's grade
       String updateStringId = "SV003";
       Double newGrade = 90.0;
       if (studentGrades.containsKey(updateStringId)) {
            studentGrades.put(updateStringId, newGrade);
            System.out.println("Updated grade for " + updateStringId + ": " + newGrade); 
            }
        
        //6. Deleting a student
        String deleteStringId = "SV003";
        if (studentGrades.containsKey((deleteStringId))) {
            studentGrades.remove(deleteStringId);
            System.out.println("Deleted student " + deleteStringId);
        }

        System.out.println("Updated list of students and their grades:");
        for (Map.Entry<String, Double> entry: studentGrades.entrySet()){
            System.out.println("Grades of " + entry.getKey() + ": " +entry.getValue());
        }
        // 7. Dispplay students have grade above
        Double threshold = 80.0;
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            if(entry.getValue() >  threshold) {
                System.out.println( "Student " + entry.getKey() + " has a grade above " + threshold + ": " + entry.getValue());
            }
        }
    }
}
