package com.kubi.kumex.dialog;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$mipmap;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DialogObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0017R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/kumex/dialog/SelectObjectProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/kumex/dialog/SelectObject;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "createView", "Landroid/view/View;", "bindView", "", "d", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SelectObjectProxy extends ViewHolderProxy<SelectObject> {

    @Nullable
    private final ItemCallBack<SelectObject> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<SelectObject> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectObjectProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<SelectObject> itemCallBack, @Nullable ItemCallBack<SelectObject> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @SuppressLint({"SetTextI18n"})
    public void bindView(@NotNull SelectObject d11) {
        Intrinsics.checkNotNullParameter(d11, "d");
        super.bindView(d11);
        View itemView = getHolder().itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        AppCompatTextView appCompatTextView = (AppCompatTextView) itemView.findViewById(R$id.name);
        AppCompatImageView appCompatImageView = (AppCompatImageView) itemView.findViewById(R$id.status);
        if (!d11.getSelect()) {
            appCompatTextView.setText(d11.getDisplay());
            appCompatTextView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
            appCompatImageView.setImageDrawable(null);
        } else {
            appCompatTextView.setText(d11.getDisplay());
            C27017c c27017c = C27017c.f54310a;
            int i11 = R$color.primary;
            appCompatTextView.setTextColor(c27017c.m66512a(i11));
            appCompatImageView.setImageDrawable(c27017c.m66514c(R$mipmap.ic_selected, Integer.valueOf(i11)));
        }
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<SelectObject> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<SelectObject> getShortCall() {
        return this.shortCall;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createView$lambda$1$lambda$0(SelectObjectProxy selectObjectProxy, View view) {
        ItemCallBack<SelectObject> shortCall = selectObjectProxy.getShortCall();
        if (shortCall != null) {
            Intrinsics.checkNotNull(view);
            int adapterPosition = selectObjectProxy.getHolder().getAdapterPosition();
            SelectObject data = selectObjectProxy.getData();
            Intrinsics.checkNotNull(data);
            shortCall.mo24515a(view, adapterPosition, data);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        final View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.bkumex_item_select, getParent(), false);
        Intrinsics.checkNotNull(viewInflate);
        C27046k.m66711z(viewInflate, 0L, new Function0() { // from class: com.kubi.kumex.dialog.p2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelectObjectProxy.createView$lambda$1$lambda$0(this.f28969b, viewInflate);
            }
        }, 1, null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
