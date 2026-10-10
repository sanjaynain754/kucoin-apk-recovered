package com.kubi.assets.search.depositandwithdraw;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.entity.SearchCoinEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.mvi.state.InterfaceC19284f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.search.depositandwithdraw.SearchCoinContract$UIState, reason: from toString */
/* JADX INFO: compiled from: SearchCoinContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003JY\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013¨\u0006)"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UIState;", "Lcom/kubi/mvi/state/IState;", "coinInfoEntity", "Lcom/kubi/data/entity/CoinInfoEntity;", ViewProps.POSITION, "", "coinList", "", "Lcom/kubi/assets/entity/SearchCoinEntity;", "type", "needHeader", "", "withdrawCoinListEmpty", TUIConstants.TIMPush.NOTIFICATION.ACTION, "<init>", "(Lcom/kubi/data/entity/CoinInfoEntity;ILjava/util/List;IZZI)V", "getCoinInfoEntity", "()Lcom/kubi/data/entity/CoinInfoEntity;", "getPosition", "()I", "getCoinList", "()Ljava/util/List;", "getType", "getNeedHeader", "()Z", "getWithdrawCoinListEmpty", "getAction", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UIState implements InterfaceC19284f {
    private final int action;

    @Nullable
    private final CoinInfoEntity coinInfoEntity;

    @Nullable
    private final List<SearchCoinEntity> coinList;
    private final boolean needHeader;
    private final int position;
    private final int type;
    private final boolean withdrawCoinListEmpty;

    public UIState() {
        this(null, 0, null, 0, false, false, 0, 127, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.coinInfoEntity, uIState.coinInfoEntity) && this.position == uIState.position && Intrinsics.areEqual(this.coinList, uIState.coinList) && this.type == uIState.type && this.needHeader == uIState.needHeader && this.withdrawCoinListEmpty == uIState.withdrawCoinListEmpty && this.action == uIState.action;
    }

    public UIState(@Nullable CoinInfoEntity coinInfoEntity, int i11, @Nullable List<SearchCoinEntity> list, int i12, boolean z11, boolean z12, int i13) {
        this.coinInfoEntity = coinInfoEntity;
        this.position = i11;
        this.coinList = list;
        this.type = i12;
        this.needHeader = z11;
        this.withdrawCoinListEmpty = z12;
        this.action = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, CoinInfoEntity coinInfoEntity, int i11, List list, int i12, boolean z11, boolean z12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            coinInfoEntity = uIState.coinInfoEntity;
        }
        if ((i14 & 2) != 0) {
            i11 = uIState.position;
        }
        if ((i14 & 4) != 0) {
            list = uIState.coinList;
        }
        if ((i14 & 8) != 0) {
            i12 = uIState.type;
        }
        if ((i14 & 16) != 0) {
            z11 = uIState.needHeader;
        }
        if ((i14 & 32) != 0) {
            z12 = uIState.withdrawCoinListEmpty;
        }
        if ((i14 & 64) != 0) {
            i13 = uIState.action;
        }
        boolean z13 = z12;
        int i15 = i13;
        boolean z14 = z11;
        List list2 = list;
        return uIState.copy(coinInfoEntity, i11, list2, i12, z14, z13, i15);
    }

    @NotNull
    public final UIState copy(@Nullable CoinInfoEntity coinInfoEntity, int position, @Nullable List<SearchCoinEntity> coinList, int type, boolean needHeader, boolean withdrawCoinListEmpty, int action) {
        return new UIState(coinInfoEntity, position, coinList, type, needHeader, withdrawCoinListEmpty, action);
    }

    public final int getAction() {
        return this.action;
    }

    @Nullable
    public final CoinInfoEntity getCoinInfoEntity() {
        return this.coinInfoEntity;
    }

    @Nullable
    public final List<SearchCoinEntity> getCoinList() {
        return this.coinList;
    }

    public final boolean getNeedHeader() {
        return this.needHeader;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean getWithdrawCoinListEmpty() {
        return this.withdrawCoinListEmpty;
    }

    public int hashCode() {
        CoinInfoEntity coinInfoEntity = this.coinInfoEntity;
        int iHashCode = (((coinInfoEntity == null ? 0 : coinInfoEntity.hashCode()) * 31) + Integer.hashCode(this.position)) * 31;
        List<SearchCoinEntity> list = this.coinList;
        return ((((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + Integer.hashCode(this.type)) * 31) + Boolean.hashCode(this.needHeader)) * 31) + Boolean.hashCode(this.withdrawCoinListEmpty)) * 31) + Integer.hashCode(this.action);
    }

    @NotNull
    public String toString() {
        return "UIState(coinInfoEntity=" + this.coinInfoEntity + ", position=" + this.position + ", coinList=" + this.coinList + ", type=" + this.type + ", needHeader=" + this.needHeader + ", withdrawCoinListEmpty=" + this.withdrawCoinListEmpty + ", action=" + this.action + ')';
    }

    public /* synthetic */ UIState(CoinInfoEntity coinInfoEntity, int i11, List list, int i12, boolean z11, boolean z12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : coinInfoEntity, (i14 & 2) != 0 ? -1 : i11, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? -1 : i12, (i14 & 16) != 0 ? false : z11, (i14 & 32) != 0 ? true : z12, (i14 & 64) != 0 ? 0 : i13);
    }
}
