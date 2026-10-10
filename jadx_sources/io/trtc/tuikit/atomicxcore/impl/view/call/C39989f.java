package io.trtc.tuikit.atomicxcore.impl.view.call;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.f */
/* JADX INFO: loaded from: classes61.dex */
public final class C39989f extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88931a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40040x f88932b;

    /* JADX INFO: renamed from: c */
    public int f88933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39989f(C40040x c40040x, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f88932b = c40040x;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f88931a = obj;
        this.f88933c |= Integer.MIN_VALUE;
        return C40040x.m88417c(this.f88932b, this);
    }
}
