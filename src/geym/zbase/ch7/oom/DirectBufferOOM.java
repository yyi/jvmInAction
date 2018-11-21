package geym.zbase.ch7.oom;

import java.nio.ByteBuffer;
/**
 * -Xmx512m -XX:+PrintGCDetails  ok  
 * -Xmx1g -XX:+PrintGCDetails    OOM ǿ��GC����
 * DirectBuffer����-XX:MaxDirectMemorySize֮ǰ��
 * java������DirectBuffer������GC��������GCʱ�����DirectBuffer
 * @author Geym
 *
 */
public class DirectBufferOOM {
    public static void main(String args[]){
        for(int i=0;i<1024;i++){
            ByteBuffer.allocateDirect(1024*1024);
            System.out.println(i);
//            System.gc();
        }
    }
}
