package io.trtc.tuikit.atomicxcore.impl.contact;

import io.trtc.tuikit.atomicxcore.impl.common.InterfaceC39513u;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.L */
/* JADX INFO: loaded from: classes61.dex */
public final class C39536L implements InterfaceC39513u {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39539O f87791a;

    public C39536L(C39539O c39539o) {
        this.f87791a = c39539o;
    }

    @Override // io.trtc.tuikit.atomicxcore.impl.common.InterfaceC39513u
    /* JADX INFO: renamed from: a */
    public final void mo82103a(String name, Object data) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(data, "data");
        if (Intrinsics.areEqual(name, "groupApplicationUnreadCountCleared")) {
            this.f87791a.f87804g.setValue(0);
        }
    }
}
