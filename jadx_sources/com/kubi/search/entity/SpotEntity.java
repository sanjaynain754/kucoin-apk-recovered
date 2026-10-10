package com.kubi.search.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import gf.C37890n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SearchRecommendEntity.kt */
/* JADX INFO: loaded from: classes44.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0012J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/search/entity/SpotEntity;", "", FirebaseAnalytics.Param.PRICE, "", "changeRate", "fav", "", "symbol", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getPrice", "()Ljava/lang/String;", "getChangeRate", "getFav", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSymbol", "toTradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/search/entity/SpotEntity;", "equals", "other", "hashCode", "", "toString", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchRecommendEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchRecommendEntity.kt\ncom/kubi/search/entity/SpotEntity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n1#2:185\n*E\n"})
public final /* data */ class SpotEntity {

    @Nullable
    private final String changeRate;

    @Nullable
    private final Boolean fav;

    @Nullable
    private final String price;

    @Nullable
    private final String symbol;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotEntity)) {
            return false;
        }
        SpotEntity spotEntity = (SpotEntity) other;
        return Intrinsics.areEqual(this.price, spotEntity.price) && Intrinsics.areEqual(this.changeRate, spotEntity.changeRate) && Intrinsics.areEqual(this.fav, spotEntity.fav) && Intrinsics.areEqual(this.symbol, spotEntity.symbol);
    }

    public static /* synthetic */ SpotEntity copy$default(SpotEntity spotEntity, String str, String str2, Boolean bool, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = spotEntity.price;
        }
        if ((i11 & 2) != 0) {
            str2 = spotEntity.changeRate;
        }
        if ((i11 & 4) != 0) {
            bool = spotEntity.fav;
        }
        if ((i11 & 8) != 0) {
            str3 = spotEntity.symbol;
        }
        return spotEntity.copy(str, str2, bool, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getFav() {
        return this.fav;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final SpotEntity copy(@Nullable String price, @Nullable String changeRate, @Nullable Boolean fav, @Nullable String symbol) {
        return new SpotEntity(price, changeRate, fav, symbol);
    }

    @Nullable
    public final String getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final Boolean getFav() {
        return this.fav;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.price;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.changeRate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.fav;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.symbol;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SpotEntity(price=" + this.price + ", changeRate=" + this.changeRate + ", fav=" + this.fav + ", symbol=" + this.symbol + ')';
    }

    @NotNull
    public final TradeItemBean toTradeItemBean() {
        double dM66647g = C27039d.m66647g(C27041f.m66671k(this.changeRate));
        String strM66668h = C27041f.m66668h(this.symbol);
        TradeItemBean tradeItemBean = new TradeItemBean(strM66668h);
        tradeItemBean.setLastDealPrice(C27039d.m66647g(C27041f.m66671k(this.price)));
        tradeItemBean.setChangeRate(Double.valueOf(dM66647g));
        Boolean bool = this.fav;
        if (bool != null) {
            tradeItemBean.setFavor(bool.booleanValue());
        }
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(strM66668h);
        if (symbolInfoEntityM85601B != null) {
            tradeItemBean.setSymbolInfoEntity(symbolInfoEntityM85601B);
        }
        return tradeItemBean;
    }

    public SpotEntity(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3) {
        this.price = str;
        this.changeRate = str2;
        this.fav = bool;
        this.symbol = str3;
    }
}
