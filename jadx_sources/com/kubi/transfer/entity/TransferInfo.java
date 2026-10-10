package com.kubi.transfer.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TransferInfo.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Jo\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006("}, m90084d2 = {"Lcom/kubi/transfer/entity/TransferInfo;", "", "payAccountType", "", "recAccountType", "currencies", "", "Lcom/kubi/transfer/entity/Currency;", "recTag", "payTag", "bizType", "transferMode", "subBizType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPayAccountType", "()Ljava/lang/String;", "getRecAccountType", "getCurrencies", "()Ljava/util/List;", "getRecTag", "getPayTag", "getBizType", "getTransferMode", "getSubBizType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TransferInfo {

    @Nullable
    private final String bizType;

    @Nullable
    private final List<Currency> currencies;

    @Nullable
    private final String payAccountType;

    @Nullable
    private final String payTag;

    @Nullable
    private final String recAccountType;

    @Nullable
    private final String recTag;

    @Nullable
    private final String subBizType;

    @Nullable
    private final String transferMode;

    public TransferInfo(@Nullable String str, @Nullable String str2, @Nullable List<Currency> list, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.payAccountType = str;
        this.recAccountType = str2;
        this.currencies = list;
        this.recTag = str3;
        this.payTag = str4;
        this.bizType = str5;
        this.transferMode = str6;
        this.subBizType = str7;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferInfo)) {
            return false;
        }
        TransferInfo transferInfo = (TransferInfo) other;
        return Intrinsics.areEqual(this.payAccountType, transferInfo.payAccountType) && Intrinsics.areEqual(this.recAccountType, transferInfo.recAccountType) && Intrinsics.areEqual(this.currencies, transferInfo.currencies) && Intrinsics.areEqual(this.recTag, transferInfo.recTag) && Intrinsics.areEqual(this.payTag, transferInfo.payTag) && Intrinsics.areEqual(this.bizType, transferInfo.bizType) && Intrinsics.areEqual(this.transferMode, transferInfo.transferMode) && Intrinsics.areEqual(this.subBizType, transferInfo.subBizType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransferInfo copy$default(TransferInfo transferInfo, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = transferInfo.payAccountType;
        }
        if ((i11 & 2) != 0) {
            str2 = transferInfo.recAccountType;
        }
        if ((i11 & 4) != 0) {
            list = transferInfo.currencies;
        }
        if ((i11 & 8) != 0) {
            str3 = transferInfo.recTag;
        }
        if ((i11 & 16) != 0) {
            str4 = transferInfo.payTag;
        }
        if ((i11 & 32) != 0) {
            str5 = transferInfo.bizType;
        }
        if ((i11 & 64) != 0) {
            str6 = transferInfo.transferMode;
        }
        if ((i11 & 128) != 0) {
            str7 = transferInfo.subBizType;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return transferInfo.copy(str, str2, list, str3, str10, str11, str8, str9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPayAccountType() {
        return this.payAccountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRecAccountType() {
        return this.recAccountType;
    }

    @Nullable
    public final List<Currency> component3() {
        return this.currencies;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRecTag() {
        return this.recTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPayTag() {
        return this.payTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTransferMode() {
        return this.transferMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSubBizType() {
        return this.subBizType;
    }

    @NotNull
    public final TransferInfo copy(@Nullable String payAccountType, @Nullable String recAccountType, @Nullable List<Currency> currencies, @Nullable String recTag, @Nullable String payTag, @Nullable String bizType, @Nullable String transferMode, @Nullable String subBizType) {
        return new TransferInfo(payAccountType, recAccountType, currencies, recTag, payTag, bizType, transferMode, subBizType);
    }

    @Nullable
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    public final List<Currency> getCurrencies() {
        return this.currencies;
    }

    @Nullable
    public final String getPayAccountType() {
        return this.payAccountType;
    }

    @Nullable
    public final String getPayTag() {
        return this.payTag;
    }

    @Nullable
    public final String getRecAccountType() {
        return this.recAccountType;
    }

    @Nullable
    public final String getRecTag() {
        return this.recTag;
    }

    @Nullable
    public final String getSubBizType() {
        return this.subBizType;
    }

    @Nullable
    public final String getTransferMode() {
        return this.transferMode;
    }

    public int hashCode() {
        String str = this.payAccountType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.recAccountType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Currency> list = this.currencies;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.recTag;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.payTag;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bizType;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.transferMode;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.subBizType;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TransferInfo(payAccountType=" + this.payAccountType + ", recAccountType=" + this.recAccountType + ", currencies=" + this.currencies + ", recTag=" + this.recTag + ", payTag=" + this.payTag + ", bizType=" + this.bizType + ", transferMode=" + this.transferMode + ", subBizType=" + this.subBizType + ')';
    }

    public /* synthetic */ TransferInfo(String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i11 & 8) != 0 ? "DEFAULT" : str3, (i11 & 16) != 0 ? "DEFAULT" : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7);
    }
}
