package com.kubi.core.biz.submit;

import com.kubi.tradebase.tradetype.TradeType;
import com.kubi.tradecorebiz.R$string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.kubi.core.biz.submit.j2, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SubmitOrderConfig.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0010\u0011\u0012\u0013\u0014\u0015J\u0012\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f\u0082\u0001\u0006\u0016\u0017\u0018\u0019\u001a\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeTypeUiData;", "", "isChecked", "", "()Z", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "getTradeType", "()Lcom/kubi/tradebase/tradetype/TradeType;", "titleRes", "", "getTitleRes", "()I", "descRes", "getDescRes", "copyData", "Limit", "Market", "AdvancedLimit", "StopLimit", "StopMarket", "Segment", "Lcom/kubi/core/biz/submit/TradeTypeUiData$AdvancedLimit;", "Lcom/kubi/core/biz/submit/TradeTypeUiData$Limit;", "Lcom/kubi/core/biz/submit/TradeTypeUiData$Market;", "Lcom/kubi/core/biz/submit/TradeTypeUiData$Segment;", "Lcom/kubi/core/biz/submit/TradeTypeUiData$StopLimit;", "Lcom/kubi/core/biz/submit/TradeTypeUiData$StopMarket;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface TradeTypeUiData {

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.j2$a, reason: from toString */
    /* JADX INFO: compiled from: SubmitOrderConfig.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\fHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeTypeUiData$AdvancedLimit;", "Lcom/kubi/core/biz/submit/TradeTypeUiData;", "isChecked", "", "<init>", "(Z)V", "()Z", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "getTradeType", "()Lcom/kubi/tradebase/tradetype/TradeType;", "titleRes", "", "getTitleRes", "()I", "descRes", "getDescRes", "copyData", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class AdvancedLimit implements TradeTypeUiData {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final boolean isChecked;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final TradeType f20751b;

        /* JADX INFO: renamed from: c */
        public final int f20752c;

        /* JADX INFO: renamed from: d */
        public final int f20753d;

        public AdvancedLimit() {
            this(false, 1, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AdvancedLimit) && this.isChecked == ((AdvancedLimit) other).isChecked;
        }

        public AdvancedLimit(boolean z11) {
            this.isChecked = z11;
            this.f20751b = TradeType.ADVANCED_LIMIT;
            this.f20752c = R$string.kc_advanced_limit_order;
            this.f20753d = R$string.kc_advanced_limit_order_guide_desc;
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public TradeType getF20771b() {
            return this.f20751b;
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getF20772c() {
            return this.f20752c;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final AdvancedLimit m22634d(boolean z11) {
            return new AdvancedLimit(z11);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        /* JADX INFO: renamed from: isChecked, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        @NotNull
        public String toString() {
            return "AdvancedLimit(isChecked=" + this.isChecked + ')';
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        @NotNull
        /* JADX INFO: renamed from: c */
        public TradeTypeUiData mo22633c(boolean z11) {
            return m22634d(z11);
        }

        public /* synthetic */ AdvancedLimit(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.j2$b, reason: from toString */
    /* JADX INFO: compiled from: SubmitOrderConfig.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\fHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeTypeUiData$Limit;", "Lcom/kubi/core/biz/submit/TradeTypeUiData;", "isChecked", "", "<init>", "(Z)V", "()Z", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "getTradeType", "()Lcom/kubi/tradebase/tradetype/TradeType;", "titleRes", "", "getTitleRes", "()I", "descRes", "getDescRes", "copyData", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Limit implements TradeTypeUiData {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final boolean isChecked;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final TradeType f20755b;

        /* JADX INFO: renamed from: c */
        public final int f20756c;

        /* JADX INFO: renamed from: d */
        public final int f20757d;

        public Limit() {
            this(false, 1, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Limit) && this.isChecked == ((Limit) other).isChecked;
        }

        public Limit(boolean z11) {
            this.isChecked = z11;
            this.f20755b = TradeType.LIMIT;
            this.f20756c = R$string.limit_price_order;
            this.f20757d = R$string.limit_price_order_desc;
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public TradeType getF20771b() {
            return this.f20755b;
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getF20772c() {
            return this.f20756c;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final Limit m22635d(boolean z11) {
            return new Limit(z11);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        /* JADX INFO: renamed from: isChecked, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        @NotNull
        public String toString() {
            return "Limit(isChecked=" + this.isChecked + ')';
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        @NotNull
        /* JADX INFO: renamed from: c */
        public TradeTypeUiData mo22633c(boolean z11) {
            return m22635d(z11);
        }

        public /* synthetic */ Limit(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? true : z11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.j2$c, reason: from toString */
    /* JADX INFO: compiled from: SubmitOrderConfig.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\fHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeTypeUiData$Market;", "Lcom/kubi/core/biz/submit/TradeTypeUiData;", "isChecked", "", "<init>", "(Z)V", "()Z", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "getTradeType", "()Lcom/kubi/tradebase/tradetype/TradeType;", "titleRes", "", "getTitleRes", "()I", "descRes", "getDescRes", "copyData", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Market implements TradeTypeUiData {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final boolean isChecked;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final TradeType f20759b;

        /* JADX INFO: renamed from: c */
        public final int f20760c;

        /* JADX INFO: renamed from: d */
        public final int f20761d;

        public Market() {
            this(false, 1, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Market) && this.isChecked == ((Market) other).isChecked;
        }

        public Market(boolean z11) {
            this.isChecked = z11;
            this.f20759b = TradeType.MARKET;
            this.f20760c = R$string.market_price_order;
            this.f20761d = R$string.market_price_order_desc;
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public TradeType getF20771b() {
            return this.f20759b;
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getF20772c() {
            return this.f20760c;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final Market m22636d(boolean z11) {
            return new Market(z11);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        /* JADX INFO: renamed from: isChecked, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        @NotNull
        public String toString() {
            return "Market(isChecked=" + this.isChecked + ')';
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        @NotNull
        /* JADX INFO: renamed from: c */
        public TradeTypeUiData mo22633c(boolean z11) {
            return m22636d(z11);
        }

        public /* synthetic */ Market(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.j2$d, reason: from toString */
    /* JADX INFO: compiled from: SubmitOrderConfig.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\fHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeTypeUiData$Segment;", "Lcom/kubi/core/biz/submit/TradeTypeUiData;", "isChecked", "", "<init>", "(Z)V", "()Z", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "getTradeType", "()Lcom/kubi/tradebase/tradetype/TradeType;", "titleRes", "", "getTitleRes", "()I", "descRes", "getDescRes", "copyData", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Segment implements TradeTypeUiData {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final boolean isChecked;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final TradeType f20763b;

        /* JADX INFO: renamed from: c */
        public final int f20764c;

        /* JADX INFO: renamed from: d */
        public final int f20765d;

        public Segment() {
            this(false, 1, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Segment) && this.isChecked == ((Segment) other).isChecked;
        }

        public Segment(boolean z11) {
            this.isChecked = z11;
            this.f20763b = TradeType.SEGMENT;
            this.f20764c = R$string.kemex_segment_delegation;
            this.f20765d = R$string.kemex_segment_delegation_desc;
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public TradeType getF20771b() {
            return this.f20763b;
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getF20772c() {
            return this.f20764c;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final Segment m22637d(boolean z11) {
            return new Segment(z11);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        /* JADX INFO: renamed from: isChecked, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        @NotNull
        public String toString() {
            return "Segment(isChecked=" + this.isChecked + ')';
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        @NotNull
        /* JADX INFO: renamed from: c */
        public TradeTypeUiData mo22633c(boolean z11) {
            return m22637d(z11);
        }

        public /* synthetic */ Segment(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.j2$e, reason: from toString */
    /* JADX INFO: compiled from: SubmitOrderConfig.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\fHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeTypeUiData$StopLimit;", "Lcom/kubi/core/biz/submit/TradeTypeUiData;", "isChecked", "", "<init>", "(Z)V", "()Z", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "getTradeType", "()Lcom/kubi/tradebase/tradetype/TradeType;", "titleRes", "", "getTitleRes", "()I", "descRes", "getDescRes", "copyData", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class StopLimit implements TradeTypeUiData {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final boolean isChecked;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final TradeType f20767b;

        /* JADX INFO: renamed from: c */
        public final int f20768c;

        /* JADX INFO: renamed from: d */
        public final int f20769d;

        public StopLimit() {
            this(false, 1, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StopLimit) && this.isChecked == ((StopLimit) other).isChecked;
        }

        public StopLimit(boolean z11) {
            this.isChecked = z11;
            this.f20767b = TradeType.LIMIT_STOP;
            this.f20768c = R$string.limit_price_stop;
            this.f20769d = R$string.limit_price_stop_desc;
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public TradeType getF20771b() {
            return this.f20767b;
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getF20772c() {
            return this.f20768c;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final StopLimit m22638d(boolean z11) {
            return new StopLimit(z11);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        /* JADX INFO: renamed from: isChecked, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        @NotNull
        public String toString() {
            return "StopLimit(isChecked=" + this.isChecked + ')';
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        @NotNull
        /* JADX INFO: renamed from: c */
        public TradeTypeUiData mo22633c(boolean z11) {
            return m22638d(z11);
        }

        public /* synthetic */ StopLimit(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.j2$f, reason: from toString */
    /* JADX INFO: compiled from: SubmitOrderConfig.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\fHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeTypeUiData$StopMarket;", "Lcom/kubi/core/biz/submit/TradeTypeUiData;", "isChecked", "", "<init>", "(Z)V", "()Z", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "getTradeType", "()Lcom/kubi/tradebase/tradetype/TradeType;", "titleRes", "", "getTitleRes", "()I", "descRes", "getDescRes", "copyData", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class StopMarket implements TradeTypeUiData {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final boolean isChecked;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final TradeType f20771b;

        /* JADX INFO: renamed from: c */
        public final int f20772c;

        /* JADX INFO: renamed from: d */
        public final int f20773d;

        public StopMarket() {
            this(false, 1, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StopMarket) && this.isChecked == ((StopMarket) other).isChecked;
        }

        public StopMarket(boolean z11) {
            this.isChecked = z11;
            this.f20771b = TradeType.MARKET_STOP;
            this.f20772c = R$string.market_price_stop;
            this.f20773d = R$string.market_price_stop_desc;
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public TradeType getF20771b() {
            return this.f20771b;
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getF20772c() {
            return this.f20772c;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final StopMarket m22639d(boolean z11) {
            return new StopMarket(z11);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        /* JADX INFO: renamed from: isChecked, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        @NotNull
        public String toString() {
            return "StopMarket(isChecked=" + this.isChecked + ')';
        }

        @Override // com.kubi.core.biz.submit.TradeTypeUiData
        @NotNull
        /* JADX INFO: renamed from: c */
        public TradeTypeUiData mo22633c(boolean z11) {
            return m22639d(z11);
        }

        public /* synthetic */ StopMarket(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    TradeType getF20771b();

    /* JADX INFO: renamed from: b */
    int getF20772c();

    @NotNull
    /* JADX INFO: renamed from: c */
    TradeTypeUiData mo22633c(boolean z11);

    /* JADX INFO: renamed from: isChecked */
    boolean getIsChecked();
}
