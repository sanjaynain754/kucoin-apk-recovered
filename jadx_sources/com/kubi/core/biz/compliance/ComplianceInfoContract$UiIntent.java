package com.kubi.core.biz.compliance;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ComplianceInfoContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/core/biz/compliance/ComplianceInfoContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "SymbolChange", "GetComplianceInfo", "Lcom/kubi/core/biz/compliance/ComplianceInfoContract$UiIntent$GetComplianceInfo;", "Lcom/kubi/core/biz/compliance/ComplianceInfoContract$UiIntent$SymbolChange;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class ComplianceInfoContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: ComplianceInfoContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/core/biz/compliance/ComplianceInfoContract$UiIntent$GetComplianceInfo;", "Lcom/kubi/core/biz/compliance/ComplianceInfoContract$UiIntent;", "symbol", "", "<init>", "(Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class GetComplianceInfo extends ComplianceInfoContract$UiIntent {

        @NotNull
        private final String symbol;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetComplianceInfo) && Intrinsics.areEqual(this.symbol, ((GetComplianceInfo) other).symbol);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetComplianceInfo(@NotNull String symbol) {
            super(null);
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.symbol = symbol;
        }

        @NotNull
        public final String getSymbol() {
            return this.symbol;
        }

        public int hashCode() {
            return this.symbol.hashCode();
        }

        @NotNull
        public String toString() {
            return "GetComplianceInfo(symbol=" + this.symbol + ')';
        }
    }

    /* JADX INFO: compiled from: ComplianceInfoContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/core/biz/compliance/ComplianceInfoContract$UiIntent$SymbolChange;", "Lcom/kubi/core/biz/compliance/ComplianceInfoContract$UiIntent;", "symbol", "", "<init>", "(Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SymbolChange extends ComplianceInfoContract$UiIntent {

        @Nullable
        private final String symbol;

        public SymbolChange(@Nullable String str) {
            super(null);
            this.symbol = str;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SymbolChange) && Intrinsics.areEqual(this.symbol, ((SymbolChange) other).symbol);
        }

        @Nullable
        public final String getSymbol() {
            return this.symbol;
        }

        public int hashCode() {
            String str = this.symbol;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "SymbolChange(symbol=" + this.symbol + ')';
        }
    }

    public /* synthetic */ ComplianceInfoContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ComplianceInfoContract$UiIntent() {
    }
}
