package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.D */
/* JADX INFO: loaded from: classes61.dex */
public final class C40049D extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89097a;

    /* JADX INFO: renamed from: b */
    public int f89098b;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89097a = obj;
        this.f89098b |= Integer.MIN_VALUE;
        return AbstractC40069N.m88437b((LiveCoreView) null, this);
    }

    public C40049D(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }
}
