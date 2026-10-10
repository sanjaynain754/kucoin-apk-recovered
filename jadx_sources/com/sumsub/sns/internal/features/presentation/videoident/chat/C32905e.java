package com.sumsub.sns.internal.features.presentation.videoident.chat;

import com.sumsub.sentry.android.AbstractC27920h;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.chat.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32905e {

    /* JADX INFO: renamed from: a */
    public final boolean f67309a;

    /* JADX INFO: renamed from: b */
    public final boolean f67310b;

    /* JADX INFO: renamed from: c */
    public final boolean f67311c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32905e)) {
            return false;
        }
        C32905e c32905e = (C32905e) obj;
        return this.f67309a == c32905e.f67309a && this.f67310b == c32905e.f67310b && this.f67311c == c32905e.f67311c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67311c) + AbstractC27920h.m69001a(this.f67310b, AbstractC27920h.m69001a(false, Boolean.hashCode(this.f67309a) * 31, 31), 31);
    }

    public final String toString() {
        return "ParticipantState(connected=" + this.f67309a + ", audioTrackSubscribed=false, videoTrackSubscribed=" + this.f67310b + ", dataTrackSubscribed=" + this.f67311c + ")";
    }

    public C32905e(boolean z11, boolean z12, boolean z13) {
        this.f67309a = z11;
        this.f67310b = z12;
        this.f67311c = z13;
    }
}
