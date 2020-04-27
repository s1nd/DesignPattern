package Criteria;

import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria1;
    private Criteria criteria2;

    public OrCriteria(Criteria criteria1,Criteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Student> meetCriteria(List<Student> students) {
        List<Student> students1 = criteria1.meetCriteria(students);
        List<Student> students2 = criteria2.meetCriteria(students);


        //并行修改错误
//        for(Student s:students1){
//            if(!students2.contains(s)){
//                students1.add(s);
//            }
//
//        }

        //在students1中加如属于students2但不属于students1的部分
        for(Student s:students2){
            if(!students1.contains(s)){
                students1.add(s);
            }

        }
        return students1;
    }
}
