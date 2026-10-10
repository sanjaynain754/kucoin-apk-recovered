package com.kubi.kumex.market;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0017R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/kumex/market/QuotesButtonObjectProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/kumex/market/ButtonObject;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "createView", "Landroid/view/View;", "bindView", "", "d", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class QuotesButtonObjectProxy extends ViewHolderProxy<ButtonObject> {

    @Nullable
    private final ItemCallBack<ButtonObject> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<ButtonObject> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuotesButtonObjectProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<ButtonObject> itemCallBack, @Nullable ItemCallBack<ButtonObject> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @SuppressLint({"SetTextI18n"})
    public void bindView(@NotNull ButtonObject d11) {
        Intrinsics.checkNotNullParameter(d11, "d");
        super.bindView(d11);
        View itemView = getHolder().itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        int i11 = R$id.addRecommend;
        ((TextView) itemView.findViewById(i11)).setEnabled(d11.getEnable());
        ((TextView) itemView.findViewById(i11)).setText(d11.getContent());
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<ButtonObject> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<ButtonObject> getShortCall() {
        return this.shortCall;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createView$lambda$1$lambda$0(QuotesButtonObjectProxy quotesButtonObjectProxy, View view) {
        ItemCallBack<ButtonObject> shortCall = quotesButtonObjectProxy.getShortCall();
        if (shortCall != null) {
            Intrinsics.checkNotNull(view);
            int adapterPosition = quotesButtonObjectProxy.getHolder().getAdapterPosition();
            ButtonObject data = quotesButtonObjectProxy.getData();
            Intrinsics.checkNotNull(data);
            shortCall.mo24515a(view, adapterPosition, data);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        final View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.bkumex_item_contract_button, getParent(), false);
        View viewFindViewById = viewInflate.findViewById(R$id.addRecommend);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.kumex.market.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuotesButtonObjectProxy.createView$lambda$1$lambda$0(this.f29462b, viewInflate);
            }
        }, 1, null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
