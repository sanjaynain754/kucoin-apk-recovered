package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.K0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40064K0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89125a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40085V0 f89126b;

    /* JADX INFO: renamed from: c */
    public int f89127c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40064K0(C40085V0 c40085v0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f89126b = c40085v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89125a = obj;
        this.f89127c |= Integer.MIN_VALUE;
        return C40085V0.m88471b(this.f89126b, (DeviceStore) null, this);
    }
}
