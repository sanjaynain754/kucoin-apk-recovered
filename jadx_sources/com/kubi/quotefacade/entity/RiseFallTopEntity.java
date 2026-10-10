package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RiseFallEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/RiseFallTopEntity;", "", "klineMetadata", "Lcom/kubi/quotefacade/entity/RiseFallTopCoinEntity;", "rate", "", "<init>", "(Lcom/kubi/quotefacade/entity/RiseFallTopCoinEntity;Ljava/lang/String;)V", "getKlineMetadata", "()Lcom/kubi/quotefacade/entity/RiseFallTopCoinEntity;", "getRate", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RiseFallTopEntity {

    @Nullable
    private final RiseFallTopCoinEntity klineMetadata;

    @Nullable
    private final String rate;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RiseFallTopEntity)) {
            return false;
        }
        RiseFallTopEntity riseFallTopEntity = (RiseFallTopEntity) other;
        return Intrinsics.areEqual(this.klineMetadata, riseFallTopEntity.klineMetadata) && Intrinsics.areEqual(this.rate, riseFallTopEntity.rate);
    }

    public static /* synthetic */ RiseFallTopEntity copy$default(RiseFallTopEntity riseFallTopEntity, RiseFallTopCoinEntity riseFallTopCoinEntity, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            riseFallTopCoinEntity = riseFallTopEntity.klineMetadata;
        }
        if ((i11 & 2) != 0) {
            str = riseFallTopEntity.rate;
        }
        return riseFallTopEntity.copy(riseFallTopCoinEntity, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RiseFallTopCoinEntity getKlineMetadata() {
        return this.klineMetadata;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRate() {
        return this.rate;
    }

    @NotNull
    public final RiseFallTopEntity copy(@Nullable RiseFallTopCoinEntity klineMetadata, @Nullable String rate) {
        return new RiseFallTopEntity(klineMetadata, rate);
    }

    @Nullable
    public final RiseFallTopCoinEntity getKlineMetadata() {
        return this.klineMetadata;
    }

    @Nullable
    public final String getRate() {
        return this.rate;
    }

    public int hashCode() {
        RiseFallTopCoinEntity riseFallTopCoinEntity = this.klineMetadata;
        int iHashCode = (riseFallTopCoinEntity == null ? 0 : riseFallTopCoinEntity.hashCode()) * 31;
        String str = this.rate;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RiseFallTopEntity(klineMetadata=" + this.klineMetadata + ", rate=" + this.rate + ')';
    }

    public RiseFallTopEntity(@Nullable RiseFallTopCoinEntity riseFallTopCoinEntity, @Nullable String str) {
        this.klineMetadata = riseFallTopCoinEntity;
        this.rate = str;
    }
}
