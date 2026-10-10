package com.trtc.uikit.livekit.p180kc.data.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.utils.C27096v0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SharedPositionInfo.kt */
/* JADX INFO: loaded from: classes60.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00012B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0005\u001a\u00020\u001eJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0099\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u00063"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/SharedPositionInfo;", "", "closeId", "", "symbol", "displaySymbol", "symbolImgUrl", "side", "marginMode", "leverage", "roe", "pnl", "openPrice", "closePrice", "markPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCloseId", "()Ljava/lang/String;", "getSymbol", "getDisplaySymbol", "getSymbolImgUrl", "getSide", "getMarginMode", "getLeverage", "getRoe", "getPnl", "getOpenPrice", "getClosePrice", "getMarkPrice", "Lcom/kubi/utils/StyledText;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SharedPositionInfo {

    @NotNull
    public static final String MARGIN_MODE_CROSS = "CROSS";

    @NotNull
    public static final String MARGIN_MODE_ISOLATED = "ISOLATED";

    @NotNull
    public static final String SIDE_LONG = "LONG";

    @NotNull
    public static final String SIDE_SHORT = "SHORT";

    @SerializedName("closeId")
    @Nullable
    private final String closeId;

    @SerializedName("closePrice")
    @Nullable
    private final String closePrice;

    @SerializedName("displaySymbol")
    @Nullable
    private final String displaySymbol;

    @SerializedName("leverage")
    @Nullable
    private final String leverage;

    @SerializedName("marginMode")
    @Nullable
    private final String marginMode;

    @SerializedName("markPrice")
    @Nullable
    private final String markPrice;

    @SerializedName("openPrice")
    @Nullable
    private final String openPrice;

    @SerializedName("pnl")
    @Nullable
    private final String pnl;

    @SerializedName("roe")
    @Nullable
    private final String roe;

    @SerializedName("side")
    @Nullable
    private final String side;

    @SerializedName("symbol")
    @Nullable
    private final String symbol;

    @SerializedName("symbolImgUrl")
    @Nullable
    private final String symbolImgUrl;

    public static /* synthetic */ SharedPositionInfo copy$default(SharedPositionInfo sharedPositionInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sharedPositionInfo.closeId;
        }
        if ((i11 & 2) != 0) {
            str2 = sharedPositionInfo.symbol;
        }
        if ((i11 & 4) != 0) {
            str3 = sharedPositionInfo.displaySymbol;
        }
        if ((i11 & 8) != 0) {
            str4 = sharedPositionInfo.symbolImgUrl;
        }
        if ((i11 & 16) != 0) {
            str5 = sharedPositionInfo.side;
        }
        if ((i11 & 32) != 0) {
            str6 = sharedPositionInfo.marginMode;
        }
        if ((i11 & 64) != 0) {
            str7 = sharedPositionInfo.leverage;
        }
        if ((i11 & 128) != 0) {
            str8 = sharedPositionInfo.roe;
        }
        if ((i11 & 256) != 0) {
            str9 = sharedPositionInfo.pnl;
        }
        if ((i11 & 512) != 0) {
            str10 = sharedPositionInfo.openPrice;
        }
        if ((i11 & 1024) != 0) {
            str11 = sharedPositionInfo.closePrice;
        }
        if ((i11 & 2048) != 0) {
            str12 = sharedPositionInfo.markPrice;
        }
        String str13 = str11;
        String str14 = str12;
        String str15 = str9;
        String str16 = str10;
        String str17 = str7;
        String str18 = str8;
        String str19 = str5;
        String str20 = str6;
        return sharedPositionInfo.copy(str, str2, str3, str4, str19, str20, str17, str18, str15, str16, str13, str14);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedPositionInfo)) {
            return false;
        }
        SharedPositionInfo sharedPositionInfo = (SharedPositionInfo) other;
        return Intrinsics.areEqual(this.closeId, sharedPositionInfo.closeId) && Intrinsics.areEqual(this.symbol, sharedPositionInfo.symbol) && Intrinsics.areEqual(this.displaySymbol, sharedPositionInfo.displaySymbol) && Intrinsics.areEqual(this.symbolImgUrl, sharedPositionInfo.symbolImgUrl) && Intrinsics.areEqual(this.side, sharedPositionInfo.side) && Intrinsics.areEqual(this.marginMode, sharedPositionInfo.marginMode) && Intrinsics.areEqual(this.leverage, sharedPositionInfo.leverage) && Intrinsics.areEqual(this.roe, sharedPositionInfo.roe) && Intrinsics.areEqual(this.pnl, sharedPositionInfo.pnl) && Intrinsics.areEqual(this.openPrice, sharedPositionInfo.openPrice) && Intrinsics.areEqual(this.closePrice, sharedPositionInfo.closePrice) && Intrinsics.areEqual(this.markPrice, sharedPositionInfo.markPrice);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCloseId() {
        return this.closeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOpenPrice() {
        return this.openPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getClosePrice() {
        return this.closePrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplaySymbol() {
        return this.displaySymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSymbolImgUrl() {
        return this.symbolImgUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRoe() {
        return this.roe;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPnl() {
        return this.pnl;
    }

    @NotNull
    public final SharedPositionInfo copy(@Nullable String closeId, @Nullable String symbol, @Nullable String displaySymbol, @Nullable String symbolImgUrl, @Nullable String side, @Nullable String marginMode, @Nullable String leverage, @Nullable String roe, @Nullable String pnl, @Nullable String openPrice, @Nullable String closePrice, @Nullable String markPrice) {
        return new SharedPositionInfo(closeId, symbol, displaySymbol, symbolImgUrl, side, marginMode, leverage, roe, pnl, openPrice, closePrice, markPrice);
    }

    @NotNull
    public final C27096v0 displaySymbol() {
        IKuMexService iKuMexService = IKuMexService.f28731a.get();
        String str = this.symbol;
        if (str == null) {
            str = "";
        }
        return IKuMexService.m33249T(iKuMexService, str, false, 2, null);
    }

    @Nullable
    public final String getCloseId() {
        return this.closeId;
    }

    @Nullable
    public final String getClosePrice() {
        return this.closePrice;
    }

    @Nullable
    public final String getDisplaySymbol() {
        return this.displaySymbol;
    }

    @Nullable
    public final String getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final String getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    public final String getOpenPrice() {
        return this.openPrice;
    }

    @Nullable
    public final String getPnl() {
        return this.pnl;
    }

    @Nullable
    public final String getRoe() {
        return this.roe;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getSymbolImgUrl() {
        return this.symbolImgUrl;
    }

    public int hashCode() {
        String str = this.closeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displaySymbol;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.symbolImgUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.side;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.marginMode;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.leverage;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.roe;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.pnl;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.openPrice;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.closePrice;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.markPrice;
        return iHashCode11 + (str12 != null ? str12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SharedPositionInfo(closeId=" + this.closeId + ", symbol=" + this.symbol + ", displaySymbol=" + this.displaySymbol + ", symbolImgUrl=" + this.symbolImgUrl + ", side=" + this.side + ", marginMode=" + this.marginMode + ", leverage=" + this.leverage + ", roe=" + this.roe + ", pnl=" + this.pnl + ", openPrice=" + this.openPrice + ", closePrice=" + this.closePrice + ", markPrice=" + this.markPrice + ')';
    }

    public SharedPositionInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12) {
        this.closeId = str;
        this.symbol = str2;
        this.displaySymbol = str3;
        this.symbolImgUrl = str4;
        this.side = str5;
        this.marginMode = str6;
        this.leverage = str7;
        this.roe = str8;
        this.pnl = str9;
        this.openPrice = str10;
        this.closePrice = str11;
        this.markPrice = str12;
    }
}
