package 原型模式.传统方式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 原型模式.传统方式 <br>
 *       <b>ClassName:</b> Client <br>
 *       <b>Date:</b> 2020年2月21日 上午11:49:19
 */
public class Client {

    Sheep sheep = new Sheep("Tom", 1, "白色");

    Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
    Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
    Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
    Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

}
