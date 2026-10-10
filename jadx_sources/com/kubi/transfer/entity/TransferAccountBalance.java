package com.kubi.transfer.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TransferAccountBalance.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003Jg\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0017¨\u0006'"}, m90084d2 = {"Lcom/kubi/transfer/entity/TransferAccountBalance;", "", "accountTag", "", "accountType", "availableBalance", FirebaseAnalytics.Param.CURRENCY, "toAccountTag", "toAccountType", "totalBalance", "usedBalance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountTag", "()Ljava/lang/String;", "getAccountType", "getAvailableBalance", "getCurrency", "getToAccountTag", "getToAccountType", "getTotalBalance", "getUsedBalance", "setUsedBalance", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TransferAccountBalance {

    @Nullable
    private final String accountTag;

    @Nullable
    private final String accountType;

    @Nullable
    private final String availableBalance;

    @Nullable
    private final String currency;

    @Nullable
    private final String toAccountTag;

    @Nullable
    private final String toAccountType;

    @Nullable
    private final String totalBalance;

    @NotNull
    private String usedBalance;

    public TransferAccountBalance() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferAccountBalance)) {
            return false;
        }
        TransferAccountBalance transferAccountBalance = (TransferAccountBalance) other;
        return Intrinsics.areEqual(this.accountTag, transferAccountBalance.accountTag) && Intrinsics.areEqual(this.accountType, transferAccountBalance.accountType) && Intrinsics.areEqual(this.availableBalance, transferAccountBalance.availableBalance) && Intrinsics.areEqual(this.currency, transferAccountBalance.currency) && Intrinsics.areEqual(this.toAccountTag, transferAccountBalance.toAccountTag) && Intrinsics.areEqual(this.toAccountType, transferAccountBalance.toAccountType) && Intrinsics.areEqual(this.totalBalance, transferAccountBalance.totalBalance) && Intrinsics.areEqual(this.usedBalance, transferAccountBalance.usedBalance);
    }

    public TransferAccountBalance(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull String usedBalance) {
        Intrinsics.checkNotNullParameter(usedBalance, "usedBalance");
        this.accountTag = str;
        this.accountType = str2;
        this.availableBalance = str3;
        this.currency = str4;
        this.toAccountTag = str5;
        this.toAccountType = str6;
        this.totalBalance = str7;
        this.usedBalance = usedBalance;
    }

    public static /* synthetic */ TransferAccountBalance copy$default(TransferAccountBalance transferAccountBalance, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = transferAccountBalance.accountTag;
        }
        if ((i11 & 2) != 0) {
            str2 = transferAccountBalance.accountType;
        }
        if ((i11 & 4) != 0) {
            str3 = transferAccountBalance.availableBalance;
        }
        if ((i11 & 8) != 0) {
            str4 = transferAccountBalance.currency;
        }
        if ((i11 & 16) != 0) {
            str5 = transferAccountBalance.toAccountTag;
        }
        if ((i11 & 32) != 0) {
            str6 = transferAccountBalance.toAccountType;
        }
        if ((i11 & 64) != 0) {
            str7 = transferAccountBalance.totalBalance;
        }
        if ((i11 & 128) != 0) {
            str8 = transferAccountBalance.usedBalance;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return transferAccountBalance.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccountTag() {
        return this.accountTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getToAccountTag() {
        return this.toAccountTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getToAccountType() {
        return this.toAccountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUsedBalance() {
        return this.usedBalance;
    }

    @NotNull
    public final TransferAccountBalance copy(@Nullable String accountTag, @Nullable String accountType, @Nullable String availableBalance, @Nullable String currency, @Nullable String toAccountTag, @Nullable String toAccountType, @Nullable String totalBalance, @NotNull String usedBalance) {
        Intrinsics.checkNotNullParameter(usedBalance, "usedBalance");
        return new TransferAccountBalance(accountTag, accountType, availableBalance, currency, toAccountTag, toAccountType, totalBalance, usedBalance);
    }

    @Nullable
    public final String getAccountTag() {
        return this.accountTag;
    }

    @Nullable
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getToAccountTag() {
        return this.toAccountTag;
    }

    @Nullable
    public final String getToAccountType() {
        return this.toAccountType;
    }

    @Nullable
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    @NotNull
    public final String getUsedBalance() {
        return this.usedBalance;
    }

    public int hashCode() {
        String str = this.accountTag;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.availableBalance;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currency;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.toAccountTag;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.toAccountType;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.totalBalance;
        return ((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.usedBalance.hashCode();
    }

    public final void setUsedBalance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.usedBalance = str;
    }

    @NotNull
    public String toString() {
        return "TransferAccountBalance(accountTag=" + this.accountTag + ", accountType=" + this.accountType + ", availableBalance=" + this.availableBalance + ", currency=" + this.currency + ", toAccountTag=" + this.toAccountTag + ", toAccountType=" + this.toAccountType + ", totalBalance=" + this.totalBalance + ", usedBalance=" + this.usedBalance + ')';
    }

    public /* synthetic */ TransferAccountBalance(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? "0" : str8);
    }
}
