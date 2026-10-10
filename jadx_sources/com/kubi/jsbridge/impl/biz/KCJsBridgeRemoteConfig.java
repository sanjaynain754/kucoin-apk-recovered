package com.kubi.jsbridge.impl.biz;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.kubi.config.RemoteConfig;
import com.kubi.sdk.protocol.ProtocolException;
import com.sensorsdata.abtest.SensorsABTest;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36586u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.jsbridge.impl.biz.h, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KCJsBridgeRemoteConfig.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000fH\u0016JH\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000fH\u0016¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/biz/KCJsBridgeRemoteConfig;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiRemoteConfigModule;", "<init>", "()V", "fastFetchAbTest", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", "paramName", "defaultValue", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "getRemoteConfig", "key", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCJsBridgeRemoteConfig implements InterfaceC36586u {
    @Override // d00.InterfaceC36586u
    /* JADX INFO: renamed from: a */
    public void mo31566a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String paramName, @NotNull String defaultValue, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(paramName, "paramName");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (paramName.length() == 0) {
            callback.invoke(null, null);
            return;
        }
        try {
            callback.invoke((String) SensorsABTest.shareInstance().fetchCacheABTest(paramName, defaultValue), null);
        } catch (Exception e11) {
            callback.invoke(null, new ProtocolException(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e11, null, false, 12, null));
        }
    }

    @Override // d00.InterfaceC36586u
    /* JADX INFO: renamed from: b */
    public void mo31567b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String key, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (key.length() == 0) {
            callback.invoke(null, null);
        } else {
            callback.invoke(RemoteConfig.m20458b(key), null);
        }
    }
}
