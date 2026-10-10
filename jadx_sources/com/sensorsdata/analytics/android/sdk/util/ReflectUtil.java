package com.sensorsdata.analytics.android.sdk.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes59.dex */
public class ReflectUtil {
    public static <T> T callMethod(Object obj, String str, Object... objArr) {
        Class[] clsArr = new Class[objArr.length];
        for (int i11 = 0; i11 < objArr.length; i11++) {
            clsArr[i11] = objArr[i11].getClass();
        }
        Method method = getMethod(obj.getClass(), str, clsArr);
        if (method == null) {
            return null;
        }
        try {
            return (T) method.invoke(obj, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T callStaticMethod(Class<?> cls, String str, Object... objArr) {
        Method method;
        Class[] clsArr = new Class[objArr.length];
        for (int i11 = 0; i11 < objArr.length; i11++) {
            clsArr[i11] = objArr[i11].getClass();
        }
        if (cls != null && (method = getMethod(cls, str, clsArr)) != null) {
            try {
                return (T) method.invoke(null, objArr);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static <T> T findField(Class<?> cls, Object obj, String... strArr) {
        Field fieldFindFieldObj = findFieldObj(cls, strArr);
        if (fieldFindFieldObj == null) {
            return null;
        }
        try {
            return (T) fieldFindFieldObj.get(obj);
        } catch (IllegalAccessException | Exception unused) {
            return null;
        }
    }

    public static Field findFieldObj(Class<?> cls, String... strArr) {
        if (strArr != null) {
            try {
                if (strArr.length != 0) {
                    Field declaredField = null;
                    for (String str : strArr) {
                        try {
                            declaredField = cls.getDeclaredField(str);
                        } catch (NoSuchFieldException unused) {
                            declaredField = null;
                        }
                        if (declaredField != null) {
                            break;
                        }
                    }
                    if (declaredField == null) {
                        return null;
                    }
                    declaredField.setAccessible(true);
                    return declaredField;
                }
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public static Class<?> getCurrentClass(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        Class<?> cls = null;
        for (String str : strArr) {
            try {
                cls = Class.forName(str);
            } catch (Exception unused) {
                cls = null;
            }
            if (cls != null) {
                break;
            }
        }
        return cls;
    }

    public static boolean isInstance(Object obj, String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        boolean zIsInstance = false;
        for (String str : strArr) {
            try {
                zIsInstance = Class.forName(str).isInstance(obj);
            } catch (Exception unused) {
            }
            if (zIsInstance) {
                break;
            }
        }
        return zIsInstance;
    }

    public static Field findFieldObjRecur(Class<?> cls, String str) {
        while (cls != Object.class) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static Method getDeclaredRecur(Class<?> cls, String str, Class<?>... clsArr) {
        while (cls != Object.class) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (declaredMethod != null) {
                    return declaredMethod;
                }
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static <T> T findField(String[] strArr, Object obj, String... strArr2) {
        Class<?> currentClass = getCurrentClass(strArr);
        if (currentClass != null) {
            return (T) findField(currentClass, obj, strArr2);
        }
        return null;
    }

    public static <T> T findFieldRecur(Object obj, String str) {
        Field fieldFindFieldObjRecur = findFieldObjRecur(obj.getClass(), str);
        if (fieldFindFieldObjRecur != null) {
            try {
                return (T) fieldFindFieldObjRecur.get(obj);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }
        return null;
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
