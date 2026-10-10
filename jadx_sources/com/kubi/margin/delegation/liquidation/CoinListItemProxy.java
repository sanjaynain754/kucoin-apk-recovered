package com.kubi.margin.delegation.liquidation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kubi.margin.R$layout;
import com.kubi.margin.entity.AssetEntity;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.UpDownColorTextView;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27041f;
import gf.C37886j;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36921k;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import rs.C44172b;

/* JADX INFO: compiled from: CoinListItemProxy.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/margin/delegation/liquidation/CoinListItemProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/margin/entity/AssetEntity;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "binding", "Lcom/kubi/margin/databinding/BmarginFragmentCoinListItemViewBinding;", "getBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentCoinListItemViewBinding;", "binding$delegate", "Lkotlin/Lazy;", "createView", "Landroid/view/View;", "bindView", "", "d", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CoinListItemProxy extends ViewHolderProxy<AssetEntity> {

    /* JADX INFO: renamed from: binding$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy binding;

    @Nullable
    private final ItemCallBack<AssetEntity> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<AssetEntity> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinListItemProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<AssetEntity> itemCallBack, @Nullable ItemCallBack<AssetEntity> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
        this.binding = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.liquidation.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoinListItemProxy.binding_delegate$lambda$0(this.f32961b);
            }
        });
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    public void bindView(@NotNull AssetEntity d11) {
        Intrinsics.checkNotNullParameter(d11, "d");
        super.bindView(d11);
        UpDownColorTextView tvPrice = getBinding().f81768e;
        Intrinsics.checkNotNullExpressionValue(tvPrice, "tvPrice");
        C44172b.m97383c(tvPrice, null, false, 3, null);
        View view = getHolder().itemView;
        C24277v.m58542g(getBinding().f81765b, d11.getCurrencyIcon());
        getBinding().f81766c.setText(d11.getCurrencyName());
        UpDownColorTextView upDownColorTextView = getBinding().f81768e;
        BigDecimal amount = d11.getAmount();
        upDownColorTextView.setText(C27041f.m66669i(amount != null ? C37886j.m85578b(amount, d11.getCurrency(), null, false, false, false, 0, null, 0, 254, null) : null, "--"));
        ShowHideTextView showHideTextView = getBinding().f81767d;
        StringBuilder sb2 = new StringBuilder();
        BigDecimal amountUSDT = d11.getAmountUSDT();
        sb2.append(C27041f.m66669i(amountUSDT != null ? C37886j.m85578b(amountUSDT, d11.getBalanceCurrency(), null, false, false, false, 0, null, 0, 254, null) : null, "--"));
        sb2.append(' ');
        sb2.append(C27041f.m66668h(d11.getBalanceCurrencyName()));
        showHideTextView.setText(sb2.toString());
    }

    @NotNull
    public final C36921k getBinding() {
        return (C36921k) this.binding.getValue();
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<AssetEntity> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<AssetEntity> getShortCall() {
        return this.shortCall;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C36921k binding_delegate$lambda$0(CoinListItemProxy coinListItemProxy) {
        return C36921k.m82710a(coinListItemProxy.getHolder().itemView);
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.bmargin_fragment_coin_list_item_view, getParent(), false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
