package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.P0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40074P0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89140a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40085V0 f89141b;

    /* JADX INFO: renamed from: c */
    public int f89142c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40074P0(C40085V0 c40085v0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f89141b = c40085v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89140a = obj;
        this.f89142c |= Integer.MIN_VALUE;
        return C40085V0.m88475c(this.f89141b, (DeviceStore) null, this);
    }
}
