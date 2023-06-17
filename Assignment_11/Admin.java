package prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key,Student> hashMap = new HashMap<>();
		for (Student student :
			 students) {
			Key key = new Key(student.getFirstName(),student.getLastName());
			hashMap.put(key, student);
			//to be continued
		}
		return hashMap;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
		double sum = 0.0;
		int count = 0;

		for (Student student : maps.values()) {
			sum += student.getGpa();
			count++;
		}

		if (count > 0) {
			return sum / count;
		} else {
			return 0.0; // Return 0.0 if there are no students in the map
		}
	}
}
