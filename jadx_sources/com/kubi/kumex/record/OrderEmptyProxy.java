package com.kubi.kumex.record;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.kubi.utils.C27017c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/kumex/record/OrderEmptyProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/kumex/record/EmptyView;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "createView", "Landroid/view/View;", "bindView", "", "d", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OrderEmptyProxy extends ViewHolderProxy<EmptyView> {

    @Nullable
    private final ItemCallBack<EmptyView> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<EmptyView> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderEmptyProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<EmptyView> itemCallBack, @Nullable ItemCallBack<EmptyView> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    public void bindView(@NotNull EmptyView d11) {
        Intrinsics.checkNotNullParameter(d11, "d");
        super.bindView(d11);
        ((TextView) getHolder().itemView.findViewById(R$id.empty_tips)).setText(C27017c.f54310a.m66516f(R$string.no_order, new Object[0]));
        ((ImageView) getHolder().itemView.findViewById(R$id.empty_icon)).setImageResource(R$drawable.ic2_common_empty);
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<EmptyView> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<EmptyView> getShortCall() {
        return this.shortCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.view_empty, getParent(), false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
