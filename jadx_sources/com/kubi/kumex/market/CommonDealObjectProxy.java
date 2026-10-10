package com.kubi.kumex.market;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.market.model.RecentDealEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.resources.C22890g;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.kubi.utils.extensions.C27039d;
import fm.C37567b;
import java.math.BigDecimal;
import ki.C41050b;
import ki.InterfaceC41049a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.InterfaceC38213a;
import p402kf.C41014a;
import p429lf.C42179a;
import p429lf.C42180b;
import p801yl.C46527h0;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import th.InterfaceC44980d;

/* JADX INFO: compiled from: MarketObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0017R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/kumex/market/CommonDealObjectProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/kumex/data/market/model/RecentDealEntity;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "createView", "Landroid/view/View;", "bindView", "", "d", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CommonDealObjectProxy extends ViewHolderProxy<RecentDealEntity> {

    @Nullable
    private final ItemCallBack<RecentDealEntity> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<RecentDealEntity> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonDealObjectProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<RecentDealEntity> itemCallBack, @Nullable ItemCallBack<RecentDealEntity> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @SuppressLint({"SetTextI18n"})
    public void bindView(@NotNull RecentDealEntity d11) {
        Intrinsics.checkNotNullParameter(d11, "d");
        super.bindView(d11);
        View itemView = getHolder().itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ((AppCompatTextView) itemView.findViewById(R$id.dealTime)).setText(C42179a.m92635h(d11.getTimestamp() / 1000000, null, false, null, 7, null));
        InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
        String currentSymbol = d11.getCurrentSymbol();
        if (currentSymbol == null) {
            currentSymbol = C46527h0.f104291a.m102677L();
        }
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(interfaceC44980dM20288g, currentSymbol, false, 2, null);
        if (contractEntityM99529O == null) {
            return;
        }
        InterfaceC38213a interfaceC38213aM84629s = C37567b.m84629s(contractEntityM99529O);
        InterfaceC41049a interfaceC41049aM90019b = C41050b.f91264a.m90019b(contractEntityM99529O);
        int i11 = R$id.dealPrice;
        AppCompatTextView appCompatTextView = (AppCompatTextView) itemView.findViewById(i11);
        BigDecimal price = d11.getPrice();
        appCompatTextView.setText(price != null ? C42180b.m92640e(price, null, C27039d.m66650j(Integer.valueOf(C37567b.m84618h(contractEntityM99529O))), true, false, true, 0, null, 105, null) : null);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) itemView.findViewById(i11);
        Context context = getParent().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatTextView2.setTextColor(C22890g.m54281f(context, Intrinsics.areEqual("buy", d11.getSide())));
        ((AppCompatTextView) itemView.findViewById(R$id.dealVol)).setText(interfaceC41049aM90019b.mo90008b(interfaceC38213aM84629s, d11.getPrice(), C41014a.m89922G(d11.getSize(), null, 1, null), null));
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<RecentDealEntity> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<RecentDealEntity> getShortCall() {
        return this.shortCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.bkumex_item_recent_deal_market, getParent(), false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
