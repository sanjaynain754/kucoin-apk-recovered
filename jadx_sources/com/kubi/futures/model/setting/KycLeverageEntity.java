package com.kubi.futures.model.setting;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycLeverageEntity.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/futures/model/setting/KycLeverageEntity;", "", "siteMaxLeverage", "Ljava/math/BigDecimal;", "userMaxLeverage", "showGuide", "", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;)V", "getSiteMaxLeverage", "()Ljava/math/BigDecimal;", "getUserMaxLeverage", "getShowGuide", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;)Lcom/kubi/futures/model/setting/KycLeverageEntity;", "equals", "other", "hashCode", "", "toString", "", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KycLeverageEntity {

    @Nullable
    private final Boolean showGuide;

    @Nullable
    private final BigDecimal siteMaxLeverage;

    @Nullable
    private final BigDecimal userMaxLeverage;

    public KycLeverageEntity() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycLeverageEntity)) {
            return false;
        }
        KycLeverageEntity kycLeverageEntity = (KycLeverageEntity) other;
        return Intrinsics.areEqual(this.siteMaxLeverage, kycLeverageEntity.siteMaxLeverage) && Intrinsics.areEqual(this.userMaxLeverage, kycLeverageEntity.userMaxLeverage) && Intrinsics.areEqual(this.showGuide, kycLeverageEntity.showGuide);
    }

    public KycLeverageEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable Boolean bool) {
        this.siteMaxLeverage = bigDecimal;
        this.userMaxLeverage = bigDecimal2;
        this.showGuide = bool;
    }

    public static /* synthetic */ KycLeverageEntity copy$default(KycLeverageEntity kycLeverageEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = kycLeverageEntity.siteMaxLeverage;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = kycLeverageEntity.userMaxLeverage;
        }
        if ((i11 & 4) != 0) {
            bool = kycLeverageEntity.showGuide;
        }
        return kycLeverageEntity.copy(bigDecimal, bigDecimal2, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getSiteMaxLeverage() {
        return this.siteMaxLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getUserMaxLeverage() {
        return this.userMaxLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getShowGuide() {
        return this.showGuide;
    }

    @NotNull
    public final KycLeverageEntity copy(@Nullable BigDecimal siteMaxLeverage, @Nullable BigDecimal userMaxLeverage, @Nullable Boolean showGuide) {
        return new KycLeverageEntity(siteMaxLeverage, userMaxLeverage, showGuide);
    }

    @Nullable
    public final Boolean getShowGuide() {
        return this.showGuide;
    }

    @Nullable
    public final BigDecimal getSiteMaxLeverage() {
        return this.siteMaxLeverage;
    }

    @Nullable
    public final BigDecimal getUserMaxLeverage() {
        return this.userMaxLeverage;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.siteMaxLeverage;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.userMaxLeverage;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Boolean bool = this.showGuide;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KycLeverageEntity(siteMaxLeverage=" + this.siteMaxLeverage + ", userMaxLeverage=" + this.userMaxLeverage + ", showGuide=" + this.showGuide + ')';
    }

    public /* synthetic */ KycLeverageEntity(BigDecimal bigDecimal, BigDecimal bigDecimal2, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2, (i11 & 4) != 0 ? null : bool);
    }
}
