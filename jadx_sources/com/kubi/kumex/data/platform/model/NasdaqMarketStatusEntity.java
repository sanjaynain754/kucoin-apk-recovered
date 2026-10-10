package com.kubi.kumex.data.platform.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: NasdaqMarketStatusEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/NasdaqMarketStatusEntity;", "", "marketSession", "", "<init>", "(Ljava/lang/String;)V", "getMarketSession", "()Ljava/lang/String;", "isLowLiquidityPeriod", "", "component1", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NasdaqMarketStatusEntity {

    @NotNull
    public static final String MARKET_STATUS_REGULAR = "regular";

    @Nullable
    private final String marketSession;

    /* JADX WARN: Multi-variable type inference failed */
    public NasdaqMarketStatusEntity() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NasdaqMarketStatusEntity) && Intrinsics.areEqual(this.marketSession, ((NasdaqMarketStatusEntity) other).marketSession);
    }

    public NasdaqMarketStatusEntity(@Nullable String str) {
        this.marketSession = str;
    }

    public static /* synthetic */ NasdaqMarketStatusEntity copy$default(NasdaqMarketStatusEntity nasdaqMarketStatusEntity, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = nasdaqMarketStatusEntity.marketSession;
        }
        return nasdaqMarketStatusEntity.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMarketSession() {
        return this.marketSession;
    }

    @NotNull
    public final NasdaqMarketStatusEntity copy(@Nullable String marketSession) {
        return new NasdaqMarketStatusEntity(marketSession);
    }

    @Nullable
    public final String getMarketSession() {
        return this.marketSession;
    }

    public int hashCode() {
        String str = this.marketSession;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final boolean isLowLiquidityPeriod() {
        return !StringsKt.equals(this.marketSession, MARKET_STATUS_REGULAR, true);
    }

    @NotNull
    public String toString() {
        return "NasdaqMarketStatusEntity(marketSession=" + this.marketSession + ')';
    }

    public /* synthetic */ NasdaqMarketStatusEntity(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str);
    }
}
