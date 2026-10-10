package io.trtc.tuikit.atomicxcore.impl.view.call;

import io.trtc.tuikit.atomicxcore.api.call.CallParticipantInfo;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.i */
/* JADX INFO: loaded from: classes61.dex */
public final class C40013i implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40040x f89006a;

    public C40013i(C40040x c40040x) {
        this.f89006a = c40040x;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        for (CallParticipantInfo callParticipantInfo : (LinkedHashSet) obj) {
            if (Intrinsics.areEqual(callParticipantInfo.getId(), this.f89006a.f89079l.getId())) {
                C40040x c40040x = this.f89006a;
                Intrinsics.checkNotNull(callParticipantInfo);
                c40040x.f89079l.setStatus(callParticipantInfo.getStatus());
                c40040x.f89079l.setRemark(callParticipantInfo.getRemark());
                c40040x.f89079l.setName(callParticipantInfo.getName());
                c40040x.f89079l.setCameraOpened(callParticipantInfo.isCameraOpened());
                c40040x.f89079l.setMicrophoneOpened(callParticipantInfo.isMicrophoneOpened());
                this.f89006a.m88425c();
            }
        }
        return Unit.INSTANCE;
    }
}
