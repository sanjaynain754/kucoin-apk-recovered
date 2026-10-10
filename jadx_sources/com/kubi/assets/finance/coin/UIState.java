package com.kubi.assets.finance.coin;

import com.kubi.mvi.state.InterfaceC19284f;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.assets.finance.coin.FinanceCoinContract$UIState, reason: from toString */
/* JADX INFO: compiled from: FinanceCoinContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/finance/coin/FinanceCoinContract$UIState;", "Lcom/kubi/mvi/state/IState;", "uiHideNumberFlag", "", "<init>", "(Z)V", "getUiHideNumberFlag", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFinanceCoinContract.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceCoinContract.kt\ncom/kubi/assets/finance/coin/FinanceCoinContract$UIState\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,25:1\n135#2,2:26\n*S KotlinDebug\n*F\n+ 1 FinanceCoinContract.kt\ncom/kubi/assets/finance/coin/FinanceCoinContract$UIState\n*L\n23#1:26,2\n*E\n"})
public final /* data */ class UIState implements InterfaceC19284f {
    private final boolean uiHideNumberFlag;

    public UIState() {
        this(false, 1, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UIState) && this.uiHideNumberFlag == ((UIState) other).uiHideNumberFlag;
    }

    public UIState(boolean z11) {
        this.uiHideNumberFlag = z11;
    }

    @NotNull
    public final UIState copy(boolean uiHideNumberFlag) {
        return new UIState(uiHideNumberFlag);
    }

    public final boolean getUiHideNumberFlag() {
        return this.uiHideNumberFlag;
    }

    public int hashCode() {
        return Boolean.hashCode(this.uiHideNumberFlag);
    }

    @NotNull
    public String toString() {
        return "UIState(uiHideNumberFlag=" + this.uiHideNumberFlag + ')';
    }

    public /* synthetic */ UIState(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? C46392a.m102322d(C42153h.f93593a.m92500D(), false) : z11);
    }
}
