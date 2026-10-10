package io.trtc.tuikit.atomicxcore.impl.view.call.grid;

import io.trtc.tuikit.atomicxcore.impl.view.call.C40040x;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.grid.d */
/* JADX INFO: loaded from: classes61.dex */
public final class C40007d {

    /* JADX INFO: renamed from: a */
    public String f88987a = "";

    /* JADX INFO: renamed from: b */
    public C40040x f88988b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C40007d) {
            return Intrinsics.areEqual(this.f88987a, ((C40007d) obj).f88987a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f88987a.hashCode();
    }
}
