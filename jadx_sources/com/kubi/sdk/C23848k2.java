package com.kubi.sdk;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

/* JADX INFO: renamed from: com.kubi.sdk.k2 */
/* JADX INFO: compiled from: HookActivityManager.java */
/* JADX INFO: loaded from: classes12.dex */
@SuppressLint({"LogNotTimber"})
public class C23848k2 {

    /* JADX INFO: renamed from: com.kubi.sdk.k2$a */
    /* JADX INFO: compiled from: HookActivityManager.java */
    /* JADX INFO: loaded from: classes2.dex */
    public static class a implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        public final Object f46873a;

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (!"reportSizeConfigurations".equals(method.getName()) && !"isTopOfTask".equals(method.getName())) {
                try {
                    return method.invoke(this.f46873a, objArr);
                } catch (InvocationTargetException e11) {
                    Throwable cause = e11.getCause();
                    Objects.requireNonNull(cause);
                    throw cause;
                }
            }
            try {
                Log.w("HookActivityManager", method.getName() + "invoke execute ");
                return method.invoke(this.f46873a, objArr);
            } catch (Exception e12) {
                Log.w("HookActivityManager", method.getName() + "exception: " + e12.getMessage());
                if ("isTopOfTask".equals(method.getName())) {
                    return Boolean.FALSE;
                }
                return null;
            }
        }

        public a(Object obj) {
            this.f46873a = obj;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m57047a() {
        Class<? super Object> superclass;
        if (Build.VERSION.SDK_INT > 28) {
            Log.i("HookActivityManager", "hook return, not match version");
            return;
        }
        try {
            Field declaredField = ActivityManager.class.getDeclaredField("IActivityManagerSingleton");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            if (obj != null && (superclass = obj.getClass().getSuperclass()) != null) {
                Field declaredField2 = superclass.getDeclaredField("mInstance");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(obj);
                Class<?> cls = Class.forName("android.app.IActivityManager");
                declaredField2.set(obj, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(obj2)));
                Log.i("HookActivityManager", "hook success!");
            }
        } catch (Exception e11) {
            Log.e("HookActivityManager", e11.getMessage(), e11);
        }
    }
}
