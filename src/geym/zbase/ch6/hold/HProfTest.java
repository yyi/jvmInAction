package geym.zbase.ch6.hold;

public class HProfTest {
	  public void slowMethod()
	  {
	    try {
	      Thread.sleep( 1000 );					//ģ��һ�������ķ���
	    } catch (InterruptedException e) {
	      e.printStackTrace();     }
	  }

	  public void slowerMethod()
	  {
	    try {
	      Thread.sleep( 10000 );					//ģ��һ�������ķ���
	    } catch (InterruptedException e) {
	      e.printStackTrace();     }
	  }

	  public void fastMethod()						//һ���ܿ�ķ���
	  {
	    try {
	      Thread.yield();
	    } catch (Exception e) {
	      e.printStackTrace();     }
	  }

	  public static void main( String[] args )
	  {
	    HProfTest test = new HProfTest();
	    test.fastMethod();						//�ֱ�������Щ����
	    test.slowMethod();
	    test.slowerMethod();
	  }
}

