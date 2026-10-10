package io.trtc.tuikit.atomicxcore.impl.view.call;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.j */
/* JADX INFO: loaded from: classes61.dex */
public final class C40014j extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89007a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40040x f89008b;

    /* JADX INFO: renamed from: c */
    public int f89009c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40014j(C40040x c40040x, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f89008b = c40040x;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89007a = obj;
        this.f89009c |= Integer.MIN_VALUE;
        return C40040x.m88419e(this.f89008b, this);
    }
}
