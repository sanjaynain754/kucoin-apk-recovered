package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0014\b'\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\fJ)\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0017\u0010\fJ)\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0018\u0010\fJ\u001d\u0010\u001a\u001a\u00020\u0006*\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0004H\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\b8\u0017X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, m90084d2 = {"Lcom/appsflyer/internal/AFg1bSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFh1ySDK;", "tag", "", "msg", "", "shouldRemoteDebug", "", "d", "(Lcom/appsflyer/internal/AFh1ySDK;Ljava/lang/String;Z)V", "", "throwable", "printMsg", "printThrowable", "shouldReportToExManager", "e", "(Lcom/appsflyer/internal/AFh1ySDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFh1ySDK;Ljava/lang/String;)V", "i", "v", "w", "p0", "getRevenue", "(Ljava/lang/String;Lcom/appsflyer/internal/AFh1ySDK;)Ljava/lang/String;", "withTag$SDK_prodRelease", "shouldExtendMsg", "Z", "getShouldExtendMsg", "()Z", "Companion"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAFLoggerBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AFLoggerBase.kt\ncom/appsflyer/internal/logger/AFLoggerBase\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n*L\n1#1,69:1\n36#2:70\n*S KotlinDebug\n*F\n+ 1 AFLoggerBase.kt\ncom/appsflyer/internal/logger/AFLoggerBase\n*L\n61#1:70\n*E\n"})
public abstract class AFg1bSDK {
    public static long getMonetizationNetwork = System.currentTimeMillis();
    private final boolean shouldExtendMsg;

    @JvmOverloads
    /* JADX INFO: renamed from: d */
    public void mo5914d(@NotNull AFh1ySDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    @JvmOverloads
    /* JADX INFO: renamed from: e */
    public void mo5915e(@NotNull AFh1ySDK tag, @NotNull String msg, @NotNull Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        Intrinsics.checkNotNullParameter(throwable, "");
    }

    @JvmOverloads
    /* JADX INFO: renamed from: i */
    public void mo5916i(@NotNull AFh1ySDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    @JvmOverloads
    /* JADX INFO: renamed from: v */
    public void mo5917v(@NotNull AFh1ySDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    @JvmOverloads
    /* JADX INFO: renamed from: w */
    public void mo5918w(@NotNull AFh1ySDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public static /* synthetic */ void d$default(AFg1bSDK aFg1bSDK, AFh1ySDK aFh1ySDK, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        aFg1bSDK.mo5914d(aFh1ySDK, str, z11);
    }

    public static /* synthetic */ void e$default(AFg1bSDK aFg1bSDK, AFh1ySDK aFh1ySDK, String str, Throwable th2, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        if ((i11 & 16) != 0) {
            z12 = true;
        }
        if ((i11 & 32) != 0) {
            z13 = true;
        }
        if ((i11 & 64) != 0) {
            z14 = true;
        }
        aFg1bSDK.mo5915e(aFh1ySDK, str, th2, z11, z12, z13, z14);
    }

    public static /* synthetic */ void i$default(AFg1bSDK aFg1bSDK, AFh1ySDK aFh1ySDK, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        aFg1bSDK.mo5916i(aFh1ySDK, str, z11);
    }

    public static /* synthetic */ void v$default(AFg1bSDK aFg1bSDK, AFh1ySDK aFh1ySDK, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        aFg1bSDK.mo5917v(aFh1ySDK, str, z11);
    }

    public static /* synthetic */ void w$default(AFg1bSDK aFg1bSDK, AFh1ySDK aFh1ySDK, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        aFg1bSDK.mo5918w(aFh1ySDK, str, z11);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: d */
    public final void m5971d(@NotNull AFh1ySDK aFh1ySDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFh1ySDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        d$default(this, aFh1ySDK, str, false, 4, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: e */
    public final void m5972e(@NotNull AFh1ySDK aFh1ySDK, @NotNull String str, @NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(aFh1ySDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        e$default(this, aFh1ySDK, str, th2, false, false, false, false, 120, null);
    }

    public void force(@NotNull AFh1ySDK tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    @NotNull
    public final String getRevenue(@Nullable String str, @NotNull AFh1ySDK aFh1ySDK) {
        Intrinsics.checkNotNullParameter(aFh1ySDK, "");
        if (str == null || StringsKt.isBlank(str)) {
            str = "null";
        }
        String strWithTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFh1ySDK);
        if (!getShouldExtendMsg()) {
            return strWithTag$SDK_prodRelease;
        }
        return "(" + (System.currentTimeMillis() - getMonetizationNetwork) + ") [" + Thread.currentThread().getName() + "] " + strWithTag$SDK_prodRelease;
    }

    @JvmName(name = "getShouldExtendMsg")
    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: i */
    public final void m5976i(@NotNull AFh1ySDK aFh1ySDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFh1ySDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        i$default(this, aFh1ySDK, str, false, 4, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: v */
    public final void m5977v(@NotNull AFh1ySDK aFh1ySDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFh1ySDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        v$default(this, aFh1ySDK, str, false, 4, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: w */
    public final void m5978w(@NotNull AFh1ySDK aFh1ySDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFh1ySDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        w$default(this, aFh1ySDK, str, false, 4, null);
    }

    @NotNull
    public final String withTag$SDK_prodRelease(@NotNull String str, @NotNull AFh1ySDK aFh1ySDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFh1ySDK, "");
        return "[" + aFh1ySDK.getMonetizationNetwork + "] " + str;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: e */
    public final void m5973e(@NotNull AFh1ySDK aFh1ySDK, @NotNull String str, @NotNull Throwable th2, boolean z11) {
        Intrinsics.checkNotNullParameter(aFh1ySDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        e$default(this, aFh1ySDK, str, th2, z11, false, false, false, 112, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: e */
    public final void m5974e(@NotNull AFh1ySDK aFh1ySDK, @NotNull String str, @NotNull Throwable th2, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(aFh1ySDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        e$default(this, aFh1ySDK, str, th2, z11, z12, false, false, 96, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: e */
    public final void m5975e(@NotNull AFh1ySDK aFh1ySDK, @NotNull String str, @NotNull Throwable th2, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(aFh1ySDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        e$default(this, aFh1ySDK, str, th2, z11, z12, z13, false, 64, null);
    }
}
