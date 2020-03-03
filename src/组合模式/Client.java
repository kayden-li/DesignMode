package 组合模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 组合模式 <br>
 *       <b>ClassName:</b> Client <br>
 *       <b>Date:</b> 2020年2月27日 下午12:55:36
 */
public class Client {

    public static void main(String[] args) {
        // 从大到小创建
        OrganizationComponent college = new University("太原工业学院", "山西省太原市尖草坪区");

        // 创建系
        OrganizationComponent department1 = new College("计算机系", "计算机系");
        OrganizationComponent department2 = new College("化学与化工系", "化学与化工系");

        // 创建各个专业
        department1.add(new Department("软件工程", "软件工程"));
        department1.add(new Department("网络工程", "网络工程"));
        department1.add(new Department("计算机科学与技术", "计算机科学与技术"));

        department2.add(new Department("材料", "材料"));
        department2.add(new Department("化学", "化学"));

        // 系加入学院
        college.add(department1);
        college.add(department2);

        college.print();
    }
}
