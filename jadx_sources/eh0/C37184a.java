package eh0;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* JADX INFO: renamed from: eh0.a */
/* JADX INFO: compiled from: BoundaryInterfaceReflectionUtil.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37184a {

    /* JADX INFO: renamed from: eh0.a$a */
    /* JADX INFO: compiled from: BoundaryInterfaceReflectionUtil.java */
    @RequiresApi(19)
    public static class a implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        public final Object f82477a;

        @NonNull
        /* JADX INFO: renamed from: a */
        public Object m83177a() {
            return this.f82477a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return C37184a.m83174d(method, this.f82477a.getClass().getClassLoader()).invoke(this.f82477a, objArr);
            } catch (InvocationTargetException e11) {
                throw e11.getTargetException();
            } catch (ReflectiveOperationException e12) {
                throw new RuntimeException("Reflection failed for method " + method, e12);
            }
        }

        public a(@NonNull Object obj) {
            this.f82477a = obj;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static <T> T m83171a(@NonNull Class<T> cls, @Nullable InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C37184a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    @Nullable
    @RequiresApi(19)
    /* JADX INFO: renamed from: c */
    public static InvocationHandler m83173c(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return new a(obj);
    }

    @Nullable
    @RequiresApi(19)
    /* JADX INFO: renamed from: e */
    public static Object m83175e(@Nullable InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return ((a) invocationHandler).m83177a();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m83176f() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m83172b(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (m83176f()) {
                if (!collection.contains(str + ":dev")) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static Method m83174d(Method method, ClassLoader classLoader) throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }
}
