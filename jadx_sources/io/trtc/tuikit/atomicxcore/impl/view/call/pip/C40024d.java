package io.trtc.tuikit.atomicxcore.impl.view.call.pip;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.pip.d */
/* JADX INFO: loaded from: classes61.dex */
public final class C40024d implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40032l f89028a;

    public C40024d(C40032l c40032l) {
        this.f89028a = c40032l;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        this.f89028a.m88413d();
        return Unit.INSTANCE;
    }
}
