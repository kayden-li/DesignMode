package 建造者模式.建造者模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 建造者模式.建造者模式 <br>
 *       <b>ClassName:</b> HouseBuilder <br>
 *       <b>Date:</b> 2020年2月22日 下午12:10:07
 */
// -->抽象建造者
public abstract class HouseBuilder {

    protected House house = new House();

    // 抽象的建造流程方法
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    // 建造好后，将产品返回
    public House buildHouse() {
        return house;
    }
}
