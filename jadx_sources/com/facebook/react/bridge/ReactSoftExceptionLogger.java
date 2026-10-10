package com.facebook.react.bridge;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.bugly.proguard.C33844oi;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import p633t6.InterfaceC44695a;
import p747x3.C45999a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReactSoftExceptionLogger.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\bH\u0007J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/facebook/react/bridge/ReactSoftExceptionLogger;", "", "<init>", "()V", "listeners", "", "Lcom/facebook/react/bridge/ReactSoftExceptionLogger$ReactSoftExceptionListener;", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeListener", "clearListeners", "logSoftExceptionVerbose", "category", "", "cause", "", "logSoftException", "logNoThrowSoftExceptionWithMessage", "message", "ReactSoftExceptionListener", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@InterfaceC44695a
public final class ReactSoftExceptionLogger {

    @NotNull
    public static final ReactSoftExceptionLogger INSTANCE = new ReactSoftExceptionLogger();

    @NotNull
    private static final List<ReactSoftExceptionListener> listeners = new CopyOnWriteArrayList();

    /* JADX INFO: compiled from: ReactSoftExceptionLogger.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/facebook/react/bridge/ReactSoftExceptionLogger$ReactSoftExceptionListener;", "", "logSoftException", "", "category", "", "cause", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public interface ReactSoftExceptionListener {
        void logSoftException(@NotNull String category, @NotNull Throwable cause);
    }

    @JvmStatic
    public static final void addListener(@NotNull ReactSoftExceptionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<ReactSoftExceptionListener> list = listeners;
        if (list.contains(listener)) {
            return;
        }
        list.add(listener);
    }

    @JvmStatic
    public static final void clearListeners() {
        listeners.clear();
    }

    @JvmStatic
    @InterfaceC44695a
    private static final void logNoThrowSoftExceptionWithMessage(String category, String message) {
        logSoftException(category, new ReactNoCrashSoftException(message));
    }

    @JvmStatic
    public static final void logSoftException(@NotNull String category, @NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(cause, "cause");
        List<ReactSoftExceptionListener> list = listeners;
        if (list.isEmpty()) {
            C45999a.m101508n(category, "Unhandled SoftException", cause);
            return;
        }
        Iterator<ReactSoftExceptionListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().logSoftException(category, cause);
        }
    }

    @JvmStatic
    public static final void logSoftExceptionVerbose(@NotNull String category, @NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(cause, "cause");
        logSoftException(category + "|" + cause.getClass().getSimpleName() + C33844oi.f71346o + cause.getMessage(), cause);
    }

    @JvmStatic
    public static final void removeListener(@NotNull ReactSoftExceptionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.remove(listener);
    }

    private ReactSoftExceptionLogger() {
    }
}
