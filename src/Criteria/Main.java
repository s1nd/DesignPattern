package Criteria;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static  void main(String[] args){
        Student xiaoHong = new Student("xiaoHong",17, "femeal");
        Student xiaoMin = new Student("xiaoMin",18, "meal");
        Student xiaoQiang = new Student("xiaoQiang",17, "meal");
        List<Student> xiaos = new ArrayList<Student>();
        xiaos.add(xiaoHong);
        xiaos.add(xiaoQiang);
        xiaos.add(xiaoMin);


        //静态方法在接口中要有body,Criteria\.一次性删除错误的生成代码
        CriteriaMeal criteriaMeal = new CriteriaMeal();
        CriteriaUnderage criteriaUnderage = new CriteriaUnderage();
        AndCriteria andCriteria = new AndCriteria(criteriaMeal,criteriaUnderage);
        OrCriteria OrCriteria = new OrCriteria(criteriaMeal,criteriaUnderage);

        //筛选
        System.out.println("underage and meal:");
        show(andCriteria.meetCriteria(xiaos));

        System.out.println();
        System.out.println("underage or meal:");
        show(OrCriteria.meetCriteria(xiaos));

    }
    public static void show(List<Student> students){
        for(Student s:students){
            System.out.println(s.getName()+";"+s.getAge()+";"+s.getGender());
        }
    }
}
