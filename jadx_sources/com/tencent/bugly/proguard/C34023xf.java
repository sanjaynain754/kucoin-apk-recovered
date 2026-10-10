package com.tencent.bugly.proguard;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.facebook.drawee.drawable.C5584f;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p584r4.C43924d;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.xf */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34023xf extends AbstractC33573c {

    /* JADX INFO: renamed from: a */
    public static final String f72515a = "RMonitor_BigBitmap_RootDrawableSizeProvider";

    /* JADX INFO: renamed from: b */
    public static final int f72516b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f72517c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f72518d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f72519e = 3;

    /* JADX INFO: renamed from: f */
    public static final int f72520f = 4;

    /* JADX INFO: renamed from: g */
    public static final int f72521g = 5;

    /* JADX INFO: renamed from: h */
    public static final int f72522h = 6;

    /* JADX INFO: renamed from: i */
    public static Method f72523i;

    /* JADX INFO: renamed from: j */
    public static Class<?> f72524j;

    /* JADX INFO: renamed from: k */
    public static Class<?> f72525k;

    /* JADX INFO: renamed from: l */
    public static Field f72526l;

    /* JADX INFO: renamed from: m */
    public static Field f72527m;

    @Override // com.tencent.bugly.proguard.AbstractC33573c
    @Nullable
    /* JADX INFO: renamed from: a */
    public C33912s4 mo72623a(@Nullable Drawable drawable) {
        return null;
    }

    static {
        try {
            int i11 = C43924d.f97115d;
            f72524j = C43924d.class;
            int i12 = C5584f.f8267z;
            f72525k = C5584f.class;
            Method method = f72524j.getMethod("getCurrent", new Class[0]);
            f72523i = method;
            method.setAccessible(true);
            Field declaredField = f72525k.getDeclaredField("mIsLayerOn");
            f72526l = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = f72525k.getDeclaredField("mLayers");
            f72527m = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77134w(f72515a, th2.toString());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final C33912s4 m75463a(Object obj) {
        try {
            boolean[] zArr = (boolean[]) f72526l.get(obj);
            Drawable[] drawableArr = (Drawable[]) f72527m.get(obj);
            if (zArr == null || drawableArr == null || zArr.length != drawableArr.length || drawableArr.length < 6) {
                return null;
            }
            Drawable drawable = drawableArr[2];
            if (!zArr[2] || drawable == null) {
                return null;
            }
            return new C33912s4(1, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), 0L);
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77134w(f72515a, th2.toString());
            return null;
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC33573c
    @Nullable
    /* JADX INFO: renamed from: b */
    public C33912s4 mo72625b(@Nullable Drawable drawable) {
        if (drawable == null || drawable.getClass() != f72524j) {
            return null;
        }
        try {
            Drawable drawable2 = (Drawable) f72523i.invoke(drawable, new Object[0]);
            if (drawable2 == null || drawable2.getClass() != f72525k) {
                return null;
            }
            return m75463a((Object) drawable2);
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77134w(f72515a, th2.toString());
            return null;
        }
    }
}
