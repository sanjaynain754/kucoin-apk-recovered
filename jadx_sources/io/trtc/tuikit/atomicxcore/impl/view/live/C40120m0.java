package io.trtc.tuikit.atomicxcore.impl.view.live;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import io.trtc.tuikit.atomicxcore.api.live.BattleInfo;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.m0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40120m0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40085V0 f89244a;

    public C40120m0(C40085V0 c40085v0) {
        this.f89244a = c40085v0;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        BattleInfo battleInfo = (BattleInfo) obj;
        LiveData<String> liveData = this.f89244a.f89156a.battleState.battleId;
        Intrinsics.checkNotNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.String>");
        ((MutableLiveData) liveData).setValue(battleInfo != null ? battleInfo.getBattleID() : null);
        return Unit.INSTANCE;
    }
}
