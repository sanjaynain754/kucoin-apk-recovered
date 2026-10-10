package io.trtc.tuikit.atomicxcore.impl.view.call;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.b */
/* JADX INFO: loaded from: classes61.dex */
public final class C39985b extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88923a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40040x f88924b;

    /* JADX INFO: renamed from: c */
    public int f88925c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39985b(C40040x c40040x, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f88924b = c40040x;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f88923a = obj;
        this.f88925c |= Integer.MIN_VALUE;
        return C40040x.m88414a(this.f88924b, this);
    }
}
