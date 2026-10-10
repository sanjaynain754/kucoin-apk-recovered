package com.kubi.resources;

import android.content.Context;
import android.os.Build;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import ro.C44127a;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.resources.q, reason: from Kotlin metadata */
/* JADX INFO: compiled from: NotchUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/resources/NotchUtils;", "", "<init>", "()V", "TAG", "", "isXiaomi", "", "isHuawei", "isOppo", "isVivo", "VIVO_NOTCH", "", "VIVO_FILLET", "getNotchHeight", "context", "Landroid/content/Context;", "hasNotch", "hasNotchAtXiaoMi", "hasNotchAtHuaWei", "hasNotchAtOPPO", "hasNotchAtVIVO", "getXiaoMiNotchSize", "getHuaWeiNotchSize", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NotchUtils {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final NotchUtils f43671a = new NotchUtils();

    /* JADX INFO: renamed from: b */
    public static final boolean f43672b;

    /* JADX INFO: renamed from: c */
    public static final boolean f43673c;

    /* JADX INFO: renamed from: d */
    public static final boolean f43674d;

    /* JADX INFO: renamed from: e */
    public static final boolean f43675e;

    static {
        String str = Build.MANUFACTURER;
        f43672b = StringsKt.equals("Xiaomi", str, true);
        f43673c = StringsKt.equals(JPushConstants.Manufacturer.HUAWEI, str, true);
        f43674d = StringsKt.equals(JPushConstants.Manufacturer.OPPO, str, true);
        f43675e = StringsKt.equals(JPushConstants.Manufacturer.VIVO, str, true);
    }

    /* JADX INFO: renamed from: a */
    public final int[] m54367a(Context context) {
        int[] iArr = {0, 0};
        try {
            try {
                try {
                    Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                    Object objInvoke = clsLoadClass.getMethod("getNotchSize", new Class[0]).invoke(clsLoadClass, new Object[0]);
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                    return (int[]) objInvoke;
                } catch (Exception unused) {
                    C44127a.m97245e("NotchUtils", "getNotchSize Exception");
                    return iArr;
                }
            } catch (ClassNotFoundException unused2) {
                C44127a.m97245e("NotchUtils", "getNotchSize ClassNotFoundException");
                return iArr;
            } catch (NoSuchMethodException unused3) {
                C44127a.m97245e("NotchUtils", "getNotchSize NoSuchMethodException");
                return iArr;
            }
        } catch (Throwable unused4) {
            return iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m54368b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (m54370d(context)) {
            if (f43672b) {
                return m54369c(context);
            }
            if (f43673c) {
                return m54367a(context)[1];
            }
            if (f43674d) {
                return 80;
            }
            if (f43675e) {
                return (int) C27025c.m66565c(context, 27);
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m54371e(Context context) {
        try {
            try {
                try {
                    Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                    Object objInvoke = clsLoadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(clsLoadClass, new Object[0]);
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
                    return ((Boolean) objInvoke).booleanValue();
                } catch (Exception unused) {
                    C44127a.m97245e("", "hasNotchAtHuawei Exception");
                    return false;
                }
            } catch (ClassNotFoundException unused2) {
                C44127a.m97245e("", "hasNotchAtHuawei ClassNotFoundException");
                return false;
            } catch (NoSuchMethodException unused3) {
                C44127a.m97245e("", "hasNotchAtHuawei NoSuchMethodException");
                return false;
            }
        } catch (Throwable unused4) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m54373g(Context context) {
        try {
            try {
                try {
                    Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
                    Object objInvoke = clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32);
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
                    return ((Boolean) objInvoke).booleanValue();
                } catch (Exception unused) {
                    C44127a.m97245e("", "hasNotchAtVivo Exception");
                    return false;
                }
            } catch (ClassNotFoundException unused2) {
                C44127a.m97245e("", "hasNotchAtVivo ClassNotFoundException");
                return false;
            } catch (NoSuchMethodException unused3) {
                C44127a.m97245e("", "hasNotchAtVivo NoSuchMethodException");
                return false;
            }
        } catch (Throwable unused4) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m54374h(Context context) {
        int iIntValue;
        if (f43672b) {
            try {
                Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                Object objInvoke = clsLoadClass.getMethod("getInt", (Class[]) Arrays.copyOf(new Class[]{String.class, Integer.TYPE}, 2)).invoke(clsLoadClass, Arrays.copyOf(new Object[]{"ro.miui.notch", 0}, 2));
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                iIntValue = ((Integer) objInvoke).intValue();
            } catch (ClassNotFoundException e11) {
                C44128b.m97264h(e11);
                iIntValue = 0;
            } catch (IllegalAccessException e12) {
                C44128b.m97264h(e12);
                iIntValue = 0;
            } catch (IllegalArgumentException e13) {
                C44128b.m97264h(e13);
                iIntValue = 0;
            } catch (NoSuchMethodException e14) {
                C44128b.m97264h(e14);
                iIntValue = 0;
            } catch (InvocationTargetException e15) {
                C44128b.m97264h(e15);
                iIntValue = 0;
            }
        } else {
            iIntValue = 0;
        }
        return iIntValue == 1;
    }

    /* JADX INFO: renamed from: c */
    public final int m54369c(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            identifier = context.getResources().getIdentifier("notch_height", "dimen", "android");
        }
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m54370d(Context context) {
        if (!m54374h(context) && !m54371e(context) && !m54372f(context) && !m54373g(context)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m54372f(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }
}
