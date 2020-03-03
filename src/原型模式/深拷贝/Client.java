package 原型模式.深拷贝;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 原型模式.传统方式.deepclone <br>
 *       <b>ClassName:</b> Client <br>
 *       <b>Date:</b> 2020年2月21日 下午1:30:21
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.name = "csvd";
        deepPrototype.deepCloneableTarget = new DeepCloneableTarget("dads", "sadf");

        // 方式一进行深拷贝
        // DeepPrototype deepPrototype2 = (DeepPrototype) deepPrototype.clone();
        //
        // System.out.println("p.name:" + deepPrototype.name + "hashcode" +
        // deepPrototype.hashCode());
        // System.out.println("p.name:" + deepPrototype2.name + "hashcode" +
        // deepPrototype2.hashCode());

        // 方式二进行深拷贝
        DeepPrototype deepPrototype2 = (DeepPrototype) deepPrototype.deepClone();

        System.out.println("p.name:" + deepPrototype.name + "hashcode" + deepPrototype.hashCode());
        System.out.println("p.name:" + deepPrototype2.name + "hashcode" + deepPrototype2.hashCode());

    }

}
