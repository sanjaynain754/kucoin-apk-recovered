package com.kubi.assets.multiaccountuse;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p197db.AccountBalance;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: UsableAssetEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJb\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0004\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0006\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\n\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000e¨\u0006*"}, m90084d2 = {"Lcom/kubi/assets/multiaccountuse/UsableAssetEntity;", "", "accountType", "", "isDefault", "", "isChosen", "transferBalance", AppsFlyerProperties.CURRENCY_CODE, "accountTypeName", "isRiskAccount", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAccountType", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTransferBalance", "getCurrencyCode", "getAccountTypeName", "balance", "", "getBalance", "()D", "displayName", "getDisplayName", "toAccountBalance", "Lcom/kubi/assets/multiaccountuse/AccountBalance;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/assets/multiaccountuse/UsableAssetEntity;", "equals", "other", "hashCode", "", "toString", "AssetsCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UsableAssetEntity {

    @Nullable
    private final String accountType;

    @Nullable
    private final String accountTypeName;

    @Nullable
    private final String currencyCode;

    @Nullable
    private final Boolean isChosen;

    @Nullable
    private final Boolean isDefault;

    @Nullable
    private final Boolean isRiskAccount;

    @Nullable
    private final String transferBalance;

    public UsableAssetEntity() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UsableAssetEntity)) {
            return false;
        }
        UsableAssetEntity usableAssetEntity = (UsableAssetEntity) other;
        return Intrinsics.areEqual(this.accountType, usableAssetEntity.accountType) && Intrinsics.areEqual(this.isDefault, usableAssetEntity.isDefault) && Intrinsics.areEqual(this.isChosen, usableAssetEntity.isChosen) && Intrinsics.areEqual(this.transferBalance, usableAssetEntity.transferBalance) && Intrinsics.areEqual(this.currencyCode, usableAssetEntity.currencyCode) && Intrinsics.areEqual(this.accountTypeName, usableAssetEntity.accountTypeName) && Intrinsics.areEqual(this.isRiskAccount, usableAssetEntity.isRiskAccount);
    }

    public UsableAssetEntity(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool3) {
        this.accountType = str;
        this.isDefault = bool;
        this.isChosen = bool2;
        this.transferBalance = str2;
        this.currencyCode = str3;
        this.accountTypeName = str4;
        this.isRiskAccount = bool3;
    }

    public static /* synthetic */ UsableAssetEntity copy$default(UsableAssetEntity usableAssetEntity, String str, Boolean bool, Boolean bool2, String str2, String str3, String str4, Boolean bool3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = usableAssetEntity.accountType;
        }
        if ((i11 & 2) != 0) {
            bool = usableAssetEntity.isDefault;
        }
        if ((i11 & 4) != 0) {
            bool2 = usableAssetEntity.isChosen;
        }
        if ((i11 & 8) != 0) {
            str2 = usableAssetEntity.transferBalance;
        }
        if ((i11 & 16) != 0) {
            str3 = usableAssetEntity.currencyCode;
        }
        if ((i11 & 32) != 0) {
            str4 = usableAssetEntity.accountTypeName;
        }
        if ((i11 & 64) != 0) {
            bool3 = usableAssetEntity.isRiskAccount;
        }
        String str5 = str4;
        Boolean bool4 = bool3;
        String str6 = str3;
        Boolean bool5 = bool2;
        return usableAssetEntity.copy(str, bool, bool5, str2, str6, str5, bool4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsDefault() {
        return this.isDefault;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsChosen() {
        return this.isChosen;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTransferBalance() {
        return this.transferBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAccountTypeName() {
        return this.accountTypeName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsRiskAccount() {
        return this.isRiskAccount;
    }

    @NotNull
    public final UsableAssetEntity copy(@Nullable String accountType, @Nullable Boolean isDefault, @Nullable Boolean isChosen, @Nullable String transferBalance, @Nullable String currencyCode, @Nullable String accountTypeName, @Nullable Boolean isRiskAccount) {
        return new UsableAssetEntity(accountType, isDefault, isChosen, transferBalance, currencyCode, accountTypeName, isRiskAccount);
    }

    @Nullable
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final String getAccountTypeName() {
        return this.accountTypeName;
    }

    public final double getBalance() {
        Double doubleOrNull;
        String str = this.transferBalance;
        if (str == null || str.length() == 0 || (doubleOrNull = StringsKt.toDoubleOrNull(this.transferBalance)) == null) {
            return 0.0d;
        }
        return doubleOrNull.doubleValue();
    }

    @Nullable
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @NotNull
    public final String getDisplayName() {
        String str = this.accountTypeName;
        return (str == null || str.length() == 0) ? "Unknown" : this.accountTypeName;
    }

    @Nullable
    public final String getTransferBalance() {
        return this.transferBalance;
    }

    public int hashCode() {
        String str = this.accountType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isDefault;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isChosen;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.transferBalance;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencyCode;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.accountTypeName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool3 = this.isRiskAccount;
        return iHashCode6 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @Nullable
    public final Boolean isChosen() {
        return this.isChosen;
    }

    @Nullable
    public final Boolean isDefault() {
        return this.isDefault;
    }

    @Nullable
    public final Boolean isRiskAccount() {
        return this.isRiskAccount;
    }

    @Nullable
    public final AccountBalance toAccountBalance() {
        String str = this.accountType;
        if (str == null) {
            return null;
        }
        String str2 = this.accountTypeName;
        String str3 = this.transferBalance;
        if (str3 == null) {
            str3 = "0";
        }
        Boolean bool = this.isDefault;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = this.isChosen;
        return new AccountBalance(str, str2, str3, zBooleanValue, bool2 != null ? bool2.booleanValue() : false);
    }

    @NotNull
    public String toString() {
        return "UsableAssetEntity(accountType=" + this.accountType + ", isDefault=" + this.isDefault + ", isChosen=" + this.isChosen + ", transferBalance=" + this.transferBalance + ", currencyCode=" + this.currencyCode + ", accountTypeName=" + this.accountTypeName + ", isRiskAccount=" + this.isRiskAccount + ')';
    }

    public /* synthetic */ UsableAssetEntity(String str, Boolean bool, Boolean bool2, String str2, String str3, String str4, Boolean bool3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : bool2, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : bool3);
    }
}
