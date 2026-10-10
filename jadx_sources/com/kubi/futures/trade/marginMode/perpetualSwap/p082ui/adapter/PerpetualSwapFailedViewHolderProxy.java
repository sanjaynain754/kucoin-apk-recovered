package com.kubi.futures.trade.marginMode.perpetualSwap.p082ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.platform.model.ModifyMarginModeErrorAggregationModel;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import dm.C36880z3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PerpetualSwapFailedViewHolderProxy.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/futures/trade/marginMode/perpetualSwap/ui/adapter/PerpetualSwapFailedViewHolderProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/kumex/data/platform/model/ModifyMarginModeErrorAggregationModel;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "viewBinder", "Lcom/kubi/kumex/databinding/BkumexItemPerpetualSwapFailedBinding;", "createView", "Landroid/view/View;", "bindView", "", "modifyMarginModeErrorAggregationModel", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PerpetualSwapFailedViewHolderProxy extends ViewHolderProxy<ModifyMarginModeErrorAggregationModel> {

    @Nullable
    private final ItemCallBack<ModifyMarginModeErrorAggregationModel> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<ModifyMarginModeErrorAggregationModel> shortCall;

    @Nullable
    private C36880z3 viewBinder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerpetualSwapFailedViewHolderProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<ModifyMarginModeErrorAggregationModel> itemCallBack, @Nullable ItemCallBack<ModifyMarginModeErrorAggregationModel> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    public void bindView(@NotNull ModifyMarginModeErrorAggregationModel modifyMarginModeErrorAggregationModel) {
        Intrinsics.checkNotNullParameter(modifyMarginModeErrorAggregationModel, "modifyMarginModeErrorAggregationModel");
        super.bindView(modifyMarginModeErrorAggregationModel);
        C36880z3 c36880z3 = this.viewBinder;
        if (c36880z3 != null) {
            c36880z3.f81416b.setText(modifyMarginModeErrorAggregationModel.getErrorMsgDesc());
            c36880z3.f81417c.setText(modifyMarginModeErrorAggregationModel.getSymbols());
        }
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<ModifyMarginModeErrorAggregationModel> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<ModifyMarginModeErrorAggregationModel> getShortCall() {
        return this.shortCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.bkumex_item_perpetual_swap_failed, getParent(), false);
        this.viewBinder = C36880z3.m82629a(viewInflate);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
