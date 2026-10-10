package com.kubi.p110rn.core.socket;

import com.facebook.soloader.SoLoader;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KRNSocketNativeBridge.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007J \u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0007J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007JL\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0007JM\u0010\u0018\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0083 R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/rn/core/socket/KRNSocketNativeBridge;", "", "<init>", "()V", "handler", "Lcom/kubi/rn/core/socket/KRNSocketNativeBridge$KRNSocketHandler;", "setHandler", "", "onStartTask", "taskId", "", "topic", "extraJson", "onEndTask", "emit", TUIConstants.TIMPush.NOTIFICATION.ACTION, "subject", "code", "", "data", "", "isBinary", "", "jsonData", "nativeEmit", "KRNSocketHandler", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class KRNSocketNativeBridge {

    @NotNull
    public static final KRNSocketNativeBridge INSTANCE = new KRNSocketNativeBridge();

    @Nullable
    private static volatile KRNSocketHandler handler;

    /* JADX INFO: compiled from: KRNSocketNativeBridge.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, m90084d2 = {"Lcom/kubi/rn/core/socket/KRNSocketNativeBridge$KRNSocketHandler;", "", "startTask", "", "taskId", "", "topic", "extraJson", "endTask", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public interface KRNSocketHandler {
        void endTask(@NotNull String taskId);

        void startTask(@NotNull String taskId, @NotNull String topic, @NotNull String extraJson);
    }

    @JvmStatic
    private static final native void nativeEmit(String taskId, String action, String topic, String subject, int code, byte[] data, boolean isBinary, String jsonData);

    static {
        try {
            SoLoader.loadLibrary("appmodules");
        } catch (Throwable unused) {
        }
    }

    @JvmStatic
    public static final void emit(@NotNull String taskId, @NotNull String action, @NotNull String topic, @NotNull String subject, int code, @Nullable byte[] data, boolean isBinary, @Nullable String jsonData) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(subject, "subject");
        nativeEmit(taskId, action, topic, subject, code, data, isBinary, jsonData);
    }

    @JvmStatic
    public static final void onEndTask(@NotNull String taskId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        KRNSocketHandler kRNSocketHandler = handler;
        if (kRNSocketHandler != null) {
            kRNSocketHandler.endTask(taskId);
        }
    }

    @JvmStatic
    public static final void onStartTask(@NotNull String taskId, @NotNull String topic, @NotNull String extraJson) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(extraJson, "extraJson");
        KRNSocketHandler kRNSocketHandler = handler;
        if (kRNSocketHandler != null) {
            kRNSocketHandler.startTask(taskId, topic, extraJson);
        }
    }

    @JvmStatic
    public static final void setHandler(@Nullable KRNSocketHandler handler2) {
        handler = handler2;
    }

    private KRNSocketNativeBridge() {
    }
}
