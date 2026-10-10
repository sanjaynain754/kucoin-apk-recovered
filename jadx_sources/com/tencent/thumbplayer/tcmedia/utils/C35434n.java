package com.tencent.thumbplayer.tcmedia.utils;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.n */
/* JADX INFO: loaded from: classes64.dex */
public class C35434n {

    /* JADX INFO: renamed from: a */
    private static ArrayList<a> f76604a = new ArrayList<>();

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.n$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        String f76605a;

        /* JADX INFO: renamed from: b */
        Map<Integer, Method> f76606b;

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.n$b */
    @Target({ElementType.METHOD, ElementType.TYPE})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        /* JADX INFO: renamed from: a */
        boolean m78914a() default false;

        /* JADX INFO: renamed from: b */
        boolean m78915b() default false;

        /* JADX INFO: renamed from: c */
        boolean m78916c() default false;
    }

    /* JADX INFO: renamed from: a */
    public static Method m78902a(Class<?> cls, String str, Object[] objArr) {
        Map<Integer, Method> mapM78909b = m78909b(cls);
        if (mapM78909b == null) {
            return null;
        }
        Iterator<Map.Entry<Integer, Method>> it = mapM78909b.entrySet().iterator();
        while (it.hasNext()) {
            Method value = it.next().getValue();
            if (value != null && str.equals(value.getName()) && m78906a(value, objArr)) {
                return value;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static int m78907b(Class<?> cls, String str, Object[] objArr) {
        Map<Integer, Method> mapM78909b = m78909b(cls);
        if (mapM78909b == null) {
            return -1;
        }
        for (Map.Entry<Integer, Method> entry : mapM78909b.entrySet()) {
            Method value = entry.getValue();
            if (value != null && str.equals(value.getName()) && m78906a(value, objArr)) {
                return entry.getKey().intValue();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m78903a(Class<?> cls) {
        String str;
        for (a aVar : f76604a) {
            if (aVar != null && (str = aVar.f76605a) != null && str.equals(cls.getName())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static String m78908b(Class<?> cls, int i11) {
        Method method;
        Map<Integer, Method> mapM78909b = m78909b(cls);
        return (mapM78909b == null || (method = mapM78909b.get(Integer.valueOf(i11))) == null) ? "unknown" : method.getName();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m78904a(Class<?> cls, int i11) {
        try {
            if (m78903a(cls)) {
                return true;
            }
            HashMap map = new HashMap();
            try {
                for (Method method : cls.getMethods()) {
                    if (((b) method.getAnnotation(b.class)) != null) {
                        map.put(Integer.valueOf(i11), method);
                        i11++;
                    }
                }
                a aVar = new a();
                aVar.f76605a = cls.getName();
                aVar.f76606b = map;
                f76604a.add(aVar);
                return true;
            } catch (Exception unused) {
                map.clear();
                return false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    private static Map<Integer, Method> m78909b(Class<?> cls) {
        String str;
        for (a aVar : f76604a) {
            if (aVar != null && (str = aVar.f76605a) != null && str.equals(cls.getName())) {
                return aVar.f76606b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m78910c(Class<?> cls, int i11) {
        Method method;
        Map<Integer, Method> mapM78909b = m78909b(cls);
        if (mapM78909b != null && (method = mapM78909b.get(Integer.valueOf(i11))) != null) {
            Class<?>[] exceptionTypes = method.getExceptionTypes();
            if (exceptionTypes != null && exceptionTypes.length > 0) {
                return true;
            }
            b bVar = (b) method.getAnnotation(b.class);
            if (bVar != null) {
                return bVar.m78914a();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m78911d(Class<?> cls, int i11) {
        Method method;
        b bVar;
        Map<Integer, Method> mapM78909b = m78909b(cls);
        if (mapM78909b == null || (method = mapM78909b.get(Integer.valueOf(i11))) == null || (bVar = (b) method.getAnnotation(b.class)) == null) {
            return false;
        }
        return bVar.m78915b();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m78912e(Class<?> cls, int i11) {
        Method method;
        b bVar;
        Map<Integer, Method> mapM78909b = m78909b(cls);
        if (mapM78909b == null || (method = mapM78909b.get(Integer.valueOf(i11))) == null || (bVar = (b) method.getAnnotation(b.class)) == null) {
            return false;
        }
        return bVar.m78916c();
    }

    /* JADX INFO: renamed from: f */
    public static Method m78913f(Class<?> cls, int i11) {
        Map<Integer, Method> mapM78909b = m78909b(cls);
        if (mapM78909b == null) {
            return null;
        }
        return mapM78909b.get(Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: a */
    private static boolean m78905a(Class<?> cls, Object obj) {
        if (!cls.isPrimitive()) {
            return false;
        }
        try {
            return obj.getClass().getField(CredentialProviderBaseController.TYPE_TAG).get(null).equals(cls);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m78906a(Method method, Object[] objArr) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (objArr == null || objArr.length == 0) {
            return parameterTypes.length == 0;
        }
        if (parameterTypes.length != objArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            Class<?> cls = parameterTypes[i11];
            Object obj = objArr[i11];
            if (obj == null) {
                if (cls.isPrimitive()) {
                    return false;
                }
            } else if (!cls.isAssignableFrom(obj.getClass()) && !m78905a(cls, objArr[i11])) {
                return false;
            }
        }
        return true;
    }
}
