package 建造者模式.建造者模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 建造者模式.建造者模式 <br>
 *       <b>ClassName:</b> CommonHouse <br>
 *       <b>Date:</b> 2020年2月22日 下午12:13:01
 */
public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("普通房子地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子屋顶");
    }

}
