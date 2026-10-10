package com.kubi.utaspotlib.repo.order.data;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UtaScaledOrderBody.kt */
/* JADX INFO: loaded from: classes54.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/order/data/UtaScaledOrderBody;", "", AppsFlyerProperties.CHANNEL, "", "symbol", "tradeType", "side", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/utaspotlib/repo/order/data/UtaScaledItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getChannel", "()Ljava/lang/String;", "getSymbol", "getTradeType", "getSide", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UtaScaledOrderBody {

    @NotNull
    private final String channel;

    @NotNull
    private final List<UtaScaledItem> items;

    @Nullable
    private final String side;

    @Nullable
    private final String symbol;

    @NotNull
    private final String tradeType;

    public UtaScaledOrderBody(@NotNull String channel, @Nullable String str, @NotNull String tradeType, @Nullable String str2, @NotNull List<UtaScaledItem> items) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(items, "items");
        this.channel = channel;
        this.symbol = str;
        this.tradeType = tradeType;
        this.side = str2;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UtaScaledOrderBody copy$default(UtaScaledOrderBody utaScaledOrderBody, String str, String str2, String str3, String str4, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = utaScaledOrderBody.channel;
        }
        if ((i11 & 2) != 0) {
            str2 = utaScaledOrderBody.symbol;
        }
        if ((i11 & 4) != 0) {
            str3 = utaScaledOrderBody.tradeType;
        }
        if ((i11 & 8) != 0) {
            str4 = utaScaledOrderBody.side;
        }
        if ((i11 & 16) != 0) {
            list = utaScaledOrderBody.items;
        }
        List list2 = list;
        String str5 = str3;
        return utaScaledOrderBody.copy(str, str2, str5, str4, list2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UtaScaledOrderBody)) {
            return false;
        }
        UtaScaledOrderBody utaScaledOrderBody = (UtaScaledOrderBody) other;
        return Intrinsics.areEqual(this.channel, utaScaledOrderBody.channel) && Intrinsics.areEqual(this.symbol, utaScaledOrderBody.symbol) && Intrinsics.areEqual(this.tradeType, utaScaledOrderBody.tradeType) && Intrinsics.areEqual(this.side, utaScaledOrderBody.side) && Intrinsics.areEqual(this.items, utaScaledOrderBody.items);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @NotNull
    public final List<UtaScaledItem> component5() {
        return this.items;
    }

    @NotNull
    public final UtaScaledOrderBody copy(@NotNull String channel, @Nullable String symbol, @NotNull String tradeType, @Nullable String side, @NotNull List<UtaScaledItem> items) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(items, "items");
        return new UtaScaledOrderBody(channel, symbol, tradeType, side, items);
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final List<UtaScaledItem> getItems() {
        return this.items;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final String getTradeType() {
        return this.tradeType;
    }

    public int hashCode() {
        int iHashCode = this.channel.hashCode() * 31;
        String str = this.symbol;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.tradeType.hashCode()) * 31;
        String str2 = this.side;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return "UtaScaledOrderBody(channel=" + this.channel + ", symbol=" + this.symbol + ", tradeType=" + this.tradeType + ", side=" + this.side + ", items=" + this.items + ')';
    }

    public /* synthetic */ UtaScaledOrderBody(String str, String str2, String str3, String str4, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "ANDROID" : str, str2, str3, str4, list);
    }
}
