package 建造者模式.传统方式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 建造者模式.传统方式 <br>
 *       <b>ClassName:</b> CommonHouse <br>
 *       <b>Date:</b> 2020年2月22日 上午11:36:34
 */
public class CommonHouse extends AbstractHouse {

    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("给普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("给普通房子封顶");
    }

}
