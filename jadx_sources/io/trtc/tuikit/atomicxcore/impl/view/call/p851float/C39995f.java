package io.trtc.tuikit.atomicxcore.impl.view.call.p851float;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.float.f */
/* JADX INFO: loaded from: classes61.dex */
public final class C39995f extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88944a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40002m f88945b;

    /* JADX INFO: renamed from: c */
    public int f88946c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39995f(C40002m c40002m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f88945b = c40002m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f88944a = obj;
        this.f88946c |= Integer.MIN_VALUE;
        return C40002m.m88390c(this.f88945b, this);
    }
}
