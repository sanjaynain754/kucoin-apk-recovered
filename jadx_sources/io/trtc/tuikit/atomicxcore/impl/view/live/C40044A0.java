package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.A0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40044A0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89086a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40085V0 f89087b;

    /* JADX INFO: renamed from: c */
    public int f89088c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40044A0(C40085V0 c40085v0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f89087b = c40085v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89086a = obj;
        this.f89088c |= Integer.MIN_VALUE;
        return C40085V0.m88474b(this.f89087b, (CoHostStore) null, this);
    }
}
