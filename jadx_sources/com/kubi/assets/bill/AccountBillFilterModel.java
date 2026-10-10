package com.kubi.assets.bill;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.bill.z, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: AccountBillFilterModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0000J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006#"}, m90084d2 = {"Lcom/kubi/assets/bill/AccountBillFilterModel;", "", FirebaseAnalytics.Param.CURRENCY, "", "bizType", "time", "direction", "accountType", "fundsType", "productCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getBizType", "getTime", "getDirection", "getAccountType", "getFundsType", "getProductCategory", "hasFilterChanged", "", "other", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AccountBillFilterModel {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final String currency;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String bizType;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final String time;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final String direction;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final String accountType;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public final String fundsType;

    /* JADX INFO: renamed from: g, reason: from toString */
    @Nullable
    public final String productCategory;

    public AccountBillFilterModel() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountBillFilterModel)) {
            return false;
        }
        AccountBillFilterModel accountBillFilterModel = (AccountBillFilterModel) other;
        return Intrinsics.areEqual(this.currency, accountBillFilterModel.currency) && Intrinsics.areEqual(this.bizType, accountBillFilterModel.bizType) && Intrinsics.areEqual(this.time, accountBillFilterModel.time) && Intrinsics.areEqual(this.direction, accountBillFilterModel.direction) && Intrinsics.areEqual(this.accountType, accountBillFilterModel.accountType) && Intrinsics.areEqual(this.fundsType, accountBillFilterModel.fundsType) && Intrinsics.areEqual(this.productCategory, accountBillFilterModel.productCategory);
    }

    public AccountBillFilterModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.currency = str;
        this.bizType = str2;
        this.time = str3;
        this.direction = str4;
        this.accountType = str5;
        this.fundsType = str6;
        this.productCategory = str7;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ AccountBillFilterModel m15820b(AccountBillFilterModel accountBillFilterModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = accountBillFilterModel.currency;
        }
        if ((i11 & 2) != 0) {
            str2 = accountBillFilterModel.bizType;
        }
        if ((i11 & 4) != 0) {
            str3 = accountBillFilterModel.time;
        }
        if ((i11 & 8) != 0) {
            str4 = accountBillFilterModel.direction;
        }
        if ((i11 & 16) != 0) {
            str5 = accountBillFilterModel.accountType;
        }
        if ((i11 & 32) != 0) {
            str6 = accountBillFilterModel.fundsType;
        }
        if ((i11 & 64) != 0) {
            str7 = accountBillFilterModel.productCategory;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return accountBillFilterModel.m15821a(str, str2, str11, str4, str10, str8, str9);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final AccountBillFilterModel m15821a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        return new AccountBillFilterModel(str, str2, str3, str4, str5, str6, str7);
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getFundsType() {
        return this.fundsType;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getProductCategory() {
        return this.productCategory;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bizType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.time;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.direction;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.accountType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fundsType;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.productCategory;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m15829j(@NotNull AccountBillFilterModel other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (Intrinsics.areEqual(this.currency, other.currency) && Intrinsics.areEqual(this.bizType, other.bizType) && Intrinsics.areEqual(this.time, other.time) && Intrinsics.areEqual(this.direction, other.direction) && Intrinsics.areEqual(this.accountType, other.accountType) && Intrinsics.areEqual(this.fundsType, other.fundsType) && Intrinsics.areEqual(this.productCategory, other.productCategory)) ? false : true;
    }

    @NotNull
    public String toString() {
        return "AccountBillFilterModel(currency=" + this.currency + ", bizType=" + this.bizType + ", time=" + this.time + ", direction=" + this.direction + ", accountType=" + this.accountType + ", fundsType=" + this.fundsType + ", productCategory=" + this.productCategory + ')';
    }

    public /* synthetic */ AccountBillFilterModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7);
    }
}
