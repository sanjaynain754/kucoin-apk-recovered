package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.C0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40048C0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89094a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40085V0 f89095b;

    /* JADX INFO: renamed from: c */
    public int f89096c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40048C0(C40085V0 c40085v0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f89095b = c40085v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89094a = obj;
        this.f89096c |= Integer.MIN_VALUE;
        return C40085V0.m88477c(this.f89095b, (CoHostStore) null, this);
    }
}
