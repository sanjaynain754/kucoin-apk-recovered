package io.trtc.tuikit.atomicxcore.impl.view.call;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.h */
/* JADX INFO: loaded from: classes61.dex */
public final class C40012h extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89003a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40040x f89004b;

    /* JADX INFO: renamed from: c */
    public int f89005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40012h(C40040x c40040x, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f89004b = c40040x;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89003a = obj;
        this.f89005c |= Integer.MIN_VALUE;
        return C40040x.m88418d(this.f89004b, this);
    }
}
