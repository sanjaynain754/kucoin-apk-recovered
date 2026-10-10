package io.trtc.tuikit.atomicxcore.impl.view.call.pip;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.pip.b */
/* JADX INFO: loaded from: classes61.dex */
public final class C40022b implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40032l f89024a;

    public C40022b(C40032l c40032l) {
        this.f89024a = c40032l;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        this.f89024a.m88412c();
        return Unit.INSTANCE;
    }
}
