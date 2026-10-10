package com.kubi.spot.business.callAuction.mvi;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.spot.business.callAuction.bean.CallAuctionConfigBean;
import com.kubi.spot.entity.TradeItemBeanEquals;
import i20.CallAuctionInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.business.callAuction.mvi.CallAuctionContract$UIState, reason: from toString */
/* JADX INFO: compiled from: CallAuctionContract.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003JO\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006("}, m90084d2 = {"Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$UIState;", "Lcom/kubi/mvi/state/IState;", "callAuctionInfo", "Lcom/kubi/spot/business/callAuction/bean/CallAuctionInfo;", "callAuctionGetConfig", "Lcom/kubi/spot/business/callAuction/bean/CallAuctionConfigBean;", TypedValues.CycleType.S_WAVE_PHASE, "Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$Phase;", "countdown", "", "bean", "Lcom/kubi/spot/entity/TradeItemBeanEquals;", "response", "<init>", "(Lcom/kubi/spot/business/callAuction/bean/CallAuctionInfo;Lcom/kubi/spot/business/callAuction/bean/CallAuctionConfigBean;Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$Phase;Ljava/lang/String;Lcom/kubi/spot/entity/TradeItemBeanEquals;Lcom/kubi/spot/entity/TradeItemBeanEquals;)V", "getCallAuctionInfo", "()Lcom/kubi/spot/business/callAuction/bean/CallAuctionInfo;", "getCallAuctionGetConfig", "()Lcom/kubi/spot/business/callAuction/bean/CallAuctionConfigBean;", "getPhase", "()Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$Phase;", "getCountdown", "()Ljava/lang/String;", "getBean", "()Lcom/kubi/spot/entity/TradeItemBeanEquals;", "getResponse", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UIState implements InterfaceC19284f {

    @Nullable
    private final TradeItemBeanEquals bean;

    @Nullable
    private final CallAuctionConfigBean callAuctionGetConfig;

    @Nullable
    private final CallAuctionInfo callAuctionInfo;

    @Nullable
    private final String countdown;

    @NotNull
    private final CallAuctionContract$Phase phase;

    @Nullable
    private final TradeItemBeanEquals response;

    public UIState() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.callAuctionInfo, uIState.callAuctionInfo) && Intrinsics.areEqual(this.callAuctionGetConfig, uIState.callAuctionGetConfig) && this.phase == uIState.phase && Intrinsics.areEqual(this.countdown, uIState.countdown) && Intrinsics.areEqual(this.bean, uIState.bean) && Intrinsics.areEqual(this.response, uIState.response);
    }

    public UIState(@Nullable CallAuctionInfo callAuctionInfo, @Nullable CallAuctionConfigBean callAuctionConfigBean, @NotNull CallAuctionContract$Phase phase, @Nullable String str, @Nullable TradeItemBeanEquals tradeItemBeanEquals, @Nullable TradeItemBeanEquals tradeItemBeanEquals2) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        this.callAuctionInfo = callAuctionInfo;
        this.callAuctionGetConfig = callAuctionConfigBean;
        this.phase = phase;
        this.countdown = str;
        this.bean = tradeItemBeanEquals;
        this.response = tradeItemBeanEquals2;
    }

    public static /* synthetic */ UIState copy$default(UIState uIState, CallAuctionInfo callAuctionInfo, CallAuctionConfigBean callAuctionConfigBean, CallAuctionContract$Phase callAuctionContract$Phase, String str, TradeItemBeanEquals tradeItemBeanEquals, TradeItemBeanEquals tradeItemBeanEquals2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            callAuctionInfo = uIState.callAuctionInfo;
        }
        if ((i11 & 2) != 0) {
            callAuctionConfigBean = uIState.callAuctionGetConfig;
        }
        if ((i11 & 4) != 0) {
            callAuctionContract$Phase = uIState.phase;
        }
        if ((i11 & 8) != 0) {
            str = uIState.countdown;
        }
        if ((i11 & 16) != 0) {
            tradeItemBeanEquals = uIState.bean;
        }
        if ((i11 & 32) != 0) {
            tradeItemBeanEquals2 = uIState.response;
        }
        TradeItemBeanEquals tradeItemBeanEquals3 = tradeItemBeanEquals;
        TradeItemBeanEquals tradeItemBeanEquals4 = tradeItemBeanEquals2;
        return uIState.copy(callAuctionInfo, callAuctionConfigBean, callAuctionContract$Phase, str, tradeItemBeanEquals3, tradeItemBeanEquals4);
    }

    @NotNull
    public final UIState copy(@Nullable CallAuctionInfo callAuctionInfo, @Nullable CallAuctionConfigBean callAuctionConfigBean, @NotNull CallAuctionContract$Phase phase, @Nullable String str, @Nullable TradeItemBeanEquals tradeItemBeanEquals, @Nullable TradeItemBeanEquals tradeItemBeanEquals2) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        return new UIState(callAuctionInfo, callAuctionConfigBean, phase, str, tradeItemBeanEquals, tradeItemBeanEquals2);
    }

    @Nullable
    public final TradeItemBeanEquals getBean() {
        return this.bean;
    }

    @Nullable
    public final CallAuctionConfigBean getCallAuctionGetConfig() {
        return this.callAuctionGetConfig;
    }

    @Nullable
    public final CallAuctionInfo getCallAuctionInfo() {
        return this.callAuctionInfo;
    }

    @Nullable
    public final String getCountdown() {
        return this.countdown;
    }

    @NotNull
    public final CallAuctionContract$Phase getPhase() {
        return this.phase;
    }

    @Nullable
    public final TradeItemBeanEquals getResponse() {
        return this.response;
    }

    public int hashCode() {
        CallAuctionInfo callAuctionInfo = this.callAuctionInfo;
        int iHashCode = (callAuctionInfo == null ? 0 : callAuctionInfo.hashCode()) * 31;
        CallAuctionConfigBean callAuctionConfigBean = this.callAuctionGetConfig;
        int iHashCode2 = (((iHashCode + (callAuctionConfigBean == null ? 0 : callAuctionConfigBean.hashCode())) * 31) + this.phase.hashCode()) * 31;
        String str = this.countdown;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        TradeItemBeanEquals tradeItemBeanEquals = this.bean;
        int iHashCode4 = (iHashCode3 + (tradeItemBeanEquals == null ? 0 : tradeItemBeanEquals.hashCode())) * 31;
        TradeItemBeanEquals tradeItemBeanEquals2 = this.response;
        return iHashCode4 + (tradeItemBeanEquals2 != null ? tradeItemBeanEquals2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UIState(callAuctionInfo=" + this.callAuctionInfo + ", callAuctionGetConfig=" + this.callAuctionGetConfig + ", phase=" + this.phase + ", countdown=" + this.countdown + ", bean=" + this.bean + ", response=" + this.response + ')';
    }

    public /* synthetic */ UIState(CallAuctionInfo callAuctionInfo, CallAuctionConfigBean callAuctionConfigBean, CallAuctionContract$Phase callAuctionContract$Phase, String str, TradeItemBeanEquals tradeItemBeanEquals, TradeItemBeanEquals tradeItemBeanEquals2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : callAuctionInfo, (i11 & 2) != 0 ? null : callAuctionConfigBean, (i11 & 4) != 0 ? CallAuctionContract$Phase.Phase1 : callAuctionContract$Phase, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : tradeItemBeanEquals, (i11 & 32) != 0 ? null : tradeItemBeanEquals2);
    }
}
