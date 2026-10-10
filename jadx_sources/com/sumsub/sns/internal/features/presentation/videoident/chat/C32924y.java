package com.sumsub.sns.internal.features.presentation.videoident.chat;

import com.sumsub.sentry.android.AbstractC27920h;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.chat.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32924y extends SNSVideoChatState {

    /* JADX INFO: renamed from: a */
    public final boolean f67367a;

    /* JADX INFO: renamed from: b */
    public final boolean f67368b;

    /* JADX INFO: renamed from: c */
    public final boolean f67369c;

    /* JADX INFO: renamed from: d */
    public final boolean f67370d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32924y)) {
            return false;
        }
        C32924y c32924y = (C32924y) obj;
        return this.f67367a == c32924y.f67367a && this.f67368b == c32924y.f67368b && this.f67369c == c32924y.f67369c && this.f67370d == c32924y.f67370d;
    }

    public C32924y(boolean z11, boolean z12, boolean z13, boolean z14) {
        super("ParticipantConnected", null);
        this.f67367a = z11;
        this.f67368b = z12;
        this.f67369c = z13;
        this.f67370d = z14;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67370d) + AbstractC27920h.m69001a(this.f67369c, AbstractC27920h.m69001a(this.f67368b, Boolean.hashCode(this.f67367a) * 31, 31), 31);
    }

    @Override // com.sumsub.sns.internal.features.presentation.videoident.chat.SNSVideoChatState
    public final String toString() {
        return "SNSParticipantConnected(hasAudioTrack=" + this.f67367a + ", hasVideoTrack=" + this.f67368b + ", hasDataTrack=" + this.f67369c + ", isReconnected=" + this.f67370d + ")";
    }
}
