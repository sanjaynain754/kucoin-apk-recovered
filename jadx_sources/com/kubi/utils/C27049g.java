package com.kubi.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.kubi.utils.g */
/* JADX INFO: compiled from: BottomNavigationViewHelper.java */
/* JADX INFO: loaded from: classes23.dex */
public class C27049g {
    /* JADX INFO: renamed from: a */
    public static void m66715a() {
        try {
            Class.forName("android.content.pm.PackageParser$Package").getDeclaredConstructor(String.class).setAccessible(true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mHiddenApiWarningShown");
            declaredField.setAccessible(true);
            declaredField.setBoolean(objInvoke, true);
        } catch (Exception unused) {
        }
    }
}
