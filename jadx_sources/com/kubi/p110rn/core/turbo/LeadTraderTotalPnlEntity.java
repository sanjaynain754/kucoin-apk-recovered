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
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\\\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006("}, m90084d2 = {"Lcom/kubi/rn/core/turbo/LeadTraderTotalPnlEntity;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "userAvatarUrl", "", TUIConstantDefine.USER_NAME, "leadTotalPnlData", "", "leadTotalPnlValue", "tradePnlSide", "", "tradeSettleCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "getUserAvatarUrl", "()Ljava/lang/String;", "getUserName", "getLeadTotalPnlData", "()Ljava/util/List;", "getLeadTotalPnlValue", "getTradePnlSide", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTradeSettleCurrency", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)Lcom/kubi/rn/core/turbo/LeadTraderTotalPnlEntity;", "equals", "", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeCopyTradingTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeCopyTradingTurboModule.kt\ncom/kubi/rn/core/turbo/LeadTraderTotalPnlEntity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,295:1\n1#2:296\n1863#3,2:297\n*S KotlinDebug\n*F\n+ 1 NativeCopyTradingTurboModule.kt\ncom/kubi/rn/core/turbo/LeadTraderTotalPnlEntity\n*L\n90#1:297,2\n*E\n"})
public final /* data */ class LeadTraderTotalPnlEntity implements WritableMapSerializable {

    @Nullable
    private final List<String> leadTotalPnlData;

    @Nullable
    private final String leadTotalPnlValue;

    @Nullable
    private final Double tradePnlSide;

    @Nullable
    private final String tradeSettleCurrency;

    @Nullable
    private final String userAvatarUrl;

    @Nullable
    private final String userName;

    public LeadTraderTotalPnlEntity() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeadTraderTotalPnlEntity)) {
            return false;
        }
        LeadTraderTotalPnlEntity leadTraderTotalPnlEntity = (LeadTraderTotalPnlEntity) other;
        return Intrinsics.areEqual(this.userAvatarUrl, leadTraderTotalPnlEntity.userAvatarUrl) && Intrinsics.areEqual(this.userName, leadTraderTotalPnlEntity.userName) && Intrinsics.areEqual(this.leadTotalPnlData, leadTraderTotalPnlEntity.leadTotalPnlData) && Intrinsics.areEqual(this.leadTotalPnlValue, leadTraderTotalPnlEntity.leadTotalPnlValue) && Intrinsics.areEqual((Object) this.tradePnlSide, (Object) leadTraderTotalPnlEntity.tradePnlSide) && Intrinsics.areEqual(this.tradeSettleCurrency, leadTraderTotalPnlEntity.tradeSettleCurrency);
    }

    public LeadTraderTotalPnlEntity(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, @Nullable Double d11, @Nullable String str4) {
        this.userAvatarUrl = str;
        this.userName = str2;
        this.leadTotalPnlData = list;
        this.leadTotalPnlValue = str3;
        this.tradePnlSide = d11;
        this.tradeSettleCurrency = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeadTraderTotalPnlEntity copy$default(LeadTraderTotalPnlEntity leadTraderTotalPnlEntity, String str, String str2, List list, String str3, Double d11, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = leadTraderTotalPnlEntity.userAvatarUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = leadTraderTotalPnlEntity.userName;
        }
        if ((i11 & 4) != 0) {
            list = leadTraderTotalPnlEntity.leadTotalPnlData;
        }
        if ((i11 & 8) != 0) {
            str3 = leadTraderTotalPnlEntity.leadTotalPnlValue;
        }
        if ((i11 & 16) != 0) {
            d11 = leadTraderTotalPnlEntity.tradePnlSide;
        }
        if ((i11 & 32) != 0) {
            str4 = leadTraderTotalPnlEntity.tradeSettleCurrency;
        }
        Double d12 = d11;
        String str5 = str4;
        return leadTraderTotalPnlEntity.copy(str, str2, list, str3, d12, str5);
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
        return this.leadTotalPnlData;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLeadTotalPnlValue() {
        return this.leadTotalPnlValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getTradePnlSide() {
        return this.tradePnlSide;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTradeSettleCurrency() {
        return this.tradeSettleCurrency;
    }

    @NotNull
    public final LeadTraderTotalPnlEntity copy(@Nullable String userAvatarUrl, @Nullable String userName, @Nullable List<String> leadTotalPnlData, @Nullable String leadTotalPnlValue, @Nullable Double tradePnlSide, @Nullable String tradeSettleCurrency) {
        return new LeadTraderTotalPnlEntity(userAvatarUrl, userName, leadTotalPnlData, leadTotalPnlValue, tradePnlSide, tradeSettleCurrency);
    }

    @Nullable
    public final List<String> getLeadTotalPnlData() {
        return this.leadTotalPnlData;
    }

    @Nullable
    public final String getLeadTotalPnlValue() {
        return this.leadTotalPnlValue;
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
        List<String> list = this.leadTotalPnlData;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.leadTotalPnlValue;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d11 = this.tradePnlSide;
        int iHashCode5 = (iHashCode4 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str4 = this.tradeSettleCurrency;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LeadTraderTotalPnlEntity(userAvatarUrl=" + this.userAvatarUrl + ", userName=" + this.userName + ", leadTotalPnlData=" + this.leadTotalPnlData + ", leadTotalPnlValue=" + this.leadTotalPnlValue + ", tradePnlSide=" + this.tradePnlSide + ", tradeSettleCurrency=" + this.tradeSettleCurrency + ")";
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
        List<String> list = this.leadTotalPnlData;
        if (list != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                writableArrayCreateArray.pushString((String) it.next());
            }
            writableMapCreateMap.putArray("leadTotalPnlData", writableArrayCreateArray);
        }
        String str3 = this.leadTotalPnlValue;
        if (str3 != null) {
            writableMapCreateMap.putString("leadTotalPnlValue", str3.toString());
        }
        Double d11 = this.tradePnlSide;
        if (d11 != null) {
            writableMapCreateMap.putDouble("tradePnlSide", d11.doubleValue());
        }
        String str4 = this.tradeSettleCurrency;
        if (str4 != null) {
            writableMapCreateMap.putString("tradeSettleCurrency", str4.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ LeadTraderTotalPnlEntity(String str, String str2, List list, String str3, Double d11, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : d11, (i11 & 32) != 0 ? null : str4);
    }
}
