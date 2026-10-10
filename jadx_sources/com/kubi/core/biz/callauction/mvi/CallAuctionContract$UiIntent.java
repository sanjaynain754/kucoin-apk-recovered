package com.kubi.core.biz.callauction.mvi;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CallAuctionBizContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "RequestCurrentStage", "OnFragmentHide", "GetCallAuction", "MockChangePhase", "Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent$GetCallAuction;", "Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent$MockChangePhase;", "Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent$OnFragmentHide;", "Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent$RequestCurrentStage;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class CallAuctionContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: CallAuctionBizContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent$GetCallAuction;", "Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent;", "<init>", "()V", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class GetCallAuction extends CallAuctionContract$UiIntent {

        @NotNull
        public static final GetCallAuction INSTANCE = new GetCallAuction();

        private GetCallAuction() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: CallAuctionBizContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent$MockChangePhase;", "Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent;", TypedValues.CycleType.S_WAVE_PHASE, "Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$Phase;", "<init>", "(Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$Phase;)V", "getPhase", "()Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$Phase;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class MockChangePhase extends CallAuctionContract$UiIntent {

        @NotNull
        private final CallAuctionContract$Phase phase;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MockChangePhase) && this.phase == ((MockChangePhase) other).phase;
        }

        @NotNull
        public final CallAuctionContract$Phase getPhase() {
            return this.phase;
        }

        public int hashCode() {
            return this.phase.hashCode();
        }

        @NotNull
        public String toString() {
            return "MockChangePhase(phase=" + this.phase + ')';
        }
    }

    /* JADX INFO: compiled from: CallAuctionBizContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent$OnFragmentHide;", "Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent;", "<init>", "()V", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class OnFragmentHide extends CallAuctionContract$UiIntent {

        @NotNull
        public static final OnFragmentHide INSTANCE = new OnFragmentHide();

        private OnFragmentHide() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: CallAuctionBizContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent$RequestCurrentStage;", "Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UiIntent;", "symbol", "", "useCountDown", "", "<init>", "(Ljava/lang/String;Z)V", "getSymbol", "()Ljava/lang/String;", "getUseCountDown", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RequestCurrentStage extends CallAuctionContract$UiIntent {

        @NotNull
        private final String symbol;
        private final boolean useCountDown;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestCurrentStage)) {
                return false;
            }
            RequestCurrentStage requestCurrentStage = (RequestCurrentStage) other;
            return Intrinsics.areEqual(this.symbol, requestCurrentStage.symbol) && this.useCountDown == requestCurrentStage.useCountDown;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestCurrentStage(@NotNull String symbol, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.symbol = symbol;
            this.useCountDown = z11;
        }

        @NotNull
        public final String getSymbol() {
            return this.symbol;
        }

        public final boolean getUseCountDown() {
            return this.useCountDown;
        }

        public int hashCode() {
            return (this.symbol.hashCode() * 31) + Boolean.hashCode(this.useCountDown);
        }

        @NotNull
        public String toString() {
            return "RequestCurrentStage(symbol=" + this.symbol + ", useCountDown=" + this.useCountDown + ')';
        }
    }

    public /* synthetic */ CallAuctionContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CallAuctionContract$UiIntent() {
    }
}
