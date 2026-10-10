package com.kubi.market.monitor.lib.p100ui.floating.setting;

import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FloatWindowSettingContract.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/setting/SelectItemIntent;", "Lcom/kubi/mvi/state/IIntent;", "type", "", "selectItem", "Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$SelectItem;", "<init>", "(ILcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$SelectItem;)V", "getType", "()I", "getSelectItem", "()Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$SelectItem;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SelectItemIntent implements InterfaceC19282d {

    @NotNull
    private final BottomSheetDialogHelper.InterfaceC24339a selectItem;
    private final int type;

    public SelectItemIntent(int i11, @NotNull BottomSheetDialogHelper.InterfaceC24339a selectItem) {
        Intrinsics.checkNotNullParameter(selectItem, "selectItem");
        this.type = i11;
        this.selectItem = selectItem;
    }

    @NotNull
    public final BottomSheetDialogHelper.InterfaceC24339a getSelectItem() {
        return this.selectItem;
    }

    public final int getType() {
        return this.type;
    }
}
