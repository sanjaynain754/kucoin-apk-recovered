package com.kubi.payment.track;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: PaymentTrackData.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/track/ThirdBuyTrackData;", "Lcom/kubi/payment/track/PaymentTrackData;", "payChannel", "", "payMethod", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPayChannel", "()Ljava/lang/String;", "getPayMethod", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ThirdBuyTrackData extends PaymentTrackData {

    @Nullable
    private final String payChannel;

    @Nullable
    private final String payMethod;

    /* JADX WARN: Multi-variable type inference failed */
    public ThirdBuyTrackData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ThirdBuyTrackData(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }

    @Nullable
    public final String getPayChannel() {
        return this.payChannel;
    }

    @Nullable
    public final String getPayMethod() {
        return this.payMethod;
    }

    public ThirdBuyTrackData(@Nullable String str, @Nullable String str2) {
        this.payChannel = str;
        this.payMethod = str2;
    }
}
