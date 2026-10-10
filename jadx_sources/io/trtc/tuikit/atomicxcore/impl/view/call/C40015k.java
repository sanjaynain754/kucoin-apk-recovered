package io.trtc.tuikit.atomicxcore.impl.view.call;

import io.trtc.tuikit.atomicxcore.api.call.CallParticipantInfo;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.k */
/* JADX INFO: loaded from: classes61.dex */
public final class C40015k implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40040x f89010a;

    public C40015k(C40040x c40040x) {
        this.f89010a = c40040x;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        CallParticipantInfo callParticipantInfo = (CallParticipantInfo) obj;
        this.f89010a.f89079l.setStatus(callParticipantInfo.getStatus());
        this.f89010a.f89079l.setRemark(callParticipantInfo.getRemark());
        this.f89010a.f89079l.setName(callParticipantInfo.getName());
        this.f89010a.m88425c();
        return Unit.INSTANCE;
    }
}
