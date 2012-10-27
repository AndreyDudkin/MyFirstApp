/**
 * Created with IntelliJ IDEA.
 * User: ND
 * Date: 11.08.12
 * Time: 20:55
 * To change this template use File | Settings | File Templates.
 */
public class EchoTestDrive {
    public static void main (String[] args) {
        Echo e1 = new Echo();
        Echo e2 = e1;
        int x=0;
        while (x<4) {
            e1.hello();
            e1.count=e1.count+1;   // Первый коммит

            if (x>0){
                e2.count=e2.count+1;
            }

            if (x>1) {
                e2.count=e2.count+e1.count;
            }
            x=x+1;
        }
        System.out.println(e2.count);
    }
}
