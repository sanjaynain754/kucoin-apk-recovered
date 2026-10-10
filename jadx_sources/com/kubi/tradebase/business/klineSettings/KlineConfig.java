package com.kubi.tradebase.business.klineSettings;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KlineConfig.kt */
/* JADX INFO: loaded from: classes48.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J>\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\""}, m90084d2 = {"Lcom/kubi/tradebase/business/klineSettings/KlineConfig;", "", "pri_dict_value", "", "pri_data_value", "symbol", "type", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getPri_dict_value", "()Ljava/lang/String;", "setPri_dict_value", "(Ljava/lang/String;)V", "getPri_data_value", "setPri_data_value", "getSymbol", "setSymbol", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/tradebase/business/klineSettings/KlineConfig;", "equals", "", "other", "hashCode", "toString", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KlineConfig {

    @Nullable
    private String pri_data_value;

    @Nullable
    private String pri_dict_value;

    @Nullable
    private String symbol;

    @Nullable
    private Integer type;

    public KlineConfig(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
        this.pri_dict_value = str;
        this.pri_data_value = str2;
        this.symbol = str3;
        this.type = num;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KlineConfig)) {
            return false;
        }
        KlineConfig klineConfig = (KlineConfig) other;
        return Intrinsics.areEqual(this.pri_dict_value, klineConfig.pri_dict_value) && Intrinsics.areEqual(this.pri_data_value, klineConfig.pri_data_value) && Intrinsics.areEqual(this.symbol, klineConfig.symbol) && Intrinsics.areEqual(this.type, klineConfig.type);
    }

    public static /* synthetic */ KlineConfig copy$default(KlineConfig klineConfig, String str, String str2, String str3, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = klineConfig.pri_dict_value;
        }
        if ((i11 & 2) != 0) {
            str2 = klineConfig.pri_data_value;
        }
        if ((i11 & 4) != 0) {
            str3 = klineConfig.symbol;
        }
        if ((i11 & 8) != 0) {
            num = klineConfig.type;
        }
        return klineConfig.copy(str, str2, str3, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPri_dict_value() {
        return this.pri_dict_value;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPri_data_value() {
        return this.pri_data_value;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @NotNull
    public final KlineConfig copy(@Nullable String pri_dict_value, @Nullable String pri_data_value, @Nullable String symbol, @Nullable Integer type) {
        return new KlineConfig(pri_dict_value, pri_data_value, symbol, type);
    }

    @Nullable
    public final String getPri_data_value() {
        return this.pri_data_value;
    }

    @Nullable
    public final String getPri_dict_value() {
        return this.pri_dict_value;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.pri_dict_value;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pri_data_value;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.symbol;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.type;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final void setPri_data_value(@Nullable String str) {
        this.pri_data_value = str;
    }

    public final void setPri_dict_value(@Nullable String str) {
        this.pri_dict_value = str;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    @NotNull
    public String toString() {
        return "KlineConfig(pri_dict_value=" + this.pri_dict_value + ", pri_data_value=" + this.pri_data_value + ", symbol=" + this.symbol + ", type=" + this.type + ')';
    }

    public /* synthetic */ KlineConfig(String str, String str2, String str3, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? "ALL-ALL" : str3, (i11 & 8) != 0 ? 3 : num);
    }
}
