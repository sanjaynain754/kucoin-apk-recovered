package com.kubi.p110rn.p111ui;

import com.google.firebase.messaging.Constants;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RnDialogCallbackManager.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0007J&\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0006J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u0006R0\u0010\u0004\u001a$\u0012\u0004\u0012\u00020\u0006\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/rn/ui/RnDialogCallbackManager;", "", "<init>", "()V", "callbacks", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlin/Function2;", "Lcom/kubi/rn/ui/KCBridgeRejecterError;", "", "dataCache", "registerCallback", "dialogId", TUIConstants.TUIChat.CALL_BACK, "invokeCallback", "data", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "removeCallback", "hasCallback", "", "getCachedData", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RnDialogCallbackManager {

    @NotNull
    public static final RnDialogCallbackManager INSTANCE = new RnDialogCallbackManager();

    @NotNull
    private static final ConcurrentHashMap<String, Function2<String, KCBridgeRejecterError, Unit>> callbacks = new ConcurrentHashMap<>();

    @NotNull
    private static final ConcurrentHashMap<String, String> dataCache = new ConcurrentHashMap<>();

    public static /* synthetic */ void invokeCallback$default(RnDialogCallbackManager rnDialogCallbackManager, String str, String str2, KCBridgeRejecterError kCBridgeRejecterError, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            kCBridgeRejecterError = null;
        }
        rnDialogCallbackManager.invokeCallback(str, str2, kCBridgeRejecterError);
    }

    @Nullable
    public final String getCachedData(@NotNull String dialogId) {
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        return dataCache.get(dialogId);
    }

    public final boolean hasCallback(@NotNull String dialogId) {
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        return callbacks.containsKey(dialogId);
    }

    public final void invokeCallback(@NotNull String dialogId, @Nullable String data, @Nullable KCBridgeRejecterError error) {
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        if (data != null) {
            dataCache.put(dialogId, data);
        }
        Function2<String, KCBridgeRejecterError, Unit> function2 = callbacks.get(dialogId);
        if (function2 != null) {
            function2.invoke(data, error);
        }
    }

    public final void registerCallback(@NotNull String dialogId, @NotNull Function2<? super String, ? super KCBridgeRejecterError, Unit> callback) {
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callbacks.put(dialogId, callback);
    }

    public final void removeCallback(@NotNull String dialogId) {
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        callbacks.remove(dialogId);
    }

    private RnDialogCallbackManager() {
    }
}
