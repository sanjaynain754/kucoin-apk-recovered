package com.kubi.payment.track;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: PaymentTrackData.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/track/FastTrackData;", "Lcom/kubi/payment/track/PaymentTrackData;", "side", "", "payType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSide", "()Ljava/lang/String;", "getPayType", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FastTrackData extends PaymentTrackData {

    @Nullable
    private final String payType;

    @Nullable
    private final String side;

    /* JADX WARN: Multi-variable type inference failed */
    public FastTrackData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ FastTrackData(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }

    @Nullable
    public final String getPayType() {
        return this.payType;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    public FastTrackData(@Nullable String str, @Nullable String str2) {
        this.side = str;
        this.payType = str2;
    }
}
