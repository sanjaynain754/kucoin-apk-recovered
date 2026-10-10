package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.Q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30489Q {

    /* JADX INFO: renamed from: a */
    public final String f61546a;

    /* JADX INFO: renamed from: b */
    public final String f61547b;

    /* JADX INFO: renamed from: c */
    public final boolean f61548c = true;

    public C30489Q(String str, String str2) {
        this.f61546a = str;
        this.f61547b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30489Q)) {
            return false;
        }
        C30489Q c30489q = (C30489Q) obj;
        return Intrinsics.areEqual(this.f61546a, c30489q.f61546a) && Intrinsics.areEqual(this.f61547b, c30489q.f61547b) && this.f61548c == c30489q.f61548c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f61548c) + ((this.f61547b.hashCode() + (this.f61546a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String str = this.f61546a;
        String str2 = this.f61547b;
        return "FrameHint(icon=" + str + ", text=" + ((Object) str2) + ", loading=" + this.f61548c + ")";
    }

    public C30489Q(String str, String str2, int i11) {
        this.f61546a = str;
        this.f61547b = str2;
    }
}
