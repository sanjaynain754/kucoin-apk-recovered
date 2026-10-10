package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.live.BattleStore;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.l0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40113l0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89218a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40085V0 f89219b;

    /* JADX INFO: renamed from: c */
    public int f89220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40113l0(C40085V0 c40085v0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f89219b = c40085v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89218a = obj;
        this.f89220c |= Integer.MIN_VALUE;
        return C40085V0.m88466a(this.f89219b, (BattleStore) null, this);
    }
}
