package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeMarketTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/VisitorFavoriteEntity;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "currencyType", "", "symbol", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getCurrencyType", "()Ljava/lang/String;", "getSymbol", "getTimestamp", "()Ljava/lang/Double;", "Ljava/lang/Double;", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/kubi/rn/core/turbo/VisitorFavoriteEntity;", "equals", "", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeMarketTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeMarketTurboModule.kt\ncom/kubi/rn/core/turbo/VisitorFavoriteEntity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n1#2:143\n*E\n"})
public final /* data */ class VisitorFavoriteEntity implements WritableMapSerializable {

    @Nullable
    private final String currencyType;

    @Nullable
    private final String symbol;

    @Nullable
    private final Double timestamp;

    public VisitorFavoriteEntity() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisitorFavoriteEntity)) {
            return false;
        }
        VisitorFavoriteEntity visitorFavoriteEntity = (VisitorFavoriteEntity) other;
        return Intrinsics.areEqual(this.currencyType, visitorFavoriteEntity.currencyType) && Intrinsics.areEqual(this.symbol, visitorFavoriteEntity.symbol) && Intrinsics.areEqual((Object) this.timestamp, (Object) visitorFavoriteEntity.timestamp);
    }

    public VisitorFavoriteEntity(@Nullable String str, @Nullable String str2, @Nullable Double d11) {
        this.currencyType = str;
        this.symbol = str2;
        this.timestamp = d11;
    }

    public static /* synthetic */ VisitorFavoriteEntity copy$default(VisitorFavoriteEntity visitorFavoriteEntity, String str, String str2, Double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = visitorFavoriteEntity.currencyType;
        }
        if ((i11 & 2) != 0) {
            str2 = visitorFavoriteEntity.symbol;
        }
        if ((i11 & 4) != 0) {
            d11 = visitorFavoriteEntity.timestamp;
        }
        return visitorFavoriteEntity.copy(str, str2, d11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrencyType() {
        return this.currencyType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final VisitorFavoriteEntity copy(@Nullable String currencyType, @Nullable String symbol, @Nullable Double timestamp) {
        return new VisitorFavoriteEntity(currencyType, symbol, timestamp);
    }

    @Nullable
    public final String getCurrencyType() {
        return this.currencyType;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final Double getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        String str = this.currencyType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d11 = this.timestamp;
        return iHashCode2 + (d11 != null ? d11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VisitorFavoriteEntity(currencyType=" + this.currencyType + ", symbol=" + this.symbol + ", timestamp=" + this.timestamp + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.currencyType;
        if (str != null) {
            writableMapCreateMap.putString("currencyType", str.toString());
        }
        String str2 = this.symbol;
        if (str2 != null) {
            writableMapCreateMap.putString("symbol", str2.toString());
        }
        Double d11 = this.timestamp;
        if (d11 != null) {
            writableMapCreateMap.putDouble("timestamp", d11.doubleValue());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ VisitorFavoriteEntity(String str, String str2, Double d11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : d11);
    }
}
