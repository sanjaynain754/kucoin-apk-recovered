package io.trtc.tuikit.atomicxcore.impl.live;

import android.content.Context;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.f1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39736f1 {

    /* JADX INFO: renamed from: a */
    public final int f88299a;

    /* JADX INFO: renamed from: b */
    public final String f88300b;

    /* JADX INFO: renamed from: c */
    public final String f88301c;

    /* JADX INFO: renamed from: d */
    public final Context f88302d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39736f1)) {
            return false;
        }
        C39736f1 c39736f1 = (C39736f1) obj;
        return this.f88299a == c39736f1.f88299a && Intrinsics.areEqual(this.f88300b, c39736f1.f88300b) && Intrinsics.areEqual(this.f88301c, c39736f1.f88301c) && Intrinsics.areEqual(this.f88302d, c39736f1.f88302d);
    }

    public final int hashCode() {
        int iM88220a = AbstractC39391a.m88220a(this.f88301c, AbstractC39391a.m88220a(this.f88300b, Integer.hashCode(this.f88299a) * 31, 31), 31);
        Context context = this.f88302d;
        return iM88220a + (context == null ? 0 : context.hashCode());
    }

    public final String toString() {
        return "LoginParam(sdkAppId=" + this.f88299a + ", userId=" + this.f88300b + ", userSig=" + this.f88301c + ", context=" + this.f88302d + ')';
    }

    public C39736f1(int i11, String userId, String userSig, Context context) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userSig, "userSig");
        this.f88299a = i11;
        this.f88300b = userId;
        this.f88301c = userSig;
        this.f88302d = context;
    }
}
