package com.kubi.assets.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OnGoingEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/assets/entity/WsMarkPriceSnapshotEntity;", "", "symbol", "", "granularity", "value", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getGranularity", "getValue", "getTimestamp", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsMarkPriceSnapshotEntity {

    @Nullable
    private final String granularity;

    @Nullable
    private final String symbol;

    @Nullable
    private final String timestamp;

    @Nullable
    private final String value;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsMarkPriceSnapshotEntity)) {
            return false;
        }
        WsMarkPriceSnapshotEntity wsMarkPriceSnapshotEntity = (WsMarkPriceSnapshotEntity) other;
        return Intrinsics.areEqual(this.symbol, wsMarkPriceSnapshotEntity.symbol) && Intrinsics.areEqual(this.granularity, wsMarkPriceSnapshotEntity.granularity) && Intrinsics.areEqual(this.value, wsMarkPriceSnapshotEntity.value) && Intrinsics.areEqual(this.timestamp, wsMarkPriceSnapshotEntity.timestamp);
    }

    public static /* synthetic */ WsMarkPriceSnapshotEntity copy$default(WsMarkPriceSnapshotEntity wsMarkPriceSnapshotEntity, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsMarkPriceSnapshotEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = wsMarkPriceSnapshotEntity.granularity;
        }
        if ((i11 & 4) != 0) {
            str3 = wsMarkPriceSnapshotEntity.value;
        }
        if ((i11 & 8) != 0) {
            str4 = wsMarkPriceSnapshotEntity.timestamp;
        }
        return wsMarkPriceSnapshotEntity.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGranularity() {
        return this.granularity;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final WsMarkPriceSnapshotEntity copy(@Nullable String symbol, @Nullable String granularity, @Nullable String value, @Nullable String timestamp) {
        return new WsMarkPriceSnapshotEntity(symbol, granularity, value, timestamp);
    }

    @Nullable
    public final String getGranularity() {
        return this.granularity;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.granularity;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.value;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.timestamp;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WsMarkPriceSnapshotEntity(symbol=" + this.symbol + ", granularity=" + this.granularity + ", value=" + this.value + ", timestamp=" + this.timestamp + ')';
    }

    public WsMarkPriceSnapshotEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.symbol = str;
        this.granularity = str2;
        this.value = str3;
        this.timestamp = str4;
    }
}
