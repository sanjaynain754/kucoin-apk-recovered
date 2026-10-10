package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.kubi.user.protocol.entity.SignTermItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeTradeTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006("}, m90084d2 = {"Lcom/kubi/rn/core/turbo/SymbolOfflineInfo;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "id", "", "symbol", "showStartTime", "showEndTime", "offlineTime", "baseCloseWithdrawTime", "quoteCloseWithdrawTime", SignTermItem.LINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getSymbol", "getShowStartTime", "getShowEndTime", "getOfflineTime", "getBaseCloseWithdrawTime", "getQuoteCloseWithdrawTime", "getLink", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeTradeTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeTradeTurboModule.kt\ncom/kubi/rn/core/turbo/SymbolOfflineInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,385:1\n1#2:386\n*E\n"})
public final /* data */ class SymbolOfflineInfo implements WritableMapSerializable {

    @Nullable
    private final String baseCloseWithdrawTime;

    @Nullable
    private final String id;

    @Nullable
    private final String link;

    @Nullable
    private final String offlineTime;

    @Nullable
    private final String quoteCloseWithdrawTime;

    @Nullable
    private final String showEndTime;

    @Nullable
    private final String showStartTime;

    @Nullable
    private final String symbol;

    public SymbolOfflineInfo() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ SymbolOfflineInfo copy$default(SymbolOfflineInfo symbolOfflineInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = symbolOfflineInfo.id;
        }
        if ((i11 & 2) != 0) {
            str2 = symbolOfflineInfo.symbol;
        }
        if ((i11 & 4) != 0) {
            str3 = symbolOfflineInfo.showStartTime;
        }
        if ((i11 & 8) != 0) {
            str4 = symbolOfflineInfo.showEndTime;
        }
        if ((i11 & 16) != 0) {
            str5 = symbolOfflineInfo.offlineTime;
        }
        if ((i11 & 32) != 0) {
            str6 = symbolOfflineInfo.baseCloseWithdrawTime;
        }
        if ((i11 & 64) != 0) {
            str7 = symbolOfflineInfo.quoteCloseWithdrawTime;
        }
        if ((i11 & 128) != 0) {
            str8 = symbolOfflineInfo.link;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return symbolOfflineInfo.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SymbolOfflineInfo)) {
            return false;
        }
        SymbolOfflineInfo symbolOfflineInfo = (SymbolOfflineInfo) other;
        return Intrinsics.areEqual(this.id, symbolOfflineInfo.id) && Intrinsics.areEqual(this.symbol, symbolOfflineInfo.symbol) && Intrinsics.areEqual(this.showStartTime, symbolOfflineInfo.showStartTime) && Intrinsics.areEqual(this.showEndTime, symbolOfflineInfo.showEndTime) && Intrinsics.areEqual(this.offlineTime, symbolOfflineInfo.offlineTime) && Intrinsics.areEqual(this.baseCloseWithdrawTime, symbolOfflineInfo.baseCloseWithdrawTime) && Intrinsics.areEqual(this.quoteCloseWithdrawTime, symbolOfflineInfo.quoteCloseWithdrawTime) && Intrinsics.areEqual(this.link, symbolOfflineInfo.link);
    }

    public SymbolOfflineInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.id = str;
        this.symbol = str2;
        this.showStartTime = str3;
        this.showEndTime = str4;
        this.offlineTime = str5;
        this.baseCloseWithdrawTime = str6;
        this.quoteCloseWithdrawTime = str7;
        this.link = str8;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getShowStartTime() {
        return this.showStartTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getShowEndTime() {
        return this.showEndTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOfflineTime() {
        return this.offlineTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBaseCloseWithdrawTime() {
        return this.baseCloseWithdrawTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getQuoteCloseWithdrawTime() {
        return this.quoteCloseWithdrawTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final SymbolOfflineInfo copy(@Nullable String id2, @Nullable String symbol, @Nullable String showStartTime, @Nullable String showEndTime, @Nullable String offlineTime, @Nullable String baseCloseWithdrawTime, @Nullable String quoteCloseWithdrawTime, @Nullable String link) {
        return new SymbolOfflineInfo(id2, symbol, showStartTime, showEndTime, offlineTime, baseCloseWithdrawTime, quoteCloseWithdrawTime, link);
    }

    @Nullable
    public final String getBaseCloseWithdrawTime() {
        return this.baseCloseWithdrawTime;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getOfflineTime() {
        return this.offlineTime;
    }

    @Nullable
    public final String getQuoteCloseWithdrawTime() {
        return this.quoteCloseWithdrawTime;
    }

    @Nullable
    public final String getShowEndTime() {
        return this.showEndTime;
    }

    @Nullable
    public final String getShowStartTime() {
        return this.showStartTime;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.showStartTime;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.showEndTime;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.offlineTime;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.baseCloseWithdrawTime;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.quoteCloseWithdrawTime;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.link;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SymbolOfflineInfo(id=" + this.id + ", symbol=" + this.symbol + ", showStartTime=" + this.showStartTime + ", showEndTime=" + this.showEndTime + ", offlineTime=" + this.offlineTime + ", baseCloseWithdrawTime=" + this.baseCloseWithdrawTime + ", quoteCloseWithdrawTime=" + this.quoteCloseWithdrawTime + ", link=" + this.link + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.id;
        if (str != null) {
            writableMapCreateMap.putString("id", str.toString());
        }
        String str2 = this.symbol;
        if (str2 != null) {
            writableMapCreateMap.putString("symbol", str2.toString());
        }
        String str3 = this.showStartTime;
        if (str3 != null) {
            writableMapCreateMap.putString("showStartTime", str3.toString());
        }
        String str4 = this.showEndTime;
        if (str4 != null) {
            writableMapCreateMap.putString("showEndTime", str4.toString());
        }
        String str5 = this.offlineTime;
        if (str5 != null) {
            writableMapCreateMap.putString("offlineTime", str5.toString());
        }
        String str6 = this.baseCloseWithdrawTime;
        if (str6 != null) {
            writableMapCreateMap.putString("baseCloseWithdrawTime", str6.toString());
        }
        String str7 = this.quoteCloseWithdrawTime;
        if (str7 != null) {
            writableMapCreateMap.putString("quoteCloseWithdrawTime", str7.toString());
        }
        String str8 = this.link;
        if (str8 != null) {
            writableMapCreateMap.putString(SignTermItem.LINK, str8.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ SymbolOfflineInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8);
    }
}
