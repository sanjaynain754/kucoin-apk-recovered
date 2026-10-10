package io.trtc.tuikit.atomicxcore.impl.view.live;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.deprecated.LiveCoreViewDeprecated;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.y */
/* JADX INFO: loaded from: classes61.dex */
public final class C40143y implements CompletionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LiveCoreViewDeprecated f89285a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TUIRoomDefine.ActionCallback f89286b;

    public C40143y(LiveCoreViewDeprecated liveCoreViewDeprecated, TUIRoomDefine.ActionCallback actionCallback) {
        this.f89285a = liveCoreViewDeprecated;
        this.f89286b = actionCallback;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
    public final void onFailure(int i11, String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        TUIRoomDefine.ActionCallback actionCallback = this.f89286b;
        if (actionCallback != null) {
            actionCallback.onError(TUICommonDefine.Error.fromInt(i11), desc);
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
    public final void onSuccess() {
        LiveData<Boolean> liveData = this.f89285a.getCoreStateProvider().f89156a.mediaState.isMicrophoneMuted;
        Intrinsics.checkNotNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Boolean>");
        ((MutableLiveData) liveData).setValue(Boolean.FALSE);
        TUIRoomDefine.ActionCallback actionCallback = this.f89286b;
        if (actionCallback != null) {
            actionCallback.onSuccess();
        }
    }
}
