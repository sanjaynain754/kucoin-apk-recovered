package com.kubi.payment.track;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: PaymentTrackData.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/track/P2PTrackData;", "Lcom/kubi/payment/track/PaymentTrackData;", "side", "", "<init>", "(Ljava/lang/String;)V", "getSide", "()Ljava/lang/String;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2PTrackData extends PaymentTrackData {

    @Nullable
    private final String side;

    /* JADX WARN: Multi-variable type inference failed */
    public P2PTrackData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ P2PTrackData(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str);
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    public P2PTrackData(@Nullable String str) {
        this.side = str;
    }
}
