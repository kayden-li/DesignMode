package 外观模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 外观模式 <br>
 *       <b>ClassName:</b> HomeTheaterFacade <br>
 *       <b>Date:</b> 2020年2月28日 下午2:45:06
 */
public class HomeTheaterFacade {

    // 定义各个子系统的对象
    private Popcorn popcorn;
    private Screen screen;
    private Projector projector;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        super();
        this.popcorn = Popcorn.getInstance();
        this.screen = Screen.getInstance();
        this.projector = Projector.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    // 操作分4步
    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        dvdPlayer.on();
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        popcorn.off();
        popcorn.off();
        screen.up();
        projector.off();
        dvdPlayer.off();
    }
}
