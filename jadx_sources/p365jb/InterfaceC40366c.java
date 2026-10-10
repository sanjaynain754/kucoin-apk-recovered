package p365jb;

import com.kubi.quotefacade.api.IQuoteFacadeService;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jb.c */
/* JADX INFO: compiled from: UnifiedRecommendSymbol.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0014\u0015R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0002\u0016\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/assets/unify/detail/data/UnifiedRecommendSymbol;", "", "symbol", "", "getSymbol", "()Ljava/lang/String;", "showSymbol", "getShowSymbol", "lastDealPrice", "Ljava/math/BigDecimal;", "getLastDealPrice", "()Ljava/math/BigDecimal;", "formatChangeRate", "getFormatChangeRate", "changeRate", "getChangeRate", "empty", "", "getEmpty", "()Z", IQuoteFacadeService.Companion.TRADE_TYPE_SPOT, "Contract", "Lcom/kubi/assets/unify/detail/data/UnifiedRecommendSymbol$Contract;", "Lcom/kubi/assets/unify/detail/data/UnifiedRecommendSymbol$Spot;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC40366c {

    /* JADX INFO: renamed from: jb.c$a, reason: from toString */
    /* JADX INFO: compiled from: UnifiedRecommendSymbol.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m90084d2 = {"Lcom/kubi/assets/unify/detail/data/UnifiedRecommendSymbol$Contract;", "Lcom/kubi/assets/unify/detail/data/UnifiedRecommendSymbol;", "symbol", "", "showSymbol", "lastDealPrice", "Ljava/math/BigDecimal;", "formatChangeRate", "changeRate", "empty", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Z)V", "getSymbol", "()Ljava/lang/String;", "getShowSymbol", "getLastDealPrice", "()Ljava/math/BigDecimal;", "getFormatChangeRate", "getChangeRate", "getEmpty", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Contract implements InterfaceC40366c {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final String symbol;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final String showSymbol;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final BigDecimal lastDealPrice;

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final String formatChangeRate;

        /* JADX INFO: renamed from: e, reason: from toString */
        @Nullable
        public final BigDecimal changeRate;

        /* JADX INFO: renamed from: f, reason: from toString */
        public final boolean empty;

        public Contract(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable String str3, @Nullable BigDecimal bigDecimal2, boolean z11) {
            this.symbol = str;
            this.showSymbol = str2;
            this.lastDealPrice = bigDecimal;
            this.formatChangeRate = str3;
            this.changeRate = bigDecimal2;
            this.empty = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Contract)) {
                return false;
            }
            Contract contract = (Contract) other;
            return Intrinsics.areEqual(this.symbol, contract.symbol) && Intrinsics.areEqual(this.showSymbol, contract.showSymbol) && Intrinsics.areEqual(this.lastDealPrice, contract.lastDealPrice) && Intrinsics.areEqual(this.formatChangeRate, contract.formatChangeRate) && Intrinsics.areEqual(this.changeRate, contract.changeRate) && this.empty == contract.empty;
        }

        @Override // p365jb.InterfaceC40366c
        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getShowSymbol() {
            return this.showSymbol;
        }

        @Override // p365jb.InterfaceC40366c
        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getFormatChangeRate() {
            return this.formatChangeRate;
        }

        @Override // p365jb.InterfaceC40366c
        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public BigDecimal getLastDealPrice() {
            return this.lastDealPrice;
        }

        @Override // p365jb.InterfaceC40366c
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getEmpty() {
            return this.empty;
        }

        @Override // p365jb.InterfaceC40366c
        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public BigDecimal getChangeRate() {
            return this.changeRate;
        }

        @Override // p365jb.InterfaceC40366c
        @Nullable
        public String getSymbol() {
            return this.symbol;
        }

        public int hashCode() {
            String str = this.symbol;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.showSymbol;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            BigDecimal bigDecimal = this.lastDealPrice;
            int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            String str3 = this.formatChangeRate;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.changeRate;
            return ((iHashCode4 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0)) * 31) + Boolean.hashCode(this.empty);
        }

        @NotNull
        public String toString() {
            return "Contract(symbol=" + this.symbol + ", showSymbol=" + this.showSymbol + ", lastDealPrice=" + this.lastDealPrice + ", formatChangeRate=" + this.formatChangeRate + ", changeRate=" + this.changeRate + ", empty=" + this.empty + ')';
        }

        public /* synthetic */ Contract(String str, String str2, BigDecimal bigDecimal, String str3, BigDecimal bigDecimal2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bigDecimal, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : bigDecimal2, z11);
        }
    }

    /* JADX INFO: renamed from: jb.c$b, reason: from toString */
    /* JADX INFO: compiled from: UnifiedRecommendSymbol.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m90084d2 = {"Lcom/kubi/assets/unify/detail/data/UnifiedRecommendSymbol$Spot;", "Lcom/kubi/assets/unify/detail/data/UnifiedRecommendSymbol;", "symbol", "", "showSymbol", "lastDealPrice", "Ljava/math/BigDecimal;", "formatChangeRate", "changeRate", "empty", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Z)V", "getSymbol", "()Ljava/lang/String;", "getShowSymbol", "getLastDealPrice", "()Ljava/math/BigDecimal;", "getFormatChangeRate", "getChangeRate", "getEmpty", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Spot implements InterfaceC40366c {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final String symbol;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final String showSymbol;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final BigDecimal lastDealPrice;

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final String formatChangeRate;

        /* JADX INFO: renamed from: e, reason: from toString */
        @Nullable
        public final BigDecimal changeRate;

        /* JADX INFO: renamed from: f, reason: from toString */
        public final boolean empty;

        public Spot(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable String str3, @Nullable BigDecimal bigDecimal2, boolean z11) {
            this.symbol = str;
            this.showSymbol = str2;
            this.lastDealPrice = bigDecimal;
            this.formatChangeRate = str3;
            this.changeRate = bigDecimal2;
            this.empty = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spot)) {
                return false;
            }
            Spot spot = (Spot) other;
            return Intrinsics.areEqual(this.symbol, spot.symbol) && Intrinsics.areEqual(this.showSymbol, spot.showSymbol) && Intrinsics.areEqual(this.lastDealPrice, spot.lastDealPrice) && Intrinsics.areEqual(this.formatChangeRate, spot.formatChangeRate) && Intrinsics.areEqual(this.changeRate, spot.changeRate) && this.empty == spot.empty;
        }

        @Override // p365jb.InterfaceC40366c
        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getShowSymbol() {
            return this.showSymbol;
        }

        @Override // p365jb.InterfaceC40366c
        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getFormatChangeRate() {
            return this.formatChangeRate;
        }

        @Override // p365jb.InterfaceC40366c
        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public BigDecimal getLastDealPrice() {
            return this.lastDealPrice;
        }

        @Override // p365jb.InterfaceC40366c
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getEmpty() {
            return this.empty;
        }

        @Override // p365jb.InterfaceC40366c
        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public BigDecimal getChangeRate() {
            return this.changeRate;
        }

        @Override // p365jb.InterfaceC40366c
        @Nullable
        public String getSymbol() {
            return this.symbol;
        }

        public int hashCode() {
            String str = this.symbol;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.showSymbol;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            BigDecimal bigDecimal = this.lastDealPrice;
            int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            String str3 = this.formatChangeRate;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.changeRate;
            return ((iHashCode4 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0)) * 31) + Boolean.hashCode(this.empty);
        }

        @NotNull
        public String toString() {
            return "Spot(symbol=" + this.symbol + ", showSymbol=" + this.showSymbol + ", lastDealPrice=" + this.lastDealPrice + ", formatChangeRate=" + this.formatChangeRate + ", changeRate=" + this.changeRate + ", empty=" + this.empty + ')';
        }

        public /* synthetic */ Spot(String str, String str2, BigDecimal bigDecimal, String str3, BigDecimal bigDecimal2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bigDecimal, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : bigDecimal2, z11);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    String getShowSymbol();

    @Nullable
    /* JADX INFO: renamed from: b */
    String getFormatChangeRate();

    @Nullable
    /* JADX INFO: renamed from: c */
    BigDecimal getLastDealPrice();

    /* JADX INFO: renamed from: d */
    boolean getEmpty();

    @Nullable
    /* JADX INFO: renamed from: e */
    BigDecimal getChangeRate();

    @Nullable
    String getSymbol();
}
