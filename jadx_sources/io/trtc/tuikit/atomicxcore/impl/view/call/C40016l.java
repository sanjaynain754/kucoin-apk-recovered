package io.trtc.tuikit.atomicxcore.impl.view.call;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.l */
/* JADX INFO: loaded from: classes61.dex */
public final class C40016l extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89011a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40040x f89012b;

    /* JADX INFO: renamed from: c */
    public int f89013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40016l(C40040x c40040x, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f89012b = c40040x;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89011a = obj;
        this.f89013c |= Integer.MIN_VALUE;
        return C40040x.m88420f(this.f89012b, this);
    }
}
