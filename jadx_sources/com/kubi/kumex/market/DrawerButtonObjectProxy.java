package com.kubi.kumex.market;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.sdk.ItemCallBack;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kumex/market/DrawerButtonObjectProxy;", "Lcom/kubi/kumex/market/QuotesButtonObjectProxy;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "Lcom/kubi/kumex/market/ButtonObject;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "createView", "Landroid/view/View;", "setLayoutHeight", "", "height", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DrawerButtonObjectProxy extends QuotesButtonObjectProxy {

    @Nullable
    private final ItemCallBack<ButtonObject> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<ButtonObject> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerButtonObjectProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<ButtonObject> itemCallBack, @Nullable ItemCallBack<ButtonObject> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createView$lambda$1$lambda$0(DrawerButtonObjectProxy drawerButtonObjectProxy, View view, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ItemCallBack<ButtonObject> shortCall = drawerButtonObjectProxy.getShortCall();
        if (shortCall != null) {
            Intrinsics.checkNotNull(view);
            int adapterPosition = drawerButtonObjectProxy.getHolder().getAdapterPosition();
            ButtonObject data = drawerButtonObjectProxy.getData();
            Intrinsics.checkNotNull(data);
            shortCall.mo24515a(view, adapterPosition, data);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kumex.market.QuotesButtonObjectProxy, com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<ButtonObject> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.kumex.market.QuotesButtonObjectProxy, com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.kumex.market.QuotesButtonObjectProxy, com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<ButtonObject> getShortCall() {
        return this.shortCall;
    }

    private final void setLayoutHeight(View view, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        layoutParams.height = i11;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.kubi.kumex.market.QuotesButtonObjectProxy, com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        final View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.bkumex_item_contract_button, getParent(), false);
        int i11 = R$id.addRecommend;
        View viewFindViewById = viewInflate.findViewById(i11);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewExtKt.m66575f(viewFindViewById, new Function1() { // from class: com.kubi.kumex.market.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DrawerButtonObjectProxy.createView$lambda$1$lambda$0(this.f29424b, viewInflate, (View) obj);
            }
        });
        ((TextView) viewInflate.findViewById(i11)).setTextSize(14.0f);
        View viewFindViewById2 = viewInflate.findViewById(i11);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        Context context = viewInflate.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setLayoutHeight(viewFindViewById2, (int) C27025c.m66565c(context, 40));
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
