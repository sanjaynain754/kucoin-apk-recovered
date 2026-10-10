package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeCopyTradingTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jb\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006)"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/CopyTraderFollowOneTraderPnlEntity;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "copyTraderAvatarUrl", "", "copyTraderName", "pnlPercent", "pnlValue", "tradePnlSide", "", "leadTraderName", "tradeSettleCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getCopyTraderAvatarUrl", "()Ljava/lang/String;", "getCopyTraderName", "getPnlPercent", "getPnlValue", "getTradePnlSide", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLeadTraderName", "getTradeSettleCurrency", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/rn/core/turbo/CopyTraderFollowOneTraderPnlEntity;", "equals", "", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeCopyTradingTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeCopyTradingTurboModule.kt\ncom/kubi/rn/core/turbo/CopyTraderFollowOneTraderPnlEntity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1#2:296\n*E\n"})
public final /* data */ class CopyTraderFollowOneTraderPnlEntity implements WritableMapSerializable {

    @Nullable
    private final String copyTraderAvatarUrl;

    @Nullable
    private final String copyTraderName;

    @Nullable
    private final String leadTraderName;

    @Nullable
    private final String pnlPercent;

    @Nullable
    private final String pnlValue;

    @Nullable
    private final Double tradePnlSide;

    @Nullable
    private final String tradeSettleCurrency;

    public CopyTraderFollowOneTraderPnlEntity() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CopyTraderFollowOneTraderPnlEntity)) {
            return false;
        }
        CopyTraderFollowOneTraderPnlEntity copyTraderFollowOneTraderPnlEntity = (CopyTraderFollowOneTraderPnlEntity) other;
        return Intrinsics.areEqual(this.copyTraderAvatarUrl, copyTraderFollowOneTraderPnlEntity.copyTraderAvatarUrl) && Intrinsics.areEqual(this.copyTraderName, copyTraderFollowOneTraderPnlEntity.copyTraderName) && Intrinsics.areEqual(this.pnlPercent, copyTraderFollowOneTraderPnlEntity.pnlPercent) && Intrinsics.areEqual(this.pnlValue, copyTraderFollowOneTraderPnlEntity.pnlValue) && Intrinsics.areEqual((Object) this.tradePnlSide, (Object) copyTraderFollowOneTraderPnlEntity.tradePnlSide) && Intrinsics.areEqual(this.leadTraderName, copyTraderFollowOneTraderPnlEntity.leadTraderName) && Intrinsics.areEqual(this.tradeSettleCurrency, copyTraderFollowOneTraderPnlEntity.tradeSettleCurrency);
    }

    public CopyTraderFollowOneTraderPnlEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Double d11, @Nullable String str5, @Nullable String str6) {
        this.copyTraderAvatarUrl = str;
        this.copyTraderName = str2;
        this.pnlPercent = str3;
        this.pnlValue = str4;
        this.tradePnlSide = d11;
        this.leadTraderName = str5;
        this.tradeSettleCurrency = str6;
    }

    public static /* synthetic */ CopyTraderFollowOneTraderPnlEntity copy$default(CopyTraderFollowOneTraderPnlEntity copyTraderFollowOneTraderPnlEntity, String str, String str2, String str3, String str4, Double d11, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = copyTraderFollowOneTraderPnlEntity.copyTraderAvatarUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = copyTraderFollowOneTraderPnlEntity.copyTraderName;
        }
        if ((i11 & 4) != 0) {
            str3 = copyTraderFollowOneTraderPnlEntity.pnlPercent;
        }
        if ((i11 & 8) != 0) {
            str4 = copyTraderFollowOneTraderPnlEntity.pnlValue;
        }
        if ((i11 & 16) != 0) {
            d11 = copyTraderFollowOneTraderPnlEntity.tradePnlSide;
        }
        if ((i11 & 32) != 0) {
            str5 = copyTraderFollowOneTraderPnlEntity.leadTraderName;
        }
        if ((i11 & 64) != 0) {
            str6 = copyTraderFollowOneTraderPnlEntity.tradeSettleCurrency;
        }
        String str7 = str5;
        String str8 = str6;
        Double d12 = d11;
        String str9 = str3;
        return copyTraderFollowOneTraderPnlEntity.copy(str, str2, str9, str4, d12, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCopyTraderAvatarUrl() {
        return this.copyTraderAvatarUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCopyTraderName() {
        return this.copyTraderName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPnlPercent() {
        return this.pnlPercent;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPnlValue() {
        return this.pnlValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getTradePnlSide() {
        return this.tradePnlSide;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLeadTraderName() {
        return this.leadTraderName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTradeSettleCurrency() {
        return this.tradeSettleCurrency;
    }

    @NotNull
    public final CopyTraderFollowOneTraderPnlEntity copy(@Nullable String copyTraderAvatarUrl, @Nullable String copyTraderName, @Nullable String pnlPercent, @Nullable String pnlValue, @Nullable Double tradePnlSide, @Nullable String leadTraderName, @Nullable String tradeSettleCurrency) {
        return new CopyTraderFollowOneTraderPnlEntity(copyTraderAvatarUrl, copyTraderName, pnlPercent, pnlValue, tradePnlSide, leadTraderName, tradeSettleCurrency);
    }

    @Nullable
    public final String getCopyTraderAvatarUrl() {
        return this.copyTraderAvatarUrl;
    }

    @Nullable
    public final String getCopyTraderName() {
        return this.copyTraderName;
    }

    @Nullable
    public final String getLeadTraderName() {
        return this.leadTraderName;
    }

    @Nullable
    public final String getPnlPercent() {
        return this.pnlPercent;
    }

    @Nullable
    public final String getPnlValue() {
        return this.pnlValue;
    }

    @Nullable
    public final Double getTradePnlSide() {
        return this.tradePnlSide;
    }

    @Nullable
    public final String getTradeSettleCurrency() {
        return this.tradeSettleCurrency;
    }

    public int hashCode() {
        String str = this.copyTraderAvatarUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.copyTraderName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pnlPercent;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pnlValue;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d11 = this.tradePnlSide;
        int iHashCode5 = (iHashCode4 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str5 = this.leadTraderName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tradeSettleCurrency;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CopyTraderFollowOneTraderPnlEntity(copyTraderAvatarUrl=" + this.copyTraderAvatarUrl + ", copyTraderName=" + this.copyTraderName + ", pnlPercent=" + this.pnlPercent + ", pnlValue=" + this.pnlValue + ", tradePnlSide=" + this.tradePnlSide + ", leadTraderName=" + this.leadTraderName + ", tradeSettleCurrency=" + this.tradeSettleCurrency + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.copyTraderAvatarUrl;
        if (str != null) {
            writableMapCreateMap.putString("copyTraderAvatarUrl", str.toString());
        }
        String str2 = this.copyTraderName;
        if (str2 != null) {
            writableMapCreateMap.putString("copyTraderName", str2.toString());
        }
        String str3 = this.pnlPercent;
        if (str3 != null) {
            writableMapCreateMap.putString("pnlPercent", str3.toString());
        }
        String str4 = this.pnlValue;
        if (str4 != null) {
            writableMapCreateMap.putString("pnlValue", str4.toString());
        }
        Double d11 = this.tradePnlSide;
        if (d11 != null) {
            writableMapCreateMap.putDouble("tradePnlSide", d11.doubleValue());
        }
        String str5 = this.leadTraderName;
        if (str5 != null) {
            writableMapCreateMap.putString("leadTraderName", str5.toString());
        }
        String str6 = this.tradeSettleCurrency;
        if (str6 != null) {
            writableMapCreateMap.putString("tradeSettleCurrency", str6.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ CopyTraderFollowOneTraderPnlEntity(String str, String str2, String str3, String str4, Double d11, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : d11, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6);
    }
}
