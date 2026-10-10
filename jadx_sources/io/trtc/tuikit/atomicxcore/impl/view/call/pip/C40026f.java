package io.trtc.tuikit.atomicxcore.impl.view.call.pip;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.pip.f */
/* JADX INFO: loaded from: classes61.dex */
public final class C40026f implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40032l f89032a;

    public C40026f(C40032l c40032l) {
        this.f89032a = c40032l;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        this.f89032a.m88413d();
        return Unit.INSTANCE;
    }
}
