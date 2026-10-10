package rh0;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: rh0.a */
/* JADX INFO: compiled from: Mappers.java */
/* JADX INFO: loaded from: classes61.dex */
public class C44095a {
    /* JADX INFO: renamed from: a */
    public static List<ClassLoader> m97164a(ClassLoader classLoader) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(classLoader);
        if (Thread.currentThread().getContextClassLoader() != null) {
            arrayList.add(Thread.currentThread().getContextClassLoader());
        }
        arrayList.add(C44095a.class.getClassLoader());
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m97165b(Class<T> cls, ClassLoader classLoader) throws NoSuchMethodException {
        try {
            Constructor<?> declaredConstructor = classLoader.loadClass(cls.getName() + "Impl").getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return (T) declaredConstructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            return (T) m97168e(cls, classLoader);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static <T> T m97166c(Class<T> cls) {
        try {
            return (T) m97167d(cls, m97164a(cls.getClassLoader()));
        } catch (ClassNotFoundException | NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static <T> T m97167d(Class<T> cls, Iterable<ClassLoader> iterable) throws NoSuchMethodException, ClassNotFoundException {
        Iterator<ClassLoader> it = iterable.iterator();
        while (it.hasNext()) {
            T t11 = (T) m97165b(cls, it.next());
            if (t11 != null) {
                return t11;
            }
        }
        throw new ClassNotFoundException("Cannot find implementation for " + cls.getName());
    }

    /* JADX INFO: renamed from: e */
    public static <T> T m97168e(Class<T> cls, ClassLoader classLoader) {
        for (T t11 : ServiceLoader.load(cls, classLoader)) {
            if (t11 != null) {
                return t11;
            }
        }
        return null;
    }
}
