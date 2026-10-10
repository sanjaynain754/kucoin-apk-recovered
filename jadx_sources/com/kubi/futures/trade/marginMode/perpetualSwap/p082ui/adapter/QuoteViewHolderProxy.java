package com.kubi.futures.trade.marginMode.perpetualSwap.p082ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.trade.marginMode.perpetualSwap.data.QuoteModel;
import com.kubi.futures.trade.marginMode.perpetualSwap.p082ui.adapter.QuoteViewHolderProxy;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import dm.C36875y3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import th.InterfaceC44980d;

/* JADX INFO: compiled from: QuoteViewHolderProxy.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/futures/trade/marginMode/perpetualSwap/ui/adapter/QuoteViewHolderProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/futures/trade/marginMode/perpetualSwap/data/QuoteModel;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "viewBinder", "Lcom/kubi/kumex/databinding/BkumexItemPerpetualSwapBinding;", "createView", "Landroid/view/View;", "bindView", "", "quoteModel", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class QuoteViewHolderProxy extends ViewHolderProxy<QuoteModel> {

    @Nullable
    private final ItemCallBack<QuoteModel> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<QuoteModel> shortCall;

    @Nullable
    private C36875y3 viewBinder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteViewHolderProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<QuoteModel> itemCallBack, @Nullable ItemCallBack<QuoteModel> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    public void bindView(@NotNull final QuoteModel quoteModel) {
        Intrinsics.checkNotNullParameter(quoteModel, "quoteModel");
        super.bindView(quoteModel);
        final C36875y3 c36875y3 = this.viewBinder;
        if (c36875y3 != null) {
            ConstraintLayout rootCl = c36875y3.f81392c;
            Intrinsics.checkNotNullExpressionValue(rootCl, "rootCl");
            C27046k.m66711z(rootCl, 0L, new Function0() { // from class: oi.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return QuoteViewHolderProxy.bindView$lambda$3$lambda$1(this.f95292b, c36875y3, quoteModel);
                }
            }, 1, null);
            c36875y3.f81391b.setText(quoteModel.getMarginMode());
            if (Intrinsics.areEqual(quoteModel.getMarginMode(), SharedPositionInfo.MARGIN_MODE_ISOLATED)) {
                c36875y3.f81391b.setText(getParent().getContext().getString(R$string.kumex_isolate_position));
            } else if (Intrinsics.areEqual(quoteModel.getMarginMode(), "CROSS")) {
                c36875y3.f81391b.setText(getParent().getContext().getString(R$string.kumex_cross_position));
            } else {
                c36875y3.f81391b.setText((CharSequence) null);
            }
            c36875y3.f81393d.setSelected(quoteModel.getSwitchable() && quoteModel.isSelected());
            BaseTextView selectStatusTv = c36875y3.f81393d;
            Intrinsics.checkNotNullExpressionValue(selectStatusTv, "selectStatusTv");
            C27046k.m66711z(selectStatusTv, 0L, new Function0() { // from class: oi.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return QuoteViewHolderProxy.bindView$lambda$3$lambda$2(this.f95295b, c36875y3, quoteModel);
                }
            }, 1, null);
            BaseTextView baseTextView = c36875y3.f81394e;
            InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
            ContractEntity contractEntity = quoteModel.getContractEntity();
            String symbol = contractEntity != null ? contractEntity.getSymbol() : null;
            if (symbol == null) {
                symbol = "";
            }
            ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(interfaceC44980dM20288g, symbol, false, 2, null);
            baseTextView.setText(C27041f.m66667g(contractEntityM99529O != null ? FuturesDisplayNameUtils.m24435g(FuturesDisplayNameUtils.f22525a, contractEntityM99529O, false, 1, null) : null, quoteModel.getSymbol()));
            if (quoteModel.getSwitchable()) {
                c36875y3.f81394e.setTextColor(ResourcesCompat.getColor(getParent().getContext().getResources(), R$color.c_text, getParent().getContext().getTheme()));
            } else {
                c36875y3.f81394e.setTextColor(ResourcesCompat.getColor(getParent().getContext().getResources(), R$color.c_text30, getParent().getContext().getTheme()));
            }
        }
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<QuoteModel> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<QuoteModel> getShortCall() {
        return this.shortCall;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$3$lambda$1(QuoteViewHolderProxy quoteViewHolderProxy, C36875y3 c36875y3, QuoteModel quoteModel) {
        ItemCallBack<QuoteModel> shortCall = quoteViewHolderProxy.getShortCall();
        if (shortCall != null) {
            ConstraintLayout rootCl = c36875y3.f81392c;
            Intrinsics.checkNotNullExpressionValue(rootCl, "rootCl");
            shortCall.mo24515a(rootCl, quoteViewHolderProxy.getHolder().getAbsoluteAdapterPosition(), quoteModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$3$lambda$2(QuoteViewHolderProxy quoteViewHolderProxy, C36875y3 c36875y3, QuoteModel quoteModel) {
        ItemCallBack<QuoteModel> shortCall = quoteViewHolderProxy.getShortCall();
        if (shortCall != null) {
            BaseTextView selectStatusTv = c36875y3.f81393d;
            Intrinsics.checkNotNullExpressionValue(selectStatusTv, "selectStatusTv");
            shortCall.mo24515a(selectStatusTv, quoteViewHolderProxy.getHolder().getAbsoluteAdapterPosition(), quoteModel);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.bkumex_item_perpetual_swap, getParent(), false);
        this.viewBinder = C36875y3.m82618a(viewInflate);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
