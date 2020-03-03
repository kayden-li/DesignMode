package 桥接模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 桥接模式 <br>
 *       <b>ClassName:</b> Brand <br>
 *       <b>Date:</b> 2020年2月24日 下午12:28:05
 */
public interface Brand {

    void open();

    void close();

    void call();
}
