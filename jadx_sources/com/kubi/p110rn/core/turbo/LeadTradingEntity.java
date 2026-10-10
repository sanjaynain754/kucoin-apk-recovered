package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeCopyTradingTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jh\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006+"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/LeadTradingEntity;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "userAvatarUrl", "", TUIConstantDefine.USER_NAME, "lead30DayData", "", "lead30DayPnl", "lead30DayValue", "tradePnlSide", "", "tradeSettleCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "getUserAvatarUrl", "()Ljava/lang/String;", "getUserName", "getLead30DayData", "()Ljava/util/List;", "getLead30DayPnl", "getLead30DayValue", "getTradePnlSide", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTradeSettleCurrency", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)Lcom/kubi/rn/core/turbo/LeadTradingEntity;", "equals", "", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeCopyTradingTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeCopyTradingTurboModule.kt\ncom/kubi/rn/core/turbo/LeadTradingEntity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,295:1\n1#2:296\n1863#3,2:297\n*S KotlinDebug\n*F\n+ 1 NativeCopyTradingTurboModule.kt\ncom/kubi/rn/core/turbo/LeadTradingEntity\n*L\n167#1:297,2\n*E\n"})
public final /* data */ class LeadTradingEntity implements WritableMapSerializable {

    @Nullable
    private final List<String> lead30DayData;

    @Nullable
    private final String lead30DayPnl;

    @Nullable
    private final String lead30DayValue;

    @Nullable
    private final Double tradePnlSide;

    @Nullable
    private final String tradeSettleCurrency;

    @Nullable
    private final String userAvatarUrl;

    @Nullable
    private final String userName;

    public LeadTradingEntity() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeadTradingEntity)) {
            return false;
        }
        LeadTradingEntity leadTradingEntity = (LeadTradingEntity) other;
        return Intrinsics.areEqual(this.userAvatarUrl, leadTradingEntity.userAvatarUrl) && Intrinsics.areEqual(this.userName, leadTradingEntity.userName) && Intrinsics.areEqual(this.lead30DayData, leadTradingEntity.lead30DayData) && Intrinsics.areEqual(this.lead30DayPnl, leadTradingEntity.lead30DayPnl) && Intrinsics.areEqual(this.lead30DayValue, leadTradingEntity.lead30DayValue) && Intrinsics.areEqual((Object) this.tradePnlSide, (Object) leadTradingEntity.tradePnlSide) && Intrinsics.areEqual(this.tradeSettleCurrency, leadTradingEntity.tradeSettleCurrency);
    }

    public LeadTradingEntity(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, @Nullable String str4, @Nullable Double d11, @Nullable String str5) {
        this.userAvatarUrl = str;
        this.userName = str2;
        this.lead30DayData = list;
        this.lead30DayPnl = str3;
        this.lead30DayValue = str4;
        this.tradePnlSide = d11;
        this.tradeSettleCurrency = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeadTradingEntity copy$default(LeadTradingEntity leadTradingEntity, String str, String str2, List list, String str3, String str4, Double d11, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = leadTradingEntity.userAvatarUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = leadTradingEntity.userName;
        }
        if ((i11 & 4) != 0) {
            list = leadTradingEntity.lead30DayData;
        }
        if ((i11 & 8) != 0) {
            str3 = leadTradingEntity.lead30DayPnl;
        }
        if ((i11 & 16) != 0) {
            str4 = leadTradingEntity.lead30DayValue;
        }
        if ((i11 & 32) != 0) {
            d11 = leadTradingEntity.tradePnlSide;
        }
        if ((i11 & 64) != 0) {
            str5 = leadTradingEntity.tradeSettleCurrency;
        }
        Double d12 = d11;
        String str6 = str5;
        String str7 = str4;
        List list2 = list;
        return leadTradingEntity.copy(str, str2, list2, str3, str7, d12, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserAvatarUrl() {
        return this.userAvatarUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    public final List<String> component3() {
        return this.lead30DayData;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLead30DayPnl() {
        return this.lead30DayPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLead30DayValue() {
        return this.lead30DayValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getTradePnlSide() {
        return this.tradePnlSide;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTradeSettleCurrency() {
        return this.tradeSettleCurrency;
    }

    @NotNull
    public final LeadTradingEntity copy(@Nullable String userAvatarUrl, @Nullable String userName, @Nullable List<String> lead30DayData, @Nullable String lead30DayPnl, @Nullable String lead30DayValue, @Nullable Double tradePnlSide, @Nullable String tradeSettleCurrency) {
        return new LeadTradingEntity(userAvatarUrl, userName, lead30DayData, lead30DayPnl, lead30DayValue, tradePnlSide, tradeSettleCurrency);
    }

    @Nullable
    public final List<String> getLead30DayData() {
        return this.lead30DayData;
    }

    @Nullable
    public final String getLead30DayPnl() {
        return this.lead30DayPnl;
    }

    @Nullable
    public final String getLead30DayValue() {
        return this.lead30DayValue;
    }

    @Nullable
    public final Double getTradePnlSide() {
        return this.tradePnlSide;
    }

    @Nullable
    public final String getTradeSettleCurrency() {
        return this.tradeSettleCurrency;
    }

    @Nullable
    public final String getUserAvatarUrl() {
        return this.userAvatarUrl;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        String str = this.userAvatarUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.lead30DayData;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.lead30DayPnl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lead30DayValue;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d11 = this.tradePnlSide;
        int iHashCode6 = (iHashCode5 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str5 = this.tradeSettleCurrency;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LeadTradingEntity(userAvatarUrl=" + this.userAvatarUrl + ", userName=" + this.userName + ", lead30DayData=" + this.lead30DayData + ", lead30DayPnl=" + this.lead30DayPnl + ", lead30DayValue=" + this.lead30DayValue + ", tradePnlSide=" + this.tradePnlSide + ", tradeSettleCurrency=" + this.tradeSettleCurrency + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.userAvatarUrl;
        if (str != null) {
            writableMapCreateMap.putString("userAvatarUrl", str.toString());
        }
        String str2 = this.userName;
        if (str2 != null) {
            writableMapCreateMap.putString(TUIConstantDefine.USER_NAME, str2.toString());
        }
        List<String> list = this.lead30DayData;
        if (list != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                writableArrayCreateArray.pushString((String) it.next());
            }
            writableMapCreateMap.putArray("lead30DayData", writableArrayCreateArray);
        }
        String str3 = this.lead30DayPnl;
        if (str3 != null) {
            writableMapCreateMap.putString("lead30DayPnl", str3.toString());
        }
        String str4 = this.lead30DayValue;
        if (str4 != null) {
            writableMapCreateMap.putString("lead30DayValue", str4.toString());
        }
        Double d11 = this.tradePnlSide;
        if (d11 != null) {
            writableMapCreateMap.putDouble("tradePnlSide", d11.doubleValue());
        }
        String str5 = this.tradeSettleCurrency;
        if (str5 != null) {
            writableMapCreateMap.putString("tradeSettleCurrency", str5.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ LeadTradingEntity(String str, String str2, List list, String str3, String str4, Double d11, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : d11, (i11 & 64) != 0 ? null : str5);
    }
}
