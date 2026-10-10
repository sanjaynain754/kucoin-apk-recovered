package io.trtc.tuikit.atomicxcore.impl.view.call.pip;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.pip.c */
/* JADX INFO: loaded from: classes61.dex */
public final class C40023c extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89025a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40032l f89026b;

    /* JADX INFO: renamed from: c */
    public int f89027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40023c(C40032l c40032l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f89026b = c40032l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89025a = obj;
        this.f89027c |= Integer.MIN_VALUE;
        return C40032l.m88408b(this.f89026b, this);
    }
}
