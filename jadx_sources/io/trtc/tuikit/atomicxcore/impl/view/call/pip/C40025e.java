package io.trtc.tuikit.atomicxcore.impl.view.call.pip;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.pip.e */
/* JADX INFO: loaded from: classes61.dex */
public final class C40025e extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89029a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40032l f89030b;

    /* JADX INFO: renamed from: c */
    public int f89031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40025e(C40032l c40032l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f89030b = c40032l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89029a = obj;
        this.f89031c |= Integer.MIN_VALUE;
        return C40032l.m88409c(this.f89030b, this);
    }
}
