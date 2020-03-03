package 建造者模式.传统方式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 建造者模式.传统方式 <br>
 *       <b>ClassName:</b> Client <br>
 *       <b>Date:</b> 2020年2月22日 上午11:39:02
 */
public class Client {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
