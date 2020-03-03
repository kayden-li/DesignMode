package 外观模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 外观模式 <br>
 *       <b>ClassName:</b> DVDPlayer <br>
 *       <b>Date:</b> 2020年2月28日 下午2:18:51
 */
public class DVDPlayer {

    // 使用饿汉式单例模式
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("dvd打开");
    }

    public void off() {
        System.out.println("dvd关闭");
    }

    public void play() {
        System.out.println("dvd正在播放");
    }

    public void pause() {
        System.out.println("dvd暂停");
    }
}
