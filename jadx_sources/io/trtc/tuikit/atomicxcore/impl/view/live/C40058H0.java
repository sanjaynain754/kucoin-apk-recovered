package io.trtc.tuikit.atomicxcore.impl.view.live;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.H0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40058H0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40085V0 f89114a;

    public C40058H0(C40085V0 c40085v0) {
        this.f89114a = c40085v0;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        LiveInfo liveInfo = (LiveInfo) obj;
        LiveData<String> liveData = this.f89114a.f89156a.roomState.roomId;
        Intrinsics.checkNotNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.String>");
        ((MutableLiveData) liveData).setValue(liveInfo.getLiveID());
        LiveData<TUIRoomDefine.UserInfo> liveData2 = this.f89114a.f89156a.roomState.ownerInfo;
        Intrinsics.checkNotNull(liveData2, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.UserInfo>");
        ((MutableLiveData) liveData2).setValue(AbstractC40043A.m88426a(liveInfo.getLiveOwner()));
        LiveData<Integer> liveData3 = this.f89114a.f89156a.roomState.maxCoGuestCount;
        Intrinsics.checkNotNull(liveData3, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Int>");
        ((MutableLiveData) liveData3).setValue(Boxing.boxInt(liveInfo.getMaxSeatCount()));
        return Unit.INSTANCE;
    }
}
