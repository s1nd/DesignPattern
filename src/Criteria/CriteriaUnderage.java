package Criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaUnderage implements Criteria {
    @Override
    public List<Student> meetCriteria(List<Student> students) {
        List<Student> UnderageStudent = new ArrayList<Student>();
        for(Student s:students){
            if(s.getAge()<18){
                UnderageStudent.add(s);
            }
        }
        return UnderageStudent;
    }
}
