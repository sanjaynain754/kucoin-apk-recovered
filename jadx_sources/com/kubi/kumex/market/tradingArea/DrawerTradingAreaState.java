package com.kubi.kumex.market.tradingArea;

import com.google.firebase.messaging.Constants;
import com.kubi.kumex.data.market.model.AvailableTradeAreaEntity;
import com.kubi.mvi.state.InterfaceC19284f;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradingAreaState.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R%\u0010\u0002\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/kumex/market/tradingArea/DrawerTradingAreaState;", "Lcom/kubi/mvi/state/IState;", "drawer", "Lkotlin/Pair;", "", "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "<init>", "(Lkotlin/Pair;Ljava/lang/Object;)V", "getDrawer", "()Lkotlin/Pair;", "getError", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DrawerTradingAreaState implements InterfaceC19284f {

    @Nullable
    private final Pair<List<AvailableTradeAreaEntity>, Integer> drawer;

    @Nullable
    private final Object error;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawerTradingAreaState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawerTradingAreaState)) {
            return false;
        }
        DrawerTradingAreaState drawerTradingAreaState = (DrawerTradingAreaState) other;
        return Intrinsics.areEqual(this.drawer, drawerTradingAreaState.drawer) && Intrinsics.areEqual(this.error, drawerTradingAreaState.error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DrawerTradingAreaState(@Nullable Pair<? extends List<AvailableTradeAreaEntity>, Integer> pair, @Nullable Object obj) {
        this.drawer = pair;
        this.error = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrawerTradingAreaState copy$default(DrawerTradingAreaState drawerTradingAreaState, Pair pair, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            pair = drawerTradingAreaState.drawer;
        }
        if ((i11 & 2) != 0) {
            obj = drawerTradingAreaState.error;
        }
        return drawerTradingAreaState.copy(pair, obj);
    }

    @NotNull
    public final DrawerTradingAreaState copy(@Nullable Pair<? extends List<AvailableTradeAreaEntity>, Integer> drawer, @Nullable Object error) {
        return new DrawerTradingAreaState(drawer, error);
    }

    @Nullable
    public final Pair<List<AvailableTradeAreaEntity>, Integer> getDrawer() {
        return this.drawer;
    }

    @Nullable
    public final Object getError() {
        return this.error;
    }

    public int hashCode() {
        Pair<List<AvailableTradeAreaEntity>, Integer> pair = this.drawer;
        int iHashCode = (pair == null ? 0 : pair.hashCode()) * 31;
        Object obj = this.error;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DrawerTradingAreaState(drawer=" + this.drawer + ", error=" + this.error + ')';
    }

    public /* synthetic */ DrawerTradingAreaState(Pair pair, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : pair, (i11 & 2) != 0 ? null : obj);
    }
}
