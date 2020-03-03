package 原型模式.浅拷贝;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 原型模式.传统方式.improve <br>
 *       <b>ClassName:</b> Client <br>
 *       <b>Date:</b> 2020年2月21日 下午12:55:42
 */
public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("Tom", 1, "白色");
        sheep.friend = new Sheep("jack", 2, "黑色");
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();

        System.out.println("sheep2:" + sheep2 + "    " + sheep2.friend.hashCode());
        System.out.println("sheep3:" + sheep3 + "    " + sheep3.friend.hashCode());
        System.out.println("sheep4:" + sheep4 + "    " + sheep4.friend.hashCode());
        System.out.println("sheep5:" + sheep5 + "    " + sheep5.friend.hashCode());
    }
}
