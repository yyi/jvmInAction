package geym.zbase.ch5.noclassgc;

import java.util.HashMap;

/**
 * noclassgc �������perm
 *-XX:+PrintGCDetails -XX:PermSize=5M -XX:MaxPermSize=5m  -verbose:class -Xnoclassgc
 *
 * PermĬ�ϲ���CMS������CMSClassUnloadingEnabled����CMS����Perm
 * -XX:+PrintGCDetails -XX:PermSize=5M -XX:MaxPermSize=5m  -XX:+UseConcMarkSweepGC -XX:+CMSClassUnloadingEnabled
 * @author Geym
 *
 */
public class PermTest {

    public static void main(String[] args) {
        for(int i=0;i<100000;i++){
            CglibBean bean = new CglibBean("geym.zbase.ch5.perm"+i,new HashMap());
        }
    }

}
