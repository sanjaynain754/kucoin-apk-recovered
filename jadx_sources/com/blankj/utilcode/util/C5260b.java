package com.blankj.utilcode.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.blankj.utilcode.util.b */
/* JADX INFO: compiled from: AdaptScreenUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5260b {

    /* JADX INFO: renamed from: a */
    public static List<Field> f6486a;

    /* JADX INFO: renamed from: com.blankj.utilcode.util.b$a */
    /* JADX INFO: compiled from: AdaptScreenUtils.java */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            C5260b.m6139g();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m6135c(Resources resources, float f11) {
        Iterator<Field> it = f6486a.iterator();
        while (it.hasNext()) {
            try {
                DisplayMetrics displayMetrics = (DisplayMetrics) it.next().get(resources);
                if (displayMetrics != null) {
                    displayMetrics.xdpi = f11;
                }
            } catch (Exception e11) {
                Log.e("AdaptScreenUtils", "applyMetricsFields: " + e11);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m6136d(Resources resources, float f11) {
        if (f6486a != null) {
            m6135c(resources, f11);
            return;
        }
        f6486a = new ArrayList();
        Class<?> superclass = resources.getClass();
        Field[] declaredFields = superclass.getDeclaredFields();
        while (declaredFields != null && declaredFields.length > 0) {
            for (Field field : declaredFields) {
                if (field.getType().isAssignableFrom(DisplayMetrics.class)) {
                    field.setAccessible(true);
                    DisplayMetrics displayMetricsM6137e = m6137e(resources, field);
                    if (displayMetricsM6137e != null) {
                        f6486a.add(field);
                        displayMetricsM6137e.xdpi = f11;
                    }
                }
            }
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return;
            } else {
                declaredFields = superclass.getDeclaredFields();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static Runnable m6138f() {
        return new a();
    }

    /* JADX INFO: renamed from: b */
    public static void m6134b(Resources resources, float f11) {
        resources.getDisplayMetrics().xdpi = f11;
        C5287o0.m6331a().getResources().getDisplayMetrics().xdpi = f11;
        m6136d(resources, f11);
    }

    /* JADX INFO: renamed from: e */
    public static DisplayMetrics m6137e(Resources resources, Field field) {
        try {
            return (DisplayMetrics) field.get(resources);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m6139g() {
        m6134b(Resources.getSystem(), Resources.getSystem().getDisplayMetrics().xdpi);
    }
}
