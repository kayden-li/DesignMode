package 原型模式.深拷贝;

import java.io.Serializable;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 原型模式.传统方式.deepclone <br>
 *       <b>ClassName:</b> DeepCloneableTarget <br>
 *       <b>Date:</b> 2020年2月21日 下午1:18:14
 */
public class DeepCloneableTarget implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    // 构造器
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    // 由于该类属性都是String类型，所有直接使用默认clone方法即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
