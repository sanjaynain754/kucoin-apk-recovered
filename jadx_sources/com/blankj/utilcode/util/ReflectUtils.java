package com.blankj.utilcode.util;

import com.tencent.bugly.proguard.C33978va;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ReflectUtils {

    /* JADX INFO: renamed from: a */
    public final Class<?> f6389a;

    /* JADX INFO: renamed from: b */
    public final Object f6390b;

    /* JADX INFO: loaded from: classes34.dex */
    public static class ReflectException extends RuntimeException {
        private static final long serialVersionUID = 858774075258496016L;

        public ReflectException(String str) {
            super(str);
        }

        public ReflectException(String str, Throwable th2) {
            super(str, th2);
        }

        public ReflectException(Throwable th2) {
            super(th2);
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.ReflectUtils$a */
    /* JADX INFO: loaded from: classes34.dex */
    public class C5243a implements Comparator<Method> {
        public C5243a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Method method, Method method2) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            int length = parameterTypes.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (!parameterTypes[i11].equals(parameterTypes2[i11])) {
                    if (ReflectUtils.this.m6092t(parameterTypes[i11]).isAssignableFrom(ReflectUtils.this.m6092t(parameterTypes2[i11]))) {
                        return 1;
                    }
                    return -1;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.ReflectUtils$b */
    /* JADX INFO: loaded from: classes34.dex */
    public static class C5244b {
    }

    /* JADX INFO: renamed from: h */
    public final Class<?>[] m6081h(Object... objArr) {
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            clsArr[i11] = obj == null ? C5244b.class : obj.getClass();
        }
        return clsArr;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m6084k(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 < clsArr2.length; i11++) {
            if (clsArr2[i11] != C5244b.class && !m6092t(clsArr[i11]).isAssignableFrom(m6092t(clsArr2[i11]))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public ReflectUtils m6085l(String str) throws ReflectException {
        return m6086m(str, new Object[0]);
    }

    /* JADX INFO: renamed from: o */
    public static ReflectUtils m6074o(Object obj) throws ReflectException {
        return new ReflectUtils(obj == null ? Object.class : obj.getClass(), obj);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX INFO: renamed from: b */
    public final <T extends AccessibleObject> T m6075b(T t11) {
        if (t11 == null) {
            return null;
        }
        if (t11 instanceof Member) {
            Member member = (Member) t11;
            if (!Modifier.isPublic(member.getModifiers()) || !Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                if (!t11.isAccessible()) {
                    t11.setAccessible(true);
                }
            }
        } else if (!t11.isAccessible()) {
            t11.setAccessible(true);
        }
        return t11;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectUtils) && this.f6390b.equals(((ReflectUtils) obj).m6079f());
    }

    /* JADX INFO: renamed from: f */
    public <T> T m6079f() {
        return (T) this.f6390b;
    }

    public int hashCode() {
        return this.f6390b.hashCode();
    }

    /* JADX INFO: renamed from: q */
    public final void m6089q(List<Method> list) {
        Collections.sort(list, new C5243a());
    }

    /* JADX INFO: renamed from: r */
    public final Class<?> m6090r() {
        return this.f6389a;
    }

    /* JADX INFO: renamed from: s */
    public final Object m6091s(Object obj) {
        return obj instanceof ReflectUtils ? ((ReflectUtils) obj).m6079f() : obj;
    }

    /* JADX INFO: renamed from: t */
    public final Class<?> m6092t(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (!cls.isPrimitive()) {
            return cls;
        }
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        return Void.TYPE == cls ? Void.class : cls;
    }

    public String toString() {
        return this.f6390b.toString();
    }

    public ReflectUtils(Class<?> cls, Object obj) {
        this.f6389a = cls;
        this.f6390b = obj;
    }

    /* JADX INFO: renamed from: c */
    public final Method m6076c(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> clsM6090r = m6090r();
        try {
            return clsM6090r.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            do {
                try {
                    return clsM6090r.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused2) {
                    clsM6090r = clsM6090r.getSuperclass();
                }
            } while (clsM6090r != null);
            throw new NoSuchMethodException();
        }
    }

    /* JADX INFO: renamed from: d */
    public ReflectUtils m6077d(String str) {
        try {
            Field fieldM6082i = m6082i(str);
            return new ReflectUtils(fieldM6082i.getType(), fieldM6082i.get(this.f6390b));
        } catch (IllegalAccessException e11) {
            throw new ReflectException(e11);
        }
    }

    /* JADX INFO: renamed from: e */
    public ReflectUtils m6078e(String str, Object obj) {
        try {
            m6082i(str).set(this.f6390b, m6091s(obj));
            return this;
        } catch (Exception e11) {
            throw new ReflectException(e11);
        }
    }

    /* JADX INFO: renamed from: g */
    public final Field m6080g(String str) {
        Class<?> clsM6090r = m6090r();
        try {
            return (Field) m6075b(clsM6090r.getField(str));
        } catch (NoSuchFieldException e11) {
            do {
                try {
                    return (Field) m6075b(clsM6090r.getDeclaredField(str));
                } catch (NoSuchFieldException unused) {
                    clsM6090r = clsM6090r.getSuperclass();
                    if (clsM6090r == null) {
                        throw new ReflectException(e11);
                    }
                }
            } while (clsM6090r == null);
            throw new ReflectException(e11);
        }
    }

    /* JADX INFO: renamed from: i */
    public final Field m6082i(String str) throws IllegalAccessException {
        Field fieldM6080g = m6080g(str);
        if ((fieldM6080g.getModifiers() & 16) == 16) {
            try {
                Field declaredField = Field.class.getDeclaredField("modifiers");
                declaredField.setAccessible(true);
                declaredField.setInt(fieldM6080g, fieldM6080g.getModifiers() & (-17));
                return fieldM6080g;
            } catch (NoSuchFieldException unused) {
                fieldM6080g.setAccessible(true);
            }
        }
        return fieldM6080g;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m6083j(Method method, String str, Class<?>[] clsArr) {
        if (method.getName().equals(str) && m6084k(method.getParameterTypes(), clsArr)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public ReflectUtils m6086m(String str, Object... objArr) throws ReflectException {
        Class<?>[] clsArrM6081h = m6081h(objArr);
        try {
            try {
                return m6087n(m6076c(str, clsArrM6081h), this.f6390b, objArr);
            } catch (NoSuchMethodException e11) {
                throw new ReflectException(e11);
            }
        } catch (NoSuchMethodException unused) {
            return m6087n(m6088p(str, clsArrM6081h), this.f6390b, objArr);
        }
    }

    /* JADX INFO: renamed from: n */
    public final ReflectUtils m6087n(Method method, Object obj, Object... objArr) {
        try {
            m6075b(method);
            if (method.getReturnType() == Void.TYPE) {
                method.invoke(obj, objArr);
                return m6074o(obj);
            }
            return m6074o(method.invoke(obj, objArr));
        } catch (Exception e11) {
            throw new ReflectException(e11);
        }
    }

    /* JADX INFO: renamed from: p */
    public final Method m6088p(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> clsM6090r = m6090r();
        ArrayList arrayList = new ArrayList();
        for (Method method : clsM6090r.getMethods()) {
            if (m6083j(method, str, clsArr)) {
                arrayList.add(method);
            }
        }
        if (!arrayList.isEmpty()) {
            m6089q(arrayList);
            return arrayList.get(0);
        }
        do {
            for (Method method2 : clsM6090r.getDeclaredMethods()) {
                if (m6083j(method2, str, clsArr)) {
                    arrayList.add(method2);
                }
            }
            if (!arrayList.isEmpty()) {
                m6089q(arrayList);
                return arrayList.get(0);
            }
            clsM6090r = clsM6090r.getSuperclass();
        } while (clsM6090r != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + m6090r() + C33978va.f72339h);
    }
}
