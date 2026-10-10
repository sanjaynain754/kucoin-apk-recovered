package com.squareup.moshi;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import ob0.C43012b;

/* JADX INFO: renamed from: com.squareup.moshi.b */
/* JADX INFO: compiled from: ClassFactory.java */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC27796b<T> {

    /* JADX INFO: renamed from: com.squareup.moshi.b$a */
    /* JADX INFO: compiled from: ClassFactory.java */
    public class a extends AbstractC27796b<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Constructor f56576a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Class f56577b;

        @Override // com.squareup.moshi.AbstractC27796b
        /* JADX INFO: renamed from: b */
        public T mo68670b() throws IllegalAccessException, InstantiationException, InvocationTargetException {
            return (T) this.f56576a.newInstance(null);
        }

        public a(Constructor constructor, Class cls) {
            this.f56576a = constructor;
            this.f56577b = cls;
        }

        public String toString() {
            return this.f56577b.getName();
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.b$b */
    /* JADX INFO: compiled from: ClassFactory.java */
    public class b extends AbstractC27796b<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Method f56578a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f56579b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Class f56580c;

        public b(Method method, Object obj, Class cls) {
            this.f56578a = method;
            this.f56579b = obj;
            this.f56580c = cls;
        }

        @Override // com.squareup.moshi.AbstractC27796b
        /* JADX INFO: renamed from: b */
        public T mo68670b() throws IllegalAccessException, InvocationTargetException {
            return (T) this.f56578a.invoke(this.f56579b, this.f56580c);
        }

        public String toString() {
            return this.f56580c.getName();
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.b$c */
    /* JADX INFO: compiled from: ClassFactory.java */
    public class c extends AbstractC27796b<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Method f56581a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Class f56582b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f56583c;

        public c(Method method, Class cls, int i11) {
            this.f56581a = method;
            this.f56582b = cls;
            this.f56583c = i11;
        }

        @Override // com.squareup.moshi.AbstractC27796b
        /* JADX INFO: renamed from: b */
        public T mo68670b() throws IllegalAccessException, InvocationTargetException {
            return (T) this.f56581a.invoke(null, this.f56582b, Integer.valueOf(this.f56583c));
        }

        public String toString() {
            return this.f56582b.getName();
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.b$d */
    /* JADX INFO: compiled from: ClassFactory.java */
    public class d extends AbstractC27796b<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Method f56584a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Class f56585b;

        public d(Method method, Class cls) {
            this.f56584a = method;
            this.f56585b = cls;
        }

        @Override // com.squareup.moshi.AbstractC27796b
        /* JADX INFO: renamed from: b */
        public T mo68670b() throws IllegalAccessException, InvocationTargetException {
            return (T) this.f56584a.invoke(null, this.f56585b, Object.class);
        }

        public String toString() {
            return this.f56585b.getName();
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract T mo68670b() throws IllegalAccessException, InstantiationException, InvocationTargetException;

    /* JADX INFO: renamed from: a */
    public static <T> AbstractC27796b<T> m68669a(Class<?> cls) {
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return new a(declaredConstructor, cls);
        } catch (NoSuchMethodException unused) {
            try {
                try {
                    try {
                        Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                        Field declaredField = cls2.getDeclaredField("theUnsafe");
                        declaredField.setAccessible(true);
                        return new b(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), cls);
                    } catch (Exception unused2) {
                        throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                    }
                } catch (IllegalAccessException unused3) {
                    throw new AssertionError();
                } catch (NoSuchMethodException unused4) {
                    Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod.setAccessible(true);
                    return new d(declaredMethod, cls);
                } catch (InvocationTargetException e11) {
                    throw C43012b.m94476p(e11);
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod2.setAccessible(true);
                int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
                Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod3.setAccessible(true);
                return new c(declaredMethod3, cls, iIntValue);
            } catch (IllegalAccessException unused6) {
                throw new AssertionError();
            }
        }
    }
}
