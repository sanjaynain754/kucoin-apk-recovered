package io.trtc.tuikit.atomicxcore.impl.view.call.pip;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.pip.a */
/* JADX INFO: loaded from: classes61.dex */
public final class C40021a extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89021a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40032l f89022b;

    /* JADX INFO: renamed from: c */
    public int f89023c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40021a(C40032l c40032l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f89022b = c40032l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89021a = obj;
        this.f89023c |= Integer.MIN_VALUE;
        return C40032l.m88407a(this.f89022b, this);
    }
}
