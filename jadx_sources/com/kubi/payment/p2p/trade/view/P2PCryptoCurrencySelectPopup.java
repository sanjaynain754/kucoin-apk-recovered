package com.kubi.payment.p2p.trade.view;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.payment.p2p.trade.view.P2PCryptoCurrencySelectPopup;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2PCryptoCurrencySelectPopup.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000*\u0001\f\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/view/P2PCryptoCurrencySelectPopup;", "Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;", "context", "Landroid/content/Context;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "selectCurrencyCrypto", "selectAdapter", "com/kubi/payment/p2p/trade/view/P2PCryptoCurrencySelectPopup$selectAdapter$2$1", "getSelectAdapter", "()Lcom/kubi/payment/p2p/trade/view/P2PCryptoCurrencySelectPopup$selectAdapter$2$1;", "selectAdapter$delegate", "Lkotlin/Lazy;", "getLayout", "", "initView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "setData", "cryptoCurrency", "cryptoCurrencyList", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2PCryptoCurrencySelectPopup extends AbsP2PBaseTopPopup {

    /* JADX INFO: renamed from: g */
    @NotNull
    public String f40135g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Lazy f40136h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PCryptoCurrencySelectPopup(@NotNull final Context context, @NotNull final Function1<? super String, Unit> listener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f40135g = "";
        this.f40136h = LazyKt.lazy(new Function0() { // from class: gu.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PCryptoCurrencySelectPopup.m49389v(this.f85633b, context, listener);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public static final P2PCryptoCurrencySelectPopup$selectAdapter$2$1 m49389v(P2PCryptoCurrencySelectPopup p2PCryptoCurrencySelectPopup, Context context, Function1 function1) {
        return new P2PCryptoCurrencySelectPopup$selectAdapter$2$1(p2PCryptoCurrencySelectPopup, context, function1, R$layout.botc_pop_item_select_label_view);
    }

    @Override // com.kubi.payment.p2p.trade.view.AbsP2PBaseTopPopup
    /* JADX INFO: renamed from: m */
    public int mo49372m() {
        return R$layout.payment_popup_select_currency_crypto;
    }

    @Override // com.kubi.payment.p2p.trade.view.AbsP2PBaseTopPopup
    /* JADX INFO: renamed from: o */
    public void mo49374o(@NotNull BaseViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        ((RecyclerView) viewHolder.getView(R$id.view_recycler)).setAdapter(m49390u());
    }

    /* JADX INFO: renamed from: u */
    public final P2PCryptoCurrencySelectPopup$selectAdapter$2$1 m49390u() {
        return (P2PCryptoCurrencySelectPopup$selectAdapter$2$1) this.f40136h.getValue();
    }

    /* JADX INFO: renamed from: w */
    public final void m49391w(@NotNull String cryptoCurrency, @NotNull List<String> cryptoCurrencyList) {
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrencyList, "cryptoCurrencyList");
        this.f40135g = cryptoCurrency;
        m49390u().replaceData(cryptoCurrencyList);
    }
}
