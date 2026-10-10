package io.trtc.tuikit.atomicxcore.impl.view.call.p851float;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.float.b */
/* JADX INFO: loaded from: classes61.dex */
public final class C39991b extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88936a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40002m f88937b;

    /* JADX INFO: renamed from: c */
    public int f88938c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39991b(C40002m c40002m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f88937b = c40002m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f88936a = obj;
        this.f88938c |= Integer.MIN_VALUE;
        return C40002m.m88385a(this.f88937b, this);
    }
}
