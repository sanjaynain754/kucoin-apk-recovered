package org.aspectj.runtime.internal;

/* JADX INFO: renamed from: org.aspectj.runtime.internal.b */
/* JADX INFO: compiled from: Conversions.java */
/* JADX INFO: loaded from: classes23.dex */
public final class C43179b {
    /* JADX INFO: renamed from: b */
    public static boolean m94789b(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new ClassCastException(obj.getClass().getName() + " can not be converted to boolean");
    }

    /* JADX INFO: renamed from: d */
    public static int m94791d(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        throw new ClassCastException(obj.getClass().getName() + " can not be converted to int");
    }

    /* JADX INFO: renamed from: a */
    public static Object m94788a(boolean z11) {
        return Boolean.valueOf(z11);
    }

    /* JADX INFO: renamed from: c */
    public static Object m94790c(int i11) {
        return Integer.valueOf(i11);
    }
}
