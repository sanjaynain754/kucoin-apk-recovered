package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeSymbolsCoinTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JP\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006'"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/FuturesCoinInfoPageResult;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/rn/core/turbo/FuturesCoinInfo;", "pageIndex", "", "pageSize", "total", "hasNext", "", "<init>", "(Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;)V", "getItems", "()Ljava/util/List;", "getPageIndex", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPageSize", "getTotal", "getHasNext", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;)Lcom/kubi/rn/core/turbo/FuturesCoinInfoPageResult;", "equals", "other", "", "hashCode", "", "toString", "", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeSymbolsCoinTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeSymbolsCoinTurboModule.kt\ncom/kubi/rn/core/turbo/FuturesCoinInfoPageResult\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,521:1\n1863#2,2:522\n1#3:524\n*S KotlinDebug\n*F\n+ 1 NativeSymbolsCoinTurboModule.kt\ncom/kubi/rn/core/turbo/FuturesCoinInfoPageResult\n*L\n257#1:522,2\n*E\n"})
public final /* data */ class FuturesCoinInfoPageResult implements WritableMapSerializable {

    @Nullable
    private final Boolean hasNext;

    @Nullable
    private final List<FuturesCoinInfo> items;

    @Nullable
    private final Double pageIndex;

    @Nullable
    private final Double pageSize;

    @Nullable
    private final Double total;

    public FuturesCoinInfoPageResult() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesCoinInfoPageResult)) {
            return false;
        }
        FuturesCoinInfoPageResult futuresCoinInfoPageResult = (FuturesCoinInfoPageResult) other;
        return Intrinsics.areEqual(this.items, futuresCoinInfoPageResult.items) && Intrinsics.areEqual((Object) this.pageIndex, (Object) futuresCoinInfoPageResult.pageIndex) && Intrinsics.areEqual((Object) this.pageSize, (Object) futuresCoinInfoPageResult.pageSize) && Intrinsics.areEqual((Object) this.total, (Object) futuresCoinInfoPageResult.total) && Intrinsics.areEqual(this.hasNext, futuresCoinInfoPageResult.hasNext);
    }

    public FuturesCoinInfoPageResult(@Nullable List<FuturesCoinInfo> list, @Nullable Double d11, @Nullable Double d12, @Nullable Double d13, @Nullable Boolean bool) {
        this.items = list;
        this.pageIndex = d11;
        this.pageSize = d12;
        this.total = d13;
        this.hasNext = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesCoinInfoPageResult copy$default(FuturesCoinInfoPageResult futuresCoinInfoPageResult, List list, Double d11, Double d12, Double d13, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = futuresCoinInfoPageResult.items;
        }
        if ((i11 & 2) != 0) {
            d11 = futuresCoinInfoPageResult.pageIndex;
        }
        if ((i11 & 4) != 0) {
            d12 = futuresCoinInfoPageResult.pageSize;
        }
        if ((i11 & 8) != 0) {
            d13 = futuresCoinInfoPageResult.total;
        }
        if ((i11 & 16) != 0) {
            bool = futuresCoinInfoPageResult.hasNext;
        }
        Boolean bool2 = bool;
        Double d14 = d12;
        return futuresCoinInfoPageResult.copy(list, d11, d14, d13, bool2);
    }

    @Nullable
    public final List<FuturesCoinInfo> component1() {
        return this.items;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getPageIndex() {
        return this.pageIndex;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getPageSize() {
        return this.pageSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getTotal() {
        return this.total;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getHasNext() {
        return this.hasNext;
    }

    @NotNull
    public final FuturesCoinInfoPageResult copy(@Nullable List<FuturesCoinInfo> items, @Nullable Double pageIndex, @Nullable Double pageSize, @Nullable Double total, @Nullable Boolean hasNext) {
        return new FuturesCoinInfoPageResult(items, pageIndex, pageSize, total, hasNext);
    }

    @Nullable
    public final Boolean getHasNext() {
        return this.hasNext;
    }

    @Nullable
    public final List<FuturesCoinInfo> getItems() {
        return this.items;
    }

    @Nullable
    public final Double getPageIndex() {
        return this.pageIndex;
    }

    @Nullable
    public final Double getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final Double getTotal() {
        return this.total;
    }

    public int hashCode() {
        List<FuturesCoinInfo> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Double d11 = this.pageIndex;
        int iHashCode2 = (iHashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.pageSize;
        int iHashCode3 = (iHashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.total;
        int iHashCode4 = (iHashCode3 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Boolean bool = this.hasNext;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FuturesCoinInfoPageResult(items=" + this.items + ", pageIndex=" + this.pageIndex + ", pageSize=" + this.pageSize + ", total=" + this.total + ", hasNext=" + this.hasNext + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        List<FuturesCoinInfo> list = this.items;
        if (list != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                writableArrayCreateArray.pushMap(((FuturesCoinInfo) it.next()).toWritableMap());
            }
            writableMapCreateMap.putArray(FirebaseAnalytics.Param.ITEMS, writableArrayCreateArray);
        }
        Double d11 = this.pageIndex;
        if (d11 != null) {
            writableMapCreateMap.putDouble("pageIndex", d11.doubleValue());
        }
        Double d12 = this.pageSize;
        if (d12 != null) {
            writableMapCreateMap.putDouble("pageSize", d12.doubleValue());
        }
        Double d13 = this.total;
        if (d13 != null) {
            writableMapCreateMap.putDouble("total", d13.doubleValue());
        }
        Boolean bool = this.hasNext;
        if (bool != null) {
            writableMapCreateMap.putBoolean("hasNext", bool.booleanValue());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ FuturesCoinInfoPageResult(List list, Double d11, Double d12, Double d13, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : d11, (i11 & 4) != 0 ? null : d12, (i11 & 8) != 0 ? null : d13, (i11 & 16) != 0 ? null : bool);
    }
}
