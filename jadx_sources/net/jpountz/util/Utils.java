package net.jpountz.util;

import com.facebook.soloader.MinElf;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public enum Utils {
    ;

    public static final ByteOrder NATIVE_BYTE_ORDER = ByteOrder.nativeOrder();

    /* JADX INFO: renamed from: b */
    public static final boolean f94876b;

    static {
        String property = System.getProperty("os.arch");
        f94876b = property.equals("i386") || property.equals(MinElf.ISA.X86) || property.equals("amd64") || property.equals(MinElf.ISA.X86_64) || property.equals("aarch64") || property.equals("ppc64le");
    }

    public static boolean isUnalignedAccessAllowed() {
        return f94876b;
    }
}
