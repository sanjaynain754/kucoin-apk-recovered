package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.contact.ReceiveMessageOpt;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import kotlinx.coroutines.C41716o;
import p852kotlin.Result;
import p852kotlin.Unit;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.B0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39521B0 implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39531G0 f87722a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReceiveMessageOpt f87723b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C41716o f87724c;

    public C39521B0(C39531G0 c39531g0, ReceiveMessageOpt receiveMessageOpt, C41716o c41716o) {
        this.f87722a = c39531g0;
        this.f87723b = receiveMessageOpt;
        this.f87724c = c41716o;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        C41716o c41716o = this.f87724c;
        Result.Companion companion = Result.INSTANCE;
        AbstractC39552b.m88278a(new C39497e(Integer.valueOf(i11), str), c41716o);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        this.f87722a.f87777s.setValue(this.f87723b);
        this.f87722a.f87765g.setValue(Boolean.valueOf(this.f87723b == ReceiveMessageOpt.NOT_NOTIFY));
        C41716o c41716o = this.f87724c;
        Result.Companion companion = Result.INSTANCE;
        c41716o.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
    }
}
