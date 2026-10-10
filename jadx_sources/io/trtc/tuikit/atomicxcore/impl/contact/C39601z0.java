package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import kotlinx.coroutines.C41716o;
import p852kotlin.Result;
import p852kotlin.Unit;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.z0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39601z0 implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C41716o f87958a;

    public C39601z0(C41716o c41716o) {
        this.f87958a = c41716o;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        C41716o c41716o = this.f87958a;
        Result.Companion companion = Result.INSTANCE;
        AbstractC39552b.m88278a(new C39497e(Integer.valueOf(i11), str), c41716o);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        C41716o c41716o = this.f87958a;
        Result.Companion companion = Result.INSTANCE;
        c41716o.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
    }
}
