package com.tencent.thumbplayer.tcmedia.utils;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.k */
/* JADX INFO: loaded from: classes64.dex */
public class C35431k {

    /* JADX INFO: renamed from: a */
    private static Method f76599a;

    /* JADX INFO: renamed from: b */
    private static Method f76600b;

    /* JADX INFO: renamed from: c */
    private static Method f76601c;

    /* JADX INFO: renamed from: a */
    public static Object m78898a(Object obj, String str, String str2, Class[] clsArr, Object... objArr) {
        try {
            Method methodM78899a = m78899a(str, str2, clsArr);
            if (methodM78899a != null) {
                return methodM78899a.invoke(obj, objArr);
            }
            return null;
        } catch (Throwable th2) {
            TPLogUtil.m78797e("TPPrimaryReflectUtil", th2.getMessage());
            return null;
        }
    }

    static {
        try {
            f76599a = Class.class.getDeclaredMethod("forName", String.class);
            f76600b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            f76601c = Class.class.getDeclaredMethod("getDeclaredField", String.class);
        } catch (Throwable th2) {
            TPLogUtil.m78797e("TPPrimaryReflectUtil", th2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static Method m78899a(String str, String str2, Class[] clsArr) {
        Method method = null;
        if (m78900a()) {
            try {
                Method method2 = (Method) f76600b.invoke((Class) f76599a.invoke(null, str), str2, clsArr);
                try {
                    method2.setAccessible(true);
                    return method2;
                } catch (Throwable th2) {
                    th = th2;
                    method = method2;
                    TPLogUtil.m78797e("TPPrimaryReflectUtil", th.getMessage());
                    return method;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return method;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m78900a() {
        return (f76599a == null || f76600b == null || f76601c == null) ? false : true;
    }
}
