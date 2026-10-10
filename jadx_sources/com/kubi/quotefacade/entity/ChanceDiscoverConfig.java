package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeChanceEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/ChanceDiscoverConfig;", "", "topCurrencyRole", "", "<init>", "(Ljava/lang/String;)V", "getTopCurrencyRole", "()Ljava/lang/String;", "setTopCurrencyRole", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChanceDiscoverConfig {

    @Nullable
    private String topCurrencyRole;

    /* JADX WARN: Multi-variable type inference failed */
    public ChanceDiscoverConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChanceDiscoverConfig) && Intrinsics.areEqual(this.topCurrencyRole, ((ChanceDiscoverConfig) other).topCurrencyRole);
    }

    public ChanceDiscoverConfig(@Nullable String str) {
        this.topCurrencyRole = str;
    }

    public static /* synthetic */ ChanceDiscoverConfig copy$default(ChanceDiscoverConfig chanceDiscoverConfig, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = chanceDiscoverConfig.topCurrencyRole;
        }
        return chanceDiscoverConfig.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTopCurrencyRole() {
        return this.topCurrencyRole;
    }

    @NotNull
    public final ChanceDiscoverConfig copy(@Nullable String topCurrencyRole) {
        return new ChanceDiscoverConfig(topCurrencyRole);
    }

    @Nullable
    public final String getTopCurrencyRole() {
        return this.topCurrencyRole;
    }

    public int hashCode() {
        String str = this.topCurrencyRole;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setTopCurrencyRole(@Nullable String str) {
        this.topCurrencyRole = str;
    }

    @NotNull
    public String toString() {
        return "ChanceDiscoverConfig(topCurrencyRole=" + this.topCurrencyRole + ')';
    }

    public /* synthetic */ ChanceDiscoverConfig(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str);
    }
}
