package io.trtc.tuikit.atomicxcore.impl.view.live;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.impl.live.AbstractC39699P0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.z0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40146z0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40085V0 f89290a;

    public C40146z0(C40085V0 c40085v0) {
        this.f89290a = c40085v0;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        SeatUserInfo seatUserInfo = (SeatUserInfo) obj;
        if (seatUserInfo != null) {
            LiveData<TUILiveConnectionManager.ConnectionUser> liveData = this.f89290a.f89156a.coHostState.receivedConnectionRequest;
            Intrinsics.checkNotNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager.ConnectionUser?>");
            ((MutableLiveData) liveData).setValue(AbstractC39699P0.m88310a(seatUserInfo));
        } else {
            LiveData<TUILiveConnectionManager.ConnectionUser> liveData2 = this.f89290a.f89156a.coHostState.receivedConnectionRequest;
            Intrinsics.checkNotNull(liveData2, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager.ConnectionUser?>");
            ((MutableLiveData) liveData2).setValue(null);
        }
        return Unit.INSTANCE;
    }
}
