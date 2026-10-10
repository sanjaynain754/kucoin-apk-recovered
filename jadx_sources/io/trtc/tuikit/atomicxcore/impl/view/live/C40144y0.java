package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.y0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40144y0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89287a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40085V0 f89288b;

    /* JADX INFO: renamed from: c */
    public int f89289c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40144y0(C40085V0 c40085v0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f89288b = c40085v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89287a = obj;
        this.f89289c |= Integer.MIN_VALUE;
        return C40085V0.m88468a(this.f89288b, (CoHostStore) null, this);
    }
}
