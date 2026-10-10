package io.trtc.tuikit.atomicxcore.impl.view.live;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.R0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40077R0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89144a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40085V0 f89145b;

    /* JADX INFO: renamed from: c */
    public int f89146c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40077R0(C40085V0 c40085v0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f89145b = c40085v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89144a = obj;
        this.f89146c |= Integer.MIN_VALUE;
        return C40085V0.m88478d(this.f89145b, null, this);
    }
}
