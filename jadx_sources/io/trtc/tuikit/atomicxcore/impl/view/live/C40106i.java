package io.trtc.tuikit.atomicxcore.impl.view.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import java.util.LinkedHashMap;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.i */
/* JADX INFO: loaded from: classes61.dex */
public final class C40106i implements CompletionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f89206a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TUILiveConnectionManager.ConnectionRequestCallback f89207b;

    public C40106i(String str, TUILiveConnectionManager.ConnectionRequestCallback connectionRequestCallback) {
        this.f89206a = str;
        this.f89207b = connectionRequestCallback;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
    public final void onFailure(int i11, String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TUILiveConnectionManager.ConnectionCode connectionCode = TUILiveConnectionManager.ConnectionCode.SUCCESS;
        if (i11 != connectionCode.getValue()) {
            connectionCode = TUILiveConnectionManager.ConnectionCode.ROOM_NOT_EXISTS;
            if (i11 != connectionCode.getValue()) {
                connectionCode = TUILiveConnectionManager.ConnectionCode.CONNECTING;
                if (i11 != connectionCode.getValue()) {
                    connectionCode = TUILiveConnectionManager.ConnectionCode.CONNECTING_OTHER_ROOM;
                    if (i11 != connectionCode.getValue()) {
                        connectionCode = TUILiveConnectionManager.ConnectionCode.CONNECTION_FULL;
                        if (i11 != connectionCode.getValue()) {
                            connectionCode = TUILiveConnectionManager.ConnectionCode.RETRY;
                            if (i11 != connectionCode.getValue()) {
                                connectionCode = null;
                            }
                        }
                    }
                }
            }
        }
        if (connectionCode == null) {
            TUILiveConnectionManager.ConnectionRequestCallback connectionRequestCallback = this.f89207b;
            if (connectionRequestCallback != null) {
                connectionRequestCallback.onError(TUICommonDefine.Error.fromInt(i11), desc);
                return;
            }
            return;
        }
        linkedHashMap.put(this.f89206a, connectionCode);
        TUILiveConnectionManager.ConnectionRequestCallback connectionRequestCallback2 = this.f89207b;
        if (connectionRequestCallback2 != null) {
            connectionRequestCallback2.onSuccess(linkedHashMap);
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
    public final void onSuccess() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(this.f89206a, TUILiveConnectionManager.ConnectionCode.SUCCESS);
        TUILiveConnectionManager.ConnectionRequestCallback connectionRequestCallback = this.f89207b;
        if (connectionRequestCallback != null) {
            connectionRequestCallback.onSuccess(linkedHashMap);
        }
    }
}
