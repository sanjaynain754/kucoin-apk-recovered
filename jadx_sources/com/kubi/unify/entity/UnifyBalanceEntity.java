package com.kubi.unify.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyEntity.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/unify/entity/UnifyBalanceEntity;", "", FirebaseAnalytics.Param.CURRENCY, "", "futuresAvailable", "Ljava/math/BigDecimal;", "futuresIsolatedAvailable", "maxWithdraw", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getCurrency", "()Ljava/lang/String;", "getFuturesAvailable", "()Ljava/math/BigDecimal;", "getFuturesIsolatedAvailable", "getMaxWithdraw", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyBalanceEntity {

    @Nullable
    private final String currency;

    @Nullable
    private final BigDecimal futuresAvailable;

    @Nullable
    private final BigDecimal futuresIsolatedAvailable;

    @Nullable
    private final BigDecimal maxWithdraw;

    public UnifyBalanceEntity() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifyBalanceEntity)) {
            return false;
        }
        UnifyBalanceEntity unifyBalanceEntity = (UnifyBalanceEntity) other;
        return Intrinsics.areEqual(this.currency, unifyBalanceEntity.currency) && Intrinsics.areEqual(this.futuresAvailable, unifyBalanceEntity.futuresAvailable) && Intrinsics.areEqual(this.futuresIsolatedAvailable, unifyBalanceEntity.futuresIsolatedAvailable) && Intrinsics.areEqual(this.maxWithdraw, unifyBalanceEntity.maxWithdraw);
    }

    public UnifyBalanceEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3) {
        this.currency = str;
        this.futuresAvailable = bigDecimal;
        this.futuresIsolatedAvailable = bigDecimal2;
        this.maxWithdraw = bigDecimal3;
    }

    public static /* synthetic */ UnifyBalanceEntity copy$default(UnifyBalanceEntity unifyBalanceEntity, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = unifyBalanceEntity.currency;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = unifyBalanceEntity.futuresAvailable;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = unifyBalanceEntity.futuresIsolatedAvailable;
        }
        if ((i11 & 8) != 0) {
            bigDecimal3 = unifyBalanceEntity.maxWithdraw;
        }
        return unifyBalanceEntity.copy(str, bigDecimal, bigDecimal2, bigDecimal3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getFuturesAvailable() {
        return this.futuresAvailable;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getFuturesIsolatedAvailable() {
        return this.futuresIsolatedAvailable;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getMaxWithdraw() {
        return this.maxWithdraw;
    }

    @NotNull
    public final UnifyBalanceEntity copy(@Nullable String currency, @Nullable BigDecimal futuresAvailable, @Nullable BigDecimal futuresIsolatedAvailable, @Nullable BigDecimal maxWithdraw) {
        return new UnifyBalanceEntity(currency, futuresAvailable, futuresIsolatedAvailable, maxWithdraw);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getFuturesAvailable() {
        return this.futuresAvailable;
    }

    @Nullable
    public final BigDecimal getFuturesIsolatedAvailable() {
        return this.futuresIsolatedAvailable;
    }

    @Nullable
    public final BigDecimal getMaxWithdraw() {
        return this.maxWithdraw;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.futuresAvailable;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.futuresIsolatedAvailable;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.maxWithdraw;
        return iHashCode3 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifyBalanceEntity(currency=" + this.currency + ", futuresAvailable=" + this.futuresAvailable + ", futuresIsolatedAvailable=" + this.futuresIsolatedAvailable + ", maxWithdraw=" + this.maxWithdraw + ')';
    }

    public /* synthetic */ UnifyBalanceEntity(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : bigDecimal3);
    }
}
