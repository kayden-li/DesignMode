package 建造者模式.建造者模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 建造者模式.建造者模式 <br>
 *       <b>ClassName:</b> HouseDirector <br>
 *       <b>Date:</b> 2020年2月22日 下午12:16:22
 */
// 指挥者--动态指定建造流程，返回具体产品
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    // 构造器传入houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 通过setter传入houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
