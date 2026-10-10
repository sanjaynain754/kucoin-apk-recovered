package net.jpountz.xxhash;

import com.tencent.bugly.proguard.C33844oi;
import java.util.Random;
import net.jpountz.util.Native;
import net.jpountz.util.Utils;

/* JADX INFO: renamed from: net.jpountz.xxhash.e */
/* JADX INFO: compiled from: XXHashFactory.java */
/* JADX INFO: loaded from: classes61.dex */
public final class C42826e {

    /* JADX INFO: renamed from: f */
    public static C42826e f94879f;

    /* JADX INFO: renamed from: g */
    public static C42826e f94880g;

    /* JADX INFO: renamed from: h */
    public static C42826e f94881h;

    /* JADX INFO: renamed from: a */
    public final String f94882a;

    /* JADX INFO: renamed from: b */
    public final AbstractC42824c f94883b;

    /* JADX INFO: renamed from: c */
    public final AbstractC42825d f94884c;

    /* JADX INFO: renamed from: d */
    public final AbstractC42822a.a f94885d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC42823b f94886e;

    /* JADX INFO: renamed from: a */
    public static <T> T m93890a(String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException {
        ClassLoader classLoader = C42826e.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return (T) classLoader.loadClass(str).getField("INSTANCE").get(null);
    }

    /* JADX INFO: renamed from: e */
    public static C42826e m93893e(String str) {
        try {
            return new C42826e(str);
        } catch (Exception e11) {
            throw new AssertionError(e11);
        }
    }

    /* JADX INFO: renamed from: f */
    public static synchronized C42826e m93894f() {
        try {
            if (f94879f == null) {
                f94879f = m93893e("JNI");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f94879f;
    }

    /* JADX INFO: renamed from: h */
    public static synchronized C42826e m93895h() {
        try {
            if (f94881h == null) {
                f94881h = m93893e("JavaSafe");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f94881h;
    }

    /* JADX INFO: renamed from: i */
    public static synchronized C42826e m93896i() {
        try {
            if (f94880g == null) {
                f94880g = m93893e("JavaUnsafe");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f94880g;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC42824c m93897d() {
        return this.f94883b;
    }

    /* JADX INFO: renamed from: g */
    public AbstractC42822a m93898g(int i11) {
        this.f94885d.m93888a(i11);
        return null;
    }

    public String toString() {
        return C42826e.class.getSimpleName() + C33844oi.f71346o + this.f94882a;
    }

    public C42826e(String str) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, SecurityException, IllegalArgumentException {
        this.f94882a = str;
        AbstractC42824c abstractC42824c = (AbstractC42824c) m93890a("net.jpountz.xxhash.XXHash32" + str);
        this.f94883b = abstractC42824c;
        this.f94885d = (AbstractC42822a.a) m93890a("net.jpountz.xxhash.StreamingXXHash32" + str + "$Factory");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("net.jpountz.xxhash.XXHash64");
        sb2.append(str);
        this.f94884c = (AbstractC42825d) m93890a(sb2.toString());
        this.f94886e = (InterfaceC42823b) m93890a("net.jpountz.xxhash.StreamingXXHash64" + str + "$Factory");
        byte[] bArr = new byte[100];
        Random random = new Random();
        random.nextBytes(bArr);
        int iNextInt = random.nextInt();
        abstractC42824c.m93889a(bArr, 0, 100, iNextInt);
        m93898g(iNextInt);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static C42826e m93891b() {
        if (!Native.isLoaded() && Native.class.getClassLoader() != ClassLoader.getSystemClassLoader()) {
            return m93892c();
        }
        try {
            return m93894f();
        } catch (Throwable unused) {
            return m93892c();
        }
    }

    /* JADX INFO: renamed from: c */
    public static C42826e m93892c() {
        if (Utils.isUnalignedAccessAllowed()) {
            try {
                return m93896i();
            } catch (Throwable unused) {
                return m93895h();
            }
        }
        return m93895h();
    }
}
