package com.kubi.kucoin.utils;

import android.os.Build;
import android.os.DeadSystemException;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.kucoin.utils.q, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CannotDeliverBroadcastExceptionFix.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0003J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kucoin/utils/CustomUncaughtExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "uncaughtExceptionHandler", "<init>", "(Ljava/lang/Thread$UncaughtExceptionHandler;)V", "uncaughtException", "", InterfaceC33953u5.f72225u, "Ljava/lang/Thread;", "exception", "", "shouldAbsorb", "", "isDeadSystemException", "isWatchDogException", "throwable", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CustomUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Thread.UncaughtExceptionHandler f28591a;

    @RequiresApi(24)
    /* JADX INFO: renamed from: a */
    public final boolean m33173a(Throwable th2) {
        if (th2 instanceof DeadSystemException) {
            return true;
        }
        Throwable cause = th2.getCause();
        if (cause == null) {
            return false;
        }
        return m33173a(cause);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m33175c(Throwable th2) {
        int i11 = Build.VERSION.SDK_INT;
        if (m33173a(th2)) {
            return true;
        }
        if (i11 == 29 && m33174b(th2)) {
            return true;
        }
        return Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(th2.getClass()).getSimpleName(), "CannotDeliverBroadcastException");
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NotNull Thread thread, @NotNull Throwable exception) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (m33175c(exception) || (uncaughtExceptionHandler = this.f28591a) == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, exception);
    }

    public CustomUncaughtExceptionHandler(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f28591a = uncaughtExceptionHandler;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m33174b(Throwable th2) {
        String stackTraceString = Log.getStackTraceString(th2);
        Intrinsics.checkNotNullExpressionValue(stackTraceString, "getStackTraceString(...)");
        return StringsKt.contains$default((CharSequence) stackTraceString, (CharSequence) "com.android.system.watchdog", false, 2, (Object) null);
    }
}
