package com.kubi.payment.third.data.entities;

import androidx.annotation.Keep;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThirdQuote.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JP\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m90084d2 = {"Lcom/kubi/payment/third/data/entities/FiatCurrencySelect;", "", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "name", "", "selected", "fiatSymbol", "channelLimit", "", "Lcom/kubi/payment/third/data/entities/ChannelLimit;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;)V", "getEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getName", "()Ljava/lang/String;", "getSelected", "getFiatSymbol", "getChannelLimit", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;)Lcom/kubi/payment/third/data/entities/FiatCurrencySelect;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatCurrencySelect {

    @Nullable
    private final List<ChannelLimit> channelLimit;

    @Nullable
    private final Boolean enable;

    @Nullable
    private final String fiatSymbol;

    @Nullable
    private final String name;

    @Nullable
    private final Boolean selected;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiatCurrencySelect)) {
            return false;
        }
        FiatCurrencySelect fiatCurrencySelect = (FiatCurrencySelect) other;
        return Intrinsics.areEqual(this.enable, fiatCurrencySelect.enable) && Intrinsics.areEqual(this.name, fiatCurrencySelect.name) && Intrinsics.areEqual(this.selected, fiatCurrencySelect.selected) && Intrinsics.areEqual(this.fiatSymbol, fiatCurrencySelect.fiatSymbol) && Intrinsics.areEqual(this.channelLimit, fiatCurrencySelect.channelLimit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FiatCurrencySelect copy$default(FiatCurrencySelect fiatCurrencySelect, Boolean bool, String str, Boolean bool2, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = fiatCurrencySelect.enable;
        }
        if ((i11 & 2) != 0) {
            str = fiatCurrencySelect.name;
        }
        if ((i11 & 4) != 0) {
            bool2 = fiatCurrencySelect.selected;
        }
        if ((i11 & 8) != 0) {
            str2 = fiatCurrencySelect.fiatSymbol;
        }
        if ((i11 & 16) != 0) {
            list = fiatCurrencySelect.channelLimit;
        }
        List list2 = list;
        Boolean bool3 = bool2;
        return fiatCurrencySelect.copy(bool, str, bool3, str2, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getSelected() {
        return this.selected;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFiatSymbol() {
        return this.fiatSymbol;
    }

    @Nullable
    public final List<ChannelLimit> component5() {
        return this.channelLimit;
    }

    @NotNull
    public final FiatCurrencySelect copy(@Nullable Boolean enable, @Nullable String name, @Nullable Boolean selected, @Nullable String fiatSymbol, @Nullable List<ChannelLimit> channelLimit) {
        return new FiatCurrencySelect(enable, name, selected, fiatSymbol, channelLimit);
    }

    @Nullable
    public final List<ChannelLimit> getChannelLimit() {
        return this.channelLimit;
    }

    @Nullable
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final String getFiatSymbol() {
        return this.fiatSymbol;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        Boolean bool = this.enable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.selected;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.fiatSymbol;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ChannelLimit> list = this.channelLimit;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FiatCurrencySelect(enable=" + this.enable + ", name=" + this.name + ", selected=" + this.selected + ", fiatSymbol=" + this.fiatSymbol + ", channelLimit=" + this.channelLimit + ')';
    }

    public FiatCurrencySelect(@Nullable Boolean bool, @Nullable String str, @Nullable Boolean bool2, @Nullable String str2, @Nullable List<ChannelLimit> list) {
        this.enable = bool;
        this.name = str;
        this.selected = bool2;
        this.fiatSymbol = str2;
        this.channelLimit = list;
    }
}
