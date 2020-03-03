package 建造者模式.建造者模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 建造者模式.建造者模式 <br>
 *       <b>ClassName:</b> Client <br>
 *       <b>Date:</b> 2020年2月22日 下午12:32:57
 */
public class Client {

    public static void main(String[] args) {
        // 盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        // 准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        // 完成建造，返回产品
        House house = houseDirector.constructHouse();

        System.out.println("-----------");

        // 盖普通房子
        HighBuilding highBuilding = new HighBuilding();
        // 准备创建房子的指挥者
        houseDirector.setHouseBuilder(highBuilding);

        // 完成建造，返回产品
        house = houseDirector.constructHouse();
    }
}
