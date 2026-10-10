package com.kubi.assets.sort;

import com.kubi.mvi.state.InterfaceC19284f;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.sort.AccountTabSortContract$UIState, reason: from toString */
/* JADX INFO: compiled from: AccountTabSortContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountTabSortContract$UIState;", "Lcom/kubi/mvi/state/IState;", "isLoading", "", "displayMode", "Lcom/kubi/assets/sort/DisplayMode;", "sortType", "Lcom/kubi/assets/sort/SortType;", "accountList", "", "Lcom/kubi/assets/sort/AccountTabSortData;", "errorMsg", "", "<init>", "(ZLcom/kubi/assets/sort/DisplayMode;Lcom/kubi/assets/sort/SortType;Ljava/util/List;Ljava/lang/String;)V", "()Z", "getDisplayMode", "()Lcom/kubi/assets/sort/DisplayMode;", "getSortType", "()Lcom/kubi/assets/sort/SortType;", "getAccountList", "()Ljava/util/List;", "getErrorMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UIState implements InterfaceC19284f {

    @NotNull
    private final List<AccountTabSortData> accountList;

    @NotNull
    private final DisplayMode displayMode;

    @Nullable
    private final String errorMsg;
    private final boolean isLoading;

    @NotNull
    private final SortType sortType;

    public UIState() {
        this(false, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return this.isLoading == uIState.isLoading && this.displayMode == uIState.displayMode && this.sortType == uIState.sortType && Intrinsics.areEqual(this.accountList, uIState.accountList) && Intrinsics.areEqual(this.errorMsg, uIState.errorMsg);
    }

    public UIState(boolean z11, @NotNull DisplayMode displayMode, @NotNull SortType sortType, @NotNull List<AccountTabSortData> accountList, @Nullable String str) {
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        Intrinsics.checkNotNullParameter(accountList, "accountList");
        this.isLoading = z11;
        this.displayMode = displayMode;
        this.sortType = sortType;
        this.accountList = accountList;
        this.errorMsg = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, boolean z11, DisplayMode displayMode, SortType sortType, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = uIState.isLoading;
        }
        if ((i11 & 2) != 0) {
            displayMode = uIState.displayMode;
        }
        if ((i11 & 4) != 0) {
            sortType = uIState.sortType;
        }
        if ((i11 & 8) != 0) {
            list = uIState.accountList;
        }
        if ((i11 & 16) != 0) {
            str = uIState.errorMsg;
        }
        String str2 = str;
        SortType sortType2 = sortType;
        return uIState.copy(z11, displayMode, sortType2, list, str2);
    }

    @NotNull
    public final UIState copy(boolean isLoading, @NotNull DisplayMode displayMode, @NotNull SortType sortType, @NotNull List<AccountTabSortData> accountList, @Nullable String errorMsg) {
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        Intrinsics.checkNotNullParameter(accountList, "accountList");
        return new UIState(isLoading, displayMode, sortType, accountList, errorMsg);
    }

    @NotNull
    public final List<AccountTabSortData> getAccountList() {
        return this.accountList;
    }

    @NotNull
    public final DisplayMode getDisplayMode() {
        return this.displayMode;
    }

    @Nullable
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @NotNull
    public final SortType getSortType() {
        return this.sortType;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.isLoading) * 31) + this.displayMode.hashCode()) * 31) + this.sortType.hashCode()) * 31) + this.accountList.hashCode()) * 31;
        String str = this.errorMsg;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @NotNull
    public String toString() {
        return "UIState(isLoading=" + this.isLoading + ", displayMode=" + this.displayMode + ", sortType=" + this.sortType + ", accountList=" + this.accountList + ", errorMsg=" + this.errorMsg + ')';
    }

    public /* synthetic */ UIState(boolean z11, DisplayMode displayMode, SortType sortType, List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? DisplayMode.RECOMMEND : displayMode, (i11 & 4) != 0 ? SortType.DEFAULT : sortType, (i11 & 8) != 0 ? CollectionsKt.emptyList() : list, (i11 & 16) != 0 ? null : str);
    }
}
