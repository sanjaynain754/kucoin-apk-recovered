package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.I0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40060I0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89117a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40085V0 f89118b;

    /* JADX INFO: renamed from: c */
    public int f89119c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40060I0(C40085V0 c40085v0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f89118b = c40085v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89117a = obj;
        this.f89119c |= Integer.MIN_VALUE;
        return C40085V0.m88476c(this.f89118b, (CoGuestStore) null, this);
    }
}
