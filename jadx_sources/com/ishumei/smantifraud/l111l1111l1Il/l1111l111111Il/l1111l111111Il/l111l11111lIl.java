package com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ishumei.smantifraud.l1111l111111Il.l11l1111Ill;
import com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111I1l;
import com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111I1ll;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class l111l11111lIl implements com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l11111Il {
    private final l1111l111111Il l1111l111111Il;

    public l111l11111lIl() {
    }

    public static Object l111l11111lIl(Object obj, String str) {
        return l1111l111111Il(obj, l1111l111111Il(obj.getClass(), str));
    }

    @Override // com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l11111Il
    public final com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl<?> l1111l111111Il(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l<?> l111l1111li1l) throws l11l1111I1ll {
        l111l1111lI1l.l1111l111111Il l1111l111111il;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        byte b11 = 0;
        l111l1111li1l.l1111l111111Il(false);
        while (true) {
            try {
                l11l1111Ill l11l1111illL1111l111111Il = this.l1111l111111Il.l1111l111111Il(l111l1111li1l, Collections.EMPTY_MAP);
                byte[] bArrL111l11111I1l = l11l1111illL1111l111111Il.l111l11111I1l();
                int iL1111l111111Il = l11l1111illL1111l111111Il.l1111l111111Il();
                if (bArrL111l11111I1l == null) {
                    bArrL111l11111I1l = new byte[0];
                }
                byte[] bArr = bArrL111l11111I1l;
                if (iL1111l111111Il < 200 || iL1111l111111Il > 299) {
                    throw new IOException();
                }
                com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl<?> l11l1111liilL1111l111111Il = l111l1111li1l.l1111l111111Il(new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111llIl(iL1111l111111Il, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, (List<com.ishumei.smantifraud.l1111l111111Il>) null));
                l111l1111li1l.l1111l111111Il("network-parse-complete");
                if (l11l1111liilL1111l111111Il.l1111l111111Il()) {
                    return l11l1111liilL1111l111111Il;
                }
                l11l1111I1ll l11l1111i1ll = l11l1111liilL1111l111111Il.l111l11111lIl;
                if (l11l1111i1ll != null) {
                    throw l11l1111i1ll;
                }
                throw new Exception("");
            } catch (Exception e11) {
                l111l1111li1l.l1111l111111Il(true);
                if ((e11 instanceof IllegalArgumentException) && TextUtils.equals(e11.getMessage(), "body is null")) {
                    throw ((IllegalArgumentException) e11);
                }
                if ((e11 instanceof SocketTimeoutException) || (e11 instanceof ConnectException)) {
                    l1111l111111il = new l111l1111lI1l.l1111l111111Il("socket", new l11l1111I1ll(-2), b11);
                } else {
                    if (e11 instanceof UnknownHostException) {
                        throw new l11l1111I1ll(e11, -1);
                    }
                    if (e11 instanceof MalformedURLException) {
                        throw new RuntimeException("Bad URL " + l111l1111li1l.l111l1111lI1l(), e11);
                    }
                    if (e11 instanceof l11l1111I1ll) {
                        l1111l111111il = new l111l1111lI1l.l1111l111111Il("VolleyError", (l11l1111I1ll) e11, b11);
                    } else {
                        l1111l111111il = new l111l1111lI1l.l1111l111111Il("network", new l11l1111I1ll(e11, -4), b11);
                    }
                }
                l11l1111I1l l11l1111i1lL11l1111Ill = l111l1111li1l.l11l1111Ill();
                int iL11l1111Il1l = l111l1111li1l.l11l1111Il1l();
                try {
                    l11l1111i1lL11l1111Ill.l1111l111111Il(l1111l111111il.l111l11111lIl);
                    l111l1111li1l.l1111l111111Il(String.format("%s-retry [timeout=%s]", l1111l111111il.l1111l111111Il, Integer.valueOf(iL11l1111Il1l)));
                } catch (l11l1111I1ll e12) {
                    l111l1111li1l.l1111l111111Il(String.format("%s-timeout-giveup [timeout=%s]", l1111l111111il.l1111l111111Il, Integer.valueOf(iL11l1111Il1l)));
                    throw e12;
                }
            }
        }
    }

    public l111l11111lIl(l1111l111111Il l1111l111111il) {
        this.l1111l111111Il = l1111l111111il;
    }

    public static Object l1111l111111Il(Object obj, String str) {
        return l1111l111111Il(obj, l1111l111111Il(obj.getClass(), str, (Class[]) null), new Object[0]);
    }

    private static Object l111l11111lIl(String str, String str2) {
        return l1111l111111Il((Object) null, l1111l111111Il(Class.forName(str), str2));
    }

    public static Object l1111l111111Il(Object obj, String str, Class[] clsArr, Object[] objArr) {
        return l1111l111111Il(obj, l1111l111111Il(obj.getClass(), str, clsArr), objArr);
    }

    private static Object l1111l111111Il(Object obj, Field field) {
        field.setAccessible(true);
        return field.get(obj);
    }

    private static Object l1111l111111Il(Object obj, Method method, Object... objArr) {
        method.setAccessible(true);
        return method.invoke(obj, objArr);
    }

    private static Object l1111l111111Il(String str, String str2) {
        return l1111l111111Il((Object) null, l1111l111111Il(Class.forName(str), str2, (Class[]) null), new Object[0]);
    }

    public static Object l1111l111111Il(String str, String str2, Class[] clsArr, Object[] objArr) {
        return l1111l111111Il((Object) null, l1111l111111Il(Class.forName(str), str2, clsArr), objArr);
    }

    private static Field l1111l111111Il(Class<?> cls, String str) throws NoSuchFieldException {
        try {
            try {
                return cls.getField(str);
            } catch (NoSuchFieldException e11) {
                if (cls.getSuperclass() != null) {
                    return l1111l111111Il((Class<?>) cls.getSuperclass(), str);
                }
                throw e11;
            }
        } catch (NoSuchFieldException unused) {
            return cls.getDeclaredField(str);
        }
    }

    private static Method l1111l111111Il(Class<?> cls, String str, Class[] clsArr) throws NoSuchMethodException {
        try {
            try {
                return cls.getMethod(str, clsArr);
            } catch (NoSuchMethodException e11) {
                if (cls.getSuperclass() != null) {
                    return l1111l111111Il(cls.getSuperclass(), str, clsArr);
                }
                throw e11;
            }
        } catch (NoSuchMethodException unused) {
            return cls.getDeclaredMethod(str, clsArr);
        }
    }

    private static Field[] l1111l111111Il(Class cls) {
        return cls.getDeclaredFields();
    }

    private static Field[] l1111l111111Il(Object obj) {
        return obj.getClass().getDeclaredFields();
    }

    private static Field[] l1111l111111Il(String str) {
        return Class.forName(str).getDeclaredFields();
    }
}
