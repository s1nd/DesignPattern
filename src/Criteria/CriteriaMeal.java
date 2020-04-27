package Criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMeal implements Criteria {
    @Override
    public List<Student> meetCriteria(List<Student> students) {
        List<Student> mealStudent = new ArrayList<Student>();
        for(Student s:students){
            //单词拼写错误，应为male
            if(s.getGender().equalsIgnoreCase("meal")){
                mealStudent.add(s);
            }
        }
        return mealStudent;
    }
}
