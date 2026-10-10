package com.sumsub.sns.internal.features.presentation.videoident.chat;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.chat.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32923x extends SNSVideoChatState {

    /* JADX INFO: renamed from: a */
    public final Throwable f67366a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32923x) && Intrinsics.areEqual(this.f67366a, ((C32923x) obj).f67366a);
    }

    public C32923x() {
        super("Disconnected", null);
        this.f67366a = null;
    }

    public final int hashCode() {
        Throwable th2 = this.f67366a;
        if (th2 == null) {
            return 0;
        }
        return th2.hashCode();
    }

    @Override // com.sumsub.sns.internal.features.presentation.videoident.chat.SNSVideoChatState
    public final String toString() {
        return "SNSDisconnected(error=" + this.f67366a + ")";
    }
}
