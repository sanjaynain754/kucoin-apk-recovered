package io.trtc.tuikit.atomicxcore.impl.view.call.p851float;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.float.d */
/* JADX INFO: loaded from: classes61.dex */
public final class C39993d extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88940a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40002m f88941b;

    /* JADX INFO: renamed from: c */
    public int f88942c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39993d(C40002m c40002m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f88941b = c40002m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f88940a = obj;
        this.f88942c |= Integer.MIN_VALUE;
        return C40002m.m88389b(this.f88941b, this);
    }
}
