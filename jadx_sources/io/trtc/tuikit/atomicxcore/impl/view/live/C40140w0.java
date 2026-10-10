package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.w0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40140w0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89280a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40085V0 f89281b;

    /* JADX INFO: renamed from: c */
    public int f89282c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40140w0(C40085V0 c40085v0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f89281b = c40085v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89280a = obj;
        this.f89282c |= Integer.MIN_VALUE;
        return C40085V0.m88465a(this.f89281b, (DeviceStore) null, this);
    }
}
