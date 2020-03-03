package 原型模式.深拷贝;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 原型模式.传统方式.deepclone <br>
 *       <b>ClassName:</b> DeepPrototype <br>
 *       <b>Date:</b> 2020年2月21日 下午1:23:26
 */
public class DeepPrototype implements Serializable, Cloneable {

    public String name;// String 属性
    public DeepCloneableTarget deepCloneableTarget;// 引用类型

    public DeepPrototype() {
        super();
    }

    // 完成深拷贝 - 方式1 使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 完成对基本数据类型和String的克隆
        deep = super.clone();
        // 对引用类型的属性进行单独处理
        DeepPrototype deepPrototype = (DeepPrototype) deep;
        deepPrototype.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepPrototype;
    }

    // 完成深拷贝 - 方式2 通过对象序列化实现深拷贝
    public Object deepClone() {
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {

            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);// 将当前对象以对象流的方式输出

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype copy = (DeepPrototype) ois.readObject();

            return copy;
        } catch (Exception e) {
            return null;
        } finally {
            // 关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
