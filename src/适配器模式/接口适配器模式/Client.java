package 适配器模式.接口适配器模式;

/**
 * * <b>Description:</b><br>
 * 
 * @author 李帆
 * @version 1.0
 * @Note <b>ProjectName:</b> DesignMode <br>
 *       <b>PackageName:</b> 适配器模式.接口适配器模式 <br>
 *       <b>ClassName:</b> Client <br>
 *       <b>Date:</b> 2020年2月23日 下午1:09:57
 */
public class Client {

    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            // 只需要覆盖需要使用的接口方法
            @Override
            public void m1() {
                super.m1();
                System.out.println("使用m1方法");
            }
        };

        absAdapter.m1();

        new AbsAdapter() {
            // 只需要覆盖需要使用的接口方法
            @Override
            public void m1() {
                super.m1();
                System.out.println("匿名内部类使用m1方法");
            }
        }.m1();
    }

}
