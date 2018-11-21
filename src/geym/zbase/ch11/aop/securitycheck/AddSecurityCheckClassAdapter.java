package geym.zbase.ch11.aop.securitycheck;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

class AddSecurityCheckClassAdapter extends ClassVisitor {
    public AddSecurityCheckClassAdapter( ClassVisitor cv) {
		super(Opcodes.ASM5, cv);
	}
    
	// ��д visitMethod�����ʵ� "operation" ����ʱ��
    // �����Զ��� MethodVisitor��ʵ�ʸ�д��������
    public MethodVisitor visitMethod(final int access, final String name, 
        final String desc, final String signature, final String[] exceptions) { 
        MethodVisitor mv = cv.visitMethod(access, name, desc, signature,exceptions);
        MethodVisitor wrappedMv = mv; 
        if (mv != null) { 
            // ���� "operation" ����
            if (name.equals("operation")) { 
                // ʹ���Զ��� MethodVisitor��ʵ�ʸ�д��������
                wrappedMv = new AddSecurityCheckMethodAdapter(mv); 
            } 
        } 
        return wrappedMv; 
    } 
}