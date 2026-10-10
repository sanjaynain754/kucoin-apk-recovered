package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.B */
/* JADX INFO: loaded from: classes61.dex */
public final class C40045B extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89089a;

    /* JADX INFO: renamed from: b */
    public int f89090b;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89089a = obj;
        this.f89090b |= Integer.MIN_VALUE;
        return AbstractC40069N.m88428a((LiveCoreView) null, this);
    }

    public C40045B(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }
}
