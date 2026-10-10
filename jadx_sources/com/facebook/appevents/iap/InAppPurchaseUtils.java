package com.facebook.appevents.iap;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InAppPurchaseUtils.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJE\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u00042\u001e\u0010\f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u000b\"\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u00042\u001e\u0010\f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u000b\"\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\u0010\u0010\u000fJG\u0010\u0013\u001a\u0004\u0018\u00010\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m90084d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseUtils;", "", "<init>", "()V", "", "className", "Ljava/lang/Class;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Ljava/lang/Class;", "clazz", "methodName", "", "args", "Ljava/lang/reflect/Method;", "d", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "c", FirebaseAnalytics.Param.METHOD, "obj", "e", "(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "b", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Class;", "BillingClientVersion", "IAPProductType", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class InAppPurchaseUtils {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final InAppPurchaseUtils f7926a = new InAppPurchaseUtils();

    /* JADX INFO: compiled from: InAppPurchaseUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "NONE", "V1", "V2_V4", "V5_V7", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public enum BillingClientVersion {
        NONE("none"),
        V1("Android-GPBL-V1"),
        V2_V4("Android-GPBL-V2-V4"),
        V5_V7("Android-GPBL-V5-V7");


        @NotNull
        private final String type;

        @NotNull
        public final String getType() {
            return this.type;
        }

        BillingClientVersion(String str) {
            this.type = str;
        }
    }

    /* JADX INFO: compiled from: InAppPurchaseUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m90084d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "INAPP", "SUBS", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public enum IAPProductType {
        INAPP("inapp"),
        SUBS("subs");


        @NotNull
        private final String type;

        @NotNull
        public final String getType() {
            return this.type;
        }

        IAPProductType(String str) {
            this.type = str;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Class<?> m8180a(@NotNull String className) {
        if (C42757a.m93689d(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(className, "className");
            try {
                return Class.forName(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseUtils.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Class<?> m8181b(@NotNull Context context, @NotNull String className) {
        if (C42757a.m93689d(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(className, "className");
            try {
                return context.getClassLoader().loadClass(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseUtils.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Method m8182c(@NotNull Class<?> clazz, @NotNull String methodName, @NotNull Class<?>... args) {
        if (C42757a.m93689d(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                return clazz.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseUtils.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final Method m8183d(@NotNull Class<?> clazz, @NotNull String methodName, @NotNull Class<?>... args) {
        if (C42757a.m93689d(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseUtils.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final Object m8184e(@NotNull Class<?> clazz, @NotNull Method method, @Nullable Object obj, @NotNull Object... args) {
        if (C42757a.m93689d(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(args, "args");
            if (obj != null) {
                obj = clazz.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(args, args.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseUtils.class);
            return null;
        }
    }
}
