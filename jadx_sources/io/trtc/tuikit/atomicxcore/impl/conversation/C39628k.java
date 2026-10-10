package io.trtc.tuikit.atomicxcore.impl.conversation;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.k */
/* JADX INFO: loaded from: classes61.dex */
public final class C39628k implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39606E f88036a;

    public C39628k(C39606E c39606e) {
        this.f88036a = c39606e;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C39606E c39606e = this.f88036a;
        c39606e.f87974b.removeCallbacks(c39606e.f87976d);
        C39606E c39606e2 = this.f88036a;
        c39606e2.f87975c = false;
        c39606e2.m88283a();
        return Unit.INSTANCE;
    }
}
