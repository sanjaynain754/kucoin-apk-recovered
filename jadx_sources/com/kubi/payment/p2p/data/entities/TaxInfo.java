package com.kubi.payment.p2p.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TaxInfo.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jn\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\n\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006'"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/TaxInfo;", "", "hit", "", "taxType", "", "taxRate", "alertTitle", "alertMessage", BridgeParamKeyKt.SHARE_KEY_LINKURL, "isSpecified", "tradeProductUrl", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getHit", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTaxType", "()Ljava/lang/String;", "getTaxRate", "getAlertTitle", "getAlertMessage", "getLinkUrl", "getTradeProductUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/payment/p2p/data/entities/TaxInfo;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TaxInfo {

    @SerializedName("userListRemindDesc")
    @Nullable
    private final String alertMessage;

    @SerializedName("userListRemindTitle")
    @Nullable
    private final String alertTitle;

    @SerializedName("hit")
    @Nullable
    private final Boolean hit;

    @SerializedName("needConfirm")
    @Nullable
    private final Boolean isSpecified;

    @SerializedName("userListRemindAppUrl")
    @Nullable
    private final String linkUrl;

    @SerializedName("taxRate")
    @Nullable
    private final String taxRate;

    @SerializedName("taxType")
    @Nullable
    private final String taxType;

    @SerializedName("appTradeProductUrl")
    @Nullable
    private final String tradeProductUrl;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxInfo)) {
            return false;
        }
        TaxInfo taxInfo = (TaxInfo) other;
        return Intrinsics.areEqual(this.hit, taxInfo.hit) && Intrinsics.areEqual(this.taxType, taxInfo.taxType) && Intrinsics.areEqual(this.taxRate, taxInfo.taxRate) && Intrinsics.areEqual(this.alertTitle, taxInfo.alertTitle) && Intrinsics.areEqual(this.alertMessage, taxInfo.alertMessage) && Intrinsics.areEqual(this.linkUrl, taxInfo.linkUrl) && Intrinsics.areEqual(this.isSpecified, taxInfo.isSpecified) && Intrinsics.areEqual(this.tradeProductUrl, taxInfo.tradeProductUrl);
    }

    public static /* synthetic */ TaxInfo copy$default(TaxInfo taxInfo, Boolean bool, String str, String str2, String str3, String str4, String str5, Boolean bool2, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = taxInfo.hit;
        }
        if ((i11 & 2) != 0) {
            str = taxInfo.taxType;
        }
        if ((i11 & 4) != 0) {
            str2 = taxInfo.taxRate;
        }
        if ((i11 & 8) != 0) {
            str3 = taxInfo.alertTitle;
        }
        if ((i11 & 16) != 0) {
            str4 = taxInfo.alertMessage;
        }
        if ((i11 & 32) != 0) {
            str5 = taxInfo.linkUrl;
        }
        if ((i11 & 64) != 0) {
            bool2 = taxInfo.isSpecified;
        }
        if ((i11 & 128) != 0) {
            str6 = taxInfo.tradeProductUrl;
        }
        Boolean bool3 = bool2;
        String str7 = str6;
        String str8 = str4;
        String str9 = str5;
        return taxInfo.copy(bool, str, str2, str3, str8, str9, bool3, str7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getHit() {
        return this.hit;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTaxType() {
        return this.taxType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTaxRate() {
        return this.taxRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAlertTitle() {
        return this.alertTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAlertMessage() {
        return this.alertMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsSpecified() {
        return this.isSpecified;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTradeProductUrl() {
        return this.tradeProductUrl;
    }

    @NotNull
    public final TaxInfo copy(@Nullable Boolean hit, @Nullable String taxType, @Nullable String taxRate, @Nullable String alertTitle, @Nullable String alertMessage, @Nullable String linkUrl, @Nullable Boolean isSpecified, @Nullable String tradeProductUrl) {
        return new TaxInfo(hit, taxType, taxRate, alertTitle, alertMessage, linkUrl, isSpecified, tradeProductUrl);
    }

    @Nullable
    public final String getAlertMessage() {
        return this.alertMessage;
    }

    @Nullable
    public final String getAlertTitle() {
        return this.alertTitle;
    }

    @Nullable
    public final Boolean getHit() {
        return this.hit;
    }

    @Nullable
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @Nullable
    public final String getTaxRate() {
        return this.taxRate;
    }

    @Nullable
    public final String getTaxType() {
        return this.taxType;
    }

    @Nullable
    public final String getTradeProductUrl() {
        return this.tradeProductUrl;
    }

    public int hashCode() {
        Boolean bool = this.hit;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.taxType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.taxRate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.alertTitle;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.alertMessage;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.linkUrl;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.isSpecified;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.tradeProductUrl;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    @Nullable
    public final Boolean isSpecified() {
        return this.isSpecified;
    }

    @NotNull
    public String toString() {
        return "TaxInfo(hit=" + this.hit + ", taxType=" + this.taxType + ", taxRate=" + this.taxRate + ", alertTitle=" + this.alertTitle + ", alertMessage=" + this.alertMessage + ", linkUrl=" + this.linkUrl + ", isSpecified=" + this.isSpecified + ", tradeProductUrl=" + this.tradeProductUrl + ')';
    }

    public TaxInfo(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool2, @Nullable String str6) {
        this.hit = bool;
        this.taxType = str;
        this.taxRate = str2;
        this.alertTitle = str3;
        this.alertMessage = str4;
        this.linkUrl = str5;
        this.isSpecified = bool2;
        this.tradeProductUrl = str6;
    }
}
