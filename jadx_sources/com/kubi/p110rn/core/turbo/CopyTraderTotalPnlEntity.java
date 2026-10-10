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
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006+"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/CopyTraderTotalPnlEntity;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "userAvatarUrl", "", TUIConstantDefine.USER_NAME, "totalPnlData", "", "totalPnlValue", "tradePnlSide", "", "leadTradersNameData", "tradeSettleCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;)V", "getUserAvatarUrl", "()Ljava/lang/String;", "getUserName", "getTotalPnlData", "()Ljava/util/List;", "getTotalPnlValue", "getTradePnlSide", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLeadTradersNameData", "getTradeSettleCurrency", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;)Lcom/kubi/rn/core/turbo/CopyTraderTotalPnlEntity;", "equals", "", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeCopyTradingTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeCopyTradingTurboModule.kt\ncom/kubi/rn/core/turbo/CopyTraderTotalPnlEntity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,295:1\n1#2:296\n1863#3,2:297\n1863#3,2:299\n*S KotlinDebug\n*F\n+ 1 NativeCopyTradingTurboModule.kt\ncom/kubi/rn/core/turbo/CopyTraderTotalPnlEntity\n*L\n115#1:297,2\n122#1:299,2\n*E\n"})
public final /* data */ class CopyTraderTotalPnlEntity implements WritableMapSerializable {

    @Nullable
    private final List<String> leadTradersNameData;

    @Nullable
    private final List<String> totalPnlData;

    @Nullable
    private final String totalPnlValue;

    @Nullable
    private final Double tradePnlSide;

    @Nullable
    private final String tradeSettleCurrency;

    @Nullable
    private final String userAvatarUrl;

    @Nullable
    private final String userName;

    public CopyTraderTotalPnlEntity() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CopyTraderTotalPnlEntity)) {
            return false;
        }
        CopyTraderTotalPnlEntity copyTraderTotalPnlEntity = (CopyTraderTotalPnlEntity) other;
        return Intrinsics.areEqual(this.userAvatarUrl, copyTraderTotalPnlEntity.userAvatarUrl) && Intrinsics.areEqual(this.userName, copyTraderTotalPnlEntity.userName) && Intrinsics.areEqual(this.totalPnlData, copyTraderTotalPnlEntity.totalPnlData) && Intrinsics.areEqual(this.totalPnlValue, copyTraderTotalPnlEntity.totalPnlValue) && Intrinsics.areEqual((Object) this.tradePnlSide, (Object) copyTraderTotalPnlEntity.tradePnlSide) && Intrinsics.areEqual(this.leadTradersNameData, copyTraderTotalPnlEntity.leadTradersNameData) && Intrinsics.areEqual(this.tradeSettleCurrency, copyTraderTotalPnlEntity.tradeSettleCurrency);
    }

    public CopyTraderTotalPnlEntity(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, @Nullable Double d11, @Nullable List<String> list2, @Nullable String str4) {
        this.userAvatarUrl = str;
        this.userName = str2;
        this.totalPnlData = list;
        this.totalPnlValue = str3;
        this.tradePnlSide = d11;
        this.leadTradersNameData = list2;
        this.tradeSettleCurrency = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CopyTraderTotalPnlEntity copy$default(CopyTraderTotalPnlEntity copyTraderTotalPnlEntity, String str, String str2, List list, String str3, Double d11, List list2, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = copyTraderTotalPnlEntity.userAvatarUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = copyTraderTotalPnlEntity.userName;
        }
        if ((i11 & 4) != 0) {
            list = copyTraderTotalPnlEntity.totalPnlData;
        }
        if ((i11 & 8) != 0) {
            str3 = copyTraderTotalPnlEntity.totalPnlValue;
        }
        if ((i11 & 16) != 0) {
            d11 = copyTraderTotalPnlEntity.tradePnlSide;
        }
        if ((i11 & 32) != 0) {
            list2 = copyTraderTotalPnlEntity.leadTradersNameData;
        }
        if ((i11 & 64) != 0) {
            str4 = copyTraderTotalPnlEntity.tradeSettleCurrency;
        }
        List list3 = list2;
        String str5 = str4;
        Double d12 = d11;
        List list4 = list;
        return copyTraderTotalPnlEntity.copy(str, str2, list4, str3, d12, list3, str5);
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
        return this.totalPnlData;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTotalPnlValue() {
        return this.totalPnlValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getTradePnlSide() {
        return this.tradePnlSide;
    }

    @Nullable
    public final List<String> component6() {
        return this.leadTradersNameData;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTradeSettleCurrency() {
        return this.tradeSettleCurrency;
    }

    @NotNull
    public final CopyTraderTotalPnlEntity copy(@Nullable String userAvatarUrl, @Nullable String userName, @Nullable List<String> totalPnlData, @Nullable String totalPnlValue, @Nullable Double tradePnlSide, @Nullable List<String> leadTradersNameData, @Nullable String tradeSettleCurrency) {
        return new CopyTraderTotalPnlEntity(userAvatarUrl, userName, totalPnlData, totalPnlValue, tradePnlSide, leadTradersNameData, tradeSettleCurrency);
    }

    @Nullable
    public final List<String> getLeadTradersNameData() {
        return this.leadTradersNameData;
    }

    @Nullable
    public final List<String> getTotalPnlData() {
        return this.totalPnlData;
    }

    @Nullable
    public final String getTotalPnlValue() {
        return this.totalPnlValue;
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
        List<String> list = this.totalPnlData;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.totalPnlValue;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d11 = this.tradePnlSide;
        int iHashCode5 = (iHashCode4 + (d11 == null ? 0 : d11.hashCode())) * 31;
        List<String> list2 = this.leadTradersNameData;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.tradeSettleCurrency;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CopyTraderTotalPnlEntity(userAvatarUrl=" + this.userAvatarUrl + ", userName=" + this.userName + ", totalPnlData=" + this.totalPnlData + ", totalPnlValue=" + this.totalPnlValue + ", tradePnlSide=" + this.tradePnlSide + ", leadTradersNameData=" + this.leadTradersNameData + ", tradeSettleCurrency=" + this.tradeSettleCurrency + ")";
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
        List<String> list = this.totalPnlData;
        if (list != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                writableArrayCreateArray.pushString((String) it.next());
            }
            writableMapCreateMap.putArray("totalPnlData", writableArrayCreateArray);
        }
        String str3 = this.totalPnlValue;
        if (str3 != null) {
            writableMapCreateMap.putString("totalPnlValue", str3.toString());
        }
        Double d11 = this.tradePnlSide;
        if (d11 != null) {
            writableMapCreateMap.putDouble("tradePnlSide", d11.doubleValue());
        }
        List<String> list2 = this.leadTradersNameData;
        if (list2 != null) {
            WritableArray writableArrayCreateArray2 = Arguments.createArray();
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                writableArrayCreateArray2.pushString((String) it2.next());
            }
            writableMapCreateMap.putArray("leadTradersNameData", writableArrayCreateArray2);
        }
        String str4 = this.tradeSettleCurrency;
        if (str4 != null) {
            writableMapCreateMap.putString("tradeSettleCurrency", str4.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ CopyTraderTotalPnlEntity(String str, String str2, List list, String str3, Double d11, List list2, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : d11, (i11 & 32) != 0 ? null : list2, (i11 & 64) != 0 ? null : str4);
    }
}
