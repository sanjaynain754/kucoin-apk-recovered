package com.kubi.assets.entity;

import androidx.annotation.Keep;
import com.kubi.utils.extensions.DowngradeExKt;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycUpgradeEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0005J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/assets/entity/KycUpgradeEntity;", "", "limitQuotaCurrencyAmount", "", "showUpdateKyc", "", "displayUpgradeLink", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getLimitQuotaCurrencyAmount", "()Ljava/lang/String;", "getShowUpdateKyc", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisplayUpgradeLink", "isShowDepositKyc", "isShowWithdrawKyc", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/assets/entity/KycUpgradeEntity;", "equals", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KycUpgradeEntity {

    @Nullable
    private final Boolean displayUpgradeLink;

    @Nullable
    private final String limitQuotaCurrencyAmount;

    @Nullable
    private final Boolean showUpdateKyc;

    public KycUpgradeEntity(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.limitQuotaCurrencyAmount = str;
        this.showUpdateKyc = bool;
        this.displayUpgradeLink = bool2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycUpgradeEntity)) {
            return false;
        }
        KycUpgradeEntity kycUpgradeEntity = (KycUpgradeEntity) other;
        return Intrinsics.areEqual(this.limitQuotaCurrencyAmount, kycUpgradeEntity.limitQuotaCurrencyAmount) && Intrinsics.areEqual(this.showUpdateKyc, kycUpgradeEntity.showUpdateKyc) && Intrinsics.areEqual(this.displayUpgradeLink, kycUpgradeEntity.displayUpgradeLink);
    }

    public static /* synthetic */ KycUpgradeEntity copy$default(KycUpgradeEntity kycUpgradeEntity, String str, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kycUpgradeEntity.limitQuotaCurrencyAmount;
        }
        if ((i11 & 2) != 0) {
            bool = kycUpgradeEntity.showUpdateKyc;
        }
        if ((i11 & 4) != 0) {
            bool2 = kycUpgradeEntity.displayUpgradeLink;
        }
        return kycUpgradeEntity.copy(str, bool, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLimitQuotaCurrencyAmount() {
        return this.limitQuotaCurrencyAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getShowUpdateKyc() {
        return this.showUpdateKyc;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getDisplayUpgradeLink() {
        return this.displayUpgradeLink;
    }

    @NotNull
    public final KycUpgradeEntity copy(@Nullable String limitQuotaCurrencyAmount, @Nullable Boolean showUpdateKyc, @Nullable Boolean displayUpgradeLink) {
        return new KycUpgradeEntity(limitQuotaCurrencyAmount, showUpdateKyc, displayUpgradeLink);
    }

    @Nullable
    public final Boolean getDisplayUpgradeLink() {
        return this.displayUpgradeLink;
    }

    @Nullable
    public final String getLimitQuotaCurrencyAmount() {
        return this.limitQuotaCurrencyAmount;
    }

    @Nullable
    public final Boolean getShowUpdateKyc() {
        return this.showUpdateKyc;
    }

    public int hashCode() {
        String str = this.limitQuotaCurrencyAmount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.showUpdateKyc;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.displayUpgradeLink;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final boolean isShowDepositKyc() {
        BigDecimal bigDecimalM66535e;
        String str = this.limitQuotaCurrencyAmount;
        return (str == null || (bigDecimalM66535e = DowngradeExKt.m66535e(str, null, 1, null)) == null || bigDecimalM66535e.compareTo(BigDecimal.ZERO) != 0) ? false : true;
    }

    public final boolean isShowWithdrawKyc() {
        Boolean bool = this.showUpdateKyc;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "KycUpgradeEntity(limitQuotaCurrencyAmount=" + this.limitQuotaCurrencyAmount + ", showUpdateKyc=" + this.showUpdateKyc + ", displayUpgradeLink=" + this.displayUpgradeLink + ')';
    }

    public /* synthetic */ KycUpgradeEntity(String str, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? Boolean.FALSE : bool, (i11 & 4) != 0 ? Boolean.FALSE : bool2);
    }
}
