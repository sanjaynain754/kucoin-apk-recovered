package com.kubi.tradingbotkit.entity.futures;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesGridLongShortEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/futures/FuturesGridLongShortEntity;", "", "longUser", "", "shortUser", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "getLongUser", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getShortUser", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/kubi/tradingbotkit/entity/futures/FuturesGridLongShortEntity;", "equals", "", "other", "hashCode", "", "toString", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesGridLongShortEntity {

    @Nullable
    private final Long longUser;

    @Nullable
    private final Long shortUser;

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesGridLongShortEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesGridLongShortEntity)) {
            return false;
        }
        FuturesGridLongShortEntity futuresGridLongShortEntity = (FuturesGridLongShortEntity) other;
        return Intrinsics.areEqual(this.longUser, futuresGridLongShortEntity.longUser) && Intrinsics.areEqual(this.shortUser, futuresGridLongShortEntity.shortUser);
    }

    public FuturesGridLongShortEntity(@Nullable Long l11, @Nullable Long l12) {
        this.longUser = l11;
        this.shortUser = l12;
    }

    public static /* synthetic */ FuturesGridLongShortEntity copy$default(FuturesGridLongShortEntity futuresGridLongShortEntity, Long l11, Long l12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = futuresGridLongShortEntity.longUser;
        }
        if ((i11 & 2) != 0) {
            l12 = futuresGridLongShortEntity.shortUser;
        }
        return futuresGridLongShortEntity.copy(l11, l12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getLongUser() {
        return this.longUser;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getShortUser() {
        return this.shortUser;
    }

    @NotNull
    public final FuturesGridLongShortEntity copy(@Nullable Long longUser, @Nullable Long shortUser) {
        return new FuturesGridLongShortEntity(longUser, shortUser);
    }

    @Nullable
    public final Long getLongUser() {
        return this.longUser;
    }

    @Nullable
    public final Long getShortUser() {
        return this.shortUser;
    }

    public int hashCode() {
        Long l11 = this.longUser;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Long l12 = this.shortUser;
        return iHashCode + (l12 != null ? l12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FuturesGridLongShortEntity(longUser=" + this.longUser + ", shortUser=" + this.shortUser + ')';
    }

    public /* synthetic */ FuturesGridLongShortEntity(Long l11, Long l12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : l12);
    }
}
