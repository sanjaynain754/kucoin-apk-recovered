package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.contact.ReceiveMessageOpt;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import kotlinx.coroutines.C41716o;
import p852kotlin.Result;
import p852kotlin.Unit;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.q */
/* JADX INFO: loaded from: classes61.dex */
public final class C39582q implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39586s f87895a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReceiveMessageOpt f87896b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C41716o f87897c;

    public C39582q(C39586s c39586s, ReceiveMessageOpt receiveMessageOpt, C41716o c41716o) {
        this.f87895a = c39586s;
        this.f87896b = receiveMessageOpt;
        this.f87897c = c41716o;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        C41716o c41716o = this.f87897c;
        Result.Companion companion = Result.INSTANCE;
        AbstractC39552b.m88278a(new C39497e(Integer.valueOf(i11), str), c41716o);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        this.f87895a.f87918k.setValue(this.f87896b);
        this.f87895a.f87914g.setValue(Boolean.valueOf(this.f87896b == ReceiveMessageOpt.NOT_NOTIFY));
        C41716o c41716o = this.f87897c;
        Result.Companion companion = Result.INSTANCE;
        c41716o.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
    }
}
