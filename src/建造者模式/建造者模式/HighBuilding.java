package 建造者模式.建造者模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 建造者模式.建造者模式 <br>
 *       <b>ClassName:</b> HighBuilding <br>
 *       <b>Date:</b> 2020年2月22日 下午12:14:34
 */
public class HighBuilding extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("高楼地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼屋顶");
    }

}
