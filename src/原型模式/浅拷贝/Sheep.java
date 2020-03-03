package 原型模式.浅拷贝;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 原型模式.传统方式 <br>
 *       <b>ClassName:</b> Sheep <br>
 *       <b>Date:</b> 2020年2月21日 上午11:47:42
 */
public class Sheep implements Cloneable {
    private String name;
    private int age;
    public Sheep friend;// 对象属性
    private String color;

    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep [name=" + name + ", age=" + age + ", color=" + color + "]";
    }

    // 克隆该实例，使用默认的clone方法来完成
    @Override
    protected Object clone() {

        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
