package com.kubi.assets.overview.coin;

import android.text.SpannableString;
import com.kubi.assets.entity.AssetCoinEntity;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.mvi.state.InterfaceC19284f;
import java.util.ArrayList;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.assets.overview.coin.AssetCoinContract$UIState, reason: from toString */
/* JADX INFO: compiled from: AssetCoinContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u001d\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003Jg\u0010\u001f\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R.\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R%\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m90084d2 = {"Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;", "Lcom/kubi/mvi/state/IState;", "data", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/AssetCoinEntity;", "Lkotlin/collections/ArrayList;", "spotWSEntity", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "uiHideNumberFlag", "", "showList", "showTip", "Landroid/text/SpannableString;", "<init>", "(Ljava/util/ArrayList;Lcom/kubi/data/entity/WsMarketSnapshotEntity;ZLjava/util/ArrayList;Landroid/text/SpannableString;)V", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "getSpotWSEntity", "()Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "getUiHideNumberFlag", "()Z", "getShowList", "getShowTip", "()Landroid/text/SpannableString;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetCoinContract.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetCoinContract.kt\ncom/kubi/assets/overview/coin/AssetCoinContract$UIState\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,50:1\n135#2,2:51\n*S KotlinDebug\n*F\n+ 1 AssetCoinContract.kt\ncom/kubi/assets/overview/coin/AssetCoinContract$UIState\n*L\n39#1:51,2\n*E\n"})
public final /* data */ class UIState implements InterfaceC19284f {

    @Nullable
    private ArrayList<AssetCoinEntity> data;

    @Nullable
    private final ArrayList<AssetCoinEntity> showList;

    @Nullable
    private final SpannableString showTip;

    @Nullable
    private final WsMarketSnapshotEntity spotWSEntity;
    private final boolean uiHideNumberFlag;

    public UIState() {
        this(null, null, false, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.data, uIState.data) && Intrinsics.areEqual(this.spotWSEntity, uIState.spotWSEntity) && this.uiHideNumberFlag == uIState.uiHideNumberFlag && Intrinsics.areEqual(this.showList, uIState.showList) && Intrinsics.areEqual(this.showTip, uIState.showTip);
    }

    public UIState(@Nullable ArrayList<AssetCoinEntity> arrayList, @Nullable WsMarketSnapshotEntity wsMarketSnapshotEntity, boolean z11, @Nullable ArrayList<AssetCoinEntity> arrayList2, @Nullable SpannableString spannableString) {
        this.data = arrayList;
        this.spotWSEntity = wsMarketSnapshotEntity;
        this.uiHideNumberFlag = z11;
        this.showList = arrayList2;
        this.showTip = spannableString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, ArrayList arrayList, WsMarketSnapshotEntity wsMarketSnapshotEntity, boolean z11, ArrayList arrayList2, SpannableString spannableString, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            arrayList = uIState.data;
        }
        if ((i11 & 2) != 0) {
            wsMarketSnapshotEntity = uIState.spotWSEntity;
        }
        if ((i11 & 4) != 0) {
            z11 = uIState.uiHideNumberFlag;
        }
        if ((i11 & 8) != 0) {
            arrayList2 = uIState.showList;
        }
        if ((i11 & 16) != 0) {
            spannableString = uIState.showTip;
        }
        SpannableString spannableString2 = spannableString;
        boolean z12 = z11;
        return uIState.copy(arrayList, wsMarketSnapshotEntity, z12, arrayList2, spannableString2);
    }

    @NotNull
    public final UIState copy(@Nullable ArrayList<AssetCoinEntity> data, @Nullable WsMarketSnapshotEntity spotWSEntity, boolean uiHideNumberFlag, @Nullable ArrayList<AssetCoinEntity> showList, @Nullable SpannableString showTip) {
        return new UIState(data, spotWSEntity, uiHideNumberFlag, showList, showTip);
    }

    @Nullable
    public final ArrayList<AssetCoinEntity> getData() {
        return this.data;
    }

    @Nullable
    public final ArrayList<AssetCoinEntity> getShowList() {
        return this.showList;
    }

    @Nullable
    public final SpannableString getShowTip() {
        return this.showTip;
    }

    @Nullable
    public final WsMarketSnapshotEntity getSpotWSEntity() {
        return this.spotWSEntity;
    }

    public final boolean getUiHideNumberFlag() {
        return this.uiHideNumberFlag;
    }

    public int hashCode() {
        ArrayList<AssetCoinEntity> arrayList = this.data;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        WsMarketSnapshotEntity wsMarketSnapshotEntity = this.spotWSEntity;
        int iHashCode2 = (((iHashCode + (wsMarketSnapshotEntity == null ? 0 : wsMarketSnapshotEntity.hashCode())) * 31) + Boolean.hashCode(this.uiHideNumberFlag)) * 31;
        ArrayList<AssetCoinEntity> arrayList2 = this.showList;
        int iHashCode3 = (iHashCode2 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        SpannableString spannableString = this.showTip;
        return iHashCode3 + (spannableString != null ? spannableString.hashCode() : 0);
    }

    public final void setData(@Nullable ArrayList<AssetCoinEntity> arrayList) {
        this.data = arrayList;
    }

    @NotNull
    public String toString() {
        return "UIState(data=" + this.data + ", spotWSEntity=" + this.spotWSEntity + ", uiHideNumberFlag=" + this.uiHideNumberFlag + ", showList=" + this.showList + ", showTip=" + ((Object) this.showTip) + ')';
    }

    public /* synthetic */ UIState(ArrayList arrayList, WsMarketSnapshotEntity wsMarketSnapshotEntity, boolean z11, ArrayList arrayList2, SpannableString spannableString, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : arrayList, (i11 & 2) != 0 ? null : wsMarketSnapshotEntity, (i11 & 4) != 0 ? C46392a.m102322d(C42153h.f93593a.m92500D(), false) : z11, (i11 & 8) != 0 ? null : arrayList2, (i11 & 16) != 0 ? null : spannableString);
    }
}
