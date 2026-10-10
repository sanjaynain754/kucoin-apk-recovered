package io.trtc.tuikit.atomicxcore.impl.message;

import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import kotlinx.coroutines.C41716o;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.q0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39855q0 implements CompletionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C41716o f88584a;

    public C39855q0(C41716o c41716o) {
        this.f88584a = c41716o;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
    public final void onFailure(int i11, String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        C41716o c41716o = this.f88584a;
        Result.Companion companion = Result.INSTANCE;
        c41716o.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new C39497e(i11, desc))));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
    public final void onSuccess() {
        C41716o c41716o = this.f88584a;
        Result.Companion companion = Result.INSTANCE;
        c41716o.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
    }
}
