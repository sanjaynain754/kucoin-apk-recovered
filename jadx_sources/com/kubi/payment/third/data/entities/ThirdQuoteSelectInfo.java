package com.kubi.payment.third.data.entities;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThirdQuote.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, m90084d2 = {"Lcom/kubi/payment/third/data/entities/ThirdQuoteSelectInfo;", "", "fiatSelected", "", "currencySelected", "payMethodIdSelected", "thirdQuoteInfo", "Lcom/kubi/payment/third/data/entities/ThirdQuoteInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/payment/third/data/entities/ThirdQuoteInfo;)V", "getFiatSelected", "()Ljava/lang/String;", "setFiatSelected", "(Ljava/lang/String;)V", "getCurrencySelected", "setCurrencySelected", "getPayMethodIdSelected", "setPayMethodIdSelected", "getThirdQuoteInfo", "()Lcom/kubi/payment/third/data/entities/ThirdQuoteInfo;", "setThirdQuoteInfo", "(Lcom/kubi/payment/third/data/entities/ThirdQuoteInfo;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ThirdQuoteSelectInfo {

    @Nullable
    private String currencySelected;

    @Nullable
    private String fiatSelected;

    @Nullable
    private String payMethodIdSelected;

    @Nullable
    private ThirdQuoteInfo thirdQuoteInfo;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThirdQuoteSelectInfo)) {
            return false;
        }
        ThirdQuoteSelectInfo thirdQuoteSelectInfo = (ThirdQuoteSelectInfo) other;
        return Intrinsics.areEqual(this.fiatSelected, thirdQuoteSelectInfo.fiatSelected) && Intrinsics.areEqual(this.currencySelected, thirdQuoteSelectInfo.currencySelected) && Intrinsics.areEqual(this.payMethodIdSelected, thirdQuoteSelectInfo.payMethodIdSelected) && Intrinsics.areEqual(this.thirdQuoteInfo, thirdQuoteSelectInfo.thirdQuoteInfo);
    }

    public static /* synthetic */ ThirdQuoteSelectInfo copy$default(ThirdQuoteSelectInfo thirdQuoteSelectInfo, String str, String str2, String str3, ThirdQuoteInfo thirdQuoteInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = thirdQuoteSelectInfo.fiatSelected;
        }
        if ((i11 & 2) != 0) {
            str2 = thirdQuoteSelectInfo.currencySelected;
        }
        if ((i11 & 4) != 0) {
            str3 = thirdQuoteSelectInfo.payMethodIdSelected;
        }
        if ((i11 & 8) != 0) {
            thirdQuoteInfo = thirdQuoteSelectInfo.thirdQuoteInfo;
        }
        return thirdQuoteSelectInfo.copy(str, str2, str3, thirdQuoteInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFiatSelected() {
        return this.fiatSelected;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrencySelected() {
        return this.currencySelected;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPayMethodIdSelected() {
        return this.payMethodIdSelected;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ThirdQuoteInfo getThirdQuoteInfo() {
        return this.thirdQuoteInfo;
    }

    @NotNull
    public final ThirdQuoteSelectInfo copy(@Nullable String fiatSelected, @Nullable String currencySelected, @Nullable String payMethodIdSelected, @Nullable ThirdQuoteInfo thirdQuoteInfo) {
        return new ThirdQuoteSelectInfo(fiatSelected, currencySelected, payMethodIdSelected, thirdQuoteInfo);
    }

    @Nullable
    public final String getCurrencySelected() {
        return this.currencySelected;
    }

    @Nullable
    public final String getFiatSelected() {
        return this.fiatSelected;
    }

    @Nullable
    public final String getPayMethodIdSelected() {
        return this.payMethodIdSelected;
    }

    @Nullable
    public final ThirdQuoteInfo getThirdQuoteInfo() {
        return this.thirdQuoteInfo;
    }

    public int hashCode() {
        String str = this.fiatSelected;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencySelected;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.payMethodIdSelected;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ThirdQuoteInfo thirdQuoteInfo = this.thirdQuoteInfo;
        return iHashCode3 + (thirdQuoteInfo != null ? thirdQuoteInfo.hashCode() : 0);
    }

    public final void setCurrencySelected(@Nullable String str) {
        this.currencySelected = str;
    }

    public final void setFiatSelected(@Nullable String str) {
        this.fiatSelected = str;
    }

    public final void setPayMethodIdSelected(@Nullable String str) {
        this.payMethodIdSelected = str;
    }

    public final void setThirdQuoteInfo(@Nullable ThirdQuoteInfo thirdQuoteInfo) {
        this.thirdQuoteInfo = thirdQuoteInfo;
    }

    @NotNull
    public String toString() {
        return "ThirdQuoteSelectInfo(fiatSelected=" + this.fiatSelected + ", currencySelected=" + this.currencySelected + ", payMethodIdSelected=" + this.payMethodIdSelected + ", thirdQuoteInfo=" + this.thirdQuoteInfo + ')';
    }

    public ThirdQuoteSelectInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable ThirdQuoteInfo thirdQuoteInfo) {
        this.fiatSelected = str;
        this.currencySelected = str2;
        this.payMethodIdSelected = str3;
        this.thirdQuoteInfo = thirdQuoteInfo;
    }
}
