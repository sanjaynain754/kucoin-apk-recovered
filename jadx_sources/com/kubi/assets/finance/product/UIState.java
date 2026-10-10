package com.kubi.assets.finance.product;

import com.kubi.assets.entity.AssetCoinEntity;
import com.kubi.assets.entity.FinanceProductEntity;
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

/* JADX INFO: renamed from: com.kubi.assets.finance.product.FinanceProductContract$UIState, reason: from toString */
/* JADX INFO: compiled from: FinanceProductContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\u0005HÆ\u0003JO\u0010\u0016\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R.\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R%\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/assets/finance/product/FinanceProductContract$UIState;", "Lcom/kubi/mvi/state/IState;", "data", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/FinanceProductEntity;", "Lkotlin/collections/ArrayList;", "uiHideNumberFlag", "", "showList", "Lcom/kubi/assets/entity/AssetCoinEntity;", "<init>", "(Ljava/util/ArrayList;ZLjava/util/ArrayList;)V", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "getUiHideNumberFlag", "()Z", "getShowList", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFinanceProductContract.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceProductContract.kt\ncom/kubi/assets/finance/product/FinanceProductContract$UIState\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,34:1\n135#2,2:35\n*S KotlinDebug\n*F\n+ 1 FinanceProductContract.kt\ncom/kubi/assets/finance/product/FinanceProductContract$UIState\n*L\n31#1:35,2\n*E\n"})
public final /* data */ class UIState implements InterfaceC19284f {

    @Nullable
    private ArrayList<FinanceProductEntity> data;

    @Nullable
    private final ArrayList<AssetCoinEntity> showList;
    private final boolean uiHideNumberFlag;

    public UIState() {
        this(null, false, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.data, uIState.data) && this.uiHideNumberFlag == uIState.uiHideNumberFlag && Intrinsics.areEqual(this.showList, uIState.showList);
    }

    public UIState(@Nullable ArrayList<FinanceProductEntity> arrayList, boolean z11, @Nullable ArrayList<AssetCoinEntity> arrayList2) {
        this.data = arrayList;
        this.uiHideNumberFlag = z11;
        this.showList = arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            arrayList = uIState.data;
        }
        if ((i11 & 2) != 0) {
            z11 = uIState.uiHideNumberFlag;
        }
        if ((i11 & 4) != 0) {
            arrayList2 = uIState.showList;
        }
        return uIState.copy(arrayList, z11, arrayList2);
    }

    @NotNull
    public final UIState copy(@Nullable ArrayList<FinanceProductEntity> data, boolean uiHideNumberFlag, @Nullable ArrayList<AssetCoinEntity> showList) {
        return new UIState(data, uiHideNumberFlag, showList);
    }

    @Nullable
    public final ArrayList<FinanceProductEntity> getData() {
        return this.data;
    }

    public final boolean getUiHideNumberFlag() {
        return this.uiHideNumberFlag;
    }

    public int hashCode() {
        ArrayList<FinanceProductEntity> arrayList = this.data;
        int iHashCode = (((arrayList == null ? 0 : arrayList.hashCode()) * 31) + Boolean.hashCode(this.uiHideNumberFlag)) * 31;
        ArrayList<AssetCoinEntity> arrayList2 = this.showList;
        return iHashCode + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    public final void setData(@Nullable ArrayList<FinanceProductEntity> arrayList) {
        this.data = arrayList;
    }

    @NotNull
    public String toString() {
        return "UIState(data=" + this.data + ", uiHideNumberFlag=" + this.uiHideNumberFlag + ", showList=" + this.showList + ')';
    }

    public /* synthetic */ UIState(ArrayList arrayList, boolean z11, ArrayList arrayList2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : arrayList, (i11 & 2) != 0 ? C46392a.m102322d(C42153h.f93593a.m92500D(), false) : z11, (i11 & 4) != 0 ? null : arrayList2);
    }
}
