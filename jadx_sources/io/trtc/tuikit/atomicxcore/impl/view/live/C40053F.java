package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.F */
/* JADX INFO: loaded from: classes61.dex */
public final class C40053F extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89105a;

    /* JADX INFO: renamed from: b */
    public int f89106b;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89105a = obj;
        this.f89106b |= Integer.MIN_VALUE;
        return AbstractC40069N.m88439c((LiveCoreView) null, this);
    }

    public C40053F(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }
}
